package me.rishon.strixgg;

import java.util.HashSet;

import me.rishon.strixgg.Commands.SetLevel;
import me.rishon.strixgg.Commands.SetLobby;
import me.rishon.strixgg.Commands.Team;
import me.rishon.strixgg.Events.*;
import me.rishon.strixgg.FileManager.Config;
import me.rishon.strixgg.FileManager.PlayerData;
import me.rishon.strixgg.Menu.MenuEvents;
import me.rishon.strixgg.Scoreboard.SB;
import me.rishon.strixgg.layers.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;





public class Main
        extends JavaPlugin
        implements Listener
{
    public static Main plugin;
    public static HashSet<Inventory> inventory;
    public static boolean running = false;

    @Override
    public void onEnable() {
        plugin = this;
        inventory = new HashSet();

        getLogger().info("StrixGunGame | Plugin Enabled | Plugin Developed by Rishon ");


        getCommand("team").setExecutor(new Team());
        getCommand("setlevel").setExecutor(new SetLevel());
        getCommand("setlobby").setExecutor(new SetLobby());

        Events();

        getDataFolder().mkdir();
        getDataFolder().mkdirs();
        PlayerData.mk();
        Config.mk();

        for(Player all : Bukkit.getOnlinePlayers()) {

            PlayerData.tryInit(all);
            PlayerData.edit(String.valueOf(all.getUniqueId().toString()) + ".name", all.getName());

            SB.MainScoreboard(all);

            all.setLevel(PlayerData.getCurrentLevel(all));

            layer1.layer1(all);
            layer2.layer2(all);
            layer3.layer3(all);
            layer4.layer4(all);
            layer5.layer5(all);
            layer6.layer6(all);
            layer7.layer7(all);
            layer8.layer8(all);
            layer9.layer9(all);
            layer10.layer10(all);

        }
    }


    public void Events() {
        Bukkit.getPluginManager().registerEvents(new OnJoin(), this);
        Bukkit.getPluginManager().registerEvents(new OnDeath(), this);
        Bukkit.getPluginManager().registerEvents(new WaterDeath(), this);
        Bukkit.getPluginManager().registerEvents(new MenuEvents(), this);
        Bukkit.getPluginManager().registerEvents(new OnRespawn(), this);
        Bukkit.getPluginManager().registerEvents(new OnDis(), this);
        Bukkit.getPluginManager().registerEvents(new Interactions(), this);
        Bukkit.getServer().getPluginManager().registerEvents(this, this);

    }

}
