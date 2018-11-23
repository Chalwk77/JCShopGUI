package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.shop_gui.redstone_1;
import static me.jericraft.shop_gui.createGuiItem;

public class category_Redstone {

    public static void addItems_Redstone_1() {
        redstone_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

