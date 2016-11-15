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

@Mod(modid = MoGlowstone.MODID, name = MoGlowstone.MODNAME, version = MoGlowstone.VERSION)
public class MoGlowstone 
{

    public static final String MODID = "moglowstone";
    public static final String MODNAME = "Mo' Glowstone";
    public static final String VERSION = "1.0.2";
    
    public static final CreativeTab creativeTab = new CreativeTab();
    
    @Instance
    public static MoGlowstone instance = new MoGlowstone();
    
    @SidedProxy(clientSide="com.themastergeneral.moglowstone.proxy.ClientProxy", serverSide="com.themastergeneral.moglowstone.proxy.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	System.out.println("Mo' Glowstone is loading...");
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
    	System.out.println("Mo' Glowstone is loaded.");
    }
}
