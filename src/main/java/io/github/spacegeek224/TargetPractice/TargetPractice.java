package io.github.spacegeek224.TargetPractice;

import java.util.logging.Level;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TargetPractice extends JavaPlugin {
    @Override
    public void onEnable() {
        // TODO Insert logic to be performed when the plugin is enabled
    	getLogger().info("onEnable has been called!");
    }
    
    @EventHandler
    public void onLogin(PlayerLoginEvent event) {
        // Your code here...
    	getLogger().log(Level.INFO, "Player " + event.getPlayer().getName() + " is logging in!");
    }
 
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }
}
