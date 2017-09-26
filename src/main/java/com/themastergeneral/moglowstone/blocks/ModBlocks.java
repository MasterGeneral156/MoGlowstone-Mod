package com.themastergeneral.moglowstone.blocks;

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

	public static final void init() {
		black_gsblock = register(new GSBlock("black_gsblock",
				MoGlowstone.MODID, "black"));
		blue_gsblock = register(new GSBlock("blue_gsblock", MoGlowstone.MODID,
				"blue"));
		brick_gsblock = register(new GSBlock("brick_gsblock",
				MoGlowstone.MODID, null));
		brown_gsblock = register(new GSBlock("brown_gsblock",
				MoGlowstone.MODID, "brown"));
		cyan_gsblock = register(new GSBlock("cyan_gsblock", MoGlowstone.MODID,
				"cyan"));
		gray_gsblock = register(new GSBlock("gray_gsblock", MoGlowstone.MODID,
				"gray"));
		green_gsblock = register(new GSBlock("green_gsblock",
				MoGlowstone.MODID, "green"));
		lamp_gsblock = register(new GSBlock("lamp_gsblock", MoGlowstone.MODID,
				null));
		lblue_gsblock = register(new GSBlock("lblue_gsblock",
				MoGlowstone.MODID, "lblue"));
		lgray_gsblock = register(new GSBlock("lgray_gsblock",
				MoGlowstone.MODID, "lgray"));
		lime_gsblock = register(new GSBlock("lime_gsblock", MoGlowstone.MODID,
				"lime"));
		magenta_gsblock = register(new GSBlock("magenta_gsblock",
				MoGlowstone.MODID, "magenta"));
		orange_gsblock = register(new GSBlock("orange_gsblock",
				MoGlowstone.MODID, "orange"));
		pink_gsblock = register(new GSBlock("pink_gsblock", MoGlowstone.MODID,
				"pink"));
		purple_gsblock = register(new GSBlock("purple_gsblock",
				MoGlowstone.MODID, "purple"));
		red_gsblock = register(new GSBlock("red_gsblock", MoGlowstone.MODID,
				"red"));
		white_gsblock = register(new GSBlock("white_gsblock",
				MoGlowstone.MODID, "white"));
	}
}
