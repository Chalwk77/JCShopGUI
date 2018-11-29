
/*
 * Copyright (c) 2018.  JCShopGUI,  Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.
 */

package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_Miscellaneous {
    public static Inventory miscellaneous_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Miscellaneous (page 1)");

    public static void addItems_Miscellaneous_1() {
        miscellaneous_1.addItem(createGuiItem(Material.BEACON));
        miscellaneous_1.addItem(createGuiItem(Material.TURTLE_EGG));
        miscellaneous_1.addItem(createGuiItem(Material.CONDUIT));
        miscellaneous_1.addItem(createGuiItem(Material.SCUTE));
        miscellaneous_1.addItem(createGuiItem(Material.COAL));
        miscellaneous_1.addItem(createGuiItem(Material.CHARCOAL));
        miscellaneous_1.addItem(createGuiItem(Material.DIAMOND));
        miscellaneous_1.addItem(createGuiItem(Material.IRON_INGOT));
        miscellaneous_1.addItem(createGuiItem(Material.GOLD_INGOT));
        miscellaneous_1.addItem(createGuiItem(Material.STICK));
        miscellaneous_1.addItem(createGuiItem(Material.BOWL));
        miscellaneous_1.addItem(createGuiItem(Material.STRING));
        miscellaneous_1.addItem(createGuiItem(Material.FEATHER));
        miscellaneous_1.addItem(createGuiItem(Material.GUNPOWDER));
        miscellaneous_1.addItem(createGuiItem(Material.WHEAT_SEEDS));
        miscellaneous_1.addItem(createGuiItem(Material.WHEAT));
        miscellaneous_1.addItem(createGuiItem(Material.FLINT));
        miscellaneous_1.addItem(createGuiItem(Material.BUCKET));
        miscellaneous_1.addItem(createGuiItem(Material.WATER_BUCKET));
        miscellaneous_1.addItem(createGuiItem(Material.LAVA_BUCKET));
        miscellaneous_1.addItem(createGuiItem(Material.SNOWBALL));
        miscellaneous_1.addItem(createGuiItem(Material.LEATHER));
        miscellaneous_1.addItem(createGuiItem(Material.PUFFERFISH_BUCKET));
        miscellaneous_1.addItem(createGuiItem(Material.SALMON_BUCKET));
        miscellaneous_1.addItem(createGuiItem(Material.COD_BUCKET));
        miscellaneous_1.addItem(createGuiItem(Material.TROPICAL_FISH_BUCKET));
        miscellaneous_1.addItem(createGuiItem(Material.BRICK));
        miscellaneous_1.addItem(createGuiItem(Material.CLAY_BALL));
        miscellaneous_1.addItem(createGuiItem(Material.SUGAR_CANE));
        miscellaneous_1.addItem(createGuiItem(Material.KELP));
        miscellaneous_1.addItem(createGuiItem(Material.PAPER));
        miscellaneous_1.addItem(createGuiItem(Material.BOOK));
        miscellaneous_1.addItem(createGuiItem(Material.SLIME_BALL));
        miscellaneous_1.addItem(createGuiItem(Material.EGG));
        miscellaneous_1.addItem(createGuiItem(Material.GLOWSTONE_DUST));
        miscellaneous_1.addItem(createGuiItem(Material.INK_SAC));
        miscellaneous_1.addItem(createGuiItem(Material.ROSE_RED));
        miscellaneous_1.addItem(createGuiItem(Material.CACTUS_GREEN));
        miscellaneous_1.addItem(createGuiItem(Material.COCOA_BEANS));
        miscellaneous_1.addItem(createGuiItem(Material.LAPIS_LAZULI));
        miscellaneous_1.addItem(createGuiItem(Material.PURPLE_DYE));
        miscellaneous_1.addItem(createGuiItem(Material.CYAN_DYE));
        miscellaneous_1.addItem(createGuiItem(Material.LIGHT_GRAY_DYE));
        miscellaneous_1.addItem(createGuiItem(Material.GRAY_DYE));
        miscellaneous_1.addItem(createGuiItem(Material.PINK_DYE));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        miscellaneous_1.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (2) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        miscellaneous_1.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory miscellaneous_2 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Miscellaneous (page 2)");

    public static void addItems_Miscellaneous_2() {
        miscellaneous_2.addItem(createGuiItem(Material.LIME_DYE));
        miscellaneous_2.addItem(createGuiItem(Material.DANDELION_YELLOW));
        miscellaneous_2.addItem(createGuiItem(Material.LIGHT_BLUE_DYE));
        miscellaneous_2.addItem(createGuiItem(Material.MAGENTA_DYE));
        miscellaneous_2.addItem(createGuiItem(Material.ORANGE_DYE));
        miscellaneous_2.addItem(createGuiItem(Material.BONE_MEAL));
        miscellaneous_2.addItem(createGuiItem(Material.BONE));
        miscellaneous_2.addItem(createGuiItem(Material.SUGAR));
        miscellaneous_2.addItem(createGuiItem(Material.PUMPKIN_SEEDS));
        miscellaneous_2.addItem(createGuiItem(Material.MELON_SEEDS));
        miscellaneous_2.addItem(createGuiItem(Material.ENDER_PEARL));
        miscellaneous_2.addItem(createGuiItem(Material.BLAZE_ROD));
        miscellaneous_2.addItem(createGuiItem(Material.GOLD_NUGGET));
        miscellaneous_2.addItem(createGuiItem(Material.NETHER_WART));
        miscellaneous_2.addItem(createGuiItem(Material.ENDER_EYE));
        miscellaneous_2.addItem(createGuiItem(Material.BAT_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.BLAZE_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.CAVE_SPIDER_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.CHICKEN_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.COD_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.COW_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.CREEPER_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.DOLPHIN_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.DONKEY_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.DROWNED_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.ELDER_GUARDIAN_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.ENDERMAN_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.ENDERMITE_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.EVOKER_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.GHAST_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.GUARDIAN_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.HORSE_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.HUSK_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.LLAMA_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.MAGMA_CUBE_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.MOOSHROOM_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.MULE_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.OCELOT_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.PARROT_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.PHANTOM_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.PIG_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.POLAR_BEAR_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.PUFFERFISH_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.RABBIT_SPAWN_EGG));
        miscellaneous_2.addItem(createGuiItem(Material.SALMON_SPAWN_EGG));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (1) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        miscellaneous_2.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (3) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        miscellaneous_2.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory miscellaneous_3 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Miscellaneous (page 3)");

    public static void addItems_Miscellaneous_3() {
        miscellaneous_3.addItem(createGuiItem(Material.SHEEP_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.SHULKER_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.SILVERFISH_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.SKELETON_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.SKELETON_HORSE_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.SLIME_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.SPIDER_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.SQUID_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.STRAY_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.TROPICAL_FISH_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.TURTLE_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.VEX_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.VILLAGER_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.VINDICATOR_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.WITCH_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.WITHER_SKELETON_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.WOLF_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.ZOMBIE_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.ZOMBIE_HORSE_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.ZOMBIE_PIGMAN_SPAWN_EGG));
        miscellaneous_3.addItem(createGuiItem(Material.EXPERIENCE_BOTTLE));
        miscellaneous_3.addItem(createGuiItem(Material.FIRE_CHARGE));
        miscellaneous_3.addItem(createGuiItem(Material.WRITABLE_BOOK));
        miscellaneous_3.addItem(createGuiItem(Material.EMERALD));
        miscellaneous_3.addItem(createGuiItem(Material.MAP));
        miscellaneous_3.addItem(createGuiItem(Material.NETHER_STAR));
        miscellaneous_3.addItem(createGuiItem(Material.FIREWORK_ROCKET));
        miscellaneous_3.addItem(createGuiItem(Material.FIREWORK_STAR));
        miscellaneous_3.addItem(createGuiItem(Material.NETHER_BRICK));
        miscellaneous_3.addItem(createGuiItem(Material.QUARTZ));
        miscellaneous_3.addItem(createGuiItem(Material.PRISMARINE_SHARD));
        miscellaneous_3.addItem(createGuiItem(Material.PRISMARINE_CRYSTALS));
        miscellaneous_3.addItem(createGuiItem(Material.RABBIT_HIDE));
        miscellaneous_3.addItem(createGuiItem(Material.IRON_HORSE_ARMOR));
        miscellaneous_3.addItem(createGuiItem(Material.GOLDEN_HORSE_ARMOR));
        miscellaneous_3.addItem(createGuiItem(Material.DIAMOND_HORSE_ARMOR));
        miscellaneous_3.addItem(createGuiItem(Material.CHORUS_FRUIT));
        miscellaneous_3.addItem(createGuiItem(Material.POPPED_CHORUS_FRUIT));
        miscellaneous_3.addItem(createGuiItem(Material.BEETROOT_SEEDS));
        miscellaneous_3.addItem(createGuiItem(Material.SHULKER_SHELL));
        miscellaneous_3.addItem(createGuiItem(Material.IRON_NUGGET));
        miscellaneous_3.addItem(createGuiItem(Material.MUSIC_DISC_13));
        miscellaneous_3.addItem(createGuiItem(Material.MUSIC_DISC_CAT));
        miscellaneous_3.addItem(createGuiItem(Material.MUSIC_DISC_BLOCKS));
        miscellaneous_3.addItem(createGuiItem(Material.MUSIC_DISC_CHIRP));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (2) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        miscellaneous_3.setItem(45, new ItemStack(previousPage));
        ItemStack nextPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.setDisplayName("next_page");
        nextPageMeta.setLore(Arrays.asList("Next Page (4) -->>"));
        nextPage.setItemMeta(nextPageMeta);
        miscellaneous_3.setItem(53, new ItemStack(nextPage));
    }

    public static Inventory miscellaneous_4 = org.bukkit.Bukkit.createInventory(null, 27, ChatColor.RED + "Miscellaneous (page 4)");

    public static void addItems_Miscellaneous_4() {
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_FAR));
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_MALL));
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_MELLOHI));
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_STAL));
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_STRAD));
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_WARD));
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_11));
        miscellaneous_4.addItem(createGuiItem(Material.MUSIC_DISC_WAIT));
        miscellaneous_4.addItem(createGuiItem(Material.NAUTILUS_SHELL));
        miscellaneous_4.addItem(createGuiItem(Material.HEART_OF_THE_SEA));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (3) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        miscellaneous_4.setItem(18, new ItemStack(previousPage));
    }
}