package dev.panda.ability;

import dev.panda.ability.abilities.Ability;

import dev.panda.ability.managers.cooldown.GlobalCooldownManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.List;;

public class PandaAbilityAPI {

    public List<Ability> getActiveAbility(Player player) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public GlobalCooldownManager getGlobalCooldown() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
