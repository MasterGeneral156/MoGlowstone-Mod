package com.themastergeneral.moglowstone.blocks;

import java.util.Random;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlockState;

public class GSOre extends CTDBlock {
	public GSOre(String name) 
	{
		super(Block.Properties.create(Material.ROCK, MaterialColor.STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(3F)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(3),
				name, MoGlowstone.MODID);
	}
}
