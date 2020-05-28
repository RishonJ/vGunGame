package me.rishon.strixgg.layers;

import me.rishon.strixgg.FileManager.PlayerData;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class layer8 {

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

    public static void layer8(Player player) {


        if (PlayerData.getCurrentLevel(player) == 43) {

            clear(player);

            ItemStack axe = new ItemStack(Material.IRON_AXE, 1);
            ItemMeta axeMeta = axe.getItemMeta();
            axeMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            axeMeta.setUnbreakable(true);
            axe.setItemMeta(axeMeta);

            player.getInventory().setItem(0, axe);

            ItemStack lhelmet = new ItemStack(Material.IRON_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);

            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();

            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();

            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.IRON_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();

            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);

        } else if (PlayerData.getCurrentLevel(player) == 44) {


            clear(player);

            ItemStack sword = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            swordMeta.setUnbreakable(true);

            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.IRON_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.setUnbreakable(true);

            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();

            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();

            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.IRON_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();

            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 45) {

            clear(player);

            ItemStack sword = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.IRON_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();

            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();

            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.IRON_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();

            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 46) {

            clear(player);

            ItemStack sword = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.IRON_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();

            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.IRON_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();

            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 47) {

            clear(player);

            ItemStack sword = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.IRON_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();
            llegMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.IRON_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();

            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);


        } else if (PlayerData.getCurrentLevel(player) == 48) {

            clear(player);

            ItemStack sword = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setUnbreakable(true);
            swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
            sword.setItemMeta(swordMeta);

            player.getInventory().setItem(0, sword);

            ItemStack lhelmet = new ItemStack(Material.IRON_HELMET, 1);
            ItemMeta lhelmetMeta = lhelmet.getItemMeta();
            lhelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lhelmetMeta.setUnbreakable(true);
            lhelmet.setItemMeta(lhelmetMeta);

            player.getInventory().setHelmet(lhelmet);

            ItemStack lchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemMeta lchestMeta = lchest.getItemMeta();
            lchestMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lchestMeta.setUnbreakable(true);
            lchest.setItemMeta(lchestMeta);

            player.getInventory().setChestplate(lchest);

            ItemStack lleg = new ItemStack(Material.IRON_LEGGINGS, 1);
            ItemMeta llegMeta = lleg.getItemMeta();
            llegMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            llegMeta.setUnbreakable(true);
            lleg.setItemMeta(llegMeta);

            player.getInventory().setLeggings(lleg);

            ItemStack lboots = new ItemStack(Material.IRON_BOOTS, 1);
            ItemMeta lbootsMeta = lboots.getItemMeta();
            lbootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            lbootsMeta.setUnbreakable(true);
            lboots.setItemMeta(lbootsMeta);

            player.getInventory().setBoots(lboots);



        }
    }

}
