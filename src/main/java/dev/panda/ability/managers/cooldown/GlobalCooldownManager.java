package dev.panda.ability.managers.cooldown;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

public class GlobalCooldownManager {

    public boolean isGlobalCooldown() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean hasGlobalCooldown(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getGlobalCooldown(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getGlobalCooldownName() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setGlobalCooldown(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
