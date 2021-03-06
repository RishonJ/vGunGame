package net.rishon.site.Listeners;

import com.gmail.filoghost.holograms.api.Hologram;
import com.gmail.filoghost.holograms.api.HolographicDisplaysAPI;
import net.rishon.site.FileManager.HoloData;
import net.rishon.site.FileManager.LBData;
import net.rishon.site.FileManager.PlayerData;
import net.rishon.site.ItemBuilder.Levels;
import net.rishon.site.Main;
import net.rishon.site.Scoreboard.PlayerSB;
import net.rishon.site.Utils.KillMSGS;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Death implements Listener {

    @EventHandler
    private void onPlayerDeath(PlayerDeathEvent event) throws Exception{

        try {
            Player player = event.getEntity().getPlayer();
            Player killer = event.getEntity().getKiller();

            player.spigot().respawn();

            int killerLevel = Main.getLevel.get(killer);
            int playerLevel = Main.getLevel.get(player);

            if (event.getEntity() instanceof Player) {

                KillMSGS.kill(player, killer);

                killer.playSound(killer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 5.0F, 5.0F);

                for (PotionEffect effects : killer.getActivePotionEffects()) {
                    killer.removePotionEffect(effects.getType());
                }
                killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 120, 0));

                if (!(killerLevel >= 48)) {
                    killer.setHealth(20D);
                }

                if (playerLevel == 1) {
                    Main.getLevel.put(player, 1);
                } else {
                    Main.getLevel.put(player, playerLevel - 1);
                }

                if (!(killerLevel == 60)) {
                    Main.getLevel.put(killer, killerLevel + 1);
                }

                if(playerLevel == 60) {
                    Main.getLevel.put(player, playerLevel - 5);
                }

                if(Main.killstreak.get(player) >= 100) {
                    Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " §7has died with a killstreak of §f§l" + Main.killstreak.get(player) + " §7kills!");
                }

                if(Main.killstreak.get(killer) > LBData.getConfig().getInt("ks")) {
                    LBData.edit("ks-player", killer.getName());
                    LBData.edit("ks", Main.killstreak.get(killer));
                }

                if(PlayerData.getKills(killer) > LBData.getConfig().getInt("kills")) {
                    LBData.edit("kills-player", killer.getName());
                    LBData.edit("kills", PlayerData.getKills(killer));
                } else  if(PlayerData.getKills(player) > LBData.getConfig().getInt("kills")) {
                    LBData.edit("kills-player", player.getName());
                    LBData.edit("kills", PlayerData.getKills(player));
                }

                PlayerData.addCoins(killer, 3);
                PlayerData.addKill(killer);
                PlayerData.addDeath(player);
                Main.killstreak.put(player, 0);
                Main.killstreak.put(killer, Main.killstreak.get(killer) + 1);
                killer.setLevel(Main.getLevel.get(killer));
                Levels.getPlayerContent(killer);

                Main.KSMSG(killer);

                // GlowAPI.setGlowing(player, false, Bukkit.getOnlinePlayers());

            }

        } catch (Exception e) {
            return;
        }
    }
}
