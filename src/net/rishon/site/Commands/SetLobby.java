package net.rishon.site.Commands;

import net.rishon.site.FileManager.LobbyData;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetLobby
        implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (p.hasPermission("gungame.setlobby")) {
            Location loc = p.getLocation();
            LobbyData.edit("world-lobby", p.getWorld().getName());
            LobbyData.edit("lobby-x", Double.valueOf(loc.getX()));
            LobbyData.edit("lobby-y", Double.valueOf(loc.getY() + 1.0D));
            LobbyData.edit("lobby-z", Double.valueOf(loc.getZ()));
            LobbyData.edit("lobby-yaw", Float.valueOf(loc.getYaw()));
            LobbyData.edit("lobby-pitch", Float.valueOf(loc.getPitch()));
            p.sendMessage("§aLobby has been successfully set.");
        } else {
            p.sendMessage("§cYou don't have permissions.");
        }
        return false;
    }
}
