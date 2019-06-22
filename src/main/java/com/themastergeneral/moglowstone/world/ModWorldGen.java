package com.themastergeneral.moglowstone.world;

import java.util.Random;

import com.themastergeneral.moglowstone.blocks.ModBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	private WorldGenerator gen_red;
	private WorldGenerator gen_black;
	private WorldGenerator gen_blue;
	private WorldGenerator gen_brown;
	private WorldGenerator gen_cyan;
	private WorldGenerator gen_gray;
	private WorldGenerator gen_green;
	private WorldGenerator gen_lblue;
	private WorldGenerator gen_lgray;
	private WorldGenerator gen_lime;
	private WorldGenerator gen_magenta;
	private WorldGenerator gen_orange;
	private WorldGenerator gen_pink;
	private WorldGenerator gen_purple;
	private WorldGenerator gen_white;
	private WorldGenerator gen_ore;

	public ModWorldGen() {
		this.gen_red = new ModWorldGenGS1(
				ModBlocks.red_gsblock.getDefaultState(), 4);
		this.gen_black = new ModWorldGenGS1(
				ModBlocks.black_gsblock.getDefaultState(), 4);
		this.gen_blue = new ModWorldGenGS1(
				ModBlocks.blue_gsblock.getDefaultState(), 4);
		this.gen_brown = new ModWorldGenGS1(
				ModBlocks.brown_gsblock.getDefaultState(), 4);
		this.gen_cyan = new ModWorldGenGS1(
				ModBlocks.cyan_gsblock.getDefaultState(), 4);
		this.gen_gray = new ModWorldGenGS1(
				ModBlocks.gray_gsblock.getDefaultState(), 4);
		this.gen_green = new ModWorldGenGS1(
				ModBlocks.green_gsblock.getDefaultState(), 4);
		this.gen_lblue = new ModWorldGenGS1(
				ModBlocks.lblue_gsblock.getDefaultState(), 4);
		this.gen_lgray = new ModWorldGenGS1(
				ModBlocks.lgray_gsblock.getDefaultState(), 4);
		this.gen_lime = new ModWorldGenGS1(
				ModBlocks.lime_gsblock.getDefaultState(), 4);
		this.gen_magenta = new ModWorldGenGS1(
				ModBlocks.magenta_gsblock.getDefaultState(), 4);
		this.gen_orange = new ModWorldGenGS1(
				ModBlocks.orange_gsblock.getDefaultState(), 4);
		this.gen_pink = new ModWorldGenGS1(
				ModBlocks.pink_gsblock.getDefaultState(), 4);
		this.gen_purple = new ModWorldGenGS1(
				ModBlocks.purple_gsblock.getDefaultState(), 4);
		this.gen_white = new ModWorldGenGS1(
				ModBlocks.white_gsblock.getDefaultState(), 4);
		this.gen_ore = new Feature(
				ModBlocks.glowstone_ore.getDefaultState(), 4);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, ChunkGenerator chunkGenerator,
			AbstractChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}
