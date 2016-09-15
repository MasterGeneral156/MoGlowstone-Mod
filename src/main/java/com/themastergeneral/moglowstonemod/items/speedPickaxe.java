package com.themastergeneral.moglowstonemod.items;

import java.util.List;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class speedPickaxe extends ItemPickaxe
{
	public speedPickaxe(ToolMaterial GSH) 
	{
        super(GSH);
        setUnlocalizedName(MoGlowstone.MODID + "_" + "pickaxeHGlowstone");
		setTextureName(MoGlowstone.MODID + ":" + "pickaxeHGlowstone");
		setCreativeTab(MoGlowstone.Tab);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("Twice as fast.");
	}
}