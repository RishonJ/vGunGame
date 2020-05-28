package me.rishon.strixgg.Events;


import me.rishon.strixgg.FileManager.PlayerData;
import me.rishon.strixgg.Main;
import me.rishon.strixgg.Scoreboard.SB;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;



public class WaterDeath implements Listener {


    @EventHandler
    public void move(PlayerMoveEvent event) {

        Player player = event.getPlayer();


        Material Water = event.getPlayer().getLocation().getBlock().getType();

        if (!(player.getGameMode() == GameMode.CREATIVE)) {
            if (Water == Material.WATER) {

               player.setHealth(0);
            }
        }
    }


}
