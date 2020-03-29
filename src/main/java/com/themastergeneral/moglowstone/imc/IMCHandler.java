package com.themastergeneral.moglowstone.imc;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.imc.texpansion.IMCTE;

public class IMCHandler 
{
	public static final void IMCInit() 
	{
		// Add Pulvierzer Recipes for our glowstone
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.black_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 0), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.red_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 1), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.green_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 2), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.brown_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 3), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.blue_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 4), 25);
		IMCTE.addPulverizerRecipe(4000,
				new ItemStack(ModBlocks.purple_gsblock), new ItemStack(
						Items.GLOWSTONE_DUST, 4),
				new ItemStack(Items.DYE, 1, 5), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.cyan_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 6), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.lgray_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 7), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.gray_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 8), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.pink_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 9), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.lime_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 10), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.lblue_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 12), 25);
		IMCTE.addPulverizerRecipe(4000,
				new ItemStack(ModBlocks.magenta_gsblock), new ItemStack(
						Items.GLOWSTONE_DUST, 4), new ItemStack(Items.DYE, 1,
						13), 25);
		IMCTE.addPulverizerRecipe(4000,
				new ItemStack(ModBlocks.orange_gsblock), new ItemStack(
						Items.GLOWSTONE_DUST, 4), new ItemStack(Items.DYE, 1,
						14), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.white_gsblock),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.DYE, 1, 15), 25);
		IMCTE.addPulverizerRecipe(4000, new ItemStack(ModBlocks.glowstone_ore),
				new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(
						Items.GLOWSTONE_DUST, 2), 50);
	}
	public static final void chiselIMC()
	{
		
	}
}
