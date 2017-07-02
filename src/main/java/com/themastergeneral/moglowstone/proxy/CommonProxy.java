package com.themastergeneral.moglowstone.proxy;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.config.Config;
import com.themastergeneral.moglowstone.handler.OreDict;
import com.themastergeneral.moglowstone.items.ModItems;
import com.themastergeneral.moglowstone.world.ModWorldGen;
import com.themastergeneral.moglowstone.handler.FuelHandler;

public class CommonProxy {

	public static Configuration config;
    public void preInit(FMLPreInitializationEvent e) 
    {
    	File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "ctd/moglowstone.cfg"));
		Config.readConfig();
    	ModBlocks.init();
    	ModItems.init();
    	GameRegistry.registerFuelHandler(new FuelHandler());
    	if (Config.disableGlowstoneGen == false)
    	{
    		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    	}
    }

    public void init(FMLInitializationEvent e) 
    {
    	OreDict.init();
    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}
