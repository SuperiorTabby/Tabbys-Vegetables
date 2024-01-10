package com.superiortabby.vegetables.block;

import com.superiortabby.vegetables.TabbysVegetables;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;


public class CuttingBoard extends BlockEntity {
    public CuttingBoard(BlockPos pos, BlockState state){
        super(TabbysVegetables.CUTTING_BOARD, pos, state);
    }

}
