package net.rishon.site.ItemBuilder;


import java.util.Map;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemBuilder {
    private ItemStack item;

    public ItemBuilder(Material m){
        this(m, 1);
    }

    public ItemBuilder(ItemStack item){
        this.item = item;
    }

    public ItemBuilder(Material m, int amount){
        item= new ItemStack(m, amount);
    }

    public ItemBuilder clone(){
        return new ItemBuilder(item);
    }

    public ItemBuilder setName(String name){
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(name);
        item.setItemMeta(im);
        return this;
    }

    public ItemBuilder setSkull(String owner){
        try{
            SkullMeta meta = (SkullMeta)item.getItemMeta();
            meta.setOwner(owner);
            item.setItemMeta(meta);
        }catch(ClassCastException expected){}
        return this;
    }

    public ItemBuilder addEnchant(Enchantment enchant, int level){
        ItemMeta im = item.getItemMeta();
        im.addEnchant(enchant, level, true);
        item.setItemMeta(im);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        ItemMeta meta = item.getItemMeta();
        meta.spigot().setUnbreakable(unbreakable);
        item.setItemMeta(meta);
        return this;
    }


    public ItemStack toItemStack(){
        return item;
    }
}