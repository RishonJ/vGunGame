package me.rishon.strixgg.Events;

import me.rishon.strixgg.FileManager.Config;
import me.rishon.strixgg.FileManager.PlayerData;
import me.rishon.strixgg.Main;
import me.rishon.strixgg.Scoreboard.SB;
import me.rishon.strixgg.layers.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;


public class OnRespawn implements Listener {


    public void clear(Player p) {

        p.getInventory().setHelmet(null);
        p.getInventory().setChestplate(null);
        p.getInventory().setLeggings(null);
        p.getInventory().setBoots(null);
        p.getInventory().clear();

    }
    @EventHandler
    public void WaterRespawn(PlayerRespawnEvent event) {

        Player player = event.getPlayer();


        if (PlayerData.getCurrentLevel(player) == 23) {
            PlayerData.layerlevel(player, 1);
        } else if (PlayerData.getCurrentLevel(player) == 35) {
            PlayerData.layerlevel(player, 2);
        } else if (PlayerData.getCurrentLevel(player) == 47) {
            PlayerData.layerlevel(player, 3);
        } else if (PlayerData.getCurrentLevel(player) == 59) {
            PlayerData.layerlevel(player, 4);
        }

        layer1.layer1(player);
        layer2.layer2(player);
        layer3.layer3(player);
        layer4.layer4(player);
        layer5.layer5(player);
        layer6.layer6(player);
        layer7.layer7(player);
        layer8.layer8(player);
        layer9.layer9(player);
        layer10.layer10(player);



        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
        {
            public void run() {
                player.setLevel(PlayerData.getCurrentLevel(player));
                SB.updateSB(player);
            }
        }, 20L);
     }
    }
