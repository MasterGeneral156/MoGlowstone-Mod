package com.themastergeneral.moglowstone.handler;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.moglowstone.blocks.ModBlocks;

public class FurnaceRecipes {
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.glowstone_ore, new ItemStack(Items.GLOWSTONE_DUST, 1), 0.1F);
	}
}
