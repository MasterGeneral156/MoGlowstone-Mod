package com.themastergeneral.moglowstone.blocks;

import com.themastergeneral.moglowstone.proxy.client.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
    	black = register(new GSBlock("black", Material.GLASS));
    	blue = register(new GSBlock("blue", Material.GLASS));
    	brick = register(new GSBlock("brick", Material.GLASS));
    	brown = register(new GSBlock("brown", Material.GLASS));
    	cyan = register(new GSBlock("cyan", Material.GLASS));
    	gray = register(new GSBlock("gray", Material.GLASS));
    	green = register(new GSBlock("green", Material.GLASS));
    	lamp = register(new GSBlock("lamp", Material.GLASS));
    	lblue = register(new GSBlock("lblue", Material.GLASS));
    	lgray = register(new GSBlock("lgray", Material.GLASS));
    	lime = register(new GSBlock("lime", Material.GLASS));
    	magenta = register(new GSBlock("magenta", Material.GLASS));
    	orange = register(new GSBlock("orange", Material.GLASS));
    	pink = register(new GSBlock("pink", Material.GLASS));
    	purple = register(new GSBlock("purple", Material.GLASS));
    	red = register(new GSBlock("red", Material.GLASS));
    	white = register(new GSBlock("white", Material.GLASS));
    }
    private static <T extends Block> T register (T block, ItemBlock itemBlock) {
    	 
    	 GameRegistry.register(block);
    	 if(itemBlock != null) {
    	 GameRegistry.register(itemBlock);
    	 }
    	 
    	 if(block instanceof ItemModelProvider) {
    	 ((ItemModelProvider)block).registerItemModel(itemBlock);
    	 }
    	 
    	 return block;
    	 }
    	 
    	 private static <T extends Block> T register(T block) {
    	 ItemBlock itemBlock = new ItemBlock(block);
    	 itemBlock.setRegistryName(block.getRegistryName());
    	 return register(block, itemBlock);
    	 }

}
