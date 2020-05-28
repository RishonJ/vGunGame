package me.rishon.strixgg.Commands;


import me.rishon.strixgg.Main;
import me.rishon.strixgg.Scoreboard.SB;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.minecraft.server.v1_15_R1.MobEffect;
import net.minecraft.server.v1_15_R1.MobEffectList;
import net.minecraft.server.v1_15_R1.PacketPlayOutEntityEffect;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Team implements CommandExecutor {

    public static ArrayList<Player> data = new ArrayList<Player>();



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String lebel, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("§cOnly players can execute this command.");
            return true;
        }


        if (args.length == 0) {

            sender.sendMessage("§e§lTOPSTRIX GUNGAME §b§lTEAMS §8(§c§lBETA§8)\n§a/team invite <player> - invite a player to your team.\n§a/team leave - leave the team.");
            return true;
        }


        if (args[0].equalsIgnoreCase("invite")) {

            if (args.length == 1) {
                sender.sendMessage("§cUsage: /team invite <player>");
                return true;
            }
            Player target = Bukkit.getServer().getPlayer(args[1]);
            if (target == null) {
                sender.sendMessage("§cCouldn't find the targeted player.");
                return true;
            }


            if (target.getName() != sender.getName()) {
                if (!SB.checkTeam(target)) {
                    sender.sendMessage("§a" + target.getName() + " §cis already in a team.");

                } else {


                    sender.sendMessage("§eYou have invited §a" + target.getName() + " §eto join your team. They have 60 seconds to accept the request.");
                    target.sendMessage("§eYou have been invited to join §a" + sender.getName() + " §eteam.");

                    if (Main.running == false) {
                        final int task1 = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
                            int count = 60;

                            public void run() {
                                this.count--;

                                if (this.count >= 1) {
                                    Main.running = true;
                                } else {

                                    Main.running = false;

                                    if (Main.running == true) {
                                        sender.sendMessage("§eYour invite to §a" + target.getName() + " §ehas expired.");
                                    }
                                }
                            }
                        }, 0L, 20L);

                        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable() {
                            public void run() {
                                Bukkit.getScheduler().cancelTask(task1);
                                Main.running = false;
                            }
                        }, 60 * 20L);
                    }

                    TextComponent accept = new TextComponent("§a§lACCEPT");

                    TextComponent deny = new TextComponent("§c§lDENY");

                    deny.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/team deny " + sender.getName()));
                    accept.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/team accept " + sender.getName()));
                    target.spigot().sendMessage(accept);
                    target.spigot().sendMessage(deny);

                }

            } else {
                sender.sendMessage("§cYou can't invite yourself.");
            }


        } else if (args[0].equalsIgnoreCase("accept")) {
            if(sender.hasPermission("topstrix.admin")) {
                if (args.length == 1) {
                    sender.sendMessage("§cUsage: /team accept <player>");
                    return true;
                }
                Player target = Bukkit.getServer().getPlayer(args[1]);
                if (target == null) {
                    sender.sendMessage("§cCouldn't find the targeted player.");
                    return true;
                }
                if (Main.running == true) {
                    if (target.getName() != sender.getName()) {
                        if (!SB.checkTeam((Player) sender) == false) {
                            SB.createTeam(target.getPlayer(), (Player) sender);
                            SB.createTeam((Player) sender, target.getPlayer());
                            sender.sendMessage("§eYou have joined §a" + target.getName() + " §eteam.");
                            target.sendMessage(ChatColor.GREEN + sender.getName() + " §ehas joined your team.");
                            data.add((Player) sender);
                            data.add(target.getPlayer());
                            Main.running = false;

                        } else {
                            sender.sendMessage("§cYou are already in a team.");
                        }
                    } else {
                        sender.sendMessage("§cCouldn't find any team requests.");
                    }


                } else {
                    sender.sendMessage("§cCouldn't find any team requests.");
                }
            }

        } else if (args[0].equalsIgnoreCase("deny")) {
            if (sender.hasPermission("topstrix.admin")) {
                if (args.length == 1) {
                    sender.sendMessage("§cUsage: /team deny <player>>");
                    return true;
                }
                Player target = Bukkit.getServer().getPlayer(args[1]);
                if (target == null) {
                    sender.sendMessage("§cCouldn't find the targeted player.");
                    return true;
                }
                if (Main.running == true) {
                    if (target.getName() != sender.getName()) {


                        sender.sendMessage("§cYou have denied §a" + target.getName() + " §cteam request.");
                        target.sendMessage(ChatColor.GREEN + sender.getName() + " §chas denied your team request.");

                        Main.running = false;

                    } else {
                        sender.sendMessage("§cYou can't deny yourself.");
                    }

                    } else{
                        sender.sendMessage("§cCouldn't find any team requests.");
                    }
                }
            }



        else if (args[0].equalsIgnoreCase("leave")) {

            if (SB.checkTeam((Player) sender)) {
                sender.sendMessage("§cYou are not in a team.");
            } else {

                SB.checkPlayers((Player) sender);

                sender.sendMessage("§cYou have left the team.");

            }

        }

            return false;


    }
}