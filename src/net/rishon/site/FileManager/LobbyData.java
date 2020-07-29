package net.rishon.site.FileManager;

import java.io.File;
import java.io.IOException;

import net.rishon.site.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

public class LobbyData
{
    public static YamlConfiguration getConfig() {
        File file = new File(Main.instance.getDataFolder().getPath(), "LobbyData.yml");
        return YamlConfiguration.loadConfiguration(file);
    }


    private static void save(YamlConfiguration config) {
        File file = new File(Main.instance.getDataFolder().getPath(), "LobbyData.yml");
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
        File file = new File(Main.instance.getDataFolder().getPath(), "LobbyData.yml");
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
        }
    }

    public static Location getLobby() {
        return new Location(Bukkit.getWorld(getConfig().getString("world-lobby")), getConfig().getInt("lobby-x"),
                getConfig().getInt("lobby-y"), getConfig().getInt("lobby-z"), getConfig().getInt("lobby-yaw"), getConfig().getInt("lobby-pitch"));
    }
}
