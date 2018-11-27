package me.jericraft;

import net.milkbowl.vault.economy.EconomyResponse;
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

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;

import static me.jericraft.category_DecorationBlocks.*;
import static me.jericraft.category_BuildingBlocks.*;
import static me.jericraft.category_Redstone.*;
import static me.jericraft.category_Transport.*;
import static me.jericraft.main_menu.menu;
import static me.jericraft.entry_point.econ;

public class inventoryClickHandler implements Listener {

    private final entry_point plugin;
    private final FileConfiguration config;
    private inventoryClickHandler thggg;
    public inventoryClickHandler(entry_point plugin) {
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        String invName = event.getInventory().getName();
        if (!invName.equals(buildingBlocks_1.getName()) && (!invName.equals(buildingBlocks_2.getName()))
                && (!invName.equals(buildingBlocks_3.getName())) && (!invName.equals(buildingBlocks_4.getName())) && (!invName.equals(buildingBlocks_5.getName()))
                && (!invName.equals(buildingBlocks_6.getName()) && (!invName.equals(decorationBlocks_1.getName()) && (!invName.equals(decorationBlocks_2.getName())
                && (!invName.equals(decorationBlocks_3.getName())) && (!invName.equals(decorationBlocks_4.getName())) && (!invName.equals(decorationBlocks_5.getName()))
                && (!invName.equals(redstone_1.getName())) && (!invName.equals(redstone_2.getName()) && (!invName.equals(transport_1.getName()))))))) {
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
            // ========== Building blocks ========== \\
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
                // ========== Decoration blocks ========== \\
            } else if (invName.equals(decorationBlocks_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_2);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(menu);
                }
            } else if (invName.equals(decorationBlocks_2.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_3);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_1);
                }
            } else if (invName.equals(decorationBlocks_3.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_4);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_2);
                }
            } else if (invName.equals(decorationBlocks_4.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_5);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_3);
                }
            } else if (invName.equals(decorationBlocks_5.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(decorationBlocks_4);
                }
                // ========== Redstone ========== \\
            } else if (invName.equals(redstone_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    player.closeInventory();
                    player.openInventory(redstone_2);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(menu);
                }
            } else if (invName.equals(redstone_2.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(redstone_1);
                }
                // ========== Transport ========== \\
            } else if (invName.equals(transport_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    player.closeInventory();
                    player.openInventory(menu);
                }
                // ========== Miscellaneous ========== \\
            }

            //==================================================================/i stone===========================================================//
            if (!clickedItem.getType().equals(Material.WITHER_SKELETON_SKULL)) {
                String item_name = mat.toString();
                List<String> lore = clickedItem.getItemMeta().getLore();

                String buy = plugin.getInstance().getConfig().getString("items." + item_name + ".buy");
                double buy_price = Double.parseDouble(buy);

                String sell = plugin.getInstance().getConfig().getString("items." + item_name + ".sell");
                double sell_price = Double.parseDouble(sell);

                String quantity = plugin.getInstance().getConfig().getString("items." + item_name + ".quantity");
                double item_quantity = Double.parseDouble(quantity);
                // ================= BUYING ================= //

                if (event.isRightClick() && !event.isShiftClick()) {
                    EconomyResponse take_money = econ.withdrawPlayer(player, buy_price);
                    if (take_money.transactionSuccess()) {
                        HashMap<Integer, ItemStack> new_item = new HashMap<Integer, ItemStack>();
                        new_item.putAll((player.getInventory().addItem(new ItemStack(mat, Integer.parseInt(quantity)))));
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
                            int count = 0;
                            for (ItemStack stack : player.getInventory().getContents()) {
                                if (stack != null && stack.getType() == mat) {
                                    count += stack.getAmount();
                                    if (count < item_quantity) {
                                        double d = (sell_price / item_quantity) * count;
                                        DecimalFormat f = new DecimalFormat("##0.###");
                                        EconomyResponse give_money = econ.depositPlayer(player, (sell_price / item_quantity) * count);
                                        if (give_money.transactionSuccess()) {
                                            HashMap<Integer, ItemStack> new_item = new HashMap<Integer, ItemStack>();
                                            new_item.putAll((player.getInventory().removeItem(new ItemStack(mat, count))));
                                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLClick").replace("%item_quantity%", "" + count).replace("%item_name%", "" + item_name).replace("%item_price%", "" + f.format(d)))));
                                        }
                                        // greater than or equal to 16
                                    } else if (count >= item_quantity) {
                                        double d = (sell_price / item_quantity) * item_quantity;
                                        DecimalFormat f = new DecimalFormat("##0.###");
                                        player.getInventory().removeItem(new ItemStack(mat, Integer.parseInt(quantity)));
                                        EconomyResponse give_money_mul = econ.depositPlayer(player, (sell_price / item_quantity));
                                        player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLClick").replace("%item_quantity%", "" + item_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + f.format(d)))));
                                        break;
                                    }
                                }
                            }
                        } else if (event.isLeftClick() && event.isShiftClick()) {
                            int count = 0;
                            for (ItemStack stack : player.getInventory().getContents()) {
                                if (stack != null && stack.getType() == mat) {
                                    count += stack.getAmount();
                                    if (count < 64) {
                                        double d = (sell_price / count) * 64;
                                        DecimalFormat f = new DecimalFormat("##0.###");
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

