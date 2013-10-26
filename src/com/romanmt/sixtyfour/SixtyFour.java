package com.romanmt.sixtyfour;

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
		int maxSize = event.getCurrentItem().getMaxStackSize();
		if(maxSize < 64 && maxSize != -1)
			event.getInventory().setMaxStackSize(64);
	}
}
