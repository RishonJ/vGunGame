package me.rishon.strixgg.Events;

import me.rishon.strixgg.FileManager.Config;
import me.rishon.strixgg.FileManager.PlayerData;
import me.rishon.strixgg.Main;
import me.rishon.strixgg.Scoreboard.SB;
import me.rishon.strixgg.layers.*;
import org.bukkit.Bukkit;

import org.bukkit.Location;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class OnDeath implements Listener {


    public void clear(Player p) {

        p.getInventory().setHelmet(null);
        p.getInventory().setChestplate(null);
        p.getInventory().setLeggings(null);
        p.getInventory().setBoots(null);
        p.getInventory().clear();

    }


    @EventHandler
    public void onDeth(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player) {
            final Player player = (Player)event.getEntity();

            Player killer = (Player)event.getDamager();

            if (player.getHealth() - event.getFinalDamage() <= 0.0D && event.getEntity() instanceof Player) {

                killer.playSound(killer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5, 5);

                PlayerData.addKill(killer);
                PlayerData.addDeath(player);
                if (PlayerData.getCurrentLevel(player) == 1) {
                    PlayerData.setCurrentLevel(player, 1);

                    player.setExp(0);

                } else {
                    player.setExp(0);
                    PlayerData.removelevel(player);

                }

                if(PlayerData.getCurrentLevel(killer) == 60) {

                    player.setExp(0);
                    killer.setExp(0);
                    killer.setLevel(60);


                } else {

                    killer.setLevel(PlayerData.getCurrentLevel(killer));
                    PlayerData.addlevel(killer);

                    player.setExp(0);
                    killer.setExp(0);

                }

                clear(player);
                clear(killer);

                event.setCancelled(true);

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

                layer1.layer1(killer);
                layer2.layer2(killer);
                layer3.layer3(killer);
                layer4.layer4(killer);
                layer5.layer5(killer);
                layer6.layer6(killer);
                layer7.layer7(killer);
                layer8.layer8(killer);
                layer9.layer9(killer);
                layer10.layer10(killer);

                SB.updateSB(player);
                SB.updateSB(killer);

                killer.setLevel(PlayerData.getCurrentLevel(killer));
                player.setLevel(PlayerData.getCurrentLevel(player));


                Bukkit.broadcastMessage("§8[§b" + PlayerData.getCurrentLevel(killer) + "§8]§c " + killer.getName() + " killed " + player.getName() + " §8[§b" + PlayerData.getCurrentLevel(player) +"§8]");
                player.teleport(Config.getLobby());

                player.setHealth(20);
                killer.setHealth(20);

                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
                {
                    public void run() {
                        player.setHealth(20);
                    }
                }, 20L);
            }
        }
    }

    @EventHandler
    public void WaterDeath1(PlayerDeathEvent event) {

        Player p = event.getEntity();
        Player killer = event.getEntity().getKiller();

        event.setDroppedExp(0);

        event.getDrops().clear();
        event.getEntity().getPlayer().setExp(0);

        if (!(event.getEntity().getKiller() instanceof Player)) {

            if (PlayerData.getCurrentLevel(p) == 1) {
                PlayerData.setCurrentLevel(p, 1);

            } else {

                PlayerData.removelevel(p);

            }

            p.setExp(0);
            event.getDrops().clear();

            Bukkit.broadcastMessage("§8[§b" + PlayerData.getCurrentLevel(p) +"§8]§c " + p.getName() + " died.");

        }

    }

    @EventHandler
    public void WaterDeath(PlayerDeathEvent event) {

        Player p = event.getEntity();
        Player killer = event.getEntity().getKiller();

        event.setDroppedExp(0);

        event.getDrops().clear();
        event.getEntity().getPlayer().setExp(0);


        if (event.getEntity().getKiller() instanceof Player) {


            if (PlayerData.getCurrentLevel(p) == 1) {
                PlayerData.setCurrentLevel(p, 1);

            } else {

                PlayerData.removelevel(p);

            }

            if(PlayerData.getCurrentLevel(killer) == 60) {

                killer.setExp(0);
                killer.setLevel(60);


            } else {

                PlayerData.addlevel(killer);
                killer.setExp(0);

                killer.setLevel(PlayerData.getCurrentLevel(killer));

                layer1.layer1(killer);
                layer2.layer2(killer);
                layer3.layer3(killer);
                layer4.layer4(killer);
                layer5.layer5(killer);
                layer6.layer6(killer);
                layer7.layer7(killer);
                layer8.layer8(killer);
                layer9.layer9(killer);
                layer10.layer10(killer);


            }


            Bukkit.broadcastMessage("§8[§b" + PlayerData.getCurrentLevel(killer) + "§8]§c " + killer.getName() + " killed " + p.getName() + " §8[§b" + PlayerData.getCurrentLevel(p) +"§8]");

            killer.setHealth(20);

            SB.updateSB(killer);

        }

    }

}
