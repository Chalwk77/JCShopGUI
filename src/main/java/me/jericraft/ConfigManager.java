package me.jericraft;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {

    private entry_point plugin = entry_point.getPlugin(entry_point.class);

    // Files & File Configs Here
    public FileConfiguration item_data;
    public File data_file;
    // --------------------------

    public void setup() {
        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }

        data_file = new File(plugin.getDataFolder(), "items.yml");

        if (!data_file.exists()) {
            try {
                data_file.createNewFile();
                Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The items.yml file has been created");
            } catch (IOException e) {
                Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Could not create the items.yml file");
            }
        }
        item_data = YamlConfiguration.loadConfiguration(data_file);
    }

    public FileConfiguration getData() {
        return item_data;
    }

    public void saveData() {
        try {
            item_data.save(data_file);
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "The items.yml file has been saved");

        } catch (IOException e) {
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Could not save the items.yml file");
        }
    }

    public void reloadData() {
        item_data = YamlConfiguration.loadConfiguration(data_file);
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "The items.yml file has been reloaded");

    }
}