package me.jericraft;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class page_handler implements Listener {
    private final entry_point plugin;
    private final FileConfiguration config;

    public page_handler(entry_point plugin) {
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        String inv_name = player.getOpenInventory().getTopInventory().getName();
        System.out.println("Inventory name: " + inv_name);
        for (int i = 0; i < player.getOpenInventory().getTopInventory().getSize(); i++) {
            // i starts at 0
            if (i == 8) {
                ItemStack prevIcon = new ItemStack(Material.WITHER_SKELETON_SKULL);
                ItemMeta var_name = prevIcon.getItemMeta();
                var_name.setDisplayName("previous_page");
                var_name.setLore(Arrays.asList("<<-- (2) Previous Page"));
                prevIcon.setItemMeta(var_name);
                //inv_name.setItem(45, new ItemStack(prevIcon));
            } else if (i == 17) {
                // code
            } else if (i == 26) {
                // code
            } else if (i == 35) {
                // code
            } else if (i == 44) {
                // code
            } else if (i == 53) {
                // code
            }
        }
    }
}
