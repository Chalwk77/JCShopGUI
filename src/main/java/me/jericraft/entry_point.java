/*
 * Copyright (c) 2018.  JCShopGUI,  Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.
 */


package me.jericraft;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.jericraft.pageHandler.*;

public class entry_point extends JavaPlugin {
    private static entry_point instance;

    static entry_point getInstance() {
        return instance;
    }

    private main_menu loadMenuIcons;
    private category_BuildingBlocks loadBuildingBlocks;
    private category_DecorationBlocks loadDecorationBlocks;
    private category_Redstone loadRedstoneItems;
    private category_Transport loadTransportItems;
    private category_Miscellaneous loadMiscellaneous;
    private category_Food loadFood;
    private category_Tools loadTools;
    private category_Combat loadCombat;
    private category_Brewing loadBrewing;

    final String PLUGIN_PREFIX = ChatColor.translateAlternateColorCodes('&', getConfig().getString("PluginPrefix") + ChatColor.RESET);
    static Economy econ = null;

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getServer().getPluginManager().registerEvents(new main_menu(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new inventoryClickHandler(this), this);

        if (!setupEconomy()) {
            getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        } else {
            getLogger().info("Hooked into Vault");
        }
        loadConfig();
        preload_categories();
        getLogger().info("====================================================================");
        getLogger().info("Plugin enabled! (Version " + getDescription().getVersion() + ")");
        getLogger().info("Author: Chalwk (Jericho Crosby)");
        getLogger().info("Copyright 2018 Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.");
        getLogger().info("====================================================================");
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("shop")) {
            if ((sender instanceof Player)) {
                if (sender.hasPermission("jericraft.shop.use")) {
                    if (args.length == 0) {
                        Player player = (Player) sender;
                        if (player.getGameMode().equals(GameMode.CREATIVE)) {
                            if (!sender.hasPermission("jericraft.shop.gamemode.bypass")) {
                                sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', getConfig().getString("GamemodeNotice")));
                            } else {
                                openMainMenu(player, false);
                            }
                        } else if (player.getGameMode().equals(GameMode.SURVIVAL)) {
                            openMainMenu(player, false);
                        }
                    } else if (args.length == 1) {
                        if (args[0].equalsIgnoreCase("reload")) {
                            if (sender.hasPermission("jericraft.shop.reload")) {
                                sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', getConfig().getString("ReloadPlugin")));
                                reloadConfig();
                            } else {
                                sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', getConfig().getString("NoPermission")));
                            }
                        } else if (args[0].equalsIgnoreCase("version")) {
                            if (sender.hasPermission("jericraft.shop.version")) {
                                sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', String.format("%s", getConfig().getString("PluginVersion").replace("%current_version%", getDescription().getVersion()))));
                            } else {
                                sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', getConfig().getString("NoPermission")));
                            }
                        } else {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cInvalid Syntax! Please use: &b/shop reload &cor &b/shop version"));
                        }
                    }
                } else {
                    sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', getConfig().getString("NoPermission")));
                }
            } else {
                getLogger().severe("Plugin commands can only be executed by a player (in game)");
            }
            return true;
        }
        return false;
    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    private void preload_categories() {
        loadMenuIcons = new main_menu();
        main_menu.initMenuIcons();

        loadBuildingBlocks = new category_BuildingBlocks();
        category_BuildingBlocks.addItems_BuildingBlocks_1();
        category_BuildingBlocks.addItems_BuildingBlocks_2();
        category_BuildingBlocks.addItems_BuildingBlocks_3();
        category_BuildingBlocks.addItems_BuildingBlocks_4();
        category_BuildingBlocks.addItems_BuildingBlocks_5();
        category_BuildingBlocks.addItems_BuildingBlocks_6();

        loadDecorationBlocks = new category_DecorationBlocks();
        category_DecorationBlocks.addItems_decorationBlocks_1();
        category_DecorationBlocks.addItems_decorationBlocks_2();
        category_DecorationBlocks.addItems_decorationBlocks_3();
        category_DecorationBlocks.addItems_decorationBlocks_4();
        category_DecorationBlocks.addItems_decorationBlocks_5();

        loadRedstoneItems = new category_Redstone();
        category_Redstone.addItems_Redstone1();
        category_Redstone.addItems_Redstone2();

        loadTransportItems = new category_Transport();
        category_Transport.addItems_Transport_1();

        loadMiscellaneous = new category_Miscellaneous();
        category_Miscellaneous.addItems_Miscellaneous_1();
        category_Miscellaneous.addItems_Miscellaneous_2();
        category_Miscellaneous.addItems_Miscellaneous_3();
        category_Miscellaneous.addItems_Miscellaneous_4();

        loadFood = new category_Food();
        category_Food.addItems_Food_1();

        loadTools = new category_Tools();
        category_Tools.addItems_Tools_1();

        loadCombat = new category_Combat();
        category_Combat.addItems_Combat_1();

        loadBrewing = new category_Brewing();
        category_Brewing.addItems_Brewing_1();
    }
}
