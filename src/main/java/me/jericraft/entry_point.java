/*
 *  JeriCraft Shop GUI Plugin
 *  Copyright 2018 Chalwk (Jericho Crosby), jericho.crosby227@gmail.com.
 *  System.out.println(player.getName() + " - go to Building Blocks Inventory");
 */
package me.jericraft;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.jericraft.shop_gui.initMenuIcons;
import static me.jericraft.shop_gui.openMainMenu;

public class entry_point extends JavaPlugin {
    public final String PLUGIN_PREFIX = ChatColor.translateAlternateColorCodes('&', getConfig().getString("PluginPrefix") + ChatColor.RESET);

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new shop_gui(), this);
        getConfig().options().copyDefaults(true);
        saveConfig();
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
                                initMenuIcons();
                                openMainMenu(player);
                            }
                        } else if (player.getGameMode().equals(GameMode.SURVIVAL)) {
                            initMenuIcons();
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
