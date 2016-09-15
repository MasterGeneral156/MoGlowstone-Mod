package com.themastergeneral.moglowstonemod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(String tabLabel)
	{
		super(tabLabel);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return MoGlowstone.fuelGlowstone;
	}

}