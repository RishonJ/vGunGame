package net.rishon.site.Listeners;

import net.rishon.site.FileManager.LobbyData;
import net.rishon.site.ItemBuilder.ItemBuilder;
import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Main;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class Respawn implements Listener {

    @EventHandler
    private void onRespawn(PlayerRespawnEvent event) {

        Player player = event.getPlayer();

        player.teleport(LobbyData.getLobby());

        Bukkit.getScheduler().runTaskLater(Main.instance, new Runnable() {
            @Override
            public void run() {
                player.setLevel(Main.getLevel.get(player));

                Levels.getPlayerContent(player);
            }
        }, 20);

    }

}
