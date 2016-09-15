package com.themastergeneral.moglowstonemod.blocks;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blueGlowstoneBlock extends Block {
	public blueGlowstoneBlock()
	{
		super(Material.glass);
		setBlockName(MoGlowstone.MODID + "_" + "blueGSblock");
		setBlockTextureName(MoGlowstone.MODID + ":" + "blueGSblock");
		setCreativeTab(MoGlowstone.Tab);
		setLightLevel(1.0F);
		setStepSound(soundTypeGlass);
		setHardness(0.3F);
	}
	
}
