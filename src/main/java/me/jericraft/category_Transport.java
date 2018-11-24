package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;

import static me.jericraft.main_menu.transport_1;
import static me.jericraft.main_menu.createGuiItem;

public class category_Transport {

    public static void addItems_Transport_1() {
        transport_1.addItem(createGuiItem(ChatColor.BLUE + "item name", new ArrayList<String>(Arrays.asList("lore")), Material.STONE));
    }
}

