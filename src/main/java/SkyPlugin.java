import org.bukkit.plugin.java.JavaPlugin;

public class SkyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SkyPlugin has been enabled!");
        this.getCommand("kit").setExecutor(new SkyCommand());
    }
    @Override
    public void onDisable() {
        getLogger().info("SkyPlugin has been disabled!");
    }
}
