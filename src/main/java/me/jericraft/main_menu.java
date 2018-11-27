package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.inventory.Inventory;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.ItemMeta;

import static me.jericraft.category_Brewing.brewing_1;
import static me.jericraft.category_BuildingBlocks.buildingBlocks_1;
import static me.jericraft.category_Combat.combat_1;
import static me.jericraft.category_DecorationBlocks.decorationBlocks_1;
import static me.jericraft.category_Food.food_1;
import static me.jericraft.category_Miscellaneous.miscellaneous_1;
import static me.jericraft.category_Redstone.redstone_1;
import static me.jericraft.category_Tools.tools_1;
import static me.jericraft.category_Transport.transport_1;

public class main_menu implements Listener {

    public static Inventory menu = org.bukkit.Bukkit.createInventory(null, 9, ChatColor.RED + "The Shop Menu");

    public static void initMenuIcons() {
        menu.addItem(createGuiItem(ChatColor.BLUE + "Building Blocks", new ArrayList<String>(Arrays.asList("data")), Material.BRICKS));
        menu.addItem(createGuiItem("Decoration Items", new ArrayList<String>(Arrays.asList("data")), Material.PEONY));
        menu.addItem(createGuiItem("Redstone", new ArrayList<String>(Arrays.asList("data")), Material.REDSTONE));
        menu.addItem(createGuiItem("Transport", new ArrayList<String>(Arrays.asList("data")), Material.POWERED_RAIL));
        menu.addItem(createGuiItem("Miscellaneous", new ArrayList<String>(Arrays.asList("data")), Material.LAVA_BUCKET));
        menu.addItem(createGuiItem("Food", new ArrayList<String>(Arrays.asList("data")), Material.APPLE));
        menu.addItem(createGuiItem("Tools", new ArrayList<String>(Arrays.asList("data")), Material.IRON_AXE));
        menu.addItem(createGuiItem("Combat", new ArrayList<String>(Arrays.asList("data")), Material.GOLDEN_SWORD));
        menu.addItem(createGuiItem("Brewing", new ArrayList<String>(Arrays.asList("data")), Material.POTION));
    }

    public static ItemStack createGuiItem(String name, ArrayList<String> desc, Material mat) {
        ItemStack i = new ItemStack(mat, 1);
        ItemMeta iMeta = i.getItemMeta();
        iMeta.setDisplayName(name);
        iMeta.setLore(desc);
        i.setItemMeta(iMeta);
        return i;
    }

    public static void openMainMenu(Player p) {
        p.openInventory(menu);
        return;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        String invTitle = event.getInventory().getTitle();
        if (!invTitle.contains("The Shop Menu")) {
            return;
        }
        if (event.getClick().equals(ClickType.NUMBER_KEY)) {
            event.setCancelled(true);
        }
        event.setCancelled(true);

        Player player = (Player) event.getWhoClicked();
        ItemStack clickedItem = event.getCurrentItem();

        if (clickedItem == null || clickedItem.getType().equals(Material.AIR)) return;

        if (clickedItem.getType().equals(Material.BRICKS)) {
            player.closeInventory();
            player.openInventory(buildingBlocks_1);
        } else if (clickedItem.getType().equals(Material.PEONY)) {
            player.closeInventory();
            player.openInventory(decorationBlocks_1);
        } else if (clickedItem.getType().equals(Material.REDSTONE)) {
            player.closeInventory();
            player.openInventory(redstone_1);
        } else if (clickedItem.getType().equals(Material.POWERED_RAIL)) {
            player.closeInventory();
            player.openInventory(transport_1);
        } else if (clickedItem.getType().equals(Material.LAVA_BUCKET)) {
            player.closeInventory();
            player.openInventory(miscellaneous_1);
        } else if (clickedItem.getType().equals(Material.APPLE)) {
            player.closeInventory();
            player.openInventory(food_1);
        } else if (clickedItem.getType().equals(Material.IRON_AXE)) {
            player.closeInventory();
            player.openInventory(tools_1);
        } else if (clickedItem.getType().equals(Material.GOLDEN_SWORD)) {
            player.closeInventory();
            player.openInventory(combat_1);
        } else if (clickedItem.getType().equals(Material.POTION)) {
            player.closeInventory();
            player.openInventory(brewing_1);
        }
    }
}