package com.themastergeneral.moglowstone.world;

import java.util.Random;

import com.themastergeneral.moglowstone.blocks.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenGlowStone1;
import net.minecraft.world.gen.feature.WorldGenGlowStone2;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator 
{
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
	public ModWorldGen() 
	{
	    this.gen_red = new ModWorldGenGS1(ModBlocks.red_gsblock, 4);
	    this.gen_black = new ModWorldGenGS1(ModBlocks.black_gsblock, 4);
	    this.gen_blue = new ModWorldGenGS1(ModBlocks.blue_gsblock, 4);
	    this.gen_brown = new ModWorldGenGS1(ModBlocks.brown_gsblock, 4);
	    this.gen_cyan = new ModWorldGenGS1(ModBlocks.cyan_gsblock, 4);
	    this.gen_gray = new ModWorldGenGS1(ModBlocks.gray_gsblock, 4);
	    this.gen_green = new ModWorldGenGS1(ModBlocks.green_gsblock, 4);
	    this.gen_lblue = new ModWorldGenGS1(ModBlocks.lblue_gsblock, 4);
	    this.gen_lgray = new ModWorldGenGS1(ModBlocks.lgray_gsblock, 4);
	    this.gen_lime = new ModWorldGenGS1(ModBlocks.lime_gsblock, 4);
	    this.gen_magenta = new ModWorldGenGS1(ModBlocks.magenta_gsblock, 4);
	    this.gen_orange = new ModWorldGenGS1(ModBlocks.orange_gsblock, 4);
	    this.gen_pink = new ModWorldGenGS1(ModBlocks.pink_gsblock, 4);
	    this.gen_purple = new ModWorldGenGS1(ModBlocks.purple_gsblock, 4);
	    this.gen_white = new ModWorldGenGS1(ModBlocks.white_gsblock, 4);
	}
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) 
	{
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        BlockPos Pos = new BlockPos(x, y, z);
	        generator.generate(world, rand, Pos);
	    }
	}
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimension()) 
    	{
        case 0: //Overworld
            break;
        case -1: //Nether
        	this.runGenerator(this.gen_red, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_black, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_blue, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_brown, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_cyan, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_gray, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_green, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_lblue, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_lgray, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_lime, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_magenta, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_orange, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_pink, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_purple, world, random, chunkX, chunkZ, 1, 0, 127);
        	this.runGenerator(this.gen_white, world, random, chunkX, chunkZ, 1, 0, 127);
            break;
        case 1: //End

            break;
        }
	}
}