package com.themastergeneral.moglowstone.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.handler.CraftingHandler;
import com.themastergeneral.moglowstone.handler.OreDict;
import com.themastergeneral.moglowstone.items.ModItems;
import com.themastergeneral.moglowstone.proxy.client.BlockRenderRegister;
import com.themastergeneral.moglowstone.world.ModWorldGen;
import com.themastergeneral.moglowstone.handler.FuelHandler;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModBlocks.init();
    	ModItems.init();
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    }

    public void init(FMLInitializationEvent e) 
    {
    	OreDict.init();
    	CraftingHandler.init();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }

    public void registerItemRenderer(Item item, int meta, String id) 
    {
    	 
    }
}
