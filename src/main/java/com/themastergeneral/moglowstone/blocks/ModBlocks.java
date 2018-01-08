package com.themastergeneral.moglowstone.blocks;

import net.minecraft.item.EnumDyeColor;

import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.moglowstone.MoGlowstone;

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

	public static GSOre glowstone_ore;

	public static final void init() {
		black_gsblock = register(new GSBlock("black_gsblock",
				MoGlowstone.MODID, "black", EnumDyeColor.BLACK));
		blue_gsblock = register(new GSBlock("blue_gsblock", MoGlowstone.MODID,
				"blue", EnumDyeColor.BLUE));
		brick_gsblock = register(new GSBlock("brick_gsblock",
				MoGlowstone.MODID, null, EnumDyeColor.YELLOW));
		brown_gsblock = register(new GSBlock("brown_gsblock",
				MoGlowstone.MODID, "brown", EnumDyeColor.BROWN));
		cyan_gsblock = register(new GSBlock("cyan_gsblock", MoGlowstone.MODID,
				"cyan", EnumDyeColor.CYAN));
		gray_gsblock = register(new GSBlock("gray_gsblock", MoGlowstone.MODID,
				"gray", EnumDyeColor.GRAY));
		green_gsblock = register(new GSBlock("green_gsblock",
				MoGlowstone.MODID, "green", EnumDyeColor.GREEN));
		lamp_gsblock = register(new GSBlock("lamp_gsblock", MoGlowstone.MODID,
				null, EnumDyeColor.YELLOW));
		lblue_gsblock = register(new GSBlock("lblue_gsblock",
				MoGlowstone.MODID, "lblue", EnumDyeColor.LIGHT_BLUE));
		lgray_gsblock = register(new GSBlock("lgray_gsblock",
				MoGlowstone.MODID, "lgray", EnumDyeColor.SILVER));
		lime_gsblock = register(new GSBlock("lime_gsblock", MoGlowstone.MODID,
				"lime", EnumDyeColor.LIME));
		magenta_gsblock = register(new GSBlock("magenta_gsblock",
				MoGlowstone.MODID, "magenta", EnumDyeColor.MAGENTA));
		orange_gsblock = register(new GSBlock("orange_gsblock",
				MoGlowstone.MODID, "orange", EnumDyeColor.ORANGE));
		pink_gsblock = register(new GSBlock("pink_gsblock", MoGlowstone.MODID,
				"pink", EnumDyeColor.PINK));
		purple_gsblock = register(new GSBlock("purple_gsblock",
				MoGlowstone.MODID, "purple", EnumDyeColor.PURPLE));
		red_gsblock = register(new GSBlock("red_gsblock", MoGlowstone.MODID,
				"red", EnumDyeColor.RED));
		white_gsblock = register(new GSBlock("white_gsblock",
				MoGlowstone.MODID, "white", EnumDyeColor.WHITE));

		glowstone_ore = register(new GSOre("glowstone_ore", MoGlowstone.MODID));
	}
}
