import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.List;

public class SkyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("sky")) {
            for (Entity e : Bukkit.getWorld("kittenz").getLivingEntities()) {
                if (!e.getType().equals(EntityType.PLAYER)) {
                    e.teleport(new Location(Bukkit.getWorld("kittenz"), e.getLocation().getX(), e.getLocation().getY() + 100, e.getLocation().getZ()));
                }
            }

            // If the player (or console) uses our command correct, we can return true
            return true;
        } else {
            return false;
        }
    }
}
