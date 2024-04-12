package me.stylescraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.stylescraft.assets.Blocks;
import me.stylescraft.assets.ItemGroup;
import me.stylescraft.assets.Items;

public class StylesCraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "stylescraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		
		//LOGGER.info("Hello Fabric world!");

		Blocks.registerModBlock();
		Items.registerItems();
		ItemGroup.registerItemGroup();
	}
}