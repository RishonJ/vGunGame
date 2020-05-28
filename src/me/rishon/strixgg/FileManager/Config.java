package me.rishon.strixgg.FileManager;

import java.io.File;
import java.io.IOException;

import me.rishon.strixgg.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;


public class Config
{
    public static YamlConfiguration getConfig() {
        File file = new File(Main.plugin.getDataFolder().getPath(), "Config.yml");
        return YamlConfiguration.loadConfiguration(file);
    }


    private static void save(YamlConfiguration config) {
        File file = new File(Main.plugin.getDataFolder().getPath(), "Config.yml");
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void edit(String path, Object value) {
        YamlConfiguration config = getConfig();
        config.set(path, value);
        save(config);
    }

    public static void mk() {
        File file = new File(Main.plugin.getDataFolder().getPath(), "Config.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            edit("world-lobby", "world");
            edit("lobby-x", Integer.valueOf(0));
            edit("lobby-y", Integer.valueOf(50));
            edit("lobby-z", Integer.valueOf(0));
            edit("lobby-yaw", Integer.valueOf(0));
            edit("lobby-pitch", Integer.valueOf(0));
            edit("NoPerm", "&cYou don't have permissions.");
        }
    }

    public static Location getLobby() {
        return new Location(Bukkit.getWorld(getConfig().getString("world-lobby")), getConfig().getInt("lobby-x"),
                getConfig().getInt("lobby-y"), getConfig().getInt("lobby-z"), getConfig().getInt("lobby-yaw"), getConfig().getInt("lobby-pitch"));
    }

}
