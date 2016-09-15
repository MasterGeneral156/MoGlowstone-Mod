package com.themastergeneral.moglowstonemod;

import com.themastergeneral.moglowstonemod.blocks.blackGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.blueGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.brickGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.brownGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.cyanGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.fuelGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.grayGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.greenGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.lblueGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.lgrayGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.limeGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.magentaGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.orangeGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.pinkGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.purpleGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.redGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.whiteGlowstoneBlock;
import com.themastergeneral.moglowstonemod.blocks.lampGlowstoneBlock;
import com.themastergeneral.moglowstonemod.items.fuelGlowstone;
import com.themastergeneral.moglowstonemod.items.ingotGlowstone;
import com.themastergeneral.moglowstonemod.items.maxPickaxe;
import com.themastergeneral.moglowstonemod.items.maxSword;
import com.themastergeneral.moglowstonemod.items.pickaxeGlowstone;
import com.themastergeneral.moglowstonemod.items.sharpSword;
import com.themastergeneral.moglowstonemod.items.speedPickaxe;
import com.themastergeneral.moglowstonemod.items.strongPickaxe;
import com.themastergeneral.moglowstonemod.items.strongSword;
import com.themastergeneral.moglowstonemod.items.swordGlowstone;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MoGlowstone.MODID, version = MoGlowstone.VERSION)
public class MoGlowstone
{
    public static final String MODID = "MoGlowstone";
    public static final String VERSION = "1.7";
    
    //Tool Materials
    public static ToolMaterial Glowstone = EnumHelper.addToolMaterial("GS", 3, 145, 20.0F, 30.0F, 30);
    public static ToolMaterial GlowstoneStrong = EnumHelper.addToolMaterial("GSS", 3, 4145, 20.0F, 30.0F, 30);
    public static ToolMaterial GlowstoneHaste = EnumHelper.addToolMaterial("GSH", 3, 145, 40.0F, 30.0F, 30);
    public static ToolMaterial GlowstoneHasteStrong = EnumHelper.addToolMaterial("GSHS", 3, 4145, 40.0F, 30.0F, 30);
    public static ToolMaterial GlowstoneSharp = EnumHelper.addToolMaterial("GSD", 3, 145, 20.0F, 64.0F, 30);
    public static ToolMaterial GlowstoneStrongSharp = EnumHelper.addToolMaterial("GSSD", 3, 4145, 20.0F, 64.0F, 30);
    
    //Blocks
    public static Block redGlowstoneBlock;
    public static Block blueGlowstoneBlock;
    public static Block greenGlowstoneBlock;
    public static Block orangeGlowstoneBlock;
    public static Block brownGlowstoneBlock;
    public static Block blackGlowstoneBlock;
    public static Block purpleGlowstoneBlock;
    public static Block limeGlowstoneBlock;
    public static Block cyanGlowstoneBlock;
    public static Block lgrayGlowstoneBlock;
    public static Block grayGlowstoneBlock;
    public static Block pinkGlowstoneBlock;
    public static Block lblueGlowstoneBlock;
    public static Block magentaGlowstoneBlock;
    public static Block whiteGlowstoneBlock;
    public static Block brickGlowstoneBlock;
    public static Block fuelGlowstoneBlock;
    public static Block lampGlowstoneBlock;
    
    //Items
    public static Item fuelGlowstone;
    public static Item pickaxeGlowstone;
    public static Item pickaxeSGlowstone;
    public static Item pickaxeHGlowstone;
    public static Item pickaxeMGlowstone;
    public static Item swordGlowstone;
    public static Item swordDGlowstone;
    public static Item swordSGlowstone;
    public static Item swordMGlowstone;
    public static Item ingotGlowstone;
    
