package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class GSBlock extends CTDBlock {

	public GSBlock(String name) {
		super(Block.Properties.create(Material.GLASS, MaterialColor.SAND).lightValue(15).sound(SoundType.GLASS).hardnessAndResistance(0.3F), name, MoGlowstone.MODID);
		this.setRegistryName(MoGlowstone.MODID, name);
	}

}
