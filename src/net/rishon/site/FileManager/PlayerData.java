package net.rishon.site.FileManager;

import java.io.File;
import java.io.IOException;

import net.rishon.site.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


public class PlayerData
{
    public static YamlConfiguration getConfig(Player player) {
        File file = new File(Main.instance.getDataFolder().getPath(), "PlayerData/" + player.getUniqueId() + ".yml");
        return YamlConfiguration.loadConfiguration(file);
    }


    private static void save(YamlConfiguration config, Player player) {
        File file = new File(Main.instance.getDataFolder().getPath(), "PlayerData/" + player.getUniqueId() + ".yml");
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void edit(String path, Object value, Player player) {
        YamlConfiguration config = getConfig(player);
        config.set(path, value);
        save(config, player);
    }


    public static int getKills(Player p) { return getConfig(p).getInt(String.valueOf(p.getUniqueId().toString()) + ".kills"); }

    public static boolean playerExists(Player p) { return getConfig(p).contains(p.getUniqueId().toString()); }

    public static void addKill(Player p) { edit(p.getUniqueId().toString() + ".kills", Integer.valueOf(getKills(p) + 1), p); }


    public static int getDeaths(Player p) { return getConfig(p).getInt(String.valueOf(p.getUniqueId().toString()) + ".deaths"); }

    public static void addDeath(Player p) { edit(String.valueOf(p.getUniqueId().toString()) + ".deaths", Integer.valueOf(getDeaths(p) + 1), p); }

    private static void setDeaths(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".deaths", Integer.valueOf(amount), p); }

    private static void setDeaths(String uuid, int amount, Player p) { edit(String.valueOf(uuid) + ".deaths", Integer.valueOf(amount), p); }

    private static void setKills(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".kills", Integer.valueOf(amount), p); }

    private static void setKills(String uuid, int amount, Player p) { edit(String.valueOf(uuid) + ".kills", Integer.valueOf(amount), p); }

    public static void setCoins(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".coins", Integer.valueOf(amount), p); }

    public static void setCoins(String uuid, int amount, Player p) { edit(String.valueOf(uuid) + ".coins", Integer.valueOf(amount), p); }

    public static int getCoins(Player p) { return getConfig(p).getInt(String.valueOf(p.getUniqueId().toString()) + ".coins"); }

    public static int getCoins(String uuid, Player p) { return getConfig(p).getInt(String.valueOf(uuid) + ".coins"); }

    public static void addCoins(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".coins", Integer.valueOf(getCoins(p) + amount), p); }

    public static void addCoins(String uuid, int amount, Player p) { edit(String.valueOf(uuid) + ".coins", Integer.valueOf(getCoins(p) + amount), p); }

    public static void removeCoins(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".coins", Integer.valueOf(getCoins(p) - amount), p); }

    public static String getKM(Player p) { return getConfig(p).getString(p.getUniqueId().toString() + ".km"); }

    public static String getKM(String uuid, Player p) { return getConfig(p).getString(String.valueOf(uuid) + ".km"); }

    public static void setKM(Player p, String type) { edit(String.valueOf(p.getUniqueId().toString()) + ".km", type, p); }

    public static void setKM(String uuid, String type, Player p) { edit(String.valueOf(uuid) + ".km", type, p); }

    public static void init(Player player) {
        setCoins(player, 0);
        setDeaths(player, 0);
        setKills(player, 0);
        setKM(player, "default");
    }

    public static void tryInit(Player player) {
        if (!getConfig(player).contains(String.valueOf(player.getUniqueId().toString()) + ".deaths")) {
            setDeaths(player, 0);
        }
        if (!getConfig(player).contains(String.valueOf(player.getUniqueId().toString()) + ".kills")) {
            setKills(player, 0);
        }
        if (!getConfig(player).contains(String.valueOf(player.getUniqueId().toString()) + ".coins")) {
            setCoins(player, 0);
        }
        if (!getConfig(player).contains(String.valueOf(player.getUniqueId().toString()) + ".km")) {
            setKM(player, "default");
        }
    }

    public static void init(String uuid, Player player) {
        setCoins(uuid, 0, player);
        setDeaths(uuid, 0, player);
        setKills(uuid, 0, player);
        setKM(player, "default");
    }

    public static String getUUIDByName(Player player) {
        String toReturn = null;
        for (String uuid : getConfig(player).getKeys(false)) {
            if (getConfig(player).getString(String.valueOf(uuid) + ".name").equalsIgnoreCase(String.valueOf(player))) {
                toReturn = uuid;
                break;
            }
        }
        return toReturn;
    }

    public static void mk(Player player) {
        File file = new File(Main.instance.getDataFolder().getPath(), "PlayerData/" + player.getUniqueId() + ".yml");
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
