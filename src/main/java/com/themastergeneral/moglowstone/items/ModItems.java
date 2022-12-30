/*
	Project:	Mo' Glowstone 1.19
	File:		com.themastergeneral.moglowstone.items.ModItems
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
package com.themastergeneral.moglowstone.items;

import com.themastergeneral.ctdcore.item.CTDFuelItem;
import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.blocks.ModBlocks;

import net.minecraft.world.item.Item;

public class ModItems {
	public static CTDFuelItem glowstone_coal = new CTDFuelItem(new Item.Properties(), 3200);
	
	//Mod blocks
	public static ModItemBlocks black_glowstone_block = new ModItemBlocks(ModBlocks.black_glowstone_block);
	public static ModItemBlocks blue_glowstone_block = new ModItemBlocks(ModBlocks.blue_glowstone_block);
	public static ModItemBlocks brick_glowstone_block = new ModItemBlocks(ModBlocks.brick_glowstone_block);
	public static ModItemBlocks brown_glowstone_block = new ModItemBlocks(ModBlocks.brown_glowstone_block);
	public static ModItemBlocks cyan_glowstone_block = new ModItemBlocks(ModBlocks.cyan_glowstone_block);
	public static ModItemBlocks gray_glowstone_block = new ModItemBlocks(ModBlocks.gray_glowstone_block);
	public static ModItemBlocks green_glowstone_block = new ModItemBlocks(ModBlocks.green_glowstone_block);
	public static ModItemBlocks lamp_glowstone_block = new ModItemBlocks(ModBlocks.lamp_glowstone_block);
	public static ModItemBlocks light_blue_glowstone_block = new ModItemBlocks(ModBlocks.light_blue_glowstone_block);
	public static ModItemBlocks light_gray_glowstone_block = new ModItemBlocks(ModBlocks.light_gray_glowstone_block);
	public static ModItemBlocks lime_glowstone_block = new ModItemBlocks(ModBlocks.lime_glowstone_block);
	public static ModItemBlocks magenta_glowstone_block = new ModItemBlocks(ModBlocks.magenta_glowstone_block);
	public static ModItemBlocks orange_glowstone_block = new ModItemBlocks(ModBlocks.orange_glowstone_block);
	public static ModItemBlocks pink_glowstone_block = new ModItemBlocks(ModBlocks.pink_glowstone_block);
	public static ModItemBlocks purple_glowstone_block = new ModItemBlocks(ModBlocks.purple_glowstone_block);
	public static ModItemBlocks red_glowstone_block = new ModItemBlocks(ModBlocks.red_glowstone_block);
	public static ModItemBlocks white_glowstone_block = new ModItemBlocks(ModBlocks.white_glowstone_block);
	public static ModItemBlocks glowstone_ore = new ModItemBlocks(ModBlocks.glowstone_ore);
}
