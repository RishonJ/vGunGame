package me.rishon.strixgg.FileManager;

import java.io.File;
import java.io.IOException;

import com.sun.org.apache.xerces.internal.xs.StringList;
import me.rishon.strixgg.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;



public class PlayerData
{
    public static YamlConfiguration getConfig() {
       File file = new File(Main.plugin.getDataFolder().getPath(), "PlayerData.yml");
        return YamlConfiguration.loadConfiguration(file);
    }


    private static void save(YamlConfiguration config) {
        File file = new File(Main.plugin.getDataFolder().getPath(), "PlayerData.yml");
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

    public static void addlevel(Player p) { edit(String.valueOf(p.getUniqueId().toString()) + ".level", Integer.valueOf(getCurrentLevel(p) + 1)); }

    public static void removelevel(Player p) { edit(String.valueOf(p.getUniqueId().toString()) + ".level", Integer.valueOf(getCurrentLevel(p) - 1)); }

    public static void layerlevel(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".level", PlayerData.getCurrentLevel(p) - Integer.valueOf(amount)); }

    public static int getDeaths(Player p) { return getConfig().getInt(String.valueOf(p.getUniqueId().toString()) + ".deaths"); }

    public static void addDeath(Player p) { edit(String.valueOf(p.getUniqueId().toString()) + ".deaths", Integer.valueOf(getDeaths(p) + 1)); }

    private static void setDeaths(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".deaths", Integer.valueOf(amount)); }

    private static void setDeaths(String uuid, int amount) { edit(String.valueOf(uuid) + ".deaths", Integer.valueOf(amount)); }

    public static void setTeam(Player p, String team) { edit(String.valueOf(p.getUniqueId().toString()) + ".team", team); }

    public static void setTeam(String uuid, String team) { edit(String.valueOf(uuid) + ".team", team); }

    public static String getTeam(Player p) { return getConfig().getString(String.valueOf(p.getUniqueId().toString()) + ".team"); }

    private static void setKills(Player p, int amount) { edit(String.valueOf(p.getUniqueId().toString()) + ".kills", Integer.valueOf(amount)); }

    private static void setKills(String uuid, int amount) { edit(String.valueOf(uuid) + ".kills", Integer.valueOf(amount)); }

    public static void setCurrentLevel(Player p, int level) { edit(String.valueOf(p.getUniqueId().toString()) + ".level", level); }

    public static void setCurrentLevel(String uuid, int level) { edit(String.valueOf(uuid) + ".level", level); }

    public static int getCurrentLevel(Player p) { return getConfig().getInt(String.valueOf(p.getUniqueId().toString()) + ".level"); }


    public static void init(Player p) {
        setDeaths(p, 0);
        setKills(p, 0);
        setCurrentLevel(p, 1);
    }

    public static void tryInit(Player p) {
        if (!getConfig().contains(String.valueOf(p.getUniqueId().toString()) + ".deaths")) {
            setDeaths(p, 0);
        }
        if (!getConfig().contains(String.valueOf(p.getUniqueId().toString()) + ".kills")) {
            setKills(p, 0);
        }
        if (!getConfig().contains(String.valueOf(p.getUniqueId().toString()) + ".level")) {
            setCurrentLevel(p, 1);
        }
    }

    public static void init(String uuid) {
        setDeaths(uuid, 0);
        setKills(uuid, 0);
        setCurrentLevel(uuid, 1);
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
        File file = new File(Main.plugin.getDataFolder().getPath(), "PlayerData.yml");
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
