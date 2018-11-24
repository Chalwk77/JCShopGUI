package me.jericraft;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.List;

import static me.jericraft.entry_point.econ;
import static me.jericraft.main_menu.buildingBlocks_1;
import static me.jericraft.main_menu.menu;
import static me.jericraft.category_BuildingBlocks.buildingBlocks_2;
import static me.jericraft.category_BuildingBlocks.buildingBlocks_3;
import static me.jericraft.category_BuildingBlocks.buildingBlocks_4;
import static me.jericraft.category_BuildingBlocks.buildingBlocks_5;
import static me.jericraft.category_BuildingBlocks.buildingBlocks_6;



public class inventoryClickHandler implements Listener {

    private final entry_point plugin;
    private final FileConfiguration config;

    public inventoryClickHandler(entry_point plugin) {
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        String invName = event.getInventory().getName();
        if (!invName.equals(buildingBlocks_1.getName()) && (!invName.equals(buildingBlocks_2.getName()))
                && (!invName.equals(buildingBlocks_3.getName())) && (!invName.equals(buildingBlocks_4.getName())) && (!invName.equals(buildingBlocks_5.getName()))
                && (!invName.equals(buildingBlocks_6.getName()))) {
            return;
        }

        if (event.getClick().equals(ClickType.NUMBER_KEY)) {

            event.setCancelled(true);
        }
        event.setCancelled(true);

        Player player = (Player) event.getWhoClicked();
        ItemStack clickedItem = event.getCurrentItem();

        Material mat = event.getCurrentItem().getType();

        PlayerInventory customer = player.getInventory();

        if (clickedItem == null || clickedItem.getType().equals(Material.AIR)) return;
        if (clickedItem.hasItemMeta()) {
            if (invName.equals(buildingBlocks_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_2);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(menu);
                }
            } else if (invName.equals(buildingBlocks_2.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_3);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_1);
                }
            } else if (invName.equals(buildingBlocks_3.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_4);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_2);
                }
            } else if (invName.equals(buildingBlocks_4.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_5);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_3);
                }
            } else if (invName.equals(buildingBlocks_5.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_6);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_4);
                }
            } else if (invName.equals(buildingBlocks_6.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(buildingBlocks_5);
                }
            }

            if (!clickedItem.getType().equals(Material.WITHER_SKELETON_SKULL)) {
                List<String> lore = clickedItem.getItemMeta().getLore();
                int buy_price = Integer.parseInt(lore.get(0));
                int sell_price = Integer.parseInt(lore.get(1));
                int item_quantity = Integer.parseInt(lore.get(2));
                String item_name = mat.toString();
                // ================= BUYING ================= //
                if (event.getClick() == ClickType.RIGHT) {
                    if (!event.isShiftClick()) {
                        EconomyResponse r = econ.withdrawPlayer(player, buy_price);
                        if (r.transactionSuccess()) {
                            //customer.addItem(new ItemStack(mat.toString()), item_quantity);
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("buyRClick").replace("%item_quantity%", "" + item_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + buy_price))));
                        } else {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughMoney").replace("%item_price%", "" + buy_price).replace("%item_name%", "" + item_name))));
                        }
                    } else {
                        EconomyResponse r = econ.withdrawPlayer(player, buy_price * 64);
                        if (r.transactionSuccess()) {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("buyRShiftClick").replace("%item_quantity%", "" + item_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + buy_price))));
                        } else {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughMoney").replace("%item_price%", "" + buy_price).replace("%item_name%", "" + item_name))));
                        }
                    }
                    // ================= SELLING ================= //
                } else if (event.getClick() == ClickType.LEFT) {
                    if (!event.isShiftClick()) {
                        EconomyResponse r = econ.depositPlayer(player, sell_price);
                        if (r.transactionSuccess()) {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLClick").replace("%item_quantity%", "" + item_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + buy_price))));
                        } else {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughMoney").replace("%item_price%", "" + buy_price).replace("%item_name%", "" + item_name))));
                        }
                    } else {
                        EconomyResponse r = econ.depositPlayer(player, sell_price * 64);
                        if (r.transactionSuccess()) {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLShiftClick").replace("%item_quantity%", "" + item_quantity).replace("%item_name%", "" + mat.toString()).replace("%item_price%", "" + buy_price))));
                        } else {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughMoney").replace("%item_price%", "" + buy_price).replace("%item_name%", "" + item_name))));
                        }
                    }
                }
            }
        }
    }
}