package com.romanmt.sixtyfour;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SixtyFour extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getLogger().info("64 Blocks baby");
	}

	@EventHandler
	public void inventoryClick(InventoryClickEvent event) {
		if(event.getCurrentItem().getType() == Material.CAKE) {
			event.getInventory().setMaxStackSize(64);
		}
	}

}
