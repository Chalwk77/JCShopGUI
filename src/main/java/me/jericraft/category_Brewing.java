
/*
 * Copyright (c) 2018.  JCShopGUI,  Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.
 */

package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static me.jericraft.main_menu.createGuiItem;

public class category_Brewing {
    public static Inventory brewing_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Brewing (page 1)");

    public static void addItems_Brewing_1() {
        brewing_1.addItem(createGuiItem(Material.GHAST_TEAR));

        ItemStack health_regen = new ItemStack(Material.POTION);
        PotionMeta potionmeta = (PotionMeta) health_regen.getItemMeta();
        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 3000, 0);
        PotionEffect regen = new PotionEffect(PotionEffectType.REGENERATION, 1000, 1);
        potionmeta.addCustomEffect(speed, true);
        potionmeta.addCustomEffect(regen, true);
        potionmeta.setDisplayName(ChatColor.DARK_PURPLE + "Night Vision 1 (3000)");
        health_regen.setItemMeta(potionmeta);
        brewing_1.setItem(1, health_regen);
    }
}

