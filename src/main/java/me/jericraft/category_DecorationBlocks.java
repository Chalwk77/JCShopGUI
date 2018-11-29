
/*
 * Copyright (c) 2018.  JCShopGUI,  Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.
 */

package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_DecorationBlocks implements Listener {
    public static Inventory decorationBlocks_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 1)");

    public static void addItems_decorationBlocks_1() {
        decorationBlocks_1.addItem(createGuiItem(Material.OAK_SAPLING));
        decorationBlocks_1.addItem(createGuiItem(Material.SPRUCE_SAPLING));
        decorationBlocks_1.addItem(createGuiItem(Material.BIRCH_SAPLING));
        decorationBlocks_1.addItem(createGuiItem(Material.JUNGLE_SAPLING));
        decorationBlocks_1.addItem(createGuiItem(Material.ACACIA_SAPLING));
        decorationBlocks_1.addItem(createGuiItem(Material.DARK_OAK_SAPLING));
        decorationBlocks_1.addItem(createGuiItem(Material.OAK_LEAVES));
        decorationBlocks_1.addItem(createGuiItem(Material.SPRUCE_LEAVES));
        decorationBlocks_1.addItem(createGuiItem(Material.BIRCH_LEAVES));
        decorationBlocks_1.addItem(createGuiItem(Material.JUNGLE_LEAVES));
        decorationBlocks_1.addItem(createGuiItem(Material.ACACIA_LEAVES));
        decorationBlocks_1.addItem(createGuiItem(Material.DARK_OAK_LEAVES));
        decorationBlocks_1.addItem(createGuiItem(Material.COBWEB));
        decorationBlocks_1.addItem(createGuiItem(Material.GRASS));
        decorationBlocks_1.addItem(createGuiItem(Material.FERN));
        decorationBlocks_1.addItem(createGuiItem(Material.DEAD_BUSH));
        decorationBlocks_1.addItem(createGuiItem(Material.SEAGRASS));
        decorationBlocks_1.addItem(createGuiItem(Material.SEA_PICKLE));
        decorationBlocks_1.addItem(createGuiItem(Material.DANDELION));
        decorationBlocks_1.addItem(createGuiItem(Material.POPPY));
        decorationBlocks_1.addItem(createGuiItem(Material.BLUE_ORCHID));
        decorationBlocks_1.addItem(createGuiItem(Material.ALLIUM));
        decorationBlocks_1.addItem(createGuiItem(Material.AZURE_BLUET));
        decorationBlocks_1.addItem(createGuiItem(Material.RED_TULIP));
        decorationBlocks_1.addItem(createGuiItem(Material.ORANGE_TULIP));
        decorationBlocks_1.addItem(createGuiItem(Material.WHITE_TULIP));
        decorationBlocks_1.addItem(createGuiItem(Material.PINK_TULIP));
        decorationBlocks_1.addItem(createGuiItem(Material.OXEYE_DAISY));
        decorationBlocks_1.addItem(createGuiItem(Material.BROWN_MUSHROOM));
        decorationBlocks_1.addItem(createGuiItem(Material.RED_MUSHROOM));
        decorationBlocks_1.addItem(createGuiItem(Material.TORCH));
        decorationBlocks_1.addItem(createGuiItem(Material.END_ROD));
        decorationBlocks_1.addItem(createGuiItem(Material.CHORUS_PLANT));
        decorationBlocks_1.addItem(createGuiItem(Material.CHORUS_FLOWER));
        decorationBlocks_1.addItem(createGuiItem(Material.CHEST));
        decorationBlocks_1.addItem(createGuiItem(Material.CRAFTING_TABLE));
        decorationBlocks_1.addItem(createGuiItem(Material.FARMLAND));
        decorationBlocks_1.addItem(createGuiItem(Material.FURNACE));
        decorationBlocks_1.addItem(createGuiItem(Material.LADDER));
        decorationBlocks_1.addItem(createGuiItem(Material.SNOW));
        decorationBlocks_1.addItem(createGuiItem(Material.CACTUS));
        decorationBlocks_1.addItem(createGuiItem(Material.JUKEBOX));
        decorationBlocks_1.addItem(createGuiItem(Material.OAK_FENCE));
        decorationBlocks_1.addItem(createGuiItem(Material.SPRUCE_FENCE));
        decorationBlocks_1.addItem(createGuiItem(Material.BIRCH_FENCE));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_1.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (2) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_1.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory decorationBlocks_2 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 2)");

    public static void addItems_decorationBlocks_2() {
        decorationBlocks_2.addItem(createGuiItem(Material.JUNGLE_FENCE));
        decorationBlocks_2.addItem(createGuiItem(Material.ACACIA_FENCE));
        decorationBlocks_2.addItem(createGuiItem(Material.DARK_OAK_FENCE));
        decorationBlocks_2.addItem(createGuiItem(Material.INFESTED_STONE));
        decorationBlocks_2.addItem(createGuiItem(Material.INFESTED_COBBLESTONE));
        decorationBlocks_2.addItem(createGuiItem(Material.INFESTED_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem(Material.INFESTED_MOSSY_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem(Material.INFESTED_CRACKED_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem(Material.INFESTED_CHISELED_STONE_BRICKS));
        decorationBlocks_2.addItem(createGuiItem(Material.BROWN_MUSHROOM_BLOCK));
        decorationBlocks_2.addItem(createGuiItem(Material.RED_MUSHROOM_BLOCK));
        decorationBlocks_2.addItem(createGuiItem(Material.MUSHROOM_STEM));
        decorationBlocks_2.addItem(createGuiItem(Material.IRON_BARS));
        decorationBlocks_2.addItem(createGuiItem(Material.GLASS_PANE));
        decorationBlocks_2.addItem(createGuiItem(Material.VINE));
        decorationBlocks_2.addItem(createGuiItem(Material.LILY_PAD));
        decorationBlocks_2.addItem(createGuiItem(Material.NETHER_BRICK_FENCE));
        decorationBlocks_2.addItem(createGuiItem(Material.ENCHANTING_TABLE));
        decorationBlocks_2.addItem(createGuiItem(Material.END_PORTAL_FRAME));
        decorationBlocks_2.addItem(createGuiItem(Material.ENDER_CHEST));
        decorationBlocks_2.addItem(createGuiItem(Material.COBBLESTONE_WALL));
        decorationBlocks_2.addItem(createGuiItem(Material.MOSSY_COBBLESTONE_WALL));
        decorationBlocks_2.addItem(createGuiItem(Material.ANVIL));
        decorationBlocks_2.addItem(createGuiItem(Material.CHIPPED_ANVIL));
        decorationBlocks_2.addItem(createGuiItem(Material.DAMAGED_ANVIL));
        decorationBlocks_2.addItem(createGuiItem(Material.WHITE_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.ORANGE_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.MAGENTA_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.LIGHT_BLUE_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.YELLOW_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.LIME_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.PINK_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.GRAY_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.LIGHT_GRAY_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.CYAN_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.PURPLE_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.BLUE_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.BROWN_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.GREEN_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.RED_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.BLACK_CARPET));
        decorationBlocks_2.addItem(createGuiItem(Material.SLIME_BLOCK));
        decorationBlocks_2.addItem(createGuiItem(Material.GRASS_PATH));
        decorationBlocks_2.addItem(createGuiItem(Material.SUNFLOWER));
        decorationBlocks_2.addItem(createGuiItem(Material.LILAC));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (1) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_2.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (3) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_2.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory decorationBlocks_3 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 3)");

    public static void addItems_decorationBlocks_3() {
        decorationBlocks_3.addItem(createGuiItem(Material.ROSE_BUSH));
        decorationBlocks_3.addItem(createGuiItem(Material.PEONY));
        decorationBlocks_3.addItem(createGuiItem(Material.TALL_GRASS));
        decorationBlocks_3.addItem(createGuiItem(Material.LARGE_FERN));
        decorationBlocks_3.addItem(createGuiItem(Material.WHITE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.ORANGE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.MAGENTA_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.LIGHT_BLUE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.YELLOW_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.LIME_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.PINK_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.GRAY_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.CYAN_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.PURPLE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.BLUE_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.BROWN_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.GREEN_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.RED_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.BLACK_STAINED_GLASS_PANE));
        decorationBlocks_3.addItem(createGuiItem(Material.SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.WHITE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.ORANGE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.MAGENTA_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.LIGHT_BLUE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.YELLOW_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.LIME_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.PINK_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.GRAY_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.LIGHT_GRAY_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.CYAN_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.PURPLE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.BLUE_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.BROWN_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.GREEN_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.RED_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.BLACK_SHULKER_BOX));
        decorationBlocks_3.addItem(createGuiItem(Material.WHITE_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem(Material.ORANGE_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem(Material.MAGENTA_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem(Material.LIGHT_BLUE_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem(Material.YELLOW_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem(Material.LIME_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem(Material.PINK_GLAZED_TERRACOTTA));
        decorationBlocks_3.addItem(createGuiItem(Material.GRAY_GLAZED_TERRACOTTA));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (2) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_3.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (4) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_3.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory decorationBlocks_4 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Decoration Blocks (page 4)");

    public static void addItems_decorationBlocks_4() {
        decorationBlocks_4.addItem(createGuiItem(Material.LIGHT_GRAY_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.CYAN_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.PURPLE_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.BLUE_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.BROWN_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.GREEN_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.RED_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.BLACK_GLAZED_TERRACOTTA));
        decorationBlocks_4.addItem(createGuiItem(Material.TUBE_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.BRAIN_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.BUBBLE_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.FIRE_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.HORN_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_BRAIN_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_BUBBLE_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_FIRE_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_HORN_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_TUBE_CORAL));
        decorationBlocks_4.addItem(createGuiItem(Material.TUBE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.BRAIN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.BUBBLE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.FIRE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.HORN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_TUBE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_BRAIN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_FIRE_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.DEAD_HORN_CORAL_FAN));
        decorationBlocks_4.addItem(createGuiItem(Material.PAINTING));
        decorationBlocks_4.addItem(createGuiItem(Material.SIGN));
        decorationBlocks_4.addItem(createGuiItem(Material.WHITE_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.ORANGE_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.MAGENTA_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.LIGHT_BLUE_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.YELLOW_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.LIME_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.PINK_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.GRAY_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.LIGHT_GRAY_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.CYAN_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.PURPLE_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.BLUE_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.BROWN_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.GREEN_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.RED_BED));
        decorationBlocks_4.addItem(createGuiItem(Material.BLACK_BED));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (3) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_4.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (5) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        decorationBlocks_4.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory decorationBlocks_5 = org.bukkit.Bukkit.createInventory(null, 36, ChatColor.RED + "Decoration Blocks (page 5)");

    public static void addItems_decorationBlocks_5() {
        decorationBlocks_5.addItem(createGuiItem(Material.ITEM_FRAME));
        decorationBlocks_5.addItem(createGuiItem(Material.FLOWER_POT));
        decorationBlocks_5.addItem(createGuiItem(Material.SKELETON_SKULL));
        decorationBlocks_5.addItem(createGuiItem(Material.WITHER_SKELETON_SKULL));
        decorationBlocks_5.addItem(createGuiItem(Material.PLAYER_HEAD));
        decorationBlocks_5.addItem(createGuiItem(Material.ZOMBIE_HEAD));
        decorationBlocks_5.addItem(createGuiItem(Material.CREEPER_HEAD));
        decorationBlocks_5.addItem(createGuiItem(Material.DRAGON_HEAD));
        decorationBlocks_5.addItem(createGuiItem(Material.ARMOR_STAND));
        decorationBlocks_5.addItem(createGuiItem(Material.WHITE_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.ORANGE_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.MAGENTA_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.LIGHT_BLUE_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.YELLOW_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.LIME_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.PINK_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.GRAY_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.LIGHT_GRAY_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.CYAN_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.PURPLE_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.BLUE_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.BROWN_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.GREEN_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.RED_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.BLACK_BANNER));
        decorationBlocks_5.addItem(createGuiItem(Material.END_CRYSTAL));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (4) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        decorationBlocks_5.setItem(27, new ItemStack(previousPage));
    }
}
