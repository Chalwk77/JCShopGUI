package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import static me.jericraft.main_menu.createGuiItem;

public class category_Brewing {
    public static Inventory brewing_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Brewing (page 1)");
    public static void addItems_Brewing_1() {
        brewing_1.addItem(createGuiItem(Material.BARRIER));
    }
}

