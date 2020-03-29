package com.themastergeneral.moglowstone.imc.texpansion;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;

public class IMCTE {
	public static final void addPulverizerRecipe(int energy, ItemStack input,
			ItemStack primaryOutput, ItemStack secondaryOutput,
			int secondaryChance) 
	{
		if (input == null || primaryOutput == null) 
		{
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setInteger("energy", energy);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("primaryOutput", new NBTTagCompound());
		if (secondaryOutput != null) 
		{
			toSend.setTag("secondaryOutput", new NBTTagCompound());
		}
		input.writeToNBT(toSend.getCompoundTag("input"));
		primaryOutput.writeToNBT(toSend.getCompoundTag("primaryOutput"));
		if (secondaryOutput != null) 
		{
			secondaryOutput.writeToNBT(toSend.getCompoundTag("secondaryOutput"));
			toSend.setInteger("chance", secondaryChance);
		}
		FMLInterModComms.sendMessage("thermalexpansion", "addpulverizerrecipe", toSend);
	}
}
