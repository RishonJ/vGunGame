package me.rishon.strixgg.Menu;


import me.rishon.strixgg.ChatUtil;
import me.rishon.strixgg.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GUI {

    public static void ProfileGUI(Player p) {
        Inventory inv = Bukkit.createInventory(null, 27, ChatUtil.format("§3§n" + p.getName() + " Profile"));


        List<String> Lore1 = new ArrayList<String>();

        ItemStack info = new ItemStack(Material.PAPER);
        ItemMeta infometa = info.getItemMeta();
        Lore1.add(" ");
        Lore1.add("§e§kLL §7View your stats §e§kLL");
        Lore1.add(" ");

        infometa.setLore(Lore1);
        infometa.setDisplayName("§dStats");

        info.setItemMeta(infometa);

        inv.setItem(10, info);
        Main.inventory.add(inv);

        List<String> Lore2 = new ArrayList<String>();

        ItemStack perk = new ItemStack(Material.REDSTONE);
        ItemMeta perkmeta = perk.getItemMeta();
        Lore2.add(" ");
        Lore2.add("§e§kLL §7Get more powerful §e§kLL");
        Lore2.add(" ");

        perkmeta.setLore(Lore2);
        perkmeta.setDisplayName("§cPerks");

        perk.setItemMeta(perkmeta);

        inv.setItem(13, perk);
        Main.inventory.add(inv);

        List<String> Lore3 = new ArrayList<String>();

        ItemStack cos = new ItemStack(Material.STRING);
        ItemMeta cosmeta = cos.getItemMeta();
        Lore3.add(" ");
        Lore3.add("§e§kLL §7Show off beauty §e§kLL");
        Lore3.add(" ");

        cosmeta.setLore(Lore3);
        cosmeta.setDisplayName("§bCosmetics");

        cos.setItemMeta(cosmeta);

        inv.setItem(16, cos);
        Main.inventory.add(inv);

        p.openInventory(inv);
    }


}
