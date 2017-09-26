package com.themastergeneral.moglowstone.handler;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

import com.themastergeneral.moglowstone.items.ModItems;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == ModItems.fuelglowstone) {
			return 3200;
		}
		return 0;

	}
}
