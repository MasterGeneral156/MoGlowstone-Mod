/*
	Project:	Mo' Glowstone 1.16
	File:		com.themastergeneral.moglowstone.MoGlowstoneRegistries
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/MoGlowstone-Mod
	License:	MIT License

				Copyright (c) 2017 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.moglowstone;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.items.ModItemBlocks;
import com.themastergeneral.moglowstone.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class MoGlowstoneRegistries {

	public static final ItemGroup ITEMGROUP = MoGlowstone.ITEMGROUP;
	public static final Logger LOGGER = MoGlowstone.LOGGER;
	public static final String MODID = MoGlowstone.MODID;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> itemRegistry = event.getRegistry();
		
		itemRegistry.register(new ModItemBlocks(ModBlocks.black_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.blue_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.brick_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.brown_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.glowstone_ore));
		itemRegistry.register(new ModItemBlocks(ModBlocks.cyan_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.gray_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.green_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.lamp_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.lblue_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.lgray_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.lime_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.magenta_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.orange_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.red_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.pink_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.purple_gsblock));
		itemRegistry.register(new ModItemBlocks(ModBlocks.white_gsblock));
		itemRegistry.register(ModItems.fuelglowstone);
		
		LOGGER.info("Items have been registered successfully.");
	}
	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
		IForgeRegistry<Block> blockRegistry = event.getRegistry();
		
		blockRegistry.register(ModBlocks.black_gsblock);
		blockRegistry.register(ModBlocks.blue_gsblock);
		blockRegistry.register(ModBlocks.brown_gsblock);
		blockRegistry.register(ModBlocks.brick_gsblock);
		blockRegistry.register(ModBlocks.cyan_gsblock);
		blockRegistry.register(ModBlocks.gray_gsblock);
		blockRegistry.register(ModBlocks.green_gsblock);
		blockRegistry.register(ModBlocks.lamp_gsblock);
		blockRegistry.register(ModBlocks.lblue_gsblock);
		blockRegistry.register(ModBlocks.lgray_gsblock);
		blockRegistry.register(ModBlocks.lime_gsblock);
		blockRegistry.register(ModBlocks.magenta_gsblock);
		blockRegistry.register(ModBlocks.orange_gsblock);
		blockRegistry.register(ModBlocks.red_gsblock);
		blockRegistry.register(ModBlocks.pink_gsblock);
		blockRegistry.register(ModBlocks.purple_gsblock);
		blockRegistry.register(ModBlocks.white_gsblock);
		blockRegistry.register(ModBlocks.glowstone_ore);
		
		LOGGER.info("Blocks have been registered successfully.");
    }
}
