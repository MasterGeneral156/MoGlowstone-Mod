package com.themastergeneral.moglowstone.handler;

import com.themastergeneral.moglowstone.blocks.ModBlocks;

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
    	/*
    	//Shaped recipes for fire charge.
    	GameRegistry.addRecipe(new ItemStack(Items.fire_charge, 6), new Object[]{
    	    	"   ",
    	    	"AB ",
    	    	" C ",
    	    	'A', Items.blaze_powder, 'B', fuelGlowstone, 'C', Items.gunpowder
    	});
    	//Shaped recipes for torches.
    	GameRegistry.addRecipe(new ItemStack(Blocks.torch, 8), new Object[]{
    	    	"A  ",
    	    	"B  ",
    	    	"   ",
    	    	'A', fuelGlowstone, 'B', Items.stick
    	});
    	*/
    	//Shaped recipes for red glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.red, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 1)
    	});
    	//Shaped recipes for blue glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.blue, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 4)
    	});
    	//Shaped recipes for green glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.green, 8),
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 2)
    	});
    	//Shaped recipes for orange glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.orange, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 14)
    	});
    	//Shaped recipes for brown glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.brown, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 3)
    	});
    	//Shaped recipes for black glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.black, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 0)
    	});
    	//Shaped recipes for cyan glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.cyan, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 6)
    	});
    	//Shaped recipes for gray glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.gray, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 8)
    	});
    	//Shaped recipes for light blue glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lblue, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 12)
    	});
    	//Shaped recipes for light gray glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lgray, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 7)
    	});
    	//Shaped recipes for lime glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.lime, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 10)
    	});
    	//Shaped recipes for magenta glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.magenta, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 13)
    	});
    	//Shaped recipes for pink glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.pink, 8), 
    			new Object[]{
    	    	"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 9)
    	});
    	//Shaped recipes for purple glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.purple, 8), 
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 5)
    	});
    	//Shaped recipes for white glowstone.
    	GameRegistry.addRecipe(new ItemStack(ModBlocks.white, 8),
    			new Object[]{"AAA","ABA","AAA",
    	    	'A', Blocks.GLOWSTONE, 'B', new ItemStack(Items.DYE, 1, 15)
    	});
    	/*
    	//Shaped recipes for glowstone fuel.
    	GameRegistry.addRecipe(new ItemStack(fuelGlowstone, 1), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Items.glowstone_dust, 'B', Items.coal
    	});
    	*/
	}
}
