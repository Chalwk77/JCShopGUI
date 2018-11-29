
/*
 * Copyright (c) 2018.  JCShopGUI,  Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.
 */

package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_Food {
    public static Inventory food_1 = org.bukkit.Bukkit.createInventory(null, 45, ChatColor.RED + "Food");

    public static void addItems_Food_1() {
        food_1.addItem(createGuiItem(Material.APPLE));
        food_1.addItem(createGuiItem(Material.MUSHROOM_STEM));
        food_1.addItem(createGuiItem(Material.BREAD));
        food_1.addItem(createGuiItem(Material.PORKCHOP));
        food_1.addItem(createGuiItem(Material.COOKED_PORKCHOP));
        food_1.addItem(createGuiItem(Material.GOLDEN_APPLE));
        food_1.addItem(createGuiItem(Material.ENCHANTED_GOLDEN_APPLE));
        food_1.addItem(createGuiItem(Material.COD));
        food_1.addItem(createGuiItem(Material.SALMON));
        food_1.addItem(createGuiItem(Material.TROPICAL_FISH));
        food_1.addItem(createGuiItem(Material.PUFFERFISH));
        food_1.addItem(createGuiItem(Material.COOKED_COD));
        food_1.addItem(createGuiItem(Material.COOKED_SALMON));
        food_1.addItem(createGuiItem(Material.CAKE));
        food_1.addItem(createGuiItem(Material.COOKIE));
        food_1.addItem(createGuiItem(Material.MELON_SLICE));
        food_1.addItem(createGuiItem(Material.DRIED_KELP));
        food_1.addItem(createGuiItem(Material.BEEF));
        food_1.addItem(createGuiItem(Material.COOKED_BEEF));
        food_1.addItem(createGuiItem(Material.CHICKEN));
        food_1.addItem(createGuiItem(Material.COOKED_CHICKEN));
        food_1.addItem(createGuiItem(Material.ROTTEN_FLESH));
        food_1.addItem(createGuiItem(Material.SPIDER_EYE));
        food_1.addItem(createGuiItem(Material.CARROT));
        food_1.addItem(createGuiItem(Material.POTATO));
        food_1.addItem(createGuiItem(Material.BAKED_POTATO));
        food_1.addItem(createGuiItem(Material.POISONOUS_POTATO));
        food_1.addItem(createGuiItem(Material.PUMPKIN_PIE));
        food_1.addItem(createGuiItem(Material.RABBIT));
        food_1.addItem(createGuiItem(Material.COOKED_RABBIT));
        food_1.addItem(createGuiItem(Material.RABBIT_STEW));
        food_1.addItem(createGuiItem(Material.MUTTON));
        food_1.addItem(createGuiItem(Material.COOKED_MUTTON));
        food_1.addItem(createGuiItem(Material.BEETROOT));
        food_1.addItem(createGuiItem(Material.BEETROOT_SOUP));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        food_1.setItem(36, new ItemStack(previousPage));
    }
}

