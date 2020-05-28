package me.rishon.strixgg.Events;


import me.rishon.strixgg.FileManager.Config;
import me.rishon.strixgg.FileManager.PlayerData;

import me.rishon.strixgg.Scoreboard.SB;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class OnJoin implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player p = event.getPlayer();

        PlayerData.tryInit(p);
        PlayerData.edit(String.valueOf(p.getUniqueId().toString()) + ".name", p.getName());
        p.getInventory().clear();
        PlayerData.setCurrentLevel(p, 1);
        p.giveExpLevels(1);
        p.setTotalExperience(1);

        SB.MainScoreboard(p);

        ItemStack axe = new ItemStack(Material.WOODEN_AXE, 1);
        ItemMeta axeMeta = axe.getItemMeta();
        axeMeta.setUnbreakable(true);
        axe.setItemMeta(axeMeta);

        p.getInventory().setItem(0, axe);

        ItemStack phead = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta pheadmeta = (SkullMeta)phead.getItemMeta();
        pheadmeta.setOwner(event.getPlayer().getName());
        pheadmeta.setDisplayName("§eProfile");
        phead.setItemMeta(pheadmeta);
        event.getPlayer().getInventory().setItem(8, phead);

        p.setExp(0);
        p.setLevel(1);

        p.teleport(Config.getLobby());

    }
}
