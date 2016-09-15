package com.themastergeneral.moglowstonemod.blocks;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class lgrayGlowstoneBlock extends Block {
	public lgrayGlowstoneBlock()
	{
		super(Material.glass);
		setBlockName(MoGlowstone.MODID + "_" + "lgrayGSblock");
		setBlockTextureName(MoGlowstone.MODID + ":" + "lgrayGSblock");
		setCreativeTab(MoGlowstone.Tab);
		setLightLevel(1.0F);
		setStepSound(soundTypeGlass);
		setHardness(0.3F);
	}
	
}
