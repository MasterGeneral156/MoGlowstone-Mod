package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GSBlock extends CTDBlock {

	protected GSBlock(String name, Material material, String modid) 
	{
		super(material, name, modid);
		this.setCreativeTab(MoGlowstone.creativeTab);
		this.setLightLevel(1.0F);
		this.setHardness(0.3F);
		this.setSoundType(blockSoundType.GLASS);
	}
}