    //Create the creative tab
    public static CreativeTabs Tab = new CreativeTab("MoGlowstone");
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	System.out.println("Starting up...");
    	/*
    	 * Initilize blocks.
    	 * */
    	//Red
    	redGlowstoneBlock = new redGlowstoneBlock();
    	GameRegistry.registerBlock(redGlowstoneBlock, "redglowstoneblock");
    	//Blue
    	blueGlowstoneBlock = new blueGlowstoneBlock();
    	GameRegistry.registerBlock(blueGlowstoneBlock, "blueglowstoneblock");
    	//Green
    	greenGlowstoneBlock = new greenGlowstoneBlock();
    	GameRegistry.registerBlock(greenGlowstoneBlock, "greenglowstoneblock");
    	//Orange
    	orangeGlowstoneBlock = new orangeGlowstoneBlock();
    	GameRegistry.registerBlock(orangeGlowstoneBlock, "orangeglowstoneblock");
    	//brown
    	brownGlowstoneBlock = new brownGlowstoneBlock();
    	GameRegistry.registerBlock(brownGlowstoneBlock, "brownglowstoneblock");
    	//black
    	blackGlowstoneBlock = new blackGlowstoneBlock();
    	GameRegistry.registerBlock(blackGlowstoneBlock, "blackglowstoneblock");
    	//purple
    	purpleGlowstoneBlock = new purpleGlowstoneBlock();
    	GameRegistry.registerBlock(purpleGlowstoneBlock, "purpleglowstoneblock");
    	//cyan
    	cyanGlowstoneBlock = new cyanGlowstoneBlock();
    	GameRegistry.registerBlock(cyanGlowstoneBlock, "cyanglowstoneblock");
    	//lgray
    	lgrayGlowstoneBlock = new lgrayGlowstoneBlock();
    	GameRegistry.registerBlock(lgrayGlowstoneBlock, "lgrayglowstoneblock");
    	//gray
    	grayGlowstoneBlock = new grayGlowstoneBlock();
    	GameRegistry.registerBlock(grayGlowstoneBlock, "grayglowstoneblock");
    	//pink
    	pinkGlowstoneBlock = new pinkGlowstoneBlock();
    	GameRegistry.registerBlock(pinkGlowstoneBlock, "pinkglowstoneblock");
    	//lime
    	limeGlowstoneBlock = new limeGlowstoneBlock();
    	GameRegistry.registerBlock(limeGlowstoneBlock, "limeglowstoneblock");
    	//lblue
    	lblueGlowstoneBlock = new lblueGlowstoneBlock();
    	GameRegistry.registerBlock(lblueGlowstoneBlock, "lblueglowstoneblock");
    	//magenta
    	magentaGlowstoneBlock = new magentaGlowstoneBlock();
    	GameRegistry.registerBlock(magentaGlowstoneBlock, "magentaglowstoneblock");
    	//white
    	whiteGlowstoneBlock = new whiteGlowstoneBlock();
    	GameRegistry.registerBlock(whiteGlowstoneBlock, "whiteglowstoneblock");
    	//bricks
    	brickGlowstoneBlock = new brickGlowstoneBlock();
    	GameRegistry.registerBlock(brickGlowstoneBlock, "brickglowstoneblock");
    	//bricks
    	fuelGlowstoneBlock = new fuelGlowstoneBlock();
    	GameRegistry.registerBlock(fuelGlowstoneBlock, "fuelglowstoneblock");
    	
    	lampGlowstoneBlock = new lampGlowstoneBlock();
    	GameRegistry.registerBlock(lampGlowstoneBlock, "lampglowstoneblock");
    	//Fuel handler, anyone?
    	GameRegistry.registerFuelHandler(new MoGlowstoneFuelHandler());
    	
    	/*
    	 * Initiliaize Items
    	 */
    	//Glowstone Fuel
    	fuelGlowstone = new fuelGlowstone();
    	GameRegistry.registerItem(fuelGlowstone, "fuelGlowstone");
    	//Glowstone Ingot
    	ingotGlowstone = new ingotGlowstone();
    	GameRegistry.registerItem(ingotGlowstone, "ingotGlowstone");
    	//Pickaxe
    	GameRegistry.registerItem(pickaxeGlowstone = new pickaxeGlowstone(Glowstone), "pickaxe_Glowstone");
    	//Haste Pickaxe
    	GameRegistry.registerItem(pickaxeHGlowstone = new speedPickaxe(GlowstoneHaste), "pickaxe_speed");
    	//Strong Pickaxe
    	GameRegistry.registerItem(pickaxeSGlowstone = new strongPickaxe(GlowstoneStrong), "pickaxe_strong");
    	//Strong Pickaxe
    	GameRegistry.registerItem(pickaxeMGlowstone = new maxPickaxe(GlowstoneHasteStrong), "pickaxe_max");
    	//Sword
    	GameRegistry.registerItem(swordGlowstone = new swordGlowstone(null, Glowstone), "sword_Glowstone");
    	//Sharp Sword
    	GameRegistry.registerItem(swordDGlowstone = new sharpSword(null, GlowstoneSharp), "sword_sharp");
    	//Strong Sword
    	GameRegistry.registerItem(swordSGlowstone = new strongSword(null, GlowstoneStrong), "sword_strong");
    	//Strong Sword
    	GameRegistry.registerItem(swordMGlowstone = new maxSword(null, GlowstoneStrongSharp), "sword_max");
    	//Glowstone Ingot
    	GameRegistry.addSmelting(brickGlowstoneBlock, new ItemStack(ingotGlowstone), 0.4f);
    	
