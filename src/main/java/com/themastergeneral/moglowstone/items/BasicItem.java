package com.themastergeneral.moglowstone.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.item.CTDItem;

public class BasicItem extends CTDItem {

	public BasicItem(Properties properties, String name, String modid) {
		super(properties, name, modid);
	}

	public int getItemBurnTime(ItemStack fuel) {
		Item item = fuel.getItem();
		if (item == ModItems.fuelglowstone)
			return 3200;
		else
			return 0;
	}
}