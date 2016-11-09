package com.themastergeneral.moglowstone.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.handler.CraftingHandler;
import com.themastergeneral.moglowstone.handler.OreDict;
import com.themastergeneral.moglowstone.proxy.client.BlockRenderRegister;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) 
    {
    	OreDict.init();
    	CraftingHandler.init();
    	BlockRenderRegister.registerBlockRenderer();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}
