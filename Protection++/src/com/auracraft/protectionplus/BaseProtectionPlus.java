package com.auracraft.protectionplus;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class BaseProtectionPlus extends JavaPlugin{
	
	protected Logger log;
	
	public void onEnable(){		
		this.log = this.getLogger();
	}
}
