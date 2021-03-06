package net.rishon.site.Scoreboard;

import net.rishon.site.FileManager.PlayerData;
import net.rishon.site.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

import java.text.DecimalFormat;
import java.util.Set;

public class PlayerSB {


    public static void gameSB(Player player) {

        try {
            Double KD;

            if (PlayerData.getKills(player) == 0.0) {
                KD = 0.0;
            } else if (PlayerData.getDeaths(player) == 0.0) {
                KD = Double.valueOf(PlayerData.getKills(player));
            } else {
                KD = Double.valueOf(PlayerData.getKills(player) / PlayerData.getDeaths(player));
            }

            ScoreboardManager game = Bukkit.getScoreboardManager();
            Scoreboard sb = game.getNewScoreboard();
            Objective objective = sb.registerNewObjective("game", "dummy");
            objective.setDisplaySlot(DisplaySlot.SIDEBAR);
            objective.setDisplayName(" §6§lTopStrix §7❘ §fGunGame");

            Score space4 = objective.getScore("§r   ");
            space4.setScore(10);

            Score Online = objective.getScore("§fOnline§8: §e" + Bukkit.getOnlinePlayers().size());
            Online.setScore(9);

            Score space3 = objective.getScore("§r  ");
            space3.setScore(8);

            Score Kills = objective.getScore("§fKills§8: §a" + PlayerData.getKills(player));
            Kills.setScore(7);

            Score kdr = objective.getScore("§fK/D§8: §a" + Double.parseDouble(new DecimalFormat("##.##").format(KD)));
            kdr.setScore(6);

            Score space2 = objective.getScore("§r ");
            space2.setScore(5);

            Score coins = objective.getScore("§fCoins§8: §e" + PlayerData.getCoins(player));
            coins.setScore(4);

            Score Killstreak = objective.getScore("§fKillstreak§8: §6" + +Main.killstreak.get(player));
            Killstreak.setScore(3);
            ;

            Score level = objective.getScore("§fLevel§8: §b" + Main.getLevel.get(player));
            level.setScore(2);

            Score space1 = objective.getScore("§r");
            space1.setScore(1);

            Score web = objective.getScore("§7play.topstrix.net");
            web.setScore(0);

            player.setScoreboard(sb);
        } catch (Exception e) {
            return;
        }
    }


    public static void updateSB(Player player) {
        try {
            Double KD;

            if (PlayerData.getKills(player) == 0.0) {
                KD = 0.0;
            } else if (PlayerData.getDeaths(player) == 0.0) {
                KD = Double.valueOf(PlayerData.getKills(player));
            } else {
                KD = Double.valueOf(PlayerData.getKills(player) / Double.valueOf(PlayerData.getDeaths(player)));
            }

            Scoreboard sb = player.getScoreboard();
            Objective objective = sb.getObjective("game");

            Set<String> entries = sb.getEntries();

            for (String entry : entries) {
                sb.resetScores(entry);
            }

            Score space4 = objective.getScore("§r   ");
            space4.setScore(10);

            Score Online = objective.getScore("§fOnline§8: §e" + Bukkit.getOnlinePlayers().size());
            Online.setScore(9);

            Score space3 = objective.getScore("§r  ");
            space3.setScore(8);

            Score Kills = objective.getScore("§fKills§8: §a" + PlayerData.getKills(player));
            Kills.setScore(7);

            Score kdr = objective.getScore("§fK/D§8: §a" + Double.parseDouble(new DecimalFormat("##.##").format(KD)));
            kdr.setScore(6);

            Score space2 = objective.getScore("§r ");
            space2.setScore(5);

            Score coins = objective.getScore("§fCoins§8: §e" + PlayerData.getCoins(player));
            coins.setScore(4);

            Score Killstreak = objective.getScore("§fKillstreak§8: §6" + +Main.killstreak.get(player));
            Killstreak.setScore(3);
            ;

            Score level = objective.getScore("§fLevel§8: §b" + Main.getLevel.get(player));
            level.setScore(2);

            Score space1 = objective.getScore("§r");
            space1.setScore(1);

            Score web = objective.getScore("§7play.topstrix.net");
            web.setScore(0);

            sb.resetScores(player);

        } catch (Exception e) {
            return;
        }
    }

}
