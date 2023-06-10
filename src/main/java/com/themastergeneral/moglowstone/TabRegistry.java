/*
	Project:	Mo' Glowstone 1.20
	File:		com.themastergeneral.moglowstone.TabRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/MoGlowstone-Mod
	License:	MIT License

				Copyright (c) 2023 MasterGeneral156
				
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

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.items.ModItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabRegistry {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoGlowstone.MODID);
	
	public static final RegistryObject<CreativeModeTab> MOGLOWSTONE_TAB = CREATIVE_MODE_TABS.register("moglowstone_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.red_glowstone_block.getDefaultInstance())
            .title(Component.translatable("itemGroup.moglowstone"))
            .displayItems((parameters, ev) -> {
                ev.accept(ModItems.red_glowstone_block); // Add the example item to the tab. For your own tabs, this method is preferred over the event
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
            }).build());
}
