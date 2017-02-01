package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.tileentity.BasicFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks extends RegisterBlock {
	public static GSBlock black_gsblock;
	public static GSBlock blue_gsblock;
	public static GSBlock brick_gsblock;
	public static GSBlock brown_gsblock;
	public static GSBlock cyan_gsblock;
	public static GSBlock gray_gsblock;
	public static GSBlock green_gsblock;
	public static GSBlock lamp_gsblock;
	public static GSBlock lblue_gsblock;
	public static GSBlock lgray_gsblock;
	public static GSBlock lime_gsblock;
	public static GSBlock magenta_gsblock;
	public static GSBlock orange_gsblock;
	public static GSBlock pink_gsblock;
	public static GSBlock purple_gsblock;
	public static GSBlock red_gsblock;
	public static GSBlock white_gsblock;

    public static final void init() 
    {
    	black_gsblock = register(new GSBlock("black_gsblock", Material.GLASS, MoGlowstone.MODID));
    	blue_gsblock = register(new GSBlock("blue_gsblock", Material.GLASS, MoGlowstone.MODID));
    	brick_gsblock = register(new GSBlock("brick_gsblock", Material.GLASS, MoGlowstone.MODID));
    	brown_gsblock = register(new GSBlock("brown_gsblock", Material.GLASS, MoGlowstone.MODID));
    	cyan_gsblock = register(new GSBlock("cyan_gsblock", Material.GLASS, MoGlowstone.MODID));
    	gray_gsblock = register(new GSBlock("gray_gsblock", Material.GLASS, MoGlowstone.MODID));
    	green_gsblock = register(new GSBlock("green_gsblock", Material.GLASS, MoGlowstone.MODID));
    	lamp_gsblock = register(new GSBlock("lamp_gsblock", Material.GLASS, MoGlowstone.MODID));
    	lblue_gsblock = register(new GSBlock("lblue_gsblock", Material.GLASS, MoGlowstone.MODID));
    	lgray_gsblock = register(new GSBlock("lgray_gsblock", Material.GLASS, MoGlowstone.MODID));
    	lime_gsblock = register(new GSBlock("lime_gsblock", Material.GLASS, MoGlowstone.MODID));
    	magenta_gsblock = register(new GSBlock("magenta_gsblock", Material.GLASS, MoGlowstone.MODID));
    	orange_gsblock = register(new GSBlock("orange_gsblock", Material.GLASS, MoGlowstone.MODID));
    	pink_gsblock = register(new GSBlock("pink_gsblock", Material.GLASS, MoGlowstone.MODID));
    	purple_gsblock = register(new GSBlock("purple_gsblock", Material.GLASS, MoGlowstone.MODID));
    	red_gsblock = register(new GSBlock("red_gsblock", Material.GLASS, MoGlowstone.MODID));
    	white_gsblock = register(new GSBlock("white_gsblock", Material.GLASS, MoGlowstone.MODID));
    }
}
