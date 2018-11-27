package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import static me.jericraft.main_menu.createGuiItem;

public class category_Food {
    public static Inventory food_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Food (page 1)");
    public static void addItems_Food_1() {
        food_1.addItem(createGuiItem(ChatColor.BLUE + "item name", Material.STONE));
    }
}

