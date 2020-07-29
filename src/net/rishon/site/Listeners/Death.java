package net.rishon.site.Listeners;

import net.rishon.site.FileManager.PlayerData;
import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Main;
import net.rishon.site.Scoreboard.PlayerSB;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Death implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    private void onWaterDeath(PlayerDeathEvent event) {


        Player player = event.getEntity().getPlayer();
        Player killer = event.getEntity().getKiller();

        event.getDrops().clear();

        int playerKills = Integer.parseInt(String.valueOf(PlayerData.getKills(player)));
        int playerLevel = Main.getLevel.get(player);


        if (!(killer instanceof Player)) {

            PlayerData.addDeath(player);
            Main.killstreak.put(player, 0);

            Bukkit.broadcastMessage("§b" + player.getName() + "§7[" + playerKills + "] §ehas died");

            if (playerLevel == 1) {
                Main.getLevel.put(player, 1);
            } else {
                Main.getLevel.put(player, playerLevel - 1);
            }

        }

    }

    @EventHandler
    private void onPlayerDeath(PlayerDeathEvent event) {

        Player player = event.getEntity().getPlayer();
        Player killer = event.getEntity().getKiller();

        try {
        event.getDrops().clear();

        int playerKills = Integer.parseInt(String.valueOf(PlayerData.getKills(player)));
        int killerKills = Integer.parseInt(String.valueOf(PlayerData.getKills(killer)));

        int killerLevel = Main.getLevel.get(killer);
        int playerLevel = Main.getLevel.get(player);


    if (event.getEntity() instanceof Player) {
        Bukkit.broadcastMessage("§b" + player.getName() + "§7[" + playerKills + "] §ehas been killed by §b" + killer.getName() + "§7[" + killerKills + "]");
        killer.playSound(killer.getLocation(), Sound.LEVEL_UP, 5.0F, 5.0F);

        if(killerLevel >= 48) {
            for(PotionEffect effects : killer.getActivePotionEffects()) {
                killer.removePotionEffect(effects.getType());
            }
            killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 120, 0));
        } else {
            for(PotionEffect effects : killer.getActivePotionEffects()) {
                killer.removePotionEffect(effects.getType());
            }
            killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 120, 0));
            killer.setHealth(20D);
        }

        if (playerLevel == 1) {
            Main.getLevel.put(player, 1);
        } else {
            Main.getLevel.put(player, playerLevel - 1);
        }

        if (killerLevel == 60) {
            Main.getLevel.put(killer, 60);
        } else {
            Main.getLevel.put(killer, killerLevel + 1);
        }


        PlayerData.addCoins(killer, 3);
        PlayerData.addKill(killer);
        PlayerData.addDeath(player);
        Main.killstreak.put(player, 0);
        Main.killstreak.put(killer, Main.killstreak.get(killer) + 1);
        killer.setLevel(Main.getLevel.get(killer));
        Levels.getPlayerContent(killer);

        player.spigot().respawn();

        Main.KSMSG(killer);

    }
} catch (Exception e) {
    return;
}

    }
}
