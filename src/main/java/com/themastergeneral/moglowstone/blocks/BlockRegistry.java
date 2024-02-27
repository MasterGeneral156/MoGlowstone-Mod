/*
	Project:	Mo' Glowstone 1.20
	File:		com.themastergeneral.moglowstone.blocks.BlockRegistry
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
package com.themastergeneral.moglowstone.blocks;

import java.util.function.Supplier;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
	//Registry category.
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoGlowstone.MODID);
	
	//Blocks
	public static final Supplier<GSBlock> black_glowstone_block = BLOCKS.register("black_glowstone_block", () -> ModBlocks.black_glowstone_block);
	public static final Supplier<GSBlock> blue_glowstone_block = BLOCKS.register("blue_glowstone_block", () -> ModBlocks.blue_glowstone_block);
	public static final Supplier<GSBlock> brick_glowstone_block = BLOCKS.register("brick_glowstone_block", () -> ModBlocks.brick_glowstone_block);
	public static final Supplier<GSBlock> brown_glowstone_block = BLOCKS.register("brown_glowstone_block", () -> ModBlocks.brown_glowstone_block);
	public static final Supplier<GSBlock> cyan_glowstone_block = BLOCKS.register("cyan_glowstone_block", () -> ModBlocks.cyan_glowstone_block);
	public static final Supplier<GSBlock> gray_glowstone_block = BLOCKS.register("gray_glowstone_block", () -> ModBlocks.gray_glowstone_block);
	public static final Supplier<GSBlock> green_glowstone_block = BLOCKS.register("green_glowstone_block", () -> ModBlocks.green_glowstone_block);
	public static final Supplier<GSBlock> lamp_glowstone_block = BLOCKS.register("lamp_glowstone_block", () -> ModBlocks.lamp_glowstone_block);
	public static final Supplier<GSBlock> light_blue_glowstone_block = BLOCKS.register("light_blue_glowstone_block", () -> ModBlocks.light_blue_glowstone_block);
	public static final Supplier<GSBlock> light_gray_glowstone_block = BLOCKS.register("light_gray_glowstone_block", () -> ModBlocks.light_gray_glowstone_block);
	public static final Supplier<GSBlock> lime_glowstone_block = BLOCKS.register("lime_glowstone_block", () -> ModBlocks.lime_glowstone_block);
	public static final Supplier<GSBlock> magenta_glowstone_block = BLOCKS.register("magenta_glowstone_block", () -> ModBlocks.magenta_glowstone_block);
	public static final Supplier<GSBlock> orange_glowstone_block = BLOCKS.register("orange_glowstone_block", () -> ModBlocks.orange_glowstone_block);
	public static final Supplier<GSBlock> pink_glowstone_block = BLOCKS.register("pink_glowstone_block", () -> ModBlocks.pink_glowstone_block);
	public static final Supplier<GSBlock> purple_glowstone_block = BLOCKS.register("purple_glowstone_block", () -> ModBlocks.purple_glowstone_block);
	public static final Supplier<GSBlock> red_glowstone_block = BLOCKS.register("red_glowstone_block", () -> ModBlocks.red_glowstone_block);
	public static final Supplier<GSBlock> white_glowstone_block = BLOCKS.register("white_glowstone_block", () -> ModBlocks.white_glowstone_block);
	
	public static final Supplier<GSOre> glowstone_ore = BLOCKS.register("glowstone_ore", () -> ModBlocks.glowstone_ore);
}
