package com.alex2k.morenuggets;

import com.alex2k.morenuggets.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNuggets implements ModInitializer {
	public static final String MOD_ID = "morenuggets";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();


	}
}
