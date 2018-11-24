package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.main_menu.miscellaneous_1;
import static me.jericraft.main_menu.createGuiItem;

public class category_Miscellaneous {

    public static void addItems_Miscellaneous_1() {
        miscellaneous_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

