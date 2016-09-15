package com.themastergeneral.moglowstonemod.blocks;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class brickGlowstoneBlock extends Block {
	public brickGlowstoneBlock()
	{
		super(Material.glass);
		setBlockName(MoGlowstone.MODID + "_" + "brickGSblock");
		setBlockTextureName(MoGlowstone.MODID + ":" + "brickGSblock");
		setCreativeTab(MoGlowstone.Tab);
		setLightLevel(1.0F);
		setStepSound(soundTypeStone);
		setHardness(1.5F);
		setHarvestLevel("pickaxe",0);
	}
	
}
