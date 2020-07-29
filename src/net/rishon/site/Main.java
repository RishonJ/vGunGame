package net.rishon.site;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import net.rishon.site.Commands.*;
import net.rishon.site.FileManager.LobbyData;
import net.rishon.site.FileManager.PlayerData;
import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Listeners.*;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.HashSet;

public class Main extends JavaPlugin implements Listener {

    public static Main instance;

    public static HashMap<Player, Integer> getLevel = new HashMap<>();

    public static HashMap<Player, Integer> killstreak = new HashMap<>();

    public static HashSet<Inventory> inventory;

    @Override
    public void onEnable() {

        instance = this;
        inventory = new HashSet();

        getLogger().info("§aGunGame has been enabled. | Rishon");

        getDataFolder().mkdir();
        getDataFolder().mkdirs();
        PlayerData.mk();
        LobbyData.mk();

        restart();
        listeners();
        commands();
        scoreboard();

        for(Player server : Bukkit.getOnlinePlayers()) {
            PlayerData.tryInit(server);
            PlayerData.edit(server.getUniqueId().toString() + ".name", server.getName());
            getLevel.put(server, 1);
            killstreak.put(server, 0);
            clear(server);

            Levels.getPlayerContent(server);

            server.setLevel(Main.getLevel.get(server));

            PlayerSB.gameSB(server);

        }


    }

    @Override
    public void onDisable() {

        getLogger().info("§cGunGame has been disabled. | Rishon");

        for(Player server : Bukkit.getOnlinePlayers()) {
            server.sendMessage("§cGunGame is restarting.");
            server.kickPlayer("...");
        }
    }


    private void listeners() {

        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new Connect(), this);
        Bukkit.getPluginManager().registerEvents(new Death(), this);
        Bukkit.getPluginManager().registerEvents(new Disconnect(), this);
        Bukkit.getPluginManager().registerEvents(new Interactions(), this);
        Bukkit.getPluginManager().registerEvents(new Respawn(), this);
    }

    private void commands() {

        getCommand("setlevel").setExecutor(new SetLevel());
        getCommand("getlevel").setExecutor(new GetLevel());
        getCommand("setlobby").setExecutor(new SetLobby());
        getCommand("setcoins").setExecutor(new SetCoins());
        getCommand("profile").setExecutor(new Profile());
    }

    public static void clear(Player player) {

        player.setLevel(0);
        player.setExp(0);
        player.setMaxHealth(20D);
        player.setHealth(20.0D);
        player.getInventory().clear();
        player.getInventory().setArmorContents(null);


    }

    private void scoreboard() {
        try {
            Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.instance, new Runnable() {
                @Override
                public void run() {
                    for (Player server : Bukkit.getOnlinePlayers()) {
                        PlayerSB.updateSB(server);
                    }
                }
            }, 0L, 100L);

        } catch (IllegalArgumentException e) {
            return;
        }

    }

    private void restart() {

        Bukkit.getScheduler().runTaskLater(Main.instance, new Runnable() {
            @Override
            public void run() {
                Bukkit.broadcastMessage("§cGunGame will be restarting in §l1 §cminute.");

            }

        }, 20 * 60 * 59);

            Bukkit.getScheduler().runTaskLater(Main.instance, new Runnable() {
                @Override
                public void run() {
                    for (Player server : Bukkit.getOnlinePlayers()) {
                        Bukkit.getMessenger().registerOutgoingPluginChannel(Main.instance, "BungeeCord");
                        ByteArrayDataOutput out = ByteStreams.newDataOutput();
                        out.writeUTF("Connect");
                        out.writeUTF("Lobby1");
                        server.sendPluginMessage(Main.instance, "BungeeCord", out.toByteArray());
                    }
                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "restart");

                    }

            }, 20 * 60 * 60);

    }

    public static void KSMSG(Player player) {

        switch (killstreak.get(player)) {

            case 10:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §b10 Killstreak.");
                break;
            case 20:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §b§l20 Killstreak.");
                break;
            case 30:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §930 Killstreak.");
                break;
            case 40:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §9§l40 Killstreak.");
                break;
            case 50:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §f50 Killstreak.");
                break;
            case 60:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §f§l60 Killstreak.");
                break;
            case 70:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §e70 Killstreak.");
                break;
            case 80:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §e§l80 Killstreak.");
                break;
            case 90:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §490 Killstreak.");
                break;
            case 100:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §4§l100 Killstreak.");
                break;
            case 125:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §0125 Killstreak.");
                break;
            case 150:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §0§l150 Killstreak.");
                break;
        }
    }


    }


