package com.themastergeneral.moglowstone.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

public class GSBlock extends CTDBlock {

	private String color;

	protected GSBlock(String name, String modid, String color) {

		super(Material.GLASS, name, modid);
		this.setCreativeTab(MoGlowstone.creativeTab);
		this.setLightLevel(1.0F);
		this.setHardness(0.3F);
		this.setSoundType(blockSoundType.GLASS);
		this.color = color;
	}
}
