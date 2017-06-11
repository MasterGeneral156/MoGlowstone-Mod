package com.themastergeneral.moglowstone.handler;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.config.Config;
import com.themastergeneral.moglowstone.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingHandler 
{
	public static final void init() 
	{
		/*if (Config.disableGlowstone == false)
		{
			//Shaped recipes for glowstone dust.
	    	GameRegistry.addRecipe(new ItemStack(Items.GLOWSTONE_DUST), 
	    			new Object[]{"AAA","ABA","AAA",
	    	    	'A', Blocks.TORCH, 'B', Items.REDSTONE
	    	});
		}
    	//Shaped recipes for glowstone lamp block.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lamp_gsblock), 
    			new Object[]{" A ", "ABA", " A ",
    	    	'B', Blocks.GLOWSTONE, 'A', Items.GLOWSTONE_DUST
    	});
    	//Shaped recipes for glowstone brick.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.brick_gsblock), 
    			new Object[]{"AA","AA",
    	    	'A', Blocks.GLOWSTONE
    	});
    	if (Config.disableDoubleOutput == false)
    	{
	    	//Shaped recipes for fire charge.
	    	GameRegistry.addRecipe(new ItemStack(Items.FIRE_CHARGE, 6), new Object[]{
	    	    	"AB",
	    	    	"C ",
	    	    	'A', Items.BLAZE_POWDER, 'B', ModItems.fuelglowstone, 'C', Items.GUNPOWDER
	    	});
	    	//Shaped recipes for torches.
	    	GameRegistry.addRecipe(new ItemStack(Blocks.TORCH, 8), new Object[]{
	    	    	"A",
	    	    	"B",
	    	    	'A', ModItems.fuelglowstone, 'B', Items.STICK
	    	});
    	}
    	if (Config.disableGlowstoneCrf == false)
    	{
	    	//Red Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.red_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeRed", 'G', Blocks.GLOWSTONE));
	    	
	    	//Blue Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blue_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeBlue", 'G', Blocks.GLOWSTONE));
	    	
	    	//Green Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.green_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeGreen", 'G', Blocks.GLOWSTONE));
	    	
	    	//Orange Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.orange_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeOrange", 'G', Blocks.GLOWSTONE));
	    	
	    	//Brown Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.brown_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeBrown", 'G', Blocks.GLOWSTONE));
	    	
	    	//Black Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.black_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeBlack", 'G', Blocks.GLOWSTONE));
	    	
	    	//Cyan Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cyan_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeCyan", 'G', Blocks.GLOWSTONE));
	    	
	    	//Gray Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gray_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeGray", 'G', Blocks.GLOWSTONE));
	    	
	    	//Light Blue Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lblue_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeLightBlue", 'G', Blocks.GLOWSTONE));
	    	
	    	//Light Gray Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lgray_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeLightGray", 'G', Blocks.GLOWSTONE));
	    	
	    	//Lime Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lime_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeLime", 'G', Blocks.GLOWSTONE));
	    	
	    	//Magenta Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.magenta_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeMagenta", 'G', Blocks.GLOWSTONE));
	    	
	    	//Pink Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.pink_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyePink", 'G', Blocks.GLOWSTONE));
	    	
	    	//Purple Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.purple_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyePurple", 'G', Blocks.GLOWSTONE));
	    	
	    	//White Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.white_gsblock, 8), "GGG", "GDG", "GGG", 'D', "dyeWhite", 'G', Blocks.GLOWSTONE));
	    	
	    	//Glowstone
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.GLOWSTONE, 8), "GGG", "GDG", "GGG", 'D', "dyeYellow", 'G', "glowstone"));
    	}
    	
    	//Shaped recipes for glowstone fuel.
    	if (Config.disableGlowstoneFuel == false)
    	{
	    	GameRegistry.addRecipe(new ItemStack(ModItems.fuelglowstone, 1), new Object[]{
	    	    	"AAA",
	    	    	"ABA",
	    	    	"AAA",
	    	    	'A', Items.GLOWSTONE_DUST, 'B', Items.COAL
	    	});
    	}
    	//Glowstone Lamp
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lamp_gsblock), " D ", "DGD", " D ", 'G', "glowstone", 'D', Items.GLOWSTONE_DUST));
    	
    	//Redstone Lamp
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.REDSTONE_LAMP), " D ", "DGD", " D ", 'G', "glowstone", 'D', Items.REDSTONE));*/
	}
}
