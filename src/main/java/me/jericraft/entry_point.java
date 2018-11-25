/*
 *  JeriCraft Shop GUI Plugin
 *  Copyright 2018 Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.
 *  System.out.println(player.getName() + " - go to Building Blocks Inventory");
 *
 *
 *  The void keyword allows us to create methods which do not return a value.
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

import java.util.List;
import java.util.Set;

import static me.jericraft.main_menu.openMainMenu;

public class entry_point extends JavaPlugin {
    private ConfigManager cfgm;
    private main_menu loadMenuIcons;
    private category_BuildingBlocks loadBuildingBlocks;


    //public static entry_point plugin;
    public final String PLUGIN_PREFIX = ChatColor.translateAlternateColorCodes('&', getConfig().getString("PluginPrefix") + ChatColor.RESET);
    public static Economy econ = null;

    @Override
    public void onEnable() {
        loadConfigManager();
        Bukkit.getServer().getPluginManager().registerEvents(new main_menu(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new category_BuildingBlocks(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new inventoryClickHandler(this), this);
        //Bukkit.getServer().getPluginManager().registerEvents(new page_handler(this), this);

        if (!setupEconomy() ) {
            getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        loadConfig();
        preloadMenu();
        preload_category_BuildingBlocks();
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
                                openMainMenu(player);
                            }
                        } else if (player.getGameMode().equals(GameMode.SURVIVAL)) {
                            openMainMenu(player);
                        }
                    } else if (args.length >= 1) {
                        if (args[0].equalsIgnoreCase("reload")) {
                            sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', getConfig().getString("ReloadPlugin")));
                            reloadConfig();
                        }
                    }
                } else {
                    sender.sendMessage(PLUGIN_PREFIX + " " + ChatColor.translateAlternateColorCodes('&', getConfig().getString("NoPermission")));
                }
            } else {
                sender.sendMessage(PLUGIN_PREFIX + " This command can only be executed by a player!");
            }
            return true;
        }
        return false;
    }

    public void loadConfigManager(){
        cfgm = new ConfigManager();
        cfgm.setup();
        cfgm.saveData();
        cfgm.reloadData();
//        Set<String> list = getConfig().getConfigurationSection("items").getKeys(false);
//        for(String item_name : list) {
//            System.out.println(item_name);
//        }
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void preloadMenu() {
        loadMenuIcons = new main_menu();
        loadMenuIcons.initMenuIcons();
    }

    public void preload_category_BuildingBlocks() {
        loadBuildingBlocks = new category_BuildingBlocks();
        loadBuildingBlocks.addItems_BuildingBlocks_1();
        loadBuildingBlocks.addItems_BuildingBlocks_2();
        loadBuildingBlocks.addItems_BuildingBlocks_3();
        loadBuildingBlocks.addItems_BuildingBlocks_4();
        loadBuildingBlocks.addItems_BuildingBlocks_5();
        loadBuildingBlocks.addItems_BuildingBlocks_6();
    }
}
