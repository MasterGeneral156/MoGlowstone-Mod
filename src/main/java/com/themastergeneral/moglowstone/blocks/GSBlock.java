package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class GSBlock extends Block {

	protected GSBlock(String name, Material material) {
		super(material);
		setBlockName(name + "GSblock");
		setBlockTextureName(MoGlowstone.MODID + ":" + name + "GSblock");
		//setCreativeTab(MoGlowstone.Tab);
		setLightLevel(1.0F);
		setStepSound(soundTypeGlass);
		setHardness(0.3F);
	}

}
