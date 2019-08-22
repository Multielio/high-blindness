package fr.polielio.project2;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class eventl implements Listener {

    @EventHandler
    public void upda(UpdateEvent e) {
        if (e.getType() == UpdateType.FAST) {
            for(Player p: Bukkit.getOnlinePlayers()){
                if(p.getLocation().getBlockY()>200 && (p.getLocation().getWorld().getEnvironment()==
                World.Environment.NORMAL)){
                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,120,1));
                }
            }

        }
    }
}
