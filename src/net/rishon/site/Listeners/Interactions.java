package net.rishon.site.Listeners;

import net.rishon.site.FileManager.LobbyData;
import net.rishon.site.FileManager.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.weather.WeatherChangeEvent;


public class Interactions
        implements Listener
{
    @EventHandler
    private void NoBreak(BlockBreakEvent event) {
        if (!(event.getPlayer().getGameMode() == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    private void onPlace(BlockPlaceEvent event) {
        if (!(event.getPlayer().getGameMode() == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onRain(WeatherChangeEvent event){
        World world = event.getWorld();
        if(world.hasStorm()){
            world.setWeatherDuration(0);
        }
    }

    @EventHandler
    private void onSwap(PlayerSwapHandItemsEvent event) {
        if (!(event.getPlayer().getGameMode() == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    private void NoPickup(PlayerPickupItemEvent event) {
        if (!(event.getPlayer().getGameMode() == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }



    @EventHandler
    private void NoDrop(PlayerDropItemEvent event) {
        if (!(event.getPlayer().getGameMode() == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    private void NoDropInv(InventoryClickEvent event) {

        if (!(event.getWhoClicked().getGameMode() == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    private void onChangeHunger(FoodLevelChangeEvent event) {
        event.setCancelled(true);
    }


    @EventHandler
    private void onCraft(CraftItemEvent event) {
        if (!(event.getWhoClicked().getGameMode() == GameMode.CREATIVE)) {
            event.setCancelled(true);
        }
    }
    
    @EventHandler
    private void waterDeath(PlayerMoveEvent event) {

        if(!(event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)) {
            if (event.getPlayer().getLocation().getBlock().getType() == Material.WATER || event.getPlayer().getLocation().getBlock().getType() == Material.LEGACY_STATIONARY_WATER) {
                // event.getPlayer().teleport(LobbyData.getLobby());
                event.getPlayer().setHealth(0.0D);
                PlayerData.addDeath(event.getPlayer());
            }
        }
    }

}