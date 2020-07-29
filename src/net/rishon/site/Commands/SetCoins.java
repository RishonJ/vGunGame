package net.rishon.site.Commands;

import net.rishon.site.FileManager.PlayerData;
import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Main;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetCoins implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("§cOnly players can execute this command.");
            return true;
        }

        if (commandSender.hasPermission("gungame.setcoins")) {

            if (strings.length == 0) {
                commandSender.sendMessage("§cUsage: /setcoins <player> <level>");
                return true;
            }

            if (strings.length == 1) {
                commandSender.sendMessage("§cUsage: /setcoins <player> <level>");
                return true;
            }

            Player player = Bukkit.getPlayer(strings[0]);
            if (player == null) {
                commandSender.sendMessage("§cCouldn't find player.");
                return true;
            }

            int coins = Integer.parseInt(strings[1]);

            PlayerData.setCoins(player, coins);
            commandSender.sendMessage("§7You have set §e" + player.getName() + " §7coins to §b" + coins);

            PlayerSB.updateSB(player);


        } else {
            commandSender.sendMessage("§cYou don't have permissions.");
        }
        return false;
    }
}
