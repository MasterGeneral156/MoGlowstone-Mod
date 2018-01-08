package com.themastergeneral.moglowstone.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

public class GSOre extends CTDBlock {
	protected GSOre(String name, String modid) {

		super(Material.ROCK, name, modid);
		this.setCreativeTab(MoGlowstone.creativeTab);
		this.setHardness(3.0F);
		this.setSoundType(blockSoundType.STONE);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.3F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.GLOWSTONE_DUST;
    }
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
       return 2 + random.nextInt(4 - 2 + fortune + 1);
    }
}
