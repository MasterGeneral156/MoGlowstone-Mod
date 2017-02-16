package com.themastergeneral.moglowstone.config;

import org.apache.logging.log4j.Level;

import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstone.proxy.CommonProxy;

import scala.Int;
import net.minecraftforge.common.config.Configuration;

public class Config 
{
    private static final String CATEGORY_GENERAL = "General";

    // This values below you can access elsewhere in your mod:
    public static boolean disableGlowstoneGen = false;
    public static boolean disableGlowstoneCrf = false;
    public static boolean disableGlowstoneFuel = false;
    public static boolean disableGlowstone = false;
    public static boolean disableDoubleOutput = false;
    public static int glowstoneSpawnMinY = 1;
    public static int glowstoneSpawnMaxY = 127;
    public static int glowstoneSpawnChance = 1;
    public static int glowstoneSpawnVeinSize = 1;
    public static String ModVersion = MoGlowstone.VERSION+"-1.10.2";

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
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
            MoGlowstone.logger.log(Level.ERROR, "Problem loading config file!", e1);
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
        ModVersion = cfg.getString("ModVersion", CATEGORY_GENERAL, ModVersion, "Internal. Don't need to mess with this.");
        disableGlowstoneGen = cfg.getBoolean("Disable World Generation of Colored Glowstone", CATEGORY_GENERAL, disableGlowstoneGen, "Set to true to disable colored glowstone from spawning in the nether.");
        disableGlowstoneCrf = cfg.getBoolean("Disable crafting of Colored Glowstone", CATEGORY_GENERAL, disableGlowstoneCrf, "Set to true to disable crafting colored glowstone.");
        disableGlowstoneFuel = cfg.getBoolean("Disable Glowstone Fuel", CATEGORY_GENERAL, disableGlowstoneFuel, "Set to true to disable crafting the glowstone fuel.");
        disableGlowstone = cfg.getBoolean("Disable Glowstone Dust Crafting Recipe", CATEGORY_GENERAL, disableGlowstone, "Set to true to disable crafting the glowstone dust.");
        disableDoubleOutput = cfg.getBoolean("Disable using glowstone fuel for double output", CATEGORY_GENERAL, disableDoubleOutput, "Set to true to disable double output on items that use glowstone fuel.");
        glowstoneSpawnMinY = cfg.getInt("Minimum Y level for glowstone to spawn at.", CATEGORY_GENERAL, glowstoneSpawnMinY, 0, 127, "Minimum Y level for the mod's glowstone to spawn at.");
        glowstoneSpawnMaxY = cfg.getInt("Maximum Y level for glowstone to spawn at.", CATEGORY_GENERAL, glowstoneSpawnMaxY, 0, 127, "Maximum Y level for the mod's glowstone to spawn at.");
        glowstoneSpawnChance = cfg.getInt("Chance for glowstone to spawn", CATEGORY_GENERAL, glowstoneSpawnChance, 0, 8, "Chance for colored glowstone to spawn naturally.");
        glowstoneSpawnVeinSize = cfg.getInt("Glowstone Vein Size", CATEGORY_GENERAL, glowstoneSpawnVeinSize, 0, 64, "Multiplier.");
    }
}
