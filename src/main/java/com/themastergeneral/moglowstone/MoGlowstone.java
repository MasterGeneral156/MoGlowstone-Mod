package com.themastergeneral.moglowstone;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.moglowstone.proxy.CommonProxy;
import com.themastergeneral.moglowstone.proxy.client.CreativeTab;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

@Mod(modid = MoGlowstone.MODID, name = MoGlowstone.MODNAME, version = MoGlowstone.VERSION, dependencies = MoGlowstone.DEPENDENCIES, acceptedMinecraftVersions = MoGlowstone.acceptedMinecraftVersions, updateJSON = MoGlowstone.updateJSON)
public class MoGlowstone 
{

    public static final String MODID = "moglowstone";
    public static final String MODNAME = "Mo' Glowstone";
    public static final String VERSION = "1.2.4";
    public static final String acceptedMinecraftVersions = "1.12";
    public static final String DEPENDENCIES = "required-after:ctdcore@[1.0.3,];";
    public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/Mo-Glowstone.json";
    
    public static final CreativeTab creativeTab = new CreativeTab();
    
    @Instance
    public static MoGlowstone instance = new MoGlowstone();
    public static Logger logger;
    
    @SidedProxy(clientSide="com.themastergeneral.moglowstone.proxy.ClientProxy", serverSide="com.themastergeneral.moglowstone.proxy.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}
