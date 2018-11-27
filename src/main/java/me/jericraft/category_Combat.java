package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import static me.jericraft.main_menu.createGuiItem;

public class category_Combat {
    public static Inventory combat_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Combat (page 1)");
    public static void addItems_Combat_1() {
        combat_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.STONE));
    }
}

