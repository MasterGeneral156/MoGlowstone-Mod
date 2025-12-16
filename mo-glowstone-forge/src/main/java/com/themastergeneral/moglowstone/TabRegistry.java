/*
	Project:	Mo' Glowstone 1.21
	File:		com.themastergeneral.moglowstone.TabRegistry
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

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.items.ItemRegistry;
import com.themastergeneral.moglowstone.items.ModItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabRegistry {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoGlowstone.MODID);
	
	public static final RegistryObject<CreativeModeTab> MOGLOWSTONE_TAB = CREATIVE_MODE_TABS.register("moglowstone_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(ItemRegistry.red_glowstone_block.get()))
            .title(Component.translatable("itemGroup.moglowstone"))
            .displayItems((parameters, ev) -> {
                ev.accept(ItemRegistry.red_glowstone_block.get());
                ev.accept(ItemRegistry.glowstone_coal.get());
    			ev.accept(ItemRegistry.black_glowstone_block.get());
    			ev.accept(ItemRegistry.brown_glowstone_block.get());
    			ev.accept(ItemRegistry.blue_glowstone_block.get());
    			ev.accept(ItemRegistry.brick_glowstone_block.get());
    			ev.accept(ItemRegistry.cyan_glowstone_block.get());
    			ev.accept(ItemRegistry.glowstone_ore.get());
    			ev.accept(ItemRegistry.gray_glowstone_block.get());
    			ev.accept(ItemRegistry.green_glowstone_block.get());
    			ev.accept(ItemRegistry.lamp_glowstone_block.get());
    			ev.accept(ItemRegistry.light_gray_glowstone_block.get());
    			ev.accept(ItemRegistry.light_blue_glowstone_block.get());
    			ev.accept(ItemRegistry.lime_glowstone_block.get());
    			ev.accept(ItemRegistry.magenta_glowstone_block.get());
    			ev.accept(ItemRegistry.orange_glowstone_block.get());
    			ev.accept(ItemRegistry.pink_glowstone_block.get());
    			ev.accept(ItemRegistry.purple_glowstone_block.get());
    			ev.accept(ItemRegistry.red_glowstone_block.get());
    			ev.accept(ItemRegistry.white_glowstone_block.get());
                ev.accept(ItemRegistry.yellow_glowstone_block.get());
            }).build());
}
