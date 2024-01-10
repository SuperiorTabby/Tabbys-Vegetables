package com.superiortabby.vegetables.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent TURNIP = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.5f).build();

    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(0).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 0.1f).build();

    public static final FoodComponent CUT_ONION = new FoodComponent.Builder().hunger(0).saturationModifier(0.1f).build();



}
