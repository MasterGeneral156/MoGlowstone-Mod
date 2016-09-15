package com.themastergeneral.moglowstonemod.blocks;

import java.util.Random;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class fuelGlowstoneBlock extends Block {
	public fuelGlowstoneBlock()
	{
		super(Material.rock);
		setBlockName(MoGlowstone.MODID + "_" + "fuelGSblock");
		setBlockTextureName(MoGlowstone.MODID + ":" + "fuelGSblock");
		setCreativeTab(MoGlowstone.Tab);
		setStepSound(soundTypeStone);
		setHardness(5.0F);
		setHarvestLevel("pickaxe",0);
	}
	  
	public int quantityDropped(Random par1Random)
    {
        return 9;
    }
	@Override
      public Item getItemDropped(int metadata, Random random, int fortune) {
          return MoGlowstone.fuelGlowstone;
      }
	
}
