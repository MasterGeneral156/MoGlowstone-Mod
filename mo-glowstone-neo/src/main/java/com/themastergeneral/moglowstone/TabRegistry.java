/*
	Project:	Mo' Glowstone 26.1.2
	File:		com.themastergeneral.moglowstone.TabRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/MoGlowstone-Mod
	License:	MIT License

				Copyright (c) 2026 MasterGeneral156
				
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

import com.themastergeneral.moglowstone.blocks.BlockRegistry;
import com.themastergeneral.moglowstone.items.ItemRegistry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TabRegistry {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoGlowstone.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOGLOWSTONE_TAB =
			CREATIVE_MODE_TABS.register("moglowstone_tab", () -> CreativeModeTab.builder()
					.title(Component.translatable("itemGroup.moglowstone"))
					.icon(() -> new ItemStack(ItemRegistry.RED_GLOWSTONE_BLOCK.get()))
					.withTabsBefore(CreativeModeTabs.COMBAT)
					.displayItems((parameters, output) -> {
						// Add all registered items
						ItemRegistry.ITEMS.getEntries().forEach(item -> output.accept(item.get()));

						// Add all registered block items
						BlockRegistry.BLOCKS.getEntries().forEach(block -> {
							BlockItem blockItem = (BlockItem) Item.BY_BLOCK.get(block.get());
							if (blockItem != null) {
								output.accept(blockItem);
							}
						});
					})
					.build());
}
