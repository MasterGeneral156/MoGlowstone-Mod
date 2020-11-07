package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class GSBlock extends CTDBlock {

	public GSBlock(String name) 
	{
		super(Block.Properties.create(Material.GLASS, MaterialColor.SAND)
				.sound(SoundType.GLASS)
				.hardnessAndResistance(0.3F)
				.harvestTool(ToolType.PICKAXE),
				name, 
				MoGlowstone.MODID);
	}
	
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos)
	{
		return 15;
	}

}
