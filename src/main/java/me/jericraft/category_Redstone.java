package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_Redstone implements Listener {
    public static Inventory redstone_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Redstone (page 1)");

    public static void addItems_Redstone1() {
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DISPENSER));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.NOTE_BLOCK));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.STICKY_PISTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.PISTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.TNT));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LEVER));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.REDSTONE_TORCH));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.REDSTONE_LAMP));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.TRIPWIRE_HOOK));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.TRAPPED_CHEST));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.LIGHT_WEIGHTED_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.HEAVY_WEIGHTED_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DAYLIGHT_DETECTOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.REDSTONE_BLOCK));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.HOPPER));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DROPPER));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.IRON_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OBSERVER));
        redstone_1.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.IRON_DOOR));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        redstone_1.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (2) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        redstone_1.setItem(53, new ItemStack(nextPage));
    }
    public static Inventory redstone_2 = org.bukkit.Bukkit.createInventory(null, 18, ChatColor.RED + "Redstone (page 2)");
    public static void addItems_Redstone2() {
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.OAK_DOOR));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.SPRUCE_DOOR));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.BIRCH_DOOR));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.JUNGLE_DOOR));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.ACACIA_DOOR));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.DARK_OAK_DOOR));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.REPEATER));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.COMPARATOR));
        redstone_2.addItem(createGuiItem("item_name", new ArrayList<String>(Arrays.asList("lore")), Material.REDSTONE));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (1) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        redstone_2.setItem(9, new ItemStack(previousPage));
    }
}
