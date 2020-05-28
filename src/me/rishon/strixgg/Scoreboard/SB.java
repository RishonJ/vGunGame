package me.rishon.strixgg.Scoreboard;

import me.rishon.strixgg.FileManager.PlayerData;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.*;

import java.util.Set;

public class SB implements Listener {



    public static void MainScoreboard(Player player) {

        ScoreboardManager game = Bukkit.getScoreboardManager();
        Scoreboard board = game.getNewScoreboard();
        Objective objective = board.registerNewObjective("game", "dummy");

        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName("§a§lPLAY.TOPSTRIX.NET");


        Score line9 = objective.getScore("§r   ");
        line9.setScore(9);

        Score line8 = objective.getScore("§eLEVEL: §a" + PlayerData.getCurrentLevel(player));
        line8.setScore(8);

        Score line6 = objective.getScore("§r  ");
        line6.setScore(7);

        Score stats = objective.getScore("§eKILLS: §a" + PlayerData.getKills(player));
        stats.setScore(6);

        Score line7 = objective.getScore("§r ");
        line7.setScore(5);

        Score line2 = objective.getScore("§6SHOP AT:");
        line2.setScore(4);

        Score line1 = objective.getScore("§b§nstore.topstrix.net");
        line1.setScore(3);

        Score line10 = objective.getScore("§r    ");
        line10.setScore(2);

        Score alpha = objective.getScore("§8(§cALPHA§8)");
        alpha.setScore(1);

        player.setScoreboard(board);

    }

    public static void updateSB(Player player) {


        Scoreboard board = player.getScoreboard();
        Objective objective = board.getObjective("game");

        Set<String> entries;

        entries = board.getEntries();

        for(String entry : entries)
        {
            board.resetScores(entry);
        }

        Score line9 = objective.getScore("§r   ");
        line9.setScore(9);

        Score line8 = objective.getScore("§eLEVEL: §a" + PlayerData.getCurrentLevel(player));
        line8.setScore(8);

        Score line6 = objective.getScore("§r  ");
        line6.setScore(7);

        Score stats = objective.getScore("§eKILLS: §a" + PlayerData.getKills(player));
        stats.setScore(6);

        Score line7 = objective.getScore("§r ");
        line7.setScore(5);

        Score line2 = objective.getScore("§6SHOP AT:");
        line2.setScore(4);

        Score line1 = objective.getScore("§b§nstore.topstrix.net");
        line1.setScore(3);

        Score line10 = objective.getScore("§r    ");
        line10.setScore(2);

        Score alpha = objective.getScore("§8(§cALPHA§8)");
        alpha.setScore(1);


        board.resetScores(player);
    }


    public static void createTeam(Player player, Player target) {

        Scoreboard board = player.getScoreboard();

        Team team = board.registerNewTeam(player.getName());

        team.setSuffix(ChatColor.GREEN + " [TEAM]");

        team.addPlayer(player);
        team.addPlayer(target);

        team.setAllowFriendlyFire(false);
        team.setNameTagVisibility(NameTagVisibility.ALWAYS.HIDE_FOR_OTHER_TEAMS);
        team.setCanSeeFriendlyInvisibles(false);

    }

    public static boolean checkTeam(Player target) {

        Scoreboard board = target.getScoreboard();

        if (board.getTeam(target.getName()) != null) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean checksize(Player target) {

        Scoreboard board = target.getScoreboard();

        if(board.getTeam(target.getName()).getSize() == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkPlayers(Player player) {

        Scoreboard board = player.getScoreboard();

        for(OfflinePlayer all : board.getTeam(player.getName()).getPlayers()) {
            SB.removeTeam((Player) all);
            ((Player) all).sendMessage(ChatColor.YELLOW + player.getName() + " §chas left the team.");
        }
        return false;
    }



    public static void removeTeam(Player target) {

        Scoreboard board = target.getScoreboard();

        Team team = board.getTeam(target.getName());

        team.removePlayer(target);

        team.unregister();

    }

}