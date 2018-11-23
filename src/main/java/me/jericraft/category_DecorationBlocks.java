package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.shop_gui.decorationBlocks_1;
import static me.jericraft.shop_gui.createGuiItem;

public class category_DecorationBlocks {

    public static void addItems_DecoratoinBlocks_1() {
        decorationBlocks_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

