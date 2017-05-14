package de.luxa.Listener;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class EVENTpads implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();

        if (p.getLocation().getBlock().getType() == Material.WOOD_PLATE) {
            if (p.getLocation().subtract(0, 1, 0).getBlock().getType() == Material.OBSIDIAN) {
                Vector v = p.getLocation().getDirection().multiply(1.5).setY(1);
                p.setVelocity(v);
                p.playSound(p.getLocation(), Sound.EXPLODE, 1, 1);
                p.setFallDistance(-500);
            }
        } else if (p.getLocation().getBlock().getType() == Material.STONE_PLATE) {
            if (p.getLocation().subtract(0, 1, 0).getBlock().getType() == Material.OBSIDIAN) {
                Vector v = p.getLocation().getDirection().multiply(7).setY(5);
                p.setVelocity(v);
                p.playSound(p.getLocation(), Sound.EXPLODE, 1, 1);
                p.setFallDistance(-500);
            }
        }

    }
}
