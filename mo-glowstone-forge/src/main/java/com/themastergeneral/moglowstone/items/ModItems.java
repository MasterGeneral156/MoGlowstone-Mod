/*
	Project:	Mo' Glowstone 1.21
	File:		com.themastergeneral.moglowstone.items.ModItems
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

import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.moglowstone.blocks.ModBlocks;

import net.minecraft.world.item.Item;

public class ModItems {
	public static CTDFuelItem glowstone_coal = new CTDFuelItem(ItemRegistry.ITEMS.key("glowstone_coal"), new Item.Properties().setId(ItemRegistry.ITEMS.key("glowstone_coal")), 3200);
	
	//Mod blocks
	public static ModItemBlocks black_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("black_glowstone_block"),ModBlocks.black_glowstone_block);
	public static ModItemBlocks blue_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("blue_glowstone_block"),ModBlocks.blue_glowstone_block);
	public static ModItemBlocks brick_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("brick_glowstone_block"),ModBlocks.brick_glowstone_block);
	public static ModItemBlocks brown_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("brown_glowstone_block"),ModBlocks.brown_glowstone_block);
	public static ModItemBlocks cyan_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("cyan_glowstone_block"),ModBlocks.cyan_glowstone_block);
	public static ModItemBlocks gray_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("gray_glowstone_block"),ModBlocks.gray_glowstone_block);
	public static ModItemBlocks green_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("green_glowstone_block"),ModBlocks.green_glowstone_block);
	public static ModItemBlocks lamp_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("lamp_glowstone_block"),ModBlocks.lamp_glowstone_block);
	public static ModItemBlocks light_blue_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("light_blue_glowstone_block"),ModBlocks.light_blue_glowstone_block);
	public static ModItemBlocks light_gray_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("light_gray_glowstone_block"),ModBlocks.light_gray_glowstone_block);
	public static ModItemBlocks lime_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("lime_glowstone_block"),ModBlocks.lime_glowstone_block);
	public static ModItemBlocks magenta_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("magenta_glowstone_block"),ModBlocks.magenta_glowstone_block);
	public static ModItemBlocks orange_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("orange_glowstone_block"),ModBlocks.orange_glowstone_block);
	public static ModItemBlocks pink_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("pink_glowstone_block"),ModBlocks.pink_glowstone_block);
	public static ModItemBlocks purple_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("purple_glowstone_block"),ModBlocks.purple_glowstone_block);
	public static ModItemBlocks red_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("red_glowstone_block"),ModBlocks.red_glowstone_block);
	public static ModItemBlocks white_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("white_glowstone_block"),ModBlocks.white_glowstone_block);
    public static ModItemBlocks yellow_glowstone_block = new ModItemBlocks(ItemRegistry.ITEMS.key("yellow_glowstone_block"),ModBlocks.yellow_glowstone_block);
	public static ModItemBlocks glowstone_ore = new ModItemBlocks(ItemRegistry.ITEMS.key("glowstone_ore"),ModBlocks.glowstone_ore);
}
