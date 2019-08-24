package com.themastergeneral.moglowstone;

import com.themastergeneral.moglowstone.blocks.ModBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MoGlowstoneItemGroup extends ItemGroup
{
	public MoGlowstoneItemGroup() 
	{
		super("moglowstone");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ModBlocks.red_gsblock);
	}
}
