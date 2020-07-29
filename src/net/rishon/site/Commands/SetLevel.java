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

public class SetLevel implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("§cOnly players can execute this command.");
            return true;
        }

        if (commandSender.hasPermission("gungame.setlevel")) {
            if (strings.length == 0) {
                commandSender.sendMessage("§cUsage: /setlevel <player> <level>");
                return true;
            }

            if (strings.length == 1) {
                commandSender.sendMessage("§cUsage: /setlevel <player> <level>");
                return true;
            }

            Player player = Bukkit.getPlayer(strings[0]);
            if (player == null) {
                commandSender.sendMessage("§cCouldn't find player.");
                return true;
            }

            int level = Integer.parseInt(strings[1]);
            if (level > 60) {
                commandSender.sendMessage("§cYou cannot enter a number higher than 60.");
                return true;
            }

            if (level < 1) {
                commandSender.sendMessage("§cYou cannot enter a number lower than 1.");
                return true;
            }

            Main.getLevel.put(player, level);
            commandSender.sendMessage("§7You have set §e" + player.getName() + " §7level to §b" + level);
            player.playSound(player.getLocation(), Sound.LEVEL_UP, 5.0F, 5.0F);

            Main.clear(player);

            PlayerSB.updateSB(player);

            Levels.getPlayerContent(player);

            player.setLevel(Main.getLevel.get(player));

        } else {
            commandSender.sendMessage("§cYou don't have permissions.");
        }
        return false;

    }
}
