package com.themastergeneral.moglowstone.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.moglowstone.MoGlowstone;

public class BasicItem extends CTDItem {
	public BasicItem(String name, String modid) {
		super(name, modid);
		this.setCreativeTab(MoGlowstone.creativeTab);
	}

	public int getItemBurnTime(ItemStack fuel) {
		Item item = fuel.getItem();
		if (item == ModItems.fuelglowstone)
			return 3200;
		else
			return 0;
	}
}