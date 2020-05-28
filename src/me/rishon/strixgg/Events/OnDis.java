package me.rishon.strixgg.Events;


import me.rishon.strixgg.Scoreboard.SB;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnDis implements Listener {


    @EventHandler
    public void onDis(PlayerQuitEvent event) {

        Player p = event.getPlayer();

        if(SB.checkPlayers(p) == true) {
            SB.checkPlayers(p);
        }

        }



}
