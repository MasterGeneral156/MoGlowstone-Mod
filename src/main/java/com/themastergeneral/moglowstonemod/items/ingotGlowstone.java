package com.themastergeneral.moglowstonemod.items;
 
import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class ingotGlowstone extends Item
{
public ingotGlowstone()
	{
		setUnlocalizedName(MoGlowstone.MODID + "_" + "ingotGlowstone");
		setTextureName(MoGlowstone.MODID + ":" + "ingotGlowstone");
		setCreativeTab(MoGlowstone.Tab);
	}
}
