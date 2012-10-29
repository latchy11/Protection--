package com.auracraft.protectionplus;

import org.bukkit.plugin.java.JavaPlugin;

public class BaseProtectionPlus extends JavaPlugin{
	public void onEnable(){
		getLogger().info("Protection++ has been enabled!");
	}
	
	public void onDisable(){
		getLogger().info("Protection++ has been disabled!");
	}
}
