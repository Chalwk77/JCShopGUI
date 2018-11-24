package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.main_menu.tools_1;
import static me.jericraft.main_menu.createGuiItem;

public class category_Tools {

    public static void addItems_Tools_1() {
        tools_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

