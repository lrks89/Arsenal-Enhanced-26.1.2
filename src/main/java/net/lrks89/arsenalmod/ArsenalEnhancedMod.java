package net.lrks89.arsenalmod;

import net.fabricmc.api.ModInitializer;

import net.lrks89.arsenalmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArsenalEnhancedMod implements ModInitializer {
	public static final String MOD_ID = "arsenalmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}