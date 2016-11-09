package com.themastergeneral.moglowstone.proxy.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.blocks.ModBlocks;


public final class BlockRenderRegister 
{
	public static void registerBlockRenderer() 
	{
	    reg(ModBlocks.black);
	    reg(ModBlocks.blue);
	    reg(ModBlocks.brick);
	    reg(ModBlocks.brown);
	    reg(ModBlocks.cyan);
	    reg(ModBlocks.gray);
	    reg(ModBlocks.green);
	    reg(ModBlocks.lamp);
	    reg(ModBlocks.lblue);
	    reg(ModBlocks.lgray);
	    reg(ModBlocks.lime);
	    reg(ModBlocks.magenta);
	    reg(ModBlocks.orange);
	    reg(ModBlocks.pink);
	    reg(ModBlocks.purple);
	    reg(ModBlocks.red);
	    reg(ModBlocks.white);
	}

	public static void reg(Block block) 
	{
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MoGlowstone.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
