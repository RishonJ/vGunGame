package me.rishon.strixgg.layers;

import me.rishon.strixgg.FileManager.PlayerData;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class layer1 {

    public static void clear(Player p) {

        p.getInventory().clear();
        p.getInventory().setHelmet(null);
        p.getInventory().setChestplate(null);
        p.getInventory().setLeggings(null);
        p.getInventory().setBoots(null);


        ItemStack phead = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta pheadmeta = (SkullMeta)phead.getItemMeta();
        pheadmeta.setOwner(p.getName());
        pheadmeta.setDisplayName("§eProfile");
        phead.setItemMeta(pheadmeta);
        p.getInventory().setItem(8, phead);

    }

    public static void layer1(Player player) {


        if (PlayerData.getCurrentLevel(player) == 1) {

            clear(player);

            ItemStack axe = new ItemStack(Material.WOODEN_AXE, 1);
            ItemMeta axeMeta = axe.getItemMeta();
            axeMeta.setUnbreakable(true);
            axe.setItemMeta(axeMeta);

            player.getInventory().setItem(0, axe);

        } else if (PlayerData.getCurrentLevel(player) == 2) {


            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);


        } else if (PlayerData.getCurrentLevel(player) == 3) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);


        } else if (PlayerData.getCurrentLevel(player) == 4) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);


        } else if (PlayerData.getCurrentLevel(player) == 5) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();
            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(lchestMeta);

            player.getInventory().setLeggings(lleg);


        } else if (PlayerData.getCurrentLevel(player) == 6) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();
            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(lchestMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);



        }
    }

}
