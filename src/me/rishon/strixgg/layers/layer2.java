package me.rishon.strixgg.layers;

import me.rishon.strixgg.FileManager.PlayerData;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class layer2 {

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

    public static void layer2(Player player) {


        if (PlayerData.getCurrentLevel(player) == 7) {

            clear(player);

            ItemStack axe = new ItemStack(Material.WOODEN_AXE, 1);
            ItemMeta axeMeta = axe.getItemMeta();
            axeMeta.setUnbreakable(true);
            axeMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            axe.setItemMeta(axeMeta);

            player.getInventory().setItem(0, axe);

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
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);

        } else if (PlayerData.getCurrentLevel(player) == 8) {


            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
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
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 9) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
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
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 10) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();
            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 11) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();
            llegMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 12) {

            clear(player);

            ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();
            llegMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);



        }
    }

}
