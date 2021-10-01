package dev.panda.ability.abilities;


import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

public abstract class Ability implements Listener {

    public boolean isAbility(ItemStack itemStack) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasCooldown(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCooldown(Player player, long time) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getCooldown(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
