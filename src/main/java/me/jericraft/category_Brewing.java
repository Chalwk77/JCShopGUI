package me.jericraft;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

import static me.jericraft.main_menu.createGuiItem;

public class category_Brewing {
    public static Inventory brewing_1 = org.bukkit.Bukkit.createInventory(null, 54, ChatColor.RED + "Brewing (page 1)");
    public static void addItems_Brewing_1() {
//        ItemStack previousPage = new ItemStack(Material.SPLASH_POTION, (short) 16389);
//        ItemMeta previousPageMeta = previousPage.getItemMeta();
//        previousPageMeta.setDisplayName("previous_page");
//        previousPageMeta.setLore(Arrays.asList("<<-- (1) Previous Page"));
//        previousPage.setItemMeta(previousPageMeta);
//        brewing_1.setItem(45, new ItemStack(previousPage));


//        ItemStack potion = new ItemStack(Material.POTION);
//        PotionMeta potionmeta = (PotionMeta) potion.getItemMeta();
//        potionmeta.setMainEffect(PotionEffectType.SPEED);
//        PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, 1000, 1);
//        PotionEffect reg = new PotionEffect(PotionEffectType.REGENERATION, 1000, 1);
//        potionmeta.addCustomEffect(speed, true);
//        potionmeta.addCustomEffect(reg, true);
//        potionmeta.setDisplayName("§9SPEED AND REG POTION");
//        potion.setItemMeta(potionmeta);
//        brewing_1.setItem(45, new ItemStack(potion));
    }
}

