package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class GSBlock extends Block {

	protected GSBlock(String name, Material material) 
	{
		super(material);
		this.setRegistryName(name + "GSblock");
		this.setUnlocalizedName(name + "GSblock");
		//setCreativeTab(MoGlowstone.Tab);
		this.setLightLevel(1.0F);
		this.setHardness(0.3F);
		this.setSoundType(blockSoundType.GLASS);
	}
}
