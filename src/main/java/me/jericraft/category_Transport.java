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
        transport_1.addItem(createGuiItem(Material.POWERED_RAIL));
        transport_1.addItem(createGuiItem(Material.DETECTOR_RAIL));
        transport_1.addItem(createGuiItem(Material.RAIL));
        transport_1.addItem(createGuiItem(Material.ACTIVATOR_RAIL));
        transport_1.addItem(createGuiItem(Material.MINECART));
        transport_1.addItem(createGuiItem(Material.SADDLE));
        transport_1.addItem(createGuiItem(Material.OAK_BOAT));
        transport_1.addItem(createGuiItem(Material.CHEST_MINECART));
        transport_1.addItem(createGuiItem(Material.FURNACE_MINECART));
        transport_1.addItem(createGuiItem(Material.CARROT_ON_A_STICK));
        transport_1.addItem(createGuiItem(Material.TNT_MINECART));
        transport_1.addItem(createGuiItem(Material.HOPPER_MINECART));
        transport_1.addItem(createGuiItem(Material.ELYTRA));
        transport_1.addItem(createGuiItem(Material.SPRUCE_BOAT));
        transport_1.addItem(createGuiItem(Material.BIRCH_BOAT));
        transport_1.addItem(createGuiItem(Material.JUNGLE_BOAT));
        transport_1.addItem(createGuiItem(Material.ACACIA_BOAT));
        transport_1.addItem(createGuiItem(Material.DARK_OAK_BOAT));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        transport_1.setItem(18, new ItemStack(previousPage));
    }
}

