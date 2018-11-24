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
import static me.jericraft.main_menu.initMenuIcons;
import static me.jericraft.main_menu.openMainMenu;

public class entry_point extends JavaPlugin {
    //public static entry_point plugin;
    public final String PLUGIN_PREFIX = ChatColor.translateAlternateColorCodes('&', getConfig().getString("PluginPrefix") + ChatColor.RESET);
    public static Economy econ = null;

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new main_menu(), this);
        getServer().getPluginManager().registerEvents(new category_BuildingBlocks(this), this);
        Bukkit.getServer().getPluginManager().registerEvents(new inventoryClickHandler(this), this);


        // add items one-time-operation
        initMenuIcons();
        category_BuildingBlocks.addItems_BuildingBlocks_1();
        category_BuildingBlocks.addItems_BuildingBlocks_2();
        category_BuildingBlocks.addItems_BuildingBlocks_3();
        category_BuildingBlocks.addItems_BuildingBlocks_4();
        category_BuildingBlocks.addItems_BuildingBlocks_5();
        category_BuildingBlocks.addItems_BuildingBlocks_6();

        category_DecorationBlocks.addItems_DecorationBlocks_1();
        category_Redstone.addItems_Redstone_1();
        category_Transport.addItems_Transport_1();
        category_Miscellaneous.addItems_Miscellaneous_1();
        category_Tools.addItems_Tools_1();
        category_Combat.addItems_Combat_1();
        category_Brewing.addItems_Brewing_1();
        category_Food.addItems_Food_1();

        getConfig().options().copyDefaults(true);
        saveConfig();
        if (!setupEconomy() ) {
            getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
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
}
