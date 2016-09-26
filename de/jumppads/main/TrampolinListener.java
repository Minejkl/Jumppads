package de.jumppads.main;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class TrampolinListener implements Listener {

	//TRAMPOLINE
	@EventHandler
	public void onJump(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		if(p.getLocation().add(0, -1, 0).getBlock().getType() == Material.SPONGE) {
			
			p.setVelocity(new Vector(0, 3, 0));
			p.playSound(p.getLocation(), Sound.SLIME_WALK, 0F, 80F);
			
		}
		
		if(p.getLocation().getBlockY() <= 0) {
			p.setVelocity(new Vector(0, 3, 0));
			p.playSound(p.getLocation(), Sound.SLIME_WALK, 0F, 80F);
		}
	}
	
}
