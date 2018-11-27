package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_Tools {
    public static Inventory tools_1 = org.bukkit.Bukkit.createInventory(null, 45, ChatColor.RED + "Tools (page 1)");
    public static void addItems_Tools_1() {
        tools_1.addItem(createGuiItem(Material.IRON_SHOVEL));
        tools_1.addItem(createGuiItem(Material.IRON_PICKAXE));
        tools_1.addItem(createGuiItem(Material.IRON_AXE));
        tools_1.addItem(createGuiItem(Material.FLINT_AND_STEEL));
        tools_1.addItem(createGuiItem(Material.WOODEN_SHOVEL));
        tools_1.addItem(createGuiItem(Material.WOODEN_PICKAXE));
        tools_1.addItem(createGuiItem(Material.WOODEN_AXE));
        tools_1.addItem(createGuiItem(Material.STONE_SHOVEL));
        tools_1.addItem(createGuiItem(Material.STONE_PICKAXE));
        tools_1.addItem(createGuiItem(Material.STONE_AXE));
        tools_1.addItem(createGuiItem(Material.DIAMOND_SHOVEL));
        tools_1.addItem(createGuiItem(Material.DIAMOND_PICKAXE));
        tools_1.addItem(createGuiItem(Material.DIAMOND_AXE));
        tools_1.addItem(createGuiItem(Material.GOLDEN_SHOVEL));
        tools_1.addItem(createGuiItem(Material.GOLDEN_PICKAXE));
        tools_1.addItem(createGuiItem(Material.GOLDEN_AXE));
        tools_1.addItem(createGuiItem(Material.WOODEN_HOE));
        tools_1.addItem(createGuiItem(Material.STONE_HOE));
        tools_1.addItem(createGuiItem(Material.IRON_HOE));
        tools_1.addItem(createGuiItem(Material.DIAMOND_HOE));
        tools_1.addItem(createGuiItem(Material.GOLDEN_HOE));
        tools_1.addItem(createGuiItem(Material.COMPASS));
        tools_1.addItem(createGuiItem(Material.FISHING_ROD));

        //todo: fix enchants books
        ItemStack book1 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta1 = (EnchantmentStorageMeta)book1.getItemMeta();
        meta1.addStoredEnchant(Enchantment.DIG_SPEED,5, true);
        book1.setItemMeta(meta1);
        tools_1.setItem(23, new ItemStack(book1));

        ItemStack book2 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta2 = (EnchantmentStorageMeta)book2.getItemMeta();
        meta2.addStoredEnchant(Enchantment.SILK_TOUCH,1, false);
        book2.setItemMeta(meta2);
        tools_1.setItem(24, new ItemStack(book2));

        ItemStack book3 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta3 = (EnchantmentStorageMeta)book3.getItemMeta();
        meta3.addStoredEnchant(Enchantment.DURABILITY,3, true);
        book3.setItemMeta(meta3);
        tools_1.setItem(25, new ItemStack(book3));

        ItemStack book4 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta4 = (EnchantmentStorageMeta)book4.getItemMeta();
        meta4.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS,3, true);
        book4.setItemMeta(meta4);
        tools_1.setItem(26, new ItemStack(book4));

        ItemStack book5 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta5 = (EnchantmentStorageMeta)book5.getItemMeta();
        meta5.addStoredEnchant(Enchantment.LUCK,3, true);
        book5.setItemMeta(meta5);
        tools_1.setItem(27, new ItemStack(book5));

        ItemStack book6= new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta6 = (EnchantmentStorageMeta)book6.getItemMeta();
        meta6.addStoredEnchant(Enchantment.LURE,3, true);
        book6.setItemMeta(meta6);
        tools_1.setItem(28, new ItemStack(book6));

        ItemStack book7 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta7 = (EnchantmentStorageMeta)book7.getItemMeta();
        meta7.addStoredEnchant(Enchantment.MENDING,1, true);
        book7.setItemMeta(meta7);
        tools_1.setItem(29, new ItemStack(book7));

        ItemStack book8 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta meta8 = (EnchantmentStorageMeta)book8.getItemMeta();
        meta8.addStoredEnchant(Enchantment.VANISHING_CURSE,1, true);
        book8.setItemMeta(meta8);
        tools_1.setItem(30, new ItemStack(book8));

        tools_1.addItem(createGuiItem(Material.CLOCK));
        tools_1.addItem(createGuiItem(Material.SHEARS));
        ItemStack previousPage = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta previousPageMeta = previousPage.getItemMeta();
        previousPageMeta.setDisplayName("previous_page");
        previousPageMeta.setLore(Arrays.asList("<<-- (menu) Previous Page"));
        previousPage.setItemMeta(previousPageMeta);
        tools_1.setItem(36, new ItemStack(previousPage));
    }
}

