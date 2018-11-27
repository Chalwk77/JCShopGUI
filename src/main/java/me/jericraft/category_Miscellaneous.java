package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import static me.jericraft.main_menu.createGuiItem;

public class category_Miscellaneous {
    public static Inventory miscellaneous_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Misccellaneous (page 1)");
    public static void addItems_Miscellaneous_1() {
        miscellaneous_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.STONE));
    }
}

