package com.themastergeneral.moglowstone.handler;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
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
		//Shaped recipes for glowstone dust.
    	GameRegistry.addRecipe(new ItemStack(Items.GLOWSTONE_DUST), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.TORCH, 'B', Items.REDSTONE
    	});
    	//Shaped recipes for glowstone lamp block.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lamp), 
    			new Object[]{" A ", "ABA", " A ",
    	    	'B', Blocks.GLOWSTONE, 'A', Items.GLOWSTONE_DUST
    	});
    	//Shaped recipes for glowstone brick.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.brick), 
    			new Object[]{"AA ","AA ","   ",
    	    	'A', Blocks.GLOWSTONE
    	});
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
    	//Red Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.red), "GGG", "GDG", "GGG", 'D', "dyeRed", 'G', Blocks.GLOWSTONE));
    	
    	//Blue Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blue), "GGG", "GDG", "GGG", 'D', "dyeBlue", 'G', Blocks.GLOWSTONE));
    	
    	//Green Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.green), "GGG", "GDG", "GGG", 'D', "dyeGreen", 'G', Blocks.GLOWSTONE));
    	
    	//Orange Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.orange), "GGG", "GDG", "GGG", 'D', "dyeOrange", 'G', Blocks.GLOWSTONE));
    	
    	//Brown Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.brown), "GGG", "GDG", "GGG", 'D', "dyeBrown", 'G', Blocks.GLOWSTONE));
    	
    	//Black Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.black), "GGG", "GDG", "GGG", 'D', "dyeBlack", 'G', Blocks.GLOWSTONE));
    	
    	//Cyan Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.cyan), "GGG", "GDG", "GGG", 'D', "dyeCyan", 'G', Blocks.GLOWSTONE));
    	
    	//Gray Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gray), "GGG", "GDG", "GGG", 'D', "dyeGray", 'G', Blocks.GLOWSTONE));
    	
    	//Light Blue Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lblue), "GGG", "GDG", "GGG", 'D', "dyeLightBlue", 'G', Blocks.GLOWSTONE));
    	
    	//Light Gray Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lgray), "GGG", "GDG", "GGG", 'D', "dyeLightGray", 'G', Blocks.GLOWSTONE));
    	
    	//Lime Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lime), "GGG", "GDG", "GGG", 'D', "dyeLime", 'G', Blocks.GLOWSTONE));
    	
    	//Magenta Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.magenta), "GGG", "GDG", "GGG", 'D', "dyeMagenta", 'G', Blocks.GLOWSTONE));
    	
    	//Pink Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.pink), "GGG", "GDG", "GGG", 'D', "dyePink", 'G', Blocks.GLOWSTONE));
    	
    	//Purple Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.purple), "GGG", "GDG", "GGG", 'D', "dyePurple", 'G', Blocks.GLOWSTONE));
    	
    	//White Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.white), "GGG", "GDG", "GGG", 'D', "dyeWhite", 'G', Blocks.GLOWSTONE));
    	
    	//Glowstone
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.GLOWSTONE), "GGG", "GDG", "GGG", 'D', "dyeYellow", 'G', "glowstone"));
    	
    	//Shaped recipes for glowstone fuel.
    	GameRegistry.addRecipe(new ItemStack(ModItems.fuelglowstone, 1), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Items.GLOWSTONE_DUST, 'B', Items.COAL
    	});
    	//Glowstone Lamp
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.lamp), " D ", "DGD", " D ", 'G', "glowstone", 'D', Items.GLOWSTONE_DUST));
    	
    	//Redstone Lamp
    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.REDSTONE_LAMP), " D ", "DGD", " D ", 'G', "glowstone", 'D', Items.REDSTONE));
	}
}