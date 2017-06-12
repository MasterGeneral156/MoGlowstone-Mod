package com.themastergeneral.moglowstone.handler;

import com.themastergeneral.ctdcore.utils.ModUtils;
import com.themastergeneral.moglowstone.MoGlowstone;
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
		if (Config.disableGlowstone == false)
		{
			//Shaped recipes for glowstone dust.
			ModUtils.addShapedRecipe("minecraft", "glowstone_dust", 
					new ItemStack(Items.GLOWSTONE_DUST), 
					new Object[]{"AAA","ABA","AAA",
		    		'A', Blocks.TORCH, 'B', Items.REDSTONE});
		}
    	//Shaped recipes for glowstone brick.
    	ModUtils.addShapedRecipe(MoGlowstone.MODID, "glowstone_bricks", 
    			new ItemStack(ModBlocks.brick_gsblock), 
    			new Object[]{"AA","AA",
    	    	'A', Blocks.GLOWSTONE
    	});
    	if (Config.disableDoubleOutput == false)
    	{
	    	//Shaped recipes for fire charge.
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "fire_charge", 
    				new ItemStack(Items.FIRE_CHARGE, 6), 
    				new Object[]{"AB","C ",
	    	    	'A', Items.BLAZE_POWDER, 'B', ModItems.fuelglowstone, 'C', Items.GUNPOWDER
	    	});
	    	//Shaped recipes for torches.
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "torch", 
    				new ItemStack(Blocks.TORCH, 8), 
    				new Object[]{"A","B",
	    	    	'A', ModItems.fuelglowstone, 'B', Items.STICK
	    	});
    	}
    	if (Config.disableGlowstoneCrf == false)
    	{
    		//Black Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "black_gs", 
    				new ItemStack(ModBlocks.black_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,0), 'G', Blocks.GLOWSTONE
	    	});
    		
	    	//Red Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "red_gs", 
    				new ItemStack(ModBlocks.red_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,1), 'G', Blocks.GLOWSTONE
	    	});
    		//Green Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "green_gs", 
    				new ItemStack(ModBlocks.green_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,2), 'G', Blocks.GLOWSTONE
	    	});
    		//Brown Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "brown_gs", 
    				new ItemStack(ModBlocks.brown_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,3), 'G', Blocks.GLOWSTONE
	    	});
    		//Blue Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "blue_gs", 
    				new ItemStack(ModBlocks.blue_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,4), 'G', Blocks.GLOWSTONE
	    	});
    		//Purple Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "purple_gs", 
    				new ItemStack(ModBlocks.purple_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,5), 'G', Blocks.GLOWSTONE
	    	});
    		//Cyan Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "cyan_gs", 
    				new ItemStack(ModBlocks.cyan_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,6), 'G', Blocks.GLOWSTONE
	    	});
    		//Light Gray Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "light_gray_gs", 
    				new ItemStack(ModBlocks.lgray_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,7), 'G', Blocks.GLOWSTONE
	    	});
    		
    		//Gray Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "gray_gs", 
    				new ItemStack(ModBlocks.gray_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,8), 'G', Blocks.GLOWSTONE
	    	});
    		
    		//Pink Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "pink_gs", 
    				new ItemStack(ModBlocks.pink_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,9), 'G', Blocks.GLOWSTONE
	    	});
    		//Lime Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "lime_gs", 
    				new ItemStack(ModBlocks.lime_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,10), 'G', Blocks.GLOWSTONE
	    	});
    		//Yellow Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "yellow_gs", 
    				new ItemStack(Blocks.GLOWSTONE, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,11), 'G', Blocks.GLOWSTONE
	    	});
    		//Light Blue Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "light_blue_gs", 
    				new ItemStack(ModBlocks.lblue_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,12), 'G', Blocks.GLOWSTONE
	    	});
    		//Magenta Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "magenta_gs", 
    				new ItemStack(ModBlocks.magenta_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,13), 'G', Blocks.GLOWSTONE
	    	});
    		//Orange Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "orange_gs", 
    				new ItemStack(ModBlocks.orange_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,14), 'G', Blocks.GLOWSTONE
	    	});
    		//White Glowstone
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "white_gs", 
    				new ItemStack(ModBlocks.white_gsblock, 8), 
    				new Object[]{"GGG","GDG","GGG",
	    	    	'D', new ItemStack(Items.DYE,1,15), 'G', Blocks.GLOWSTONE
	    	});
    	}
    	
    	//Shaped recipes for glowstone fuel.
    	if (Config.disableGlowstoneFuel == false)
    	{
    		ModUtils.addShapedRecipe(MoGlowstone.MODID, "glowstone_fuel", 
    				new ItemStack(ModItems.fuelglowstone, 1), 
    				new Object[]{"AAA","ABA","AAA",
	    	    	'A', Items.GLOWSTONE_DUST, 'B', Items.COAL
	    	});
    	}
    	//Glowstone Lamp
    	ModUtils.addShapedRecipe(MoGlowstone.MODID, "glowstone_lamp", 
				new ItemStack(ModBlocks.lamp_gsblock), 
				new Object[]{" D ","DGD"," D ",
    	    	'D', Items.GLOWSTONE_DUST, 'G', Blocks.GLOWSTONE
    	});
	}
}
