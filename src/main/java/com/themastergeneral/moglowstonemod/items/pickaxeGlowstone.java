package com.themastergeneral.moglowstonemod.items;

import java.util.List;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class pickaxeGlowstone extends ItemPickaxe
{
	public pickaxeGlowstone(ToolMaterial GS) 
	{
        super(GS);
        setUnlocalizedName(MoGlowstone.MODID + "_" + "pickaxeGlowstone");
		setTextureName(MoGlowstone.MODID + ":" + "pickaxeGlowstone");
		setCreativeTab(MoGlowstone.Tab);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("Upgradeable.");
	}
}