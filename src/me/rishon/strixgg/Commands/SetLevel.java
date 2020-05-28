package me.rishon.strixgg.Commands;

import me.rishon.strixgg.ChatUtil;
import me.rishon.strixgg.FileManager.Config;
import me.rishon.strixgg.FileManager.PlayerData;
import me.rishon.strixgg.Scoreboard.SB;
import me.rishon.strixgg.layers.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class SetLevel
        implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player)sender;

        if (player.isOp()) {
            if (args.length == 0) {

                sender.sendMessage("§cUsage: /setlevel <player> <level>");
                return true;
            }

                if (args.length == 1) {
                    sender.sendMessage("§cUsage: /setlevel <player> <level>");
                    return true;
                }

                Player target = Bukkit.getServer().getPlayer(args[0]);
                if (target == null) {
                    sender.sendMessage("§cCouldn't find the targeted player.");
                    return true;
                }

                int level = Integer.parseInt(args[1]);

            PlayerData.setCurrentLevel(target, level);
            sender.sendMessage("§cYou have set " + target.getName() + " level to " + level);

            target.setLevel(PlayerData.getCurrentLevel(target));

            SB.updateSB(target);

            layer1.layer1(target);
            layer2.layer2(target);
            layer3.layer3(target);
            layer4.layer4(target);
            layer5.layer5(target);
            layer6.layer6(target);
            layer7.layer7(target);
            layer8.layer8(target);
            layer9.layer9(target);
            layer10.layer10(target);


        } else {
            player.sendMessage(ChatUtil.format(Config.getConfig().getString("NoPerm")));
        }
        return false;
    }
}
