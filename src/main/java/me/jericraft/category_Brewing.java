package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.main_menu.brewing_1;
import static me.jericraft.main_menu.createGuiItem;

public class category_Brewing {

    public static void addItems_Brewing_1() {
        brewing_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

