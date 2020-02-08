import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SkyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName() == "sky") {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                // Here we need to give items to our player
            }

            // If the player (or console) uses our command correct, we can return true
            return true;
        } else {
            return false;
        }
    }
}
