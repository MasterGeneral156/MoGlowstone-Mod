package com.themastergeneral.moglowstone.items;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems extends RegisterItem
{
	public static BasicItem fuelglowstone;
	public static void init() 
	{
		fuelglowstone = register(new BasicItem("fuelglowstone", MoGlowstone.MODID));
		 
	}
}
