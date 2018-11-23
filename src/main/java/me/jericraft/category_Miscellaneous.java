package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.shop_gui.miscellaneous_1;
import static me.jericraft.shop_gui.createGuiItem;

public class category_Miscellaneous {

    public static void addItems_Miscellaneous_1() {
        miscellaneous_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

