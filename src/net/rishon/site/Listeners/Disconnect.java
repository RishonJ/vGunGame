package net.rishon.site.Listeners;

import net.rishon.site.Main;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Disconnect implements Listener {

    @EventHandler
    public void onDisconnect(PlayerQuitEvent event) {

        event.setQuitMessage(null);

    }
    }
