package com.themastergeneral.moglowstone.imc.texpansion;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms;

public class IMCChisel {
	public static final void addVariation(String group, IBlockState Blockstate) {
		if (group == null || Blockstate == null) {
			return;
		}
		ItemStack stack = new ItemStack(Blockstate.getBlock(), 1, Blockstate.getBlock().damageDropped(Blockstate));
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("group", new NBTTagCompound());
		toSend.setTag("stack", new NBTTagCompound());
		stack.writeToNBT(toSend.getCompoundTag("stack"));
		FMLInterModComms.sendMessage("chisel", "add_variation",
				toSend);
	}
}