    	//Shaped recipes for glowstone dust.
    	GameRegistry.addRecipe(new ItemStack(Items.glowstone_dust), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.torch, 'B', Items.redstone
    	});
    	//Shaped recipes for glowstone lamp block.
    	GameRegistry.addRecipe(new ItemStack(lampGlowstoneBlock), new Object[]{
    	    	" A ",
    	    	"ABA",
    	    	" A ",
    	    	'B', Blocks.glowstone, 'A', Items.glowstone_dust
    	});
    	//Shaped recipes for haste pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeHGlowstone), new Object[]{
    	    	"AAC",
    	    	"ABC",
    	    	"ACC",
    	    	'B', pickaxeGlowstone, 'A', Items.redstone, 'C', Blocks.redstone_block
    	});
    	//Shaped recipes for haste pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeHGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', pickaxeGlowstone, 'C', Items.redstone, 'A', Blocks.redstone_block
    	});
    	//Shaped recipes for haste pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeHGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', pickaxeGlowstone, 'A', Items.redstone, 'C', Blocks.redstone_block
    	});
    	//Shaped recipes for sharp sword.
    	GameRegistry.addRecipe(new ItemStack(swordDGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', swordGlowstone, 'A', Items.quartz, 'C', Blocks.quartz_block
    	});
    	//Shaped recipes for sharp sword.
    	GameRegistry.addRecipe(new ItemStack(swordDGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', swordGlowstone, 'C', Items.quartz, 'A', Blocks.quartz_block
    	});
    	//Shaped recipes for superior sword.
    	GameRegistry.addRecipe(new ItemStack(swordMGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', swordSGlowstone, 'C', Items.quartz, 'A', Blocks.quartz_block
    	});
    	//Shaped recipes for superior sword.
    	GameRegistry.addRecipe(new ItemStack(swordMGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', swordSGlowstone, 'A', Items.quartz, 'C', Blocks.quartz_block
    	});
    	//Shaped recipes for superior sword.
    	GameRegistry.addRecipe(new ItemStack(swordMGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', swordDGlowstone, 'A', Items.diamond, 'C', Blocks.obsidian
    	});
    	//Shaped recipes for superior sword.
    	GameRegistry.addRecipe(new ItemStack(swordMGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', swordDGlowstone, 'C', Items.diamond, 'A', Blocks.obsidian
    	});
    	//Shaped recipes for Strong pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeSGlowstone), new Object[]{
    	    	"ACA",
    	    	"CBC",
    	    	"ACA",
    	    	'B', pickaxeGlowstone, 'C', Items.diamond, 'A', Blocks.obsidian
    	});
    	//Shaped recipes for Strong pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeSGlowstone), new Object[]{
    	    	"ACA",
    	    	"CBC",
    	    	"ACA",
    	    	'B', pickaxeGlowstone, 'A', Items.diamond, 'C', Blocks.obsidian
    	});
    	//Shaped recipes for Strong sword.
    	GameRegistry.addRecipe(new ItemStack(swordSGlowstone), new Object[]{
    	    	"ACA",
    	    	"CBC",
    	    	"ACA",
    	    	'B', swordGlowstone, 'C', Items.diamond, 'A', Blocks.obsidian
    	});
    	//Shaped recipes for Strong Sword.
    	GameRegistry.addRecipe(new ItemStack(swordSGlowstone), new Object[]{
    	    	"ACA",
    	    	"CBC",
    	    	"ACA",
    	    	'B', swordGlowstone, 'A', Items.diamond, 'C', Blocks.obsidian
    	});
    	//Shaped recipes for Superior pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeMGlowstone), new Object[]{
    	    	"ACA",
    	    	"CBC",
    	    	"ACA",
    	    	'B', pickaxeHGlowstone, 'A', Items.diamond, 'C', Blocks.obsidian
    	});
    	//Shaped recipes for Superior pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeMGlowstone), new Object[]{
    	    	"ACA",
    	    	"CBC",
    	    	"ACA",
    	    	'B', pickaxeHGlowstone, 'C', Items.diamond, 'A', Blocks.obsidian
    	});
    	//Shaped recipes for superior pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeMGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', pickaxeSGlowstone, 'C', Items.redstone, 'A', Blocks.redstone_block
    	});
    	//Shaped recipes for superior pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeMGlowstone), new Object[]{
    	    	"CAC",
    	    	"ABA",
    	    	"CAC",
    	    	'B', pickaxeSGlowstone, 'A', Items.redstone, 'C', Blocks.redstone_block
    	});
    	//Shaped recipes for fuel brick.
    	GameRegistry.addRecipe(new ItemStack(fuelGlowstoneBlock), new Object[]{
    	    	"AAA",
    	    	"AAA",
    	    	"AAA",
    	    	'A', fuelGlowstone
    	});
    	//Shaped recipes for glowstone brick.
    	GameRegistry.addRecipe(new ItemStack(brickGlowstoneBlock), new Object[]{
    	    	"AA ",
    	    	"AA ",
    	    	"   ",
    	    	'A', Blocks.glowstone
    	});
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
    	//Shaped recipes for red glowstone.
    	GameRegistry.addRecipe(new ItemStack(redGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 1)
    	});
    	//Shaped recipes for blue glowstone.
    	GameRegistry.addRecipe(new ItemStack(blueGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 4)
    	});
    	//Shaped recipes for green glowstone.
    	GameRegistry.addRecipe(new ItemStack(greenGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 2)
    	});
    	//Shaped recipes for orange glowstone.
    	GameRegistry.addRecipe(new ItemStack(orangeGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 14)
    	});
    	//Shaped recipes for brown glowstone.
    	GameRegistry.addRecipe(new ItemStack(brownGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 3)
    	});
    	//Shaped recipes for black glowstone.
    	GameRegistry.addRecipe(new ItemStack(blackGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 0)
    	});
    	//Shaped recipes for cyan glowstone.
    	GameRegistry.addRecipe(new ItemStack(cyanGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 6)
    	});
    	//Shaped recipes for gray glowstone.
    	GameRegistry.addRecipe(new ItemStack(grayGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 8)
    	});
    	//Shaped recipes for light blue glowstone.
    	GameRegistry.addRecipe(new ItemStack(lblueGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 12)
    	});
    	//Shaped recipes for light gray glowstone.
    	GameRegistry.addRecipe(new ItemStack(lgrayGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 7)
    	});
    	//Shaped recipes for lime glowstone.
    	GameRegistry.addRecipe(new ItemStack(limeGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 10)
    	});
    	//Shaped recipes for magenta glowstone.
    	GameRegistry.addRecipe(new ItemStack(magentaGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 13)
    	});
    	//Shaped recipes for pink glowstone.
    	GameRegistry.addRecipe(new ItemStack(pinkGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 9)
    	});
    	//Shaped recipes for purple glowstone.
    	GameRegistry.addRecipe(new ItemStack(purpleGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 5)
    	});
    	//Shaped recipes for white glowstone.
    	GameRegistry.addRecipe(new ItemStack(whiteGlowstoneBlock, 8), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 15)
    	});
    	//Shaped recipes for glowstone fuel.
    	GameRegistry.addRecipe(new ItemStack(fuelGlowstone, 1), new Object[]{
    	    	"AAA",
    	    	"ABA",
    	    	"AAA",
    	    	'A', Items.glowstone_dust, 'B', Items.coal
    	});
    	//Shaped recipes for glowstone pickaxe.
    	GameRegistry.addRecipe(new ItemStack(pickaxeGlowstone, 1), new Object[]{
    	    	"AAA",
    	    	" B ",
    	    	" B ",
    	    	'A', ingotGlowstone, 'B', Blocks.obsidian
    	});
    	//Shaped recipes for glowstone pickaxe.
    	GameRegistry.addRecipe(new ItemStack(swordGlowstone, 1), new Object[]{
    	    	" A ",
    	    	" A ",
    	    	" B ",
    	    	'A', ingotGlowstone, 'B', Blocks.obsidian
    	});
    	//Line break
    	
    	//Dev note to himself
    	//ItemStack(item, number, damage))
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("Is it working?");
        System.out.println("Haha, yes we are!");
        System.out.println("Have a cake!");
    }
}
