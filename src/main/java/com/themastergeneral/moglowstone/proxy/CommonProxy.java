package com.themastergeneral.moglowstone.proxy;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.handler.CraftingHandler;
import com.themastergeneral.moglowstone.handler.OreDict;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) 
    {
    	OreDict.init();
    	CraftingHandler.init();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}
