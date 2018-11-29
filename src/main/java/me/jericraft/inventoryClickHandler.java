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

import static me.jericraft.pageHandler.*;
import static me.jericraft.category_BuildingBlocks.*;
import static me.jericraft.category_DecorationBlocks.*;
import static me.jericraft.category_Redstone.*;
import static me.jericraft.category_Transport.*;
import static me.jericraft.category_Miscellaneous.*;
import static me.jericraft.category_Food.*;
import static me.jericraft.category_Tools.*;
import static me.jericraft.category_Combat.*;
import static me.jericraft.category_Brewing.*;

import static me.jericraft.entry_point.econ;

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
                && (!invName.equals(buildingBlocks_6.getName()) && (!invName.equals(decorationBlocks_1.getName()) && (!invName.equals(decorationBlocks_2.getName())
                && (!invName.equals(decorationBlocks_3.getName())) && (!invName.equals(decorationBlocks_4.getName())) && (!invName.equals(decorationBlocks_5.getName()))
                && (!invName.equals(redstone_1.getName())) && (!invName.equals(redstone_2.getName()) && (!invName.equals(transport_1.getName())
                && (!invName.equals(miscellaneous_1.getName())) && (!invName.equals(miscellaneous_2.getName())) && (!invName.equals(miscellaneous_3.getName()))
                && (!invName.equals(miscellaneous_4.getName()) && (!invName.equals(food_1.getName()) && (!invName.equals(tools_1.getName()))))
                && (!invName.equals(combat_1.getName()) && (!invName.equals(brewing_1.getName()))))))))) {
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
                    openBuildingBlocksGUI(player, 2);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
            } else if (invName.equals(buildingBlocks_2.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openBuildingBlocksGUI(player, 3);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openBuildingBlocksGUI(player, 1);
                }
            } else if (invName.equals(buildingBlocks_3.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openBuildingBlocksGUI(player, 4);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openBuildingBlocksGUI(player, 2);
                }
            } else if (invName.equals(buildingBlocks_4.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openBuildingBlocksGUI(player, 5);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openBuildingBlocksGUI(player, 3);
                }
            } else if (invName.equals(buildingBlocks_5.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openBuildingBlocksGUI(player, 6);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openBuildingBlocksGUI(player, 4);
                }
            } else if (invName.equals(buildingBlocks_6.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openBuildingBlocksGUI(player, 5);
                }
                // ========== Decoration blocks ========== \\
            } else if (invName.equals(decorationBlocks_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openDecorationGUI(player, 2);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
            } else if (invName.equals(decorationBlocks_2.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openDecorationGUI(player, 3);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openDecorationGUI(player, 1);
                }
            } else if (invName.equals(decorationBlocks_3.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openDecorationGUI(player, 4);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openDecorationGUI(player, 2);
                }
            } else if (invName.equals(decorationBlocks_4.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openDecorationGUI(player, 5);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openDecorationGUI(player, 3);
                }
            } else if (invName.equals(decorationBlocks_5.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openDecorationGUI(player, 4);
                }
                // ========== Redstone ========== \\
            } else if (invName.equals(redstone_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openRedstoneGUI(player, 2);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
            } else if (invName.equals(redstone_2.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openRedstoneGUI(player, 1);
                }
                // ========== Transport ========== \\
            } else if (invName.equals(transport_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
                // ========== Miscellaneous ========== \\
            } else if (invName.equals(miscellaneous_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openMiscellaneousGUI(player, 2);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
            } else if (invName.equals(miscellaneous_2.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openMiscellaneousGUI(player, 3);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMiscellaneousGUI(player, 1);
                }
            } else if (invName.equals(miscellaneous_3.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("next_page")) {
                    openMiscellaneousGUI(player, 4);
                } else if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMiscellaneousGUI(player, 2);
                }
            } else if (invName.equals(miscellaneous_4.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMiscellaneousGUI(player, 3);
                }
                // ========== fOOD ========== \\
            } else if (invName.equals(food_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
                // ========== Tools ========== \\
            } else if (invName.equals(tools_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
                // ========== Combat ========== \\
            } else if (invName.equals(combat_1.getName())) {
                if (clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase("previous_page")) {
                    openMainMenu(player, true);
                }
            }
            //===============================================================================================================================//
            if (!clickedItem.getType().equals(Material.WITHER_SKELETON_SKULL)) {
                String item_name = mat.toString();
                List<String> lore = clickedItem.getItemMeta().getLore();

                String buy = plugin.getInstance().getConfig().getString("items." + item_name + ".buy");
                double buy_price = Double.parseDouble(buy);

                String sell = plugin.getInstance().getConfig().getString("items." + item_name + ".sell");
                double sell_price = Double.parseDouble(sell);

                String quantity = plugin.getInstance().getConfig().getString("items." + item_name + ".quantity");
                double item_quantity = Double.parseDouble(quantity);
                int i_quantity = (int) item_quantity;

                if (buy_price != 0) {
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
                                player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("buyRClick").replace("%item_quantity%", "" + i_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + buy_price))));
                            }
                        } else {
                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("notEnoughMoney").replace("%item_price%", "" + buy_price).replace("%item_quantity%", "" + i_quantity).replace("%item_name%", "" + item_name))));
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
                                        } else if (count >= item_quantity) {
                                            double d = (sell_price / item_quantity) * item_quantity;
                                            DecimalFormat f = new DecimalFormat("##0.###");
                                            player.getInventory().removeItem(new ItemStack(mat, Integer.parseInt(quantity)));
                                            EconomyResponse give_money_mul = econ.depositPlayer(player, (sell_price / item_quantity));
                                            player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", plugin.getConfig().getString("sellLClick").replace("%item_quantity%", "" + i_quantity).replace("%item_name%", "" + item_name).replace("%item_price%", "" + f.format(d)))));
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
                } else {
                    player.sendMessage(plugin.PLUGIN_PREFIX + " " + ChatColor.RED + "This item cannot be bought/sold at this time.");
                }
            }
        }
    }
}

