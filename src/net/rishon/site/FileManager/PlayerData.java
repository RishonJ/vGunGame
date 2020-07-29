package net.rishon.site.FileManager;

import java.io.File;
import java.io.IOException;

import net.rishon.site.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


public class PlayerData
{
    public static YamlConfiguration getConfig() {
        File file = new File(Main.instance.getDataFolder().getPath(), "PlayerData.yml");
        return YamlConfiguration.loadConfiguration(file);
    }


    private static void save(YamlConfiguration config) {
        File file = new File(Main.instance.getDataFolder().getPath(), "PlayerData.yml");
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


    public static int getKills(Player p) { return getConfig().getInt(String.valueOf(p.getUniqueId().toString()) + ".kills"); }

    public static boolean playerExists(Player p) { return getConfig().contains(p.getUniqueId().toString()); }

    public static void addKill(Player p) { edit(String.valueOf(p.getUniqueId().toString()) + ".kills", Integer.valueOf(getKills(p) + 1)); }


    public static int getDeaths(Player p) { return getConfig().getInt(String.valueOf(p.getUniqueId().toString()) + ".deaths"); }

    public static void addDeath(Player p) { edit(String.valueOf(p.getUniqueId().toString()) + ".deaths", Integer.valueOf(getDeaths(p) + 1)); }

    private static void setDeaths(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".deaths", Integer.valueOf(amount)); }

    private static void setDeaths(String uuid, int amount) { edit(String.valueOf(uuid) + ".deaths", Integer.valueOf(amount)); }

    private static void setKills(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".kills", Integer.valueOf(amount)); }

    private static void setKills(String uuid, int amount) { edit(String.valueOf(uuid) + ".kills", Integer.valueOf(amount)); }

    public static void setCoins(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".coins", Integer.valueOf(amount)); }

    public static void setCoins(String uuid, int amount) { edit(String.valueOf(uuid) + ".coins", Integer.valueOf(amount)); }

    public static int getCoins(Player p) { return getConfig().getInt(String.valueOf(p.getUniqueId().toString()) + ".coins"); }

    public static int getCoins(String uuid) { return getConfig().getInt(String.valueOf(uuid) + ".coins"); }

    public static void addCoins(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".coins", Integer.valueOf(getCoins(p) + amount)); }

    public static void addCoins(String uuid, int amount) { edit(String.valueOf(uuid) + ".coins", Integer.valueOf(getCoins(uuid) + amount)); }

    public static void removeCoins(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".coins", Integer.valueOf(getCoins(p) - amount)); }


    public static void init(Player player) {
        setCoins(player, 0);
        setDeaths(player, 0);
        setKills(player, 0);
    }

    public static void tryInit(Player player) {
        if (!getConfig().contains(String.valueOf(player.getUniqueId().toString()) + ".deaths")) {
            setDeaths(player, 0);
        }
        if (!getConfig().contains(String.valueOf(player.getUniqueId().toString()) + ".kills")) {
            setKills(player, 0);
        }
        if (!getConfig().contains(String.valueOf(player.getUniqueId().toString()) + ".coins")) {
            setCoins(player, 0);
        }
    }

    public static void init(String uuid) {
        setCoins(uuid, 0);
        setDeaths(uuid, 0);
        setKills(uuid, 0);
    }

    public static String getUUIDByName(String player) {
        String toReturn = null;
        for (String uuid : getConfig().getKeys(false)) {
            if (getConfig().getString(String.valueOf(uuid) + ".name").equalsIgnoreCase(player)) {
                toReturn = uuid;
                break;
            }
        }
        return toReturn;
    }

    public static void mk() {
        File file = new File(Main.instance.getDataFolder().getPath(), "PlayerData.yml");
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
