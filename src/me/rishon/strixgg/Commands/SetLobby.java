package me.rishon.strixgg.Commands;

import me.rishon.strixgg.ChatUtil;
import me.rishon.strixgg.FileManager.Config;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class SetLobby implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (p.hasPermission("strixgg.setlobby")) {
            Location loc = p.getLocation();
            Config.edit("world-lobby", p.getWorld().getName());
            Config.edit("lobby-x", Double.valueOf(loc.getX()));
            Config.edit("lobby-y", Double.valueOf(loc.getY() + 1.0D));
            Config.edit("lobby-z", Double.valueOf(loc.getZ()));
            Config.edit("lobby-yaw", Float.valueOf(loc.getYaw()));
            Config.edit("lobby-pitch", Float.valueOf(loc.getPitch()));
            p.sendMessage("§aLobby has been successfully set.");
        } else {
            p.sendMessage(ChatUtil.format(Config.getConfig().getString("NoPerm")));
        }
        return false;
    }
}
