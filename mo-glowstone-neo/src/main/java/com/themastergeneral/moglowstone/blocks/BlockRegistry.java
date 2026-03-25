/*
	Project:	Mo' Glowstone 26.1
	File:		com.themastergeneral.moglowstone.blocks.BlockRegistry
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
package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
	// Registry category.
	public static final DeferredRegister.Blocks BLOCKS = MoGlowstone.BLOCKS;

	public static final DeferredBlock<Block> BLACK_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"black_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_BLACK)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> BLUE_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"blue_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_BLUE)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> BRICK_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"brick_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_RED)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> BROWN_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"brown_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_BROWN)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> CYAN_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"cyan_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_CYAN)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> GRAY_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"gray_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_GRAY)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> GREEN_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"green_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_GREEN)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> LAMP_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"lamp_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_YELLOW)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> LIGHT_BLUE_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"light_blue_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> LIGHT_GRAY_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"light_gray_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_LIGHT_GRAY)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> LIME_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"lime_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_LIGHT_GREEN)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> MAGENTA_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"magenta_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_MAGENTA)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> ORANGE_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"orange_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_ORANGE)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> PINK_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"pink_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_PINK)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> PURPLE_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"purple_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_PURPLE)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> RED_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"red_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_RED)
					.lightLevel(state -> 15)
	);

	public static final DeferredBlock<Block> WHITE_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
			"white_glowstone_block",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.TERRACOTTA_WHITE)
					.lightLevel(state -> 15)
	);

    public static final DeferredBlock<Block> YELLOW_GLOWSTONE_BLOCK = BLOCKS.registerSimpleBlock(
            "yellow_glowstone_block",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .lightLevel(state -> 15)
    );

	public static final DeferredBlock<Block> GLOWSTONE_ORE = BLOCKS.registerSimpleBlock(
			"glowstone_ore",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.STONE)
	);
}

