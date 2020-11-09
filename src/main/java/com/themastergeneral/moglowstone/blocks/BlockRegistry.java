/*
	Project:	Mo' Glowstone 1.16
	File:		com.themastergeneral.moglowstone.blocks.BlockRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/MoGlowstone-Mod
	License:	MIT License

				Copyright (c) 2017 MasterGeneral156
				
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
package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
	//Registry category.
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoGlowstone.MODID);
	
	//Blocks
	public static final RegistryObject<Block> black_gsblock = BLOCKS.register("black_gsblock", () -> ModBlocks.black_gsblock);
	public static final RegistryObject<Block> blue_gsblock = BLOCKS.register("blue_gsblock", () -> ModBlocks.blue_gsblock);
	public static final RegistryObject<Block> brick_gsblock = BLOCKS.register("brick_gsblock", () -> ModBlocks.brick_gsblock);
	public static final RegistryObject<Block> brown_gsblock = BLOCKS.register("brown_gsblock", () -> ModBlocks.brown_gsblock);
	public static final RegistryObject<Block> cyan_gsblock = BLOCKS.register("cyan_gsblock", () -> ModBlocks.cyan_gsblock);
	public static final RegistryObject<Block> gray_gsblock = BLOCKS.register("gray_gsblock", () -> ModBlocks.gray_gsblock);
	public static final RegistryObject<Block> green_gsblock = BLOCKS.register("green_gsblock", () -> ModBlocks.green_gsblock);
	public static final RegistryObject<Block> lamp_gsblock = BLOCKS.register("lamp_gsblock", () -> ModBlocks.lamp_gsblock);
	public static final RegistryObject<Block> lblue_gsblock = BLOCKS.register("lblue_gsblock", () -> ModBlocks.lblue_gsblock);
	public static final RegistryObject<Block> lgray_gsblock = BLOCKS.register("lgray_gsblock", () -> ModBlocks.lgray_gsblock);
	public static final RegistryObject<Block> lime_gsblock = BLOCKS.register("lime_gsblock", () -> ModBlocks.lime_gsblock);
	public static final RegistryObject<Block> magenta_gsblock = BLOCKS.register("magenta_gsblock", () -> ModBlocks.magenta_gsblock);
	public static final RegistryObject<Block> orange_gsblock = BLOCKS.register("orange_gsblock", () -> ModBlocks.orange_gsblock);
	public static final RegistryObject<Block> pink_gsblock = BLOCKS.register("pink_gsblock", () -> ModBlocks.pink_gsblock);
	public static final RegistryObject<Block> purple_gsblock = BLOCKS.register("purple_gsblock", () -> ModBlocks.purple_gsblock);
	public static final RegistryObject<Block> red_gsblock = BLOCKS.register("red_gsblock", () -> ModBlocks.red_gsblock);
	public static final RegistryObject<Block> white_gsblock = BLOCKS.register("white_gsblock", () -> ModBlocks.white_gsblock);
	
	public static final RegistryObject<Block> glowstone_ore = BLOCKS.register("glowstone_ore", () -> ModBlocks.glowstone_ore);
}
