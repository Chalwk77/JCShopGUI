package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.shop_gui.tools_1;
import static me.jericraft.shop_gui.createGuiItem;

public class category_Tools {

    public static void addItems_Tools_1() {
        tools_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

