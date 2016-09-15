package com.themastergeneral.moglowstonemod.items;

import java.util.List;

import com.themastergeneral.moglowstonemod.MoGlowstone;

import net.minecraft.item.ItemSword;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class maxSword extends ItemSword {

	public maxSword(String unlocalizedName, ToolMaterial GSSS) {
		super(GSSS);
        setUnlocalizedName(MoGlowstone.MODID + "_" + "swordMGlowstone");
		setTextureName(MoGlowstone.MODID + ":" + "swordMGlowstone");
		setCreativeTab(MoGlowstone.Tab);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List list, boolean flag) 
	{
		list.add("Twice as sharp, 30 times stronger.");
	}

}
