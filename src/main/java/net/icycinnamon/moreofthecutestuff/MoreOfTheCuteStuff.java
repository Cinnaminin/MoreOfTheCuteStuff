package net.icycinnamon.moreofthecutestuff;

import block.ModBlocks;
import block.entity.ModBlockEntities;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreOfTheCuteStuff implements ModInitializer {
public static final String MOD_ID = "moreofthecutestuff";
public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		item.ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		net.icycinnamon.moreofthecutestuff.item.ModItemGroups.registerItemGroups();
		ModBlockEntities.registerBlockEntities();

		LOGGER.info("Thank you for playing More Of The Cute Stuff mod made by IcyCinnamon! I thank you for your support <3");
	}
}