package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class GSBlock extends CTDBlock {

	public GSBlock(String name, String modid) {
		super(Block.Properties.create(Material.GLASS, MaterialColor.SAND).lightValue(15).sound(SoundType.GLASS).hardnessAndResistance(0.3F), name, modid);
		this.setRegistryName(modid, name);
	}

}
