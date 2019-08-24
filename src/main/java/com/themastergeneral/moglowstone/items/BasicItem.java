package com.themastergeneral.moglowstone.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.moglowstone.MoGlowstone;

public class BasicItem extends CTDItem {

	public BasicItem(String name) {
		super(new Item.Properties(), name, MoGlowstone.MODID);
	}

	@Override
	public int getBurnTime(ItemStack itemStack)
	{
		return 3200;
	}
}