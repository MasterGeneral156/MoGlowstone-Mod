package com.themastergeneral.moglowstone.blocks;

import java.util.Random;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class GSOre extends CTDBlock {
	public GSOre(String name) {

		super(Block.Properties.create(Material.GROUND, MaterialColor.STONE).lightValue(15).sound(SoundType.STONE).hardnessAndResistance(0.3F), name, MoGlowstone.MODID);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.GLOWSTONE_DUST;
    }
	
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
       return 2 + random.nextInt(4 - 2 + fortune + 1);
    }
}
