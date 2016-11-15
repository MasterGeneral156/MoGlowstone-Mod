package com.themastergeneral.moglowstone.items;

import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.proxy.client.ItemModelProvider;

import net.minecraft.item.Item;

public class BasicItem extends Item implements ItemModelProvider
{ 
	protected String name;
	public BasicItem(String name) 
	{
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MoGlowstone.creativeTab);
	}
	@Override
	public void registerItemModel(Item item) 
	{
		MoGlowstone.proxy.registerItemRenderer(this, 0, name);
	}
}