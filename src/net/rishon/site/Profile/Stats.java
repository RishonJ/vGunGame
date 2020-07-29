package net.rishon.site.Profile;


import java.util.ArrayList;
import java.util.List;

import net.rishon.site.FileManager.PlayerData;
import net.rishon.site.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Stats {

    public static void StatsGUI(Player player) {

        Inventory inv = Bukkit.createInventory(null, 27, "§3" + player.getName() + " Stats");

        List<String> Lore1 = new ArrayList<String>();

        ItemStack stats = new ItemStack(Material.NETHER_STAR);
        ItemMeta statsmeta = stats.getItemMeta();
        Lore1.add("§r");
        Lore1.add("§e§kLL §r §fKills: §a" + PlayerData.getKills(player) + " §e§kLL");
        Lore1.add("§r ");
        Lore1.add("§e§kLL §r §fDeaths: §a" + PlayerData.getDeaths(player) + " §e§kLL");
        Lore1.add("§r  ");
        Lore1.add("§e§kLL §r §fK/D: §aError §e§kLL");
        Lore1.add("§r   ");
        Lore1.add("§e§kLL §r §7??? §e§kLL");

        statsmeta.setLore(Lore1);
        statsmeta.setDisplayName("§aStats");

        stats.setItemMeta(statsmeta);

        inv.setItem(13, stats);
        Main.inventory.add(inv);

        player.openInventory(inv);

    }

}
