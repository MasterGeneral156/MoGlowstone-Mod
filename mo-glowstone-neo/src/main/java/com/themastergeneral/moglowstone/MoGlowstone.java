/*
	Project:	Mo' Glowstone 1.21
	File:		com.themastergeneral.moglowstone.MoGlowstone
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/MoGlowstone-Mod
	License:	MIT License

				Copyright (c) 2025 MasterGeneral156
				
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

import com.mojang.logging.LogUtils;

import com.themastergeneral.ctdcore.helpers.ModUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import com.themastergeneral.moglowstone.blocks.BlockRegistry;
import com.themastergeneral.moglowstone.items.ItemRegistry;

@Mod("moglowstone")
public class MoGlowstone {
	
	public static MoGlowstone instance;
	public static final Logger LOGGER = LogUtils.getLogger();

	public static final String MODID = "moglowstone";

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoGlowstone.MODID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoGlowstone.MODID);

	public MoGlowstone(IEventBus modEventBus, ModContainer modContainer) {
		instance = this;
        // Register the setup method for modloading
        modEventBus.addListener(this::setup);
        
        BlockRegistry.BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);

        TabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("Mo' Glowstone for Minecraft NeoForge " + ModUtils.getMCVersion() + " is launching.");
    }
}
