import org.bukkit.plugin.java.JavaPlugin;

public class SkyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SkyPlugin has been enabled!");
    }
    @Override
    public void onDisable() {
        getLogger().info("SkyPlugin has been disabled!");
    }
}
