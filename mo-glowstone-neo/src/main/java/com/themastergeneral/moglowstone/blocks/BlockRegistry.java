/*
	Project:	Mo' Glowstone 26.2
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

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
	// Registry category.
	public static final DeferredRegister.Blocks BLOCKS = MoGlowstone.BLOCKS;


	public static final DeferredBlock<Block> BLACK_GLOWSTONE_BLOCK = BLOCKS.register("black_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_BLACK)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> BLUE_GLOWSTONE_BLOCK = BLOCKS.register("blue_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_BLUE)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> BRICK_GLOWSTONE_BLOCK = BLOCKS.register("brick_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_YELLOW)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> BROWN_GLOWSTONE_BLOCK = BLOCKS.register("brown_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_BROWN)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> CYAN_GLOWSTONE_BLOCK = BLOCKS.register("cyan_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_CYAN)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> GRAY_GLOWSTONE_BLOCK = BLOCKS.register("gray_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_GRAY)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> GREEN_GLOWSTONE_BLOCK = BLOCKS.register("green_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_GREEN)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> LAMP_GLOWSTONE_BLOCK = BLOCKS.register("lamp_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_YELLOW)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> LIGHT_BLUE_GLOWSTONE_BLOCK = BLOCKS.register("light_blue_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_LIGHT_BLUE)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> LIGHT_GRAY_GLOWSTONE_BLOCK = BLOCKS.register("light_gray_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_LIGHT_GRAY)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> LIME_GLOWSTONE_BLOCK = BLOCKS.register("lime_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_LIGHT_GREEN)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> MAGENTA_GLOWSTONE_BLOCK = BLOCKS.register("magenta_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_MAGENTA)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> ORANGE_GLOWSTONE_BLOCK = BLOCKS.register("orange_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_ORANGE)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> PINK_GLOWSTONE_BLOCK = BLOCKS.register("pink_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_PINK)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> PURPLE_GLOWSTONE_BLOCK = BLOCKS.register("purple_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_PURPLE)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> RED_GLOWSTONE_BLOCK = BLOCKS.register("red_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_RED)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> WHITE_GLOWSTONE_BLOCK = BLOCKS.register("white_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.TERRACOTTA_WHITE)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> YELLOW_GLOWSTONE_BLOCK = BLOCKS.register("yellow_glowstone_block", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_YELLOW)
			.sound(SoundType.GLASS)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> GLOWSTONE_ORE = BLOCKS.register("glowstone_ore", registryName -> new CTDBlock(BlockBehaviour.Properties.of()
			.mapColor(MapColor.STONE)
			.setId(ResourceKey.create(Registries.BLOCK, registryName))
			.lightLevel(state -> 7)));
}

