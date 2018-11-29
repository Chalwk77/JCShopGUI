
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

class category_Combat {
    static Inventory combat_1 = org.bukkit.Bukkit.createInventory(null, 45, ChatColor.RED + "Combat (page 1)");

    static void addItems_Combat_1() {
        combat_1.addItem(createGuiItem(Material.TURTLE_HELMET));
        combat_1.addItem(createGuiItem(Material.BOW));
        combat_1.addItem(createGuiItem(Material.ARROW));
        combat_1.addItem(createGuiItem(Material.IRON_SWORD));
        combat_1.addItem(createGuiItem(Material.WOODEN_SWORD));
        combat_1.addItem(createGuiItem(Material.IRON_SWORD));
        combat_1.addItem(createGuiItem(Material.STONE_SWORD));
        combat_1.addItem(createGuiItem(Material.DIAMOND_SWORD));
        combat_1.addItem(createGuiItem(Material.GOLDEN_SWORD));
        combat_1.addItem(createGuiItem(Material.LEATHER_HELMET));
        combat_1.addItem(createGuiItem(Material.LEATHER_CHESTPLATE));
        combat_1.addItem(createGuiItem(Material.LEATHER_LEGGINGS));
        combat_1.addItem(createGuiItem(Material.LEATHER_BOOTS));
        combat_1.addItem(createGuiItem(Material.CHAINMAIL_HELMET));
        combat_1.addItem(createGuiItem(Material.CHAINMAIL_CHESTPLATE));
        combat_1.addItem(createGuiItem(Material.CHAINMAIL_LEGGINGS));
        combat_1.addItem(createGuiItem(Material.CHAINMAIL_BOOTS));
        combat_1.addItem(createGuiItem(Material.IRON_HELMET));
        combat_1.addItem(createGuiItem(Material.IRON_CHESTPLATE));
        combat_1.addItem(createGuiItem(Material.IRON_LEGGINGS));
        combat_1.addItem(createGuiItem(Material.IRON_BOOTS));
        combat_1.addItem(createGuiItem(Material.DIAMOND_HELMET));
        combat_1.addItem(createGuiItem(Material.DIAMOND_CHESTPLATE));
        combat_1.addItem(createGuiItem(Material.DIAMOND_LEGGINGS));
        combat_1.addItem(createGuiItem(Material.DIAMOND_BOOTS));
        combat_1.addItem(createGuiItem(Material.GOLDEN_HELMET));
        combat_1.addItem(createGuiItem(Material.GOLDEN_CHESTPLATE));
        combat_1.addItem(createGuiItem(Material.GOLDEN_LEGGINGS));
        combat_1.addItem(createGuiItem(Material.GOLDEN_BOOTS));
        //todo: fix missing enchantment books between GOLDEN_BOOTS & SHIELD
        combat_1.addItem(createGuiItem(Material.SHIELD));
        combat_1.addItem(createGuiItem(Material.TOTEM_OF_UNDYING));
        combat_1.addItem(createGuiItem(Material.TRIDENT));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        combat_1.setItem(36, new ItemStack(previousPage));
    }
}

