package com.themastergeneral.moglowstonemod.items;

import java.util.List;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class strongPickaxe extends ItemPickaxe
{
	public strongPickaxe(ToolMaterial GSS) 
	{
        super(GSS);
        setUnlocalizedName(MoGlowstone.MODID + "_" + "pickaxeSGlowstone");
		setTextureName(MoGlowstone.MODID + ":" + "pickaxeSGlowstone");
		setCreativeTab(MoGlowstone.Tab);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("30 times stronger.");
	}
}