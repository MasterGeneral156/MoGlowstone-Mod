package com.themastergeneral.moglowstone.tileentity;

import net.minecraft.block.BlockFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BasicFurnace extends BlockFurnace {
	
	protected String name;
	public BasicFurnace(boolean isBurning) 
	{
		super(isBurning);
	}
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(Blocks.FURNACE);
    }

}
