package com.themastergeneral.moglowstone.config;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Level;

import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.proxy.CommonProxy;

public class Config 
{
	private static final String CATEGORY_GENERAL = "General";
	private static final String CATEGORY_GENERATION = "World Generation";
	private static final String CATEGORY_INTEGRATION = "Mod Integrations";

	public static boolean disableGlowstoneOreGen = false;
	public static int glowstoneSpawnMinY = 1;
	public static int glowstoneSpawnMaxY = 127;
	public static int glowstoneSpawnChance = 1;
	public static int glowstoneSpawnVeinSize = 1;
	
	//Generation of glowstone blocks
	public static boolean disableGlowstoneRedGen = false;
	public static boolean disableGlowstoneWhiteGen = false;
	public static boolean disableGlowstonePurpleGen = false;
	public static boolean disableGlowstonePinkGen = false;
	public static boolean disableGlowstoneOrangeGen = false;
	public static boolean disableGlowstoneMagentaGen = false;
	public static boolean disableGlowstoneLimeGen = false;
	public static boolean disableGlowstoneLightGrayGen = false;
	public static boolean disableGlowstoneLightBlueGen = false;
	public static boolean disableGlowstoneGreenGen = false;
	public static boolean disableGlowstoneGrayGen = false;
	public static boolean disableGlowstoneCyanGen = false;
	public static boolean disableGlowstoneBrownGen = false;
	public static boolean disableGlowstoneBlueGen = false;
	public static boolean disableGlowstoneBlackGen = false;
	
	public static boolean disableAlbedo = false;

	// Call this from CommonProxy.preInit(). It will create our config if it
	// doesn't
	// exist yet and read the values if it does exist.
	public static void readConfig() 
	{
		Configuration cfg = CommonProxy.config;
		try 
		{
			cfg.load();
			initGeneralConfig(cfg);
		} 
		catch (Exception e1) 
		{
			MoGlowstone.logger.log(Level.ERROR, "Problem loading config file!",
					e1);
		} 
		finally 
		{
			if (cfg.hasChanged()) 
			{
				cfg.save();
			}
		}
	}

	private static void initGeneralConfig(Configuration cfg) 
	{
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration for the Mo Glowstone mod.");
		cfg.addCustomCategoryComment(CATEGORY_GENERATION, "World Generation stuffs");
		cfg.addCustomCategoryComment(CATEGORY_INTEGRATION, "Configuration options for Mo' Glowstone to integrate with other mods.");
		disableGlowstoneOreGen = cfg.getBoolean(
				"Disable World Generation of Glowstone Ore",
				CATEGORY_GENERATION, disableGlowstoneOreGen,
				"Set to true to disable glowstone ore from generating.");
		glowstoneSpawnMinY = cfg.getInt(
				"Minimum Y level for glowstone to spawn at.", CATEGORY_GENERAL,
				glowstoneSpawnMinY, 0, 127,
				"Minimum Y level for the mod's glowstone to spawn at.");
		glowstoneSpawnMaxY = cfg.getInt(
				"Maximum Y level for glowstone to spawn at.", CATEGORY_GENERAL,
				glowstoneSpawnMaxY, 0, 127,
				"Maximum Y level for the mod's glowstone to spawn at.");
		glowstoneSpawnChance = cfg.getInt("Chance for glowstone to spawn",
				CATEGORY_GENERAL, glowstoneSpawnChance, 0, 8,
				"Chance for colored glowstone to spawn naturally.");
		glowstoneSpawnVeinSize = cfg.getInt("Glowstone Vein Size",
				CATEGORY_GENERAL, glowstoneSpawnVeinSize, 0, 64, "Multiplier.");
		//Each glowstone type
		disableGlowstoneRedGen = cfg.getBoolean(
				"Disable World Generation of Red Glowstone",
				CATEGORY_GENERATION, disableGlowstoneRedGen,
				"Set to true to disable Red Glowstone from generating.");
		disableGlowstoneWhiteGen = cfg.getBoolean(
				"Disable World Generation of White Glowstone",
				CATEGORY_GENERATION, disableGlowstoneWhiteGen,
				"Set to true to disable White Glowstone from generating.");
		disableGlowstonePurpleGen = cfg.getBoolean(
				"Disable World Generation of Purple Glowstone",
				CATEGORY_GENERATION, disableGlowstonePurpleGen,
				"Set to true to disable Purple Glowstone from generating.");
		disableGlowstonePinkGen = cfg.getBoolean(
				"Disable World Generation of Pink Glowstone",
				CATEGORY_GENERATION, disableGlowstonePinkGen,
				"Set to true to disable Pink Glowstone from generating.");
		disableGlowstoneOrangeGen = cfg.getBoolean(
				"Disable World Generation of Orange Glowstone",
				CATEGORY_GENERATION, disableGlowstoneOrangeGen,
				"Set to true to disable Orange Glowstone from generating.");
		disableGlowstoneMagentaGen = cfg.getBoolean(
				"Disable World Generation of Magenta Glowstone",
				CATEGORY_GENERATION, disableGlowstoneMagentaGen,
				"Set to true to disable Magenta Glowstone from generating.");
		disableGlowstoneLimeGen = cfg.getBoolean(
				"Disable World Generation of Lime Glowstone",
				CATEGORY_GENERATION, disableGlowstoneLimeGen,
				"Set to true to disable Lime Glowstone from generating.");
		disableGlowstoneLightGrayGen = cfg.getBoolean(
				"Disable World Generation of Light Gray Glowstone",
				CATEGORY_GENERATION, disableGlowstoneLightGrayGen,
				"Set to true to disable Light Gray Glowstone from generating.");
		disableGlowstoneLightBlueGen = cfg.getBoolean(
				"Disable World Generation of Light Blue Glowstone",
				CATEGORY_GENERATION, disableGlowstoneLightBlueGen,
				"Set to true to disable Light Blue Glowstone from generating.");
		disableGlowstoneGreenGen = cfg.getBoolean(
				"Disable World Generation of Green Glowstone",
				CATEGORY_GENERATION, disableGlowstoneGreenGen,
				"Set to true to disable Green Glowstone from generating.");
		disableGlowstoneGrayGen = cfg.getBoolean(
				"Disable World Generation of Gray Glowstone",
				CATEGORY_GENERATION, disableGlowstoneWhiteGen,
				"Set to true to disable Gray Glowstone from generating.");
		disableGlowstoneCyanGen = cfg.getBoolean(
				"Disable World Generation of Cyan Glowstone",
				CATEGORY_GENERATION, disableGlowstoneCyanGen,
				"Set to true to disable Cyan Glowstone from generating.");
		disableGlowstoneBrownGen = cfg.getBoolean(
				"Disable World Generation of Brown Glowstone",
				CATEGORY_GENERATION, disableGlowstoneBrownGen,
				"Set to true to disable Brown Glowstone from generating.");
		disableGlowstoneBlueGen = cfg.getBoolean(
				"Disable World Generation of Blue Glowstone",
				CATEGORY_GENERATION, disableGlowstoneBlueGen,
				"Set to true to disable Blue Glowstone from generating.");
		disableGlowstoneBlackGen = cfg.getBoolean(
				"Disable World Generation of Black Glowstone",
				CATEGORY_GENERATION, disableGlowstoneBlackGen,
				"Set to true to disable Black Glowstone from generating.");
		//Mod integrations
		disableAlbedo = cfg.getBoolean("Disable colored lighting when Albedo is available?",
				CATEGORY_INTEGRATION, disableAlbedo, "Set to true to disable colored lighting.");
	}
}
