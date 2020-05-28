//package me.rishon.strixgg.Teams;
//
//import me.rishon.strixgg.Main;
//import org.bukkit.configuration.file.YamlConfiguration;
//import org.bukkit.entity.Player;
//
//import java.io.File;
//import java.io.IOException;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.util.*;
//
//
//public class Teams {
//
//
//
//    public static HashMap<Player, String> team = new HashMap<>();
//
//
//    public static boolean inTeam(Player player) {
//        return team.containsKey(player);
//    }
//
//    public static Set<Player> getMembers() {
//        return team.keySet();
//    }
//
//    public static Player getMember() {
//        Set<Player> keySet = team.keySet();
//        for (Player player : keySet) {
//            if (team.get(player).equals("member"))
//                return player;
//        }
//        return null;
//    }
//
//
//    public static Player getLeader() {
//        Set<Player> keySet = team.keySet();
//        for (Player player : keySet) {
//            if (team.get(player).equals("leader"))
//                return player;
//        }
//        return null;
//    }
//
//    public static void addTeam(Player player, String role) {
//        team.put(player, role);
//    }
//
//    public static void removeTeam(Player player) {
//        if (team.containsKey(player)) {
//            team.remove(player);
//
//        }
//    }
//
//
//}
