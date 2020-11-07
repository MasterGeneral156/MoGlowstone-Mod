package com.themastergeneral.moglowstone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moglowstone")
public class MoGlowstone {
	
	public static MoGlowstone instance;
	static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "moglowstone";
	public static final ItemGroup ITEMGROUP = new MoGlowstoneItemGroup();

	public MoGlowstone() {
		instance = this;
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server, registry and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("Mo' Glowstone is launching.");
    }
}
