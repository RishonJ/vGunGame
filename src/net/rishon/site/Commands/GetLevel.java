package net.rishon.site.Commands;

import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Main;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetLevel implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("§cOnly players can execute this command.");
            return true;
        }

        if (commandSender.hasPermission("gungame.setlevel")) {
            if (strings.length == 0) {
                commandSender.sendMessage("§cUsage: /getlevel <player>");
                return true;
            }

            if (strings.length == 1) {
                commandSender.sendMessage("§cUsage: /getlevel <player>");
                return true;
            }

            Player player = Bukkit.getPlayer(strings[0]);
            if (player == null) {
                commandSender.sendMessage("§cCouldn't find player.");
                return true;
            }

            commandSender.sendMessage("§e" + player.getName() + " §7level is §b" + Main.getLevel.get(player));

        } else {
            commandSender.sendMessage("§cYou don't have permissions.");
        }
        return false;

    }
}
