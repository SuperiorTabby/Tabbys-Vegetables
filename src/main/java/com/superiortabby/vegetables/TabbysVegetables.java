package com.superiortabby.vegetables;


import com.superiortabby.vegetables.block.CuttingBoard;
import com.superiortabby.vegetables.block.CuttingBoardBlock;
import com.superiortabby.vegetables.block.OnionCrop;
import com.superiortabby.vegetables.block.TurnipCrop;
import com.superiortabby.vegetables.item.ModFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.structure.StrongholdGenerator;
import net.minecraft.util.Identifier;


import static com.superiortabby.vegetables.item.ModFoodComponents.ONION;

import static net.minecraft.registry.Registries.*;

public class TabbysVegetables implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.





	public static final TurnipCrop TURNIP_CROP =
			new TurnipCrop(AbstractBlock.Settings.create().nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final Item TURNIP_SEEDS = new AliasedBlockItem(TabbysVegetables.TURNIP_CROP, new Item.Settings());
	public static final Item TURNIP = new Item(new FabricItemSettings().food(ModFoodComponents.TURNIP));

	public static final OnionCrop ONION_CROP =
			new OnionCrop(AbstractBlock.Settings.create().nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final Item ONION_SEEDS = new AliasedBlockItem(TabbysVegetables.ONION_CROP, new Item.Settings());
	public static final Item ONION = new Item(new FabricItemSettings().food(ModFoodComponents.ONION));
	public static final Item CUT_ONION = new Item(new FabricItemSettings().food(ModFoodComponents.CUT_ONION));


	public static final CuttingBoardBlock CUTTING_BOARD_BLOCK = new CuttingBoardBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).nonOpaque().notSolid());
	public static final BlockEntityType<CuttingBoard> CUTTING_BOARD = Registry.register(BLOCK_ENTITY_TYPE,
			new Identifier("tabbys-vegetables","cutting_board"),
			FabricBlockEntityTypeBuilder.create(CuttingBoard::new, CUTTING_BOARD_BLOCK).build()
	);



	@Override
	public void onInitialize() {

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.




		//Onion Block Registry
		Registry.register(BLOCK,
				new Identifier("tabbys-vegetables","onion_crop"),
					ONION_CROP);
		Registry.register(ITEM,
			new Identifier("tabbys-vegetables", "onion_seeds"),
				ONION_SEEDS);
		Registry.register(ITEM,
				new Identifier("tabbys-vegetables", "onion_food"),
					ONION);
		Registry.register(ITEM,
				new Identifier("tabbys-vegetables","cut_onion"),
					CUT_ONION);



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

		//Cutting Board registry
		Registry.register(BLOCK,
				new Identifier("tabbys-vegetables","cutting_board_block"),
				CUTTING_BOARD_BLOCK);
		Registry.register(ITEM,
				new Identifier("tabbys-vegetables","cutting_board_block"),
					new BlockItem(CUTTING_BOARD_BLOCK,
							new FabricItemSettings()));


	}
}

