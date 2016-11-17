package com.themastergeneral.moglowstone.world;

import java.util.Random;

import com.themastergeneral.moglowstone.blocks.GSBlock;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModWorldGenGS1 extends WorldGenerator {

	private Block block;
	private int i;
	public ModWorldGenGS1(GSBlock blockin, int iin) 
	{
		block = blockin;
		i = iin;
	}
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        if (!worldIn.isAirBlock(position))
        {
            return false;
        }
        else if (worldIn.getBlockState(position.up()).getBlock() != Blocks.NETHERRACK)
        {
            return false;
        }
        else
        {
            worldIn.setBlockState(position, block.getDefaultState(), i);

            for (int i = 0; i < 1500; ++i)
            {
                BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), -rand.nextInt(12), rand.nextInt(8) - rand.nextInt(8));

                if (worldIn.isAirBlock(blockpos))
                {
                    int j = 0;

                    for (EnumFacing enumfacing : EnumFacing.values())
                    {
                        if (worldIn.getBlockState(blockpos.offset(enumfacing)).getBlock() == block)
                        {
                            ++j;
                        }

                        if (j > 1)
                        {
                            break;
                        }
                    }

                    if (j == 1)
                    {
                        worldIn.setBlockState(blockpos, block.getDefaultState(), i);
                    }
                }
            }

            return true;
        }
    }

}
