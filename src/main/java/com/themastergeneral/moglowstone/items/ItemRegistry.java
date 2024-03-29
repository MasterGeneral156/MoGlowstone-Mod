/*
	Project:	Mo' Glowstone 1.20
	File:		com.themastergeneral.moglowstone.items.ItemRegistry
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
package com.themastergeneral.moglowstone.items;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoGlowstone.MODID);
	
	//Base items
	public static final RegistryObject<Item> glowstone_coal = ITEMS.register("glowstone_coal", () -> ModItems.glowstone_coal);
	
	//Block items
	public static final RegistryObject<Item> black_glowstone_block = ITEMS.register("black_glowstone_block", () -> ModItems.black_glowstone_block);
	public static final RegistryObject<Item> blue_glowstone_block = ITEMS.register("blue_glowstone_block", () -> ModItems.blue_glowstone_block);
	public static final RegistryObject<Item> brick_glowstone_block = ITEMS.register("brick_glowstone_block", () -> ModItems.brick_glowstone_block);
	public static final RegistryObject<Item> brown_glowstone_block = ITEMS.register("brown_glowstone_block", () -> ModItems.brown_glowstone_block);
	public static final RegistryObject<Item> cyan_glowstone_block = ITEMS.register("cyan_glowstone_block", () -> ModItems.cyan_glowstone_block);
	public static final RegistryObject<Item> gray_glowstone_block = ITEMS.register("gray_glowstone_block", () -> ModItems.gray_glowstone_block);
	public static final RegistryObject<Item> green_glowstone_block = ITEMS.register("green_glowstone_block", () -> ModItems.green_glowstone_block);
	public static final RegistryObject<Item> lamp_glowstone_block = ITEMS.register("lamp_glowstone_block", () -> ModItems.lamp_glowstone_block);
	public static final RegistryObject<Item> light_blue_glowstone_block = ITEMS.register("light_blue_glowstone_block", () -> ModItems.light_blue_glowstone_block);
	public static final RegistryObject<Item> light_gray_glowstone_block = ITEMS.register("light_gray_glowstone_block", () -> ModItems.light_gray_glowstone_block);
	public static final RegistryObject<Item> lime_glowstone_block = ITEMS.register("lime_glowstone_block", () -> ModItems.lime_glowstone_block);
	public static final RegistryObject<Item> magenta_glowstone_block = ITEMS.register("magenta_glowstone_block", () -> ModItems.magenta_glowstone_block);
	public static final RegistryObject<Item> orange_glowstone_block = ITEMS.register("orange_glowstone_block", () -> ModItems.orange_glowstone_block);
	public static final RegistryObject<Item> pink_glowstone_block = ITEMS.register("pink_glowstone_block", () -> ModItems.pink_glowstone_block);
	public static final RegistryObject<Item> purple_glowstone_block = ITEMS.register("purple_glowstone_block", () -> ModItems.purple_glowstone_block);
	public static final RegistryObject<Item> red_glowstone_block = ITEMS.register("red_glowstone_block", () -> ModItems.red_glowstone_block);
	public static final RegistryObject<Item> white_glowstone_block = ITEMS.register("white_glowstone_block", () -> ModItems.white_glowstone_block);
	public static final RegistryObject<Item> glowstone_ore = ITEMS.register("glowstone_ore", () -> ModItems.glowstone_ore);
}
