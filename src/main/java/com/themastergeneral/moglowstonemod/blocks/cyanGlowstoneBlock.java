package com.themastergeneral.moglowstonemod.blocks;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class cyanGlowstoneBlock extends Block {
	public cyanGlowstoneBlock()
	{
		super(Material.glass);
		setBlockName(MoGlowstone.MODID + "_" + "cyanGSblock");
		setBlockTextureName(MoGlowstone.MODID + ":" + "cyanGSblock");
		setCreativeTab(MoGlowstone.Tab);
		setLightLevel(1.0F);
		setStepSound(soundTypeGlass);
		setHardness(0.3F);
	}
	
}
