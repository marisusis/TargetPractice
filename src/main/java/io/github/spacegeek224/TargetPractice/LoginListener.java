package io.github.spacegeek224.TargetPractice;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
 
public final class LoginListener implements Listener {
	public LoginListener(TargetPractice plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
 
    @EventHandler
    public void normalLogin(PlayerLoginEvent event) {
        // Some code here
    	event.getPlayer().sendMessage("Welcome to SpaceHex!");
    }
 
    @EventHandler(priority = EventPriority.HIGH)
    public void highLogin(PlayerLoginEvent event) {
        // Some code here
    }
}