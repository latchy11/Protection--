package com.auracraft.protectionplus;

import java.net.MalformedURLException;
import java.net.URL;

public class ProtectionPlusUpdate {

	private BaseProtectionPlus plugin;
	private URL filesField;
	
	public ProtectionPlusUpdate(BaseProtectionPlus plugin, String url) {
		this.plugin = plugin;
		
		try {
			this.filesField = new URL(url);
		}catch (MalformedURLException e){
			e.printStackTrace();
		}
	}
	
	public boolean updateNeeded(){
		
		
		return false;
	}
}
