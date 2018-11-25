package me.jericraft;

import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.text.DecimalFormat;
import java.util.HashMap;
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

        if (clickedItem == null || clickedItem.getType().equals(Material.AIR)) return;
        event.setCancelled(true);
        Material mat = event.getCurrentItem().getType();

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
                double buy_price = Integer.parseInt(lore.get(0));
                double sell_price = Integer.parseInt(lore.get(1));
                double item_quantity = Integer.parseInt(lore.get(2));
                String item_name = mat.toString();
                // ================= BUYING ================= //
                if (event.isRightClick() && !event.isShiftClick()) {
                    EconomyResponse take_money = econ.withdrawPlayer(player, buy_price);
                    if (take_money.transactionSuccess()) {
                        HashMap<Integer, ItemStack> new_item = new HashMap<Integer, ItemStack>();
                        new_item.putAll((player.getInventory().addItem(new ItemStack(mat, Integer.parseInt(lore.get(2))))));
                        if (!new_item.isEmpty()) {
                            Location loc = player.getLocation();
                            player.getWorld().dropItem(loc, clickedItem);
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("inventoryFull")));
                        } else {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("buyRClick").replace("%item_quantity%", "" + item_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + buy_price))));
                        }
                    } else {
                        player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughMoney").replace("%item_price%", "" + buy_price).replace("%item_name%", "" + item_name))));
                    }
                } else if (event.isRightClick() && event.isShiftClick()) {
                    EconomyResponse take_money_mul = econ.withdrawPlayer(player, (buy_price / item_quantity) * 64);
                    if (take_money_mul.transactionSuccess()) {
                        player.getInventory().addItem(new ItemStack(mat, 64));
                        player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("buyRShiftClick").replace("%item_quantity%", "" + 64).replace("%item_name%", "" + item_name).replace("%item_price%", "" + (buy_price / item_quantity) * 64))));
                    } else {
                        player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughMoney").replace("%item_price%", "" + buy_price).replace("%item_name%", "" + item_name).replace("%item_quantity%", "" + 64))));
                    }
                    // ================= SELLING ================= //
                } else {
                    if (player.getInventory().contains(mat)) {
                        if (event.isLeftClick() && !event.isShiftClick()) {
                            EconomyResponse give_money = econ.depositPlayer(player, sell_price);
                            if (give_money.transactionSuccess()) {
                                HashMap<Integer, ItemStack> new_item = new HashMap<Integer, ItemStack>();
                                new_item.putAll((player.getInventory().removeItem(new ItemStack(mat, Integer.parseInt(lore.get(2))))));
                                player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLClick").replace("%item_quantity%", "" + item_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + sell_price))));
                            }
                        } else if (event.isLeftClick() && event.isShiftClick()) {
                            int count = 0;
                            for (ItemStack stack : player.getInventory().getContents()) {
                                if (stack != null && stack.getType() == mat) {
                                    count += stack.getAmount();
                                    if (count < 64) {
                                        double d = (sell_price / count) * 64;
                                        DecimalFormat f = new DecimalFormat("##.00");
                                        player.getInventory().remove(new ItemStack(mat, count));
                                        EconomyResponse give_money_mul = econ.depositPlayer(player, (sell_price / count) * 64);
                                        if (give_money_mul.transactionSuccess()) {
                                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLShiftClick").replace("%item_quantity%", "" + count).replace("%item_name%", "" + mat.toString()).replace("%item_price%", "" + f.format(d)))));
                                        }
                                    } else if (count >= 64) {
                                        player.getInventory().removeItem(new ItemStack(mat, 64));
                                        EconomyResponse give_money_mul = econ.depositPlayer(player, (sell_price / item_quantity) * 64);
                                        if (give_money_mul.transactionSuccess()) {
                                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLShiftClick").replace("%item_quantity%", "" + 64).replace("%item_name%", "" + mat.toString()).replace("%item_price%", "" + (sell_price / item_quantity) * 64))));
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughItems"))));
                    }
                }
            }
        }
    }
}

