package net.rishon.site.ItemBuilder;

import net.rishon.site.Main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class Levels {

    public static void getPlayerContent(Player player) {

        int playerLevel = Main.getLevel.get(player);

        switch (playerLevel) {
            case 1:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_AXE).setName("§bWooden Axe").setUnbreakable(true).toItemStack()));
                break;
            case 2:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).toItemStack()));
                break;
            case 3:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).toItemStack()));
                break;
            case 4:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).toItemStack()));
                break;
            case 5:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).toItemStack()));
                break;
            case 6:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).toItemStack()));
                break;
            case 7:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_AXE).setName("§bWooden Axe").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).toItemStack()));
                break;
            case 8:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).toItemStack()));
                break;
            case 9:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).toItemStack()));
                break;
            case 10:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).toItemStack()));
                break;
            case 11:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).toItemStack()));
                break;
            case 12:
                player.getInventory().setItem(0, (new ItemBuilder(Material.WOODEN_SWORD).setName("§bWooden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 13:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_AXE).setName("§bStone Axe").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 14:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.LEATHER_HELMET).setName("§bLeather Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 15:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.LEATHER_CHESTPLATE).setName("§bLeather Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 16:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.LEATHER_LEGGINGS).setName("§bLeather Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 17:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.LEATHER_BOOTS).setName("§bLeather Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 18:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).toItemStack()));
                break;
            case 19:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_AXE).setName("§bStone Axe").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).toItemStack()));
                break;
            case 20:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).toItemStack()));
                break;
            case 21:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).toItemStack()));
                break;
            case 22:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).toItemStack()));
                break;
            case 23:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).toItemStack()));
                break;
            case 24:
                player.getInventory().setItem(0, (new ItemBuilder(Material.STONE_SWORD).setName("§bStone Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 25:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_AXE).setName("§bGolden Axe").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 26:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.CHAINMAIL_HELMET).setName("§bChain Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 27:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§bChain Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 28:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.CHAINMAIL_LEGGINGS).setName("§bChain Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 29:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.CHAINMAIL_BOOTS).setName("§bChain Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 30:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).toItemStack()));
                break;
            case 31:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_AXE).setName("§bGolden Axe").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).toItemStack()));
                break;
            case 32:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).toItemStack()));
                break;
            case 33:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).toItemStack()));
                break;
            case 34:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).toItemStack()));
                break;
            case 35:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).toItemStack()));
                break;
            case 36:
                player.getInventory().setItem(0, (new ItemBuilder(Material.GOLDEN_SWORD).setName("§bGolden Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 37:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_AXE).setName("§bIron Axe").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 38:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.GOLDEN_HELMET).setName("§bGolden Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 39:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.GOLDEN_CHESTPLATE).setName("§bGolden Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 40:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.GOLDEN_LEGGINGS).setName("§bGolden Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 41:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.GOLDEN_BOOTS).setName("§bGolden Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 42:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).toItemStack()));
                break;
            case 43:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_AXE).setName("§bIron Axe").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).toItemStack()));
                break;
            case 44:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).toItemStack()));
                break;
            case 45:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).toItemStack()));
                break;
            case 46:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).toItemStack()));
                break;
            case 47:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).toItemStack()));
                break;
            case 48:
                player.getInventory().setItem(0, (new ItemBuilder(Material.IRON_SWORD).setName("§bIron Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 49:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_AXE).setName("§bDiamond Axe").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 50:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.IRON_HELMET).setName("§bIron Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 51:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.IRON_CHESTPLATE).setName("§bIron Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 52:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.IRON_LEGGINGS).setName("§bIron Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 53:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.IRON_BOOTS).setName("§bIron Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
            case 54:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.DIAMOND_BOOTS).setName("§bDiamond Boots").setUnbreakable(true).toItemStack()));
                break;
            case 55:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_AXE).setName("§bDiamond Axe").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.DIAMOND_BOOTS).setName("§bDiamond Boots").setUnbreakable(true).toItemStack()));
                break;
            case 56:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.DIAMOND_BOOTS).setName("§bDiamond Boots").setUnbreakable(true).toItemStack()));
                break;
            case 57:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.DIAMOND_BOOTS).setName("§bDiamond Boots").setUnbreakable(true).toItemStack()));
                break;
            case 58:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.DIAMOND_BOOTS).setName("§bDiamond Boots").setUnbreakable(true).toItemStack()));
                break;
            case 59:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.DIAMOND_BOOTS).setName("§bDiamond Boots").setUnbreakable(true).toItemStack()));
                break;
            case 60:
                player.getInventory().setItem(0, (new ItemBuilder(Material.DIAMOND_SWORD).setName("§bDiamond Sword").setUnbreakable(true).addEnchant(Enchantment.DAMAGE_ALL, 1).toItemStack()));
                player.getInventory().setHelmet((new ItemBuilder(Material.DIAMOND_HELMET).setName("§bDiamond Helmet").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setChestplate((new ItemBuilder(Material.DIAMOND_CHESTPLATE).setName("§bDiamond Chestplate").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setLeggings((new ItemBuilder(Material.DIAMOND_LEGGINGS).setName("§bDiamond Leggings").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                player.getInventory().setBoots((new ItemBuilder(Material.DIAMOND_BOOTS).setName("§bDiamond Boots").setUnbreakable(true).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).toItemStack()));
                break;
        }
    }
}
