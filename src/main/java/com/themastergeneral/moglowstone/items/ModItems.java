package com.themastergeneral.moglowstone.items;

import com.themastergeneral.moglowstone.proxy.client.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static BasicItem fuelGlowstone;
	
	 public static void init() 
	 {
		 fuelGlowstone = register(new BasicItem("fuelGlowstone"));
		  
	 }
	
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
}
