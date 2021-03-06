package net.rishon.site.Commands;

import net.rishon.site.GUI.Profile.ProfileGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Profile implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("§cOnly players can execute this command.");
            return true;
        }

        ProfileGUI.StatsGUI((Player) commandSender);

        return false;
    }
}
