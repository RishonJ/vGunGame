package me.rishon.strixgg.Menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class MenuEvents implements Listener {

    @EventHandler
    public void onMenuClick(PlayerInteractEvent event) {
        Player p = event.getPlayer();

        ItemStack phead = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta pheadmeta = (SkullMeta)phead.getItemMeta();
        pheadmeta.setOwner(p.getName());
        pheadmeta.setDisplayName("§eProfile");
        phead.setItemMeta(pheadmeta);

        if (p.getItemInHand().getItemMeta().getDisplayName().contains("§eProfile")) {
            p.sendMessage("§cComing soon...");
        }



    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        ItemStack phead = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta pheadmeta = (SkullMeta)phead.getItemMeta();
        pheadmeta.setOwner(event.getPlayer().getName());
        pheadmeta.setDisplayName("§eProfile");
        phead.setItemMeta(pheadmeta);
        event.getPlayer().getInventory().setItem(8, phead);
    }


    @EventHandler
    public void onDropHead(PlayerDropItemEvent event) {
        Player p = event.getPlayer();

        if (event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals("§eProfile")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void noTouch(InventoryClickEvent event) {
        Player player = (Player)event.getWhoClicked();

        ItemStack phead = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta pheadmeta = (SkullMeta)phead.getItemMeta();
        pheadmeta.setOwner(player.getName());
        pheadmeta.setDisplayName("§eProfile");
        phead.setItemMeta(pheadmeta);

        if (player.getInventory().getItemInHand().getItemMeta().getDisplayName().contains("§eProfile")) {
            event.setCancelled(true);
        }

    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Player p = event.getPlayer();

        if (event.getItemInHand().getItemMeta().getDisplayName().equals("§eProfile"))
            event.setCancelled(true);
    }

}
