package net.rishon.site.Listeners;

import net.rishon.site.FileManager.LobbyData;
import net.rishon.site.FileManager.PlayerData;
import net.rishon.site.ItemBuilder.ItemBuilder;
import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Main;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Connect implements Listener {

    @EventHandler
    public void onConnection(PlayerJoinEvent event) {

        event.setJoinMessage(null);

        Player player = event.getPlayer();

        player.teleport(LobbyData.getLobby());

        PlayerData.tryInit(player);
        PlayerData.edit(player.getUniqueId().toString() + ".name", player.getName());

        Main.clear(player);
        Main.getLevel.put(player, 1);
        Main.killstreak.put(player, 0);

        Levels.getPlayerContent(player);
        player.setLevel(Main.getLevel.get(player));

            PlayerSB.gameSB(player);

    }


}
