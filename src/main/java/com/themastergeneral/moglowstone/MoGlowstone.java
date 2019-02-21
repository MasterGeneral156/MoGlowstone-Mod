package com.themastergeneral.moglowstone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.moglowstone.blocks.ModBlocks;
import com.themastergeneral.moglowstone.items.ModItemBlocks;
import com.themastergeneral.moglowstone.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("moglowstone")
public class MoGlowstone {
	
	public static MoGlowstone instance;
	private static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "moglowstone";

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
	
	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration
    {
		@SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event)
        {
			IForgeRegistry<Block> blockRegistry = event.getRegistry();
			
			blockRegistry.register(ModBlocks.black_gsblock);
			blockRegistry.register(ModBlocks.blue_gsblock);
			blockRegistry.register(ModBlocks.brown_gsblock);
			blockRegistry.register(ModBlocks.brick_gsblock);
			blockRegistry.register(ModBlocks.cyan_gsblock);
			blockRegistry.register(ModBlocks.gray_gsblock);
			blockRegistry.register(ModBlocks.green_gsblock);
			blockRegistry.register(ModBlocks.lamp_gsblock);
			blockRegistry.register(ModBlocks.lblue_gsblock);
			blockRegistry.register(ModBlocks.lgray_gsblock);
			blockRegistry.register(ModBlocks.lime_gsblock);
			blockRegistry.register(ModBlocks.magenta_gsblock);
			blockRegistry.register(ModBlocks.orange_gsblock);
			blockRegistry.register(ModBlocks.red_gsblock);
			blockRegistry.register(ModBlocks.pink_gsblock);
			blockRegistry.register(ModBlocks.purple_gsblock);
			blockRegistry.register(ModBlocks.white_gsblock);
			blockRegistry.register(ModBlocks.glowstone_ore);
        }
		
		@SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event)
        {
			IForgeRegistry<Item> itemRegistry = event.getRegistry();
			
			Properties itemBuilder = (new Item.Properties());

			
			itemRegistry.register(new ModItemBlocks(ModBlocks.black_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.blue_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.brick_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.brown_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.glowstone_ore, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.cyan_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.gray_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.green_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.lamp_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.lblue_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.lgray_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.lime_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.magenta_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.orange_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.red_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.pink_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.purple_gsblock, itemBuilder));
			itemRegistry.register(new ModItemBlocks(ModBlocks.white_gsblock, itemBuilder));
			itemRegistry.register(ModItems.fuelglowstone);
        }
    }
}
