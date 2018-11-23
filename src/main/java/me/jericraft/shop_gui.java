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

public class shop_gui implements Listener {

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

    public static Inventory buildingBlocks_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory decorationBlocks_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory redstone_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory transport_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory miscellaneous_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory food_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory tools_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory combat_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");
    public static Inventory brewing_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Building Blocks (page 1)");

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
        String invName = event.getInventory().getName();
        if (!invName.equals(menu.getName()) && (!invName.equals(buildingBlocks_1.getName()))) {
            return;
        }
        if (event.getClick().equals(ClickType.NUMBER_KEY)) {
            event.setCancelled(true);
        }
        event.setCancelled(true);

        Player player = (Player) event.getWhoClicked();
        ItemStack clickedItem = event.getCurrentItem();

        if (clickedItem == null || clickedItem.getType().equals(Material.AIR)) return;

        if (event.getRawSlot() == 10) player.sendMessage("You clicked at slot " + 1);
        if (clickedItem.getType().equals(Material.BRICKS)) {
            player.closeInventory();
            category_BuildingBlocks.addItems_BuildingBlocks_1();
            player.openInventory(buildingBlocks_1);
        } else if (clickedItem.getType().equals(Material.PEONY)) {
            player.closeInventory();
            category_DecorationBlocks.addItems_DecoratoinBlocks_1();
            player.openInventory(decorationBlocks_1);
        } else if (clickedItem.getType().equals(Material.REDSTONE)) {
            player.closeInventory();
            category_Redstone.addItems_Redstone_1();
            player.openInventory(redstone_1);
        } else if (clickedItem.getType().equals(Material.POWERED_RAIL)) {
            player.closeInventory();
            category_Transport.addItems_Transport_1();
            player.openInventory(transport_1);
        } else if (clickedItem.getType().equals(Material.LAVA_BUCKET)) {
            player.closeInventory();
            category_Miscellaneous.addItems_Miscellaneous_1();
            player.openInventory(miscellaneous_1);
        } else if (clickedItem.getType().equals(Material.APPLE)) {
            player.closeInventory();
            category_Food.addItems_Food_1();
            player.openInventory(food_1);
        } else if (clickedItem.getType().equals(Material.IRON_AXE)) {
            player.closeInventory();
            category_Tools.addItems_Tools_1();
            player.openInventory(tools_1);
        } else if (clickedItem.getType().equals(Material.GOLDEN_SWORD)) {
            player.closeInventory();
            category_Combat.addItems_Combat_1();
            player.openInventory(combat_1);
        } else if (clickedItem.getType().equals(Material.POTION)) {
            player.closeInventory();
            category_Brewing.addItems_Brewing_1();
            player.openInventory(brewing_1);
        }
    }
}