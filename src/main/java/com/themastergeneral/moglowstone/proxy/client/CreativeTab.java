package com.themastergeneral.moglowstone.proxy.client;

import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs{

	public CreativeTab() 
	{
		super(MoGlowstone.MODID);
	}

	@Override
	public Item getTabIconItem() 
	{
		return ModItems.fuelGlowstone; //shown icon on creative tab
	}
	
	 @Override
	 public boolean hasSearchBar() 
	 {
		 return false;
	 }

}
