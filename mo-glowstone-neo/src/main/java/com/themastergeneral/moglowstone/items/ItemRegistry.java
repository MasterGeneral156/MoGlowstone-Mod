/*
	Project:	Mo' Glowstone 1.21
	File:		com.themastergeneral.moglowstone.items.ItemRegistry
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
package com.themastergeneral.moglowstone.items;

import java.util.function.Supplier;

import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.moglowstone.MoGlowstone;

import com.themastergeneral.moglowstone.blocks.BlockRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
	public static final DeferredRegister.Items ITEMS = MoGlowstone.ITEMS;

	// Base item: Glowstone Coal with custom burn time
    public static DeferredItem<Item> GLOWSTONE_COAL = ITEMS.registerItem(
            "glowstone_coal",
            properties -> new CTDFuelItem(properties, 3200)
    );

	// Block items registration
	public static final DeferredItem<BlockItem> BLACK_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("black_glowstone_block", BlockRegistry.BLACK_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> BLUE_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("blue_glowstone_block", BlockRegistry.BLUE_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> BRICK_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("brick_glowstone_block", BlockRegistry.BRICK_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> BROWN_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("brown_glowstone_block", BlockRegistry.BROWN_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> CYAN_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("cyan_glowstone_block", BlockRegistry.CYAN_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> GRAY_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("gray_glowstone_block", BlockRegistry.GRAY_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> GREEN_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("green_glowstone_block", BlockRegistry.GREEN_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> LAMP_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("lamp_glowstone_block", BlockRegistry.LAMP_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> LIGHT_BLUE_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("light_blue_glowstone_block", BlockRegistry.LIGHT_BLUE_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> LIGHT_GRAY_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("light_gray_glowstone_block", BlockRegistry.LIGHT_GRAY_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> LIME_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("lime_glowstone_block", BlockRegistry.LIME_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> MAGENTA_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("magenta_glowstone_block", BlockRegistry.MAGENTA_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> ORANGE_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("orange_glowstone_block", BlockRegistry.ORANGE_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> PINK_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("pink_glowstone_block", BlockRegistry.PINK_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> PURPLE_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("purple_glowstone_block", BlockRegistry.PURPLE_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> RED_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("red_glowstone_block", BlockRegistry.RED_GLOWSTONE_BLOCK);
	public static final DeferredItem<BlockItem> WHITE_GLOWSTONE_BLOCK = ITEMS.registerSimpleBlockItem("white_glowstone_block", BlockRegistry.WHITE_GLOWSTONE_BLOCK);

	// Glowstone Ore block item
	public static final Supplier<BlockItem> GLOWSTONE_ORE = ITEMS.registerSimpleBlockItem("glowstone_ore", BlockRegistry.GLOWSTONE_ORE);
}

