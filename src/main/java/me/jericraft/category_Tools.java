package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import static me.jericraft.main_menu.createGuiItem;

public class category_Tools {
    public static Inventory tools_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Tools (page 1)");
    public static void addItems_Tools_1() {
        tools_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.STONE));
    }
}

