package com.themastergeneral.moglowstonemod.items;

import java.util.List;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class maxPickaxe extends ItemPickaxe
{
	public maxPickaxe(ToolMaterial GSHS) 
	{
        super(GSHS);
        setUnlocalizedName(MoGlowstone.MODID + "_" + "pickaxeMGlowstone");
		setTextureName(MoGlowstone.MODID + ":" + "pickaxeMGlowstone");
		setCreativeTab(MoGlowstone.Tab);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("Twice as fast, 30 times stronger.");
	}
}