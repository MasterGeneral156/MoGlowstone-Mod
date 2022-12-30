/*
	Project:	Mo' Glowstone 1.19
	File:		com.themastergeneral.moglowstone.MoGlowstone
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/MoGlowstone-Mod
	License:	MIT License

				Copyright (c) 2022 MasterGeneral156
				
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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.moglowstone.blocks.BlockRegistry;
import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.items.ItemRegistry;
import com.themastergeneral.moglowstone.items.ModItems;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moglowstone")
public class MoGlowstone {
	
	public static MoGlowstone instance;
	static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "moglowstone";
	
	public static CreativeModeTab MoGlowstoneTab;

	public MoGlowstone() {
		instance = this;
        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(this::setup);
        modbus.addListener(this::registerTabs);
        modbus.addListener(this::fillTab);

        // Register ourselves for server, registry and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        
        ItemRegistry.ITEMS.register(modbus);
        BlockRegistry.BLOCKS.register(modbus);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("Mo' Glowstone is launching.");
    }
	
	private void registerTabs(CreativeModeTabEvent.Register event)
    {
		MoGlowstoneTab = event.registerCreativeModeTab(new ResourceLocation(MODID, "moglowstone_tab"), builder -> builder
                .icon(() -> new ItemStack(ModItems.red_glowstone_block))
                .title(Component.translatable("tabs.modid.main_tab"))
                .displayItems((featureFlags, output, hasOp) -> { }));
    }
	
	private void fillTab(CreativeModeTabEvent.BuildContents ev)
	{
		if (ev.getTab() == MoGlowstoneTab)
		{
			ev.accept(ModItems.glowstone_coal);
			ev.accept(ModBlocks.black_glowstone_block);
			ev.accept(ModBlocks.brown_glowstone_block);
			ev.accept(ModBlocks.blue_glowstone_block);
			ev.accept(ModBlocks.brick_glowstone_block);
			ev.accept(ModBlocks.cyan_glowstone_block);
			ev.accept(ModBlocks.glowstone_ore);
			ev.accept(ModBlocks.gray_glowstone_block);
			ev.accept(ModBlocks.green_glowstone_block);
			ev.accept(ModBlocks.lamp_glowstone_block);
			ev.accept(ModBlocks.light_gray_glowstone_block);
			ev.accept(ModBlocks.light_blue_glowstone_block);
			ev.accept(ModBlocks.lime_glowstone_block);
			ev.accept(ModBlocks.magenta_glowstone_block);
			ev.accept(ModBlocks.orange_glowstone_block);
			ev.accept(ModBlocks.pink_glowstone_block);
			ev.accept(ModBlocks.purple_glowstone_block);
			ev.accept(ModBlocks.red_glowstone_block);
			ev.accept(ModBlocks.white_glowstone_block);
		}
	}
}
