package io.github.gamer4life1.SkyCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class SkyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("io.github.gamer4life1.SkyPlugin has been enabled!");
        this.getCommand("kit").setExecutor(new SkyCommand());
    }
    @Override
    public void onDisable() {
        getLogger().info("io.github.gamer4life1.SkyPlugin has been disabled!");
    }
}
