package net.choco.sets;

import net.choco.advancedsets.api.ASetsAPI;
import net.choco.sets.effects.TestEffect;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        ASetsAPI.registerNewEffectType("Test" , TestEffect.class);
        getServer().getPluginManager().registerEvents(new TestEffect(), this);
    }
}
