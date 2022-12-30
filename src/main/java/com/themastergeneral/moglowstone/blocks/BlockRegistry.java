/*
	Project:	Mo' Glowstone 1.19
	File:		com.themastergeneral.moglowstone.blocks.BlockRegistry
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
package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
	//Registry category.
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoGlowstone.MODID);
	
	//Blocks
	public static final RegistryObject<Block> black_glowstone_block = BLOCKS.register("black_glowstone_block", () -> ModBlocks.black_glowstone_block);
	public static final RegistryObject<Block> blue_glowstone_block = BLOCKS.register("blue_glowstone_block", () -> ModBlocks.blue_glowstone_block);
	public static final RegistryObject<Block> brick_glowstone_block = BLOCKS.register("brick_glowstone_block", () -> ModBlocks.brick_glowstone_block);
	public static final RegistryObject<Block> brown_glowstone_block = BLOCKS.register("brown_glowstone_block", () -> ModBlocks.brown_glowstone_block);
	public static final RegistryObject<Block> cyan_glowstone_block = BLOCKS.register("cyan_glowstone_block", () -> ModBlocks.cyan_glowstone_block);
	public static final RegistryObject<Block> gray_glowstone_block = BLOCKS.register("gray_glowstone_block", () -> ModBlocks.gray_glowstone_block);
	public static final RegistryObject<Block> green_glowstone_block = BLOCKS.register("green_glowstone_block", () -> ModBlocks.green_glowstone_block);
	public static final RegistryObject<Block> lamp_glowstone_block = BLOCKS.register("lamp_glowstone_block", () -> ModBlocks.lamp_glowstone_block);
	public static final RegistryObject<Block> light_blue_glowstone_block = BLOCKS.register("light_blue_glowstone_block", () -> ModBlocks.light_blue_glowstone_block);
	public static final RegistryObject<Block> light_gray_glowstone_block = BLOCKS.register("light_gray_glowstone_block", () -> ModBlocks.light_gray_glowstone_block);
	public static final RegistryObject<Block> lime_glowstone_block = BLOCKS.register("lime_glowstone_block", () -> ModBlocks.lime_glowstone_block);
	public static final RegistryObject<Block> magenta_glowstone_block = BLOCKS.register("magenta_glowstone_block", () -> ModBlocks.magenta_glowstone_block);
	public static final RegistryObject<Block> orange_glowstone_block = BLOCKS.register("orange_glowstone_block", () -> ModBlocks.orange_glowstone_block);
	public static final RegistryObject<Block> pink_glowstone_block = BLOCKS.register("pink_glowstone_block", () -> ModBlocks.pink_glowstone_block);
	public static final RegistryObject<Block> purple_glowstone_block = BLOCKS.register("purple_glowstone_block", () -> ModBlocks.purple_glowstone_block);
	public static final RegistryObject<Block> red_glowstone_block = BLOCKS.register("red_glowstone_block", () -> ModBlocks.red_glowstone_block);
	public static final RegistryObject<Block> white_glowstone_block = BLOCKS.register("white_glowstone_block", () -> ModBlocks.white_glowstone_block);
	
	public static final RegistryObject<Block> glowstone_ore = BLOCKS.register("glowstone_ore", () -> ModBlocks.glowstone_ore);
}
