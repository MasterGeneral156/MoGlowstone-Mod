package com.themastergeneral.moglowstone.te;

import com.themastergeneral.moglowstone.blocks.GSBlock;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import elucent.albedo.lighting.ILightProvider;
import elucent.albedo.lighting.Light;
import net.minecraftforge.fml.common.Optional;

@Optional.Interface(iface="elucent.albedo.lighting.ILightProvider", modid="albedo")
public class TEGlowstone extends TileEntity implements ILightProvider {

	public TEGlowstone() {

	}
	@Override
	@Optional.Method(modid="albedo")
	public Light provideLight() {
		//Taken from Albedo Torches.
		//Thank you, Tamaized!
		Block b = world.getBlockState(getPos()).getBlock();
		return Light.builder().pos(getPos()).color(b instanceof GSBlock ? ((GSBlock) b).dyecolor.getColorValue() : 0xFFFF00, false).radius(15).build();
	}

}
