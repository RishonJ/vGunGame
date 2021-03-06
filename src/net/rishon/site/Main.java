package net.rishon.site;

import com.gmail.filoghost.holograms.api.Hologram;
import com.gmail.filoghost.holograms.api.HolographicDisplaysAPI;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import net.rishon.site.Commands.*;
import net.rishon.site.Commands.Admin.*;
import net.rishon.site.Commands.Admin.Levels.GetLevel;
import net.rishon.site.Commands.Admin.Levels.SetLevel;
import net.rishon.site.Commands.Moderation.Fly;
import net.rishon.site.Commands.Moderation.Teleport;
import net.rishon.site.FileManager.*;
import net.rishon.site.GUI.Shop.ShopInteractions;
import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Listeners.*;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.Sound;
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

    public static HolographicDisplaysAPI hologram;


    public void onEnable() {

        instance = this;
        inventory = new HashSet();

        getLogger().info("§aGunGame has been enabled. | Rishon");

        getDataFolder().mkdir();
        getDataFolder().mkdirs();

        SwearData.mk();
        LobbyData.mk();
        HoloData.mk();
        LBData.mk();
       // restart();
        listeners();
        commands();

        utils();

        for(Player server : Bukkit.getOnlinePlayers()) {
            PlayerData.mk(server);

            PlayerData.tryInit(server);
            PlayerData.edit(server.getUniqueId().toString() + ".name", server.getName(), server);
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
           server.kickPlayer("§cGunGame is restarting.");
       }

        try {
            for(Hologram holo : HolographicDisplaysAPI.getHolograms(Main.instance)) {
                holo.delete();
            }
        } catch (Exception e) {
            return;
        }

    }


    private void listeners() {

        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new Connection(), this);
        Bukkit.getPluginManager().registerEvents(new Death(), this);
        Bukkit.getPluginManager().registerEvents(new WaterDeath(), this);
        Bukkit.getPluginManager().registerEvents(new Filter(), this);
        Bukkit.getPluginManager().registerEvents(new Interactions(), this);
        Bukkit.getPluginManager().registerEvents(new ShopInteractions(), this);
        Bukkit.getPluginManager().registerEvents(new Respawn(), this);
    }

    private void commands() {

        getCommand("setlevel").setExecutor(new SetLevel());
        getCommand("getlevel").setExecutor(new GetLevel());
        getCommand("teleport").setExecutor(new Teleport());
        getCommand("fly").setExecutor(new Fly());
        getCommand("gamemode").setExecutor(new Gamemode());
        getCommand("setlobby").setExecutor(new SetLobby());
        getCommand("setholo").setExecutor(new SetHolo());
        getCommand("setcoins").setExecutor(new SetCoins());
        getCommand("profile").setExecutor(new Profile());
        getCommand("shop").setExecutor(new Shop());
        getCommand("team").setExecutor(new Team());
        getCommand("ping").setExecutor(new Ping());
        getCommand("addswear").setExecutor(new AddSwear());
    }

    public static void clear(Player player) {

        player.setLevel(0);
        player.setExp(0);
        player.setMaxHealth(20D);
        player.setHealth(20.0D);
        player.getInventory().clear();
        player.getInventory().setArmorContents(null);


    }

    private void utils() {
        try {
            Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.instance, new Runnable() {
                @Override
                public void run() {
                    for (Player server : Bukkit.getOnlinePlayers()) {
                        PlayerSB.updateSB(server);
                    }
                }
            }, 0L, 100L);

            Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.instance, new Runnable() {
                @Override
                public void run() {
                    try {
                        for (Hologram holo : HolographicDisplaysAPI.getHolograms(Main.instance)) {
                            holo.delete();
                        }

                    } catch (Exception e) {
                        return;
                    }

                    hologram.createHologram(Main.instance, HoloData.getHolo(), "§8• §bLeaderboard §8•",
                            "§6Most Kills §8• §f" + LBData.getConfig().getString("kills-player") + " §8• §f" + LBData.getConfig().getInt("kills"),
                            "§6Highest Killstreak §8• §f" + LBData.getConfig().getString("ks-player") + " §8• §f" + LBData.getConfig().getInt("ks"),
                            "§7play.topstrix.net");
                }
            }, 0L, 20 * 60);


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

        }, 20 * 60 * 89);

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

            }, 20 * 60 * 90);

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
               // GlowAPI.setGlowing(player, GlowAPI.Color.WHITE, Bukkit.getOnlinePlayers());
                break;
            case 60:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §f§l60 Killstreak.");
              //  GlowAPI.setGlowing(player, GlowAPI.Color.WHITE, Bukkit.getOnlinePlayers());
                break;
            case 70:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §e70 Killstreak.");
             //   GlowAPI.setGlowing(player, GlowAPI.Color.YELLOW, Bukkit.getOnlinePlayers());
                break;
            case 80:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §e§l80 Killstreak.");
               // GlowAPI.setGlowing(player, GlowAPI.Color.YELLOW, Bukkit.getOnlinePlayers());
                break;
            case 90:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §490 Killstreak.");
              //  GlowAPI.setGlowing(player, GlowAPI.Color.DARK_RED, Bukkit.getOnlinePlayers());
                break;
            case 100:
                for(Player game : Bukkit.getOnlinePlayers()) {
                    game.playSound(game.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 5);
                }
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §4§l100 Killstreak.");
              //  GlowAPI.setGlowing(player, GlowAPI.Color.DARK_RED, Bukkit.getOnlinePlayers());
                break;
            case 125:
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §0125 Killstreak.");
               // GlowAPI.setGlowing(player, GlowAPI.Color.BLACK, Bukkit.getOnlinePlayers());
                break;
            case 150:
                for(Player game : Bukkit.getOnlinePlayers()) {
                    game.playSound(game.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 5);
                }
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §0§l150 Killstreak.");
              //  GlowAPI.setGlowing(player, GlowAPI.Color.BLACK, Bukkit.getOnlinePlayers());
                break;
            case 300:
                for(Player game : Bukkit.getOnlinePlayers()) {
                    game.playSound(game.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 5);
                }
                Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7is on a §d§l300 KILLSTREAK!");
              //  GlowAPI.setGlowing(player, GlowAPI.Color.PURPLE, Bukkit.getOnlinePlayers());
                break;
        }
    }


    }


