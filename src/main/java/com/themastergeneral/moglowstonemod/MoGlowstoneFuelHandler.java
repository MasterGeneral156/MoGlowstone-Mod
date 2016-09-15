package com.themastergeneral.moglowstonemod;

import com.themastergeneral.moglowstonemod.items.fuelGlowstone;
import com.themastergeneral.moglowstonemod.blocks.fuelGlowstoneBlock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class MoGlowstoneFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() instanceof fuelGlowstone)
        {
            return 3200;
        }
		if (fuel.getItem() == Item.getItemFromBlock(MoGlowstone.fuelGlowstoneBlock))
		{
			return 32000;
		}
		return 0;
		
	}
}