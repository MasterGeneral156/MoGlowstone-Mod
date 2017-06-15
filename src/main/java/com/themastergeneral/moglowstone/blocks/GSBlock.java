package com.themastergeneral.moglowstone.blocks;

import java.util.Random;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class GSBlock extends CTDBlock {

	private String color;
	protected GSBlock(String name, String modid, String color) 
	{
	
		super(Material.GLASS, name, modid);
		this.setCreativeTab(MoGlowstone.creativeTab);
		this.setLightLevel(1.0F);
		this.setHardness(0.3F);
		this.setSoundType(blockSoundType.GLASS);
		this.color=color;
	}
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
		if (!(color == null))
		{
			return MathHelper.clamp(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
		}
		else
		{
			return 1;
		}
    }

    public int quantityDropped(Random random)
    {
    	if (!(color == null))
		{
    		return 2 + random.nextInt(3);
		}
    	else
    	{
    		return 1;
    	}
    }
}
