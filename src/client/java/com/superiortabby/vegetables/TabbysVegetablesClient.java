package com.superiortabby.vegetables;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import java.awt.image.renderable.RenderableImage;

import static com.superiortabby.vegetables.TabbysVegetables.TURNIP_CROP;

public class TabbysVegetablesClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TURNIP_CROP);

	}





}