package com.themastergeneral.moglowstone.world;

import java.util.Random;
import java.util.function.Function;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class ModWorldGenGS1 extends Feature {
	public ModWorldGenGS1(Function p_i49878_1_) {
		super(p_i49878_1_);
	}

	private BlockState block;
	private int i;

	@Override
	public boolean place(IWorld worldIn, ChunkGenerator generator, Random rand, BlockPos pos, IFeatureConfig config) {
		if (!worldIn.isAirBlock(pos)) {
	         return false;
	      } else if (worldIn.getBlockState(pos.up()).getBlock() != Blocks.NETHERRACK) {
	         return false;
	      } else {
	         worldIn.setBlockState(pos, block, 2);

	         for(int i = 0; i < 1500; ++i) {
	            BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), -rand.nextInt(12), rand.nextInt(8) - rand.nextInt(8));
	            if (worldIn.getBlockState(blockpos).isAir(worldIn, blockpos)) {
	               int j = 0;

	               for(Direction direction : Direction.values()) {
	                  if (worldIn.getBlockState(blockpos.offset(direction)).getBlock() == block.getBlock()) {
	                     ++j;
	                  }

	                  if (j > 1) {
	                     break;
	                  }
	               }

	               if (j == 1) {
	                  worldIn.setBlockState(blockpos, block, 2);
	               }
	            }
	         }

	         return true;
	      }
	}

}
