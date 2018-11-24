package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.main_menu.decorationBlocks_1;
import static me.jericraft.main_menu.createGuiItem;

public class category_DecorationBlocks {

    public static void addItems_DecorationBlocks_1() {
        decorationBlocks_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

