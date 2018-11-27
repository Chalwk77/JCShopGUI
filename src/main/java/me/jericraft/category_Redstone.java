package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_Redstone implements Listener {
    public static Inventory redstone_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Redstone (page 1)");

    public static void addItems_Redstone1() {
        redstone_1.addItem(createGuiItem("item_name", Material.DISPENSER));
        redstone_1.addItem(createGuiItem("item_name", Material.NOTE_BLOCK));
        redstone_1.addItem(createGuiItem("item_name", Material.STICKY_PISTON));
        redstone_1.addItem(createGuiItem("item_name", Material.PISTON));
        redstone_1.addItem(createGuiItem("item_name", Material.TNT));
        redstone_1.addItem(createGuiItem("item_name", Material.LEVER));
        redstone_1.addItem(createGuiItem("item_name", Material.STONE_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.OAK_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.SPRUCE_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.BIRCH_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.JUNGLE_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.ACACIA_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.DARK_OAK_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.REDSTONE_TORCH));
        redstone_1.addItem(createGuiItem("item_name", Material.STONE_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", Material.OAK_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", Material.SPRUCE_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", Material.BIRCH_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", Material.JUNGLE_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", Material.ACACIA_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", Material.DARK_OAK_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", Material.OAK_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", Material.SPRUCE_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", Material.BIRCH_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", Material.JUNGLE_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", Material.ACACIA_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", Material.DARK_OAK_FENCE_GATE));
        redstone_1.addItem(createGuiItem("item_name", Material.REDSTONE_LAMP));
        redstone_1.addItem(createGuiItem("item_name", Material.TRIPWIRE_HOOK));
        redstone_1.addItem(createGuiItem("item_name", Material.OAK_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", Material.SPRUCE_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", Material.BIRCH_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", Material.JUNGLE_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", Material.ACACIA_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", Material.DARK_OAK_BUTTON));
        redstone_1.addItem(createGuiItem("item_name", Material.TRAPPED_CHEST));
        redstone_1.addItem(createGuiItem("item_name", Material.LIGHT_WEIGHTED_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.HEAVY_WEIGHTED_PRESSURE_PLATE));
        redstone_1.addItem(createGuiItem("item_name", Material.DAYLIGHT_DETECTOR));
        redstone_1.addItem(createGuiItem("item_name", Material.REDSTONE_BLOCK));
        redstone_1.addItem(createGuiItem("item_name", Material.HOPPER));
        redstone_1.addItem(createGuiItem("item_name", Material.DROPPER));
        redstone_1.addItem(createGuiItem("item_name", Material.IRON_TRAPDOOR));
        redstone_1.addItem(createGuiItem("item_name", Material.OBSERVER));
        redstone_1.addItem(createGuiItem("item_name", Material.IRON_DOOR));
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
        redstone_2.addItem(createGuiItem("item_name", Material.OAK_DOOR));
        redstone_2.addItem(createGuiItem("item_name", Material.SPRUCE_DOOR));
        redstone_2.addItem(createGuiItem("item_name", Material.BIRCH_DOOR));
        redstone_2.addItem(createGuiItem("item_name", Material.JUNGLE_DOOR));
        redstone_2.addItem(createGuiItem("item_name", Material.ACACIA_DOOR));
        redstone_2.addItem(createGuiItem("item_name", Material.DARK_OAK_DOOR));
        redstone_2.addItem(createGuiItem("item_name", Material.REPEATER));
        redstone_2.addItem(createGuiItem("item_name", Material.COMPARATOR));
        redstone_2.addItem(createGuiItem("item_name", Material.REDSTONE));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (1) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        redstone_2.setItem(9, new ItemStack(previousPage));
    }
}
