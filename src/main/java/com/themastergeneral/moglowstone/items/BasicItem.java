package com.themastergeneral.moglowstone.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.item.Item;

public class BasicItem extends CTDItem
{ 
	public BasicItem(String name, String modid) 
	{
		super(name, modid);
		this.setCreativeTab(MoGlowstone.creativeTab);
	}
}