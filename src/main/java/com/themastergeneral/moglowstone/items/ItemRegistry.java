/*
	Project:	Mo' Glowstone 1.19
	File:		com.themastergeneral.moglowstone.items.ItemRegistry
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

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoGlowstone.MODID);
	
	//Base items
	public static final RegistryObject<Item> fuelglowstone = ITEMS.register("fuelglowstone", () -> ModItems.fuelglowstone);
	
	//Block items
	public static final RegistryObject<Item> black_gsblock = ITEMS.register("black_gsblock", () -> ModItems.black_gsblock);
	public static final RegistryObject<Item> blue_gsblock = ITEMS.register("blue_gsblock", () -> ModItems.blue_gsblock);
	public static final RegistryObject<Item> brick_gsblock = ITEMS.register("brick_gsblock", () -> ModItems.brick_gsblock);
	public static final RegistryObject<Item> brown_gsblock = ITEMS.register("brown_gsblock", () -> ModItems.brown_gsblock);
	public static final RegistryObject<Item> cyan_gsblock = ITEMS.register("cyan_gsblock", () -> ModItems.cyan_gsblock);
	public static final RegistryObject<Item> gray_gsblock = ITEMS.register("gray_gsblock", () -> ModItems.gray_gsblock);
	public static final RegistryObject<Item> green_gsblock = ITEMS.register("green_gsblock", () -> ModItems.green_gsblock);
	public static final RegistryObject<Item> lamp_gsblock = ITEMS.register("lamp_gsblock", () -> ModItems.lamp_gsblock);
	public static final RegistryObject<Item> lblue_gsblock = ITEMS.register("lblue_gsblock", () -> ModItems.lblue_gsblock);
	public static final RegistryObject<Item> lgray_gsblock = ITEMS.register("lgray_gsblock", () -> ModItems.lgray_gsblock);
	public static final RegistryObject<Item> lime_gsblock = ITEMS.register("lime_gsblock", () -> ModItems.lime_gsblock);
	public static final RegistryObject<Item> magenta_gsblock = ITEMS.register("magenta_gsblock", () -> ModItems.magenta_gsblock);
	public static final RegistryObject<Item> orange_gsblock = ITEMS.register("orange_gsblock", () -> ModItems.orange_gsblock);
	public static final RegistryObject<Item> pink_gsblock = ITEMS.register("pink_gsblock", () -> ModItems.pink_gsblock);
	public static final RegistryObject<Item> purple_gsblock = ITEMS.register("purple_gsblock", () -> ModItems.purple_gsblock);
	public static final RegistryObject<Item> red_gsblock = ITEMS.register("red_gsblock", () -> ModItems.red_gsblock);
	public static final RegistryObject<Item> white_gsblock = ITEMS.register("white_gsblock", () -> ModItems.white_gsblock);
	public static final RegistryObject<Item> glowstone_ore = ITEMS.register("glowstone_ore", () -> ModItems.glowstone_ore);
}
