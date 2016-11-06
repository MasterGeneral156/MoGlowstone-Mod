package com.themastergeneral.moglowstone.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static GSBlock black;
	public static GSBlock blue;
	public static GSBlock brick;
	public static GSBlock brown;
	public static GSBlock cyan;
	public static GSBlock gray;
	public static GSBlock green;
	public static GSBlock lamp;
	public static GSBlock lblue;
	public static GSBlock lgray;
	public static GSBlock lime;
	public static GSBlock magenta;
	public static GSBlock orange;
	public static GSBlock pink;
	public static GSBlock purple;
	public static GSBlock red;
	public static GSBlock white;

    public static final void init() {
    	black = new GSBlock("black", Material.glass);
    	GameRegistry.registerBlock(black, "black");
    	
    	blue = new GSBlock("blue", Material.glass);
    	GameRegistry.registerBlock(blue, "blue");
    	
    	brick = new GSBlock("brick", Material.glass);
    	GameRegistry.registerBlock(brick, "brick");
    	
    	brown = new GSBlock("brown", Material.glass);
    	GameRegistry.registerBlock(brown, "brown");
    	
    	cyan = new GSBlock("cyan", Material.glass);
    	GameRegistry.registerBlock(cyan, "cyan");
    	
    	gray = new GSBlock("gray", Material.glass);
    	GameRegistry.registerBlock(gray, "gray");
    	
    	green = new GSBlock("green", Material.glass);
    	GameRegistry.registerBlock(green, "green");
    	
    	lamp = new GSBlock("lamp", Material.glass);
    	GameRegistry.registerBlock(lamp, "lamp");
    	
    	lblue = new GSBlock("lblue", Material.glass);
    	GameRegistry.registerBlock(lblue, "lblue");
    	
    	lgray = new GSBlock("lgray", Material.glass);
    	GameRegistry.registerBlock(lgray, "lgray");
    	
    	lime = new GSBlock("lime", Material.glass);
    	GameRegistry.registerBlock(lime, "lime");
    	
    	magenta = new GSBlock("magenta", Material.glass);
    	GameRegistry.registerBlock(magenta, "magenta");
    	
    	orange = new GSBlock("orange", Material.glass);
    	GameRegistry.registerBlock(orange, "orange");
    	
    	pink = new GSBlock("pink", Material.glass);
    	GameRegistry.registerBlock(pink, "pink");
    	
    	purple = new GSBlock("purple", Material.glass);
    	GameRegistry.registerBlock(purple, "purple");
    	
    	red = new GSBlock("red", Material.glass);
    	GameRegistry.registerBlock(red, "red");
    	
    	white = new GSBlock("white", Material.glass);
    	GameRegistry.registerBlock(white, "white");
    }

}
