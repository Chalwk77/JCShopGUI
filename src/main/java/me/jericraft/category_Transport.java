package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_Transport {
    public static Inventory transport_1 = org.bukkit.Bukkit.createInventory(null, 27, ChatColor.RED + "Transport");
    public static void addItems_Transport_1() {
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.POWERED_RAIL));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.DETECTOR_RAIL));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.RAIL));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.ACTIVATOR_RAIL));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.MINECART));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.SADDLE));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.OAK_BOAT));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.CHEST_MINECART));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.FURNACE_MINECART));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.CARROT_ON_A_STICK));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.TNT_MINECART));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.HOPPER_MINECART));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.ELYTRA));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.SPRUCE_BOAT));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.BIRCH_BOAT));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.JUNGLE_BOAT));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.ACACIA_BOAT));
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.DARK_OAK_BOAT));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        transport_1.setItem(18, new ItemStack(previousPage));
    }
}

