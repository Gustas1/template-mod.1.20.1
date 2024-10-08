package net.chips.tutorialmod;

import net.chips.tutorialmod.block.ModBlocks;
import net.chips.tutorialmod.item.ModItemGroups;
import net.chips.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();

		FuelRegistry.INSTANCE.add(ModItems.COAL_CLUMP, 200);
	}
}