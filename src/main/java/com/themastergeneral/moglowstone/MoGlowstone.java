package com.themastergeneral.moglowstone;

import com.themastergeneral.moglowstone.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoGlowstone.MODID, name = MoGlowstone.MODNAME, version = MoGlowstone.VERSION)
public class MoGlowstone 
{

    public static final String MODID = "moglowstone";
    public static final String MODNAME = "Mo' Glowstone";
    public static final String VERSION = "1.0.2";
        
    @Instance
    public static MoGlowstone instance = new MoGlowstone();
    
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
