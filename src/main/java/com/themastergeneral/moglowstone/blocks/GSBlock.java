package com.themastergeneral.moglowstone.blocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.te.TEGlowstone;

public class GSBlock extends CTDBlock {

	public String color;
	public EnumDyeColor dyecolor;

	protected GSBlock(String name, String modid, String color, EnumDyeColor dyecolor) {

		super(Material.GLASS, name, modid);
		this.setCreativeTab(MoGlowstone.creativeTab);
		this.setLightLevel(1.0F);
		this.setHardness(0.3F);
		this.setSoundType(blockSoundType.GLASS);
		this.color = color;
		this.dyecolor = dyecolor;
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Nullable
	@Override
	public TileEntity createTileEntity(@Nonnull World world,
			@Nonnull IBlockState state) {
		return new TEGlowstone();
	}
}
