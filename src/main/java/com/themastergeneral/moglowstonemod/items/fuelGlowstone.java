package com.themastergeneral.moglowstonemod.items;
 
import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import java.util.List;
 
public class fuelGlowstone extends Item
{
public fuelGlowstone()
	{
		setUnlocalizedName(MoGlowstone.MODID + "_" + "fuelGlowstone");
		setTextureName(MoGlowstone.MODID + ":" + "fuelGlowstone");
		setCreativeTab(MoGlowstone.Tab);
	}

	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("2x better than coal!");
	}
}
