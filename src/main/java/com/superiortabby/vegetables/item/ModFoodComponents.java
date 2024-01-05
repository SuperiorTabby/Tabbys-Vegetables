package com.superiortabby.vegetables.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TURNIP = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.5f).build();

}
