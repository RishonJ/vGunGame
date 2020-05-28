package me.rishon.strixgg.Events;

import org.bukkit.event.Listener;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class Interactions
        implements Listener
{
    @EventHandler
    public void NoBreak(BlockBreakEvent event) {
        if (!event.getPlayer().isOp()) {
            event.setCancelled(true);
        }
    }



    @EventHandler
    public void NoPickup(PlayerPickupItemEvent event) {
        if (!event.getPlayer().isOp()) {
            event.setCancelled(true);
        }
    }



    @EventHandler
    public void NoDrop(PlayerDropItemEvent event) {
        if (!event.getPlayer().isOp()) {
            event.setCancelled(true);
        }
    }


    @EventHandler
    public void NoDropInv(InventoryClickEvent event) {
        Player player = (Player)event.getWhoClicked();

        if (!player.isOp()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onChangeHunger(FoodLevelChangeEvent e) {
        Player p = (Player)e.getEntity();
            e.setCancelled(true);

    }




    @EventHandler
    public void onCraft(CraftItemEvent e) {
        if (!e.getWhoClicked().isOp()) {
            e.setCancelled(true);
        }
    }




    @EventHandler
    public void onJoin(PlayerJoinEvent e) { e.setJoinMessage(null); }





    @EventHandler
    public void onQuit(PlayerQuitEvent e) { e.setQuitMessage(null); }
}