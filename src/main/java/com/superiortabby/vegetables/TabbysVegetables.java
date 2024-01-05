package com.superiortabby.vegetables;


import com.superiortabby.vegetables.block.TurnipCrop;
import com.superiortabby.vegetables.item.ModFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.registry.Registries.*;

public class TabbysVegetables implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.




	public static final Block ONION_BLOCK = new Block(FabricBlockSettings.create().strength(((float) 0.0f)));

	public static final CropBlock TURNIP_CROP =
			new TurnipCrop(AbstractBlock.Settings.create().nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final Item TURNIP_SEEDS = new AliasedBlockItem(TabbysVegetables.TURNIP_CROP, new Item.Settings());
	public static final Item TURNIP = new Item(new FabricItemSettings().food(ModFoodComponents.TURNIP));




	@Override
	public void onInitialize() {





		//Onion Block Registry
		Registry.register(BLOCK,
				new Identifier("tabbys-vegetables", "onion_block"),
				ONION_BLOCK);

		//Turnip Registry
		Registry.register(BLOCK,
				new Identifier("tabbys-vegetables","turnip_crop"),
						TURNIP_CROP);

		Registry.register(ITEM,
				new Identifier("tabbys-vegetables","turnip_seeds"),
						TURNIP_SEEDS);

		Registry.register(ITEM,
		new Identifier("tabbys-vegetables", "turnip_food"),
		TURNIP);






		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


	}
}

