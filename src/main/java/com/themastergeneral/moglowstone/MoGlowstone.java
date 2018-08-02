package com.themastergeneral.moglowstone;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.moglowstone.proxy.CommonProxy;
import com.themastergeneral.moglowstone.proxy.client.CreativeTab;

@Mod(modid = MoGlowstone.MODID, name = MoGlowstone.MODNAME, certificateFingerprint = MoGlowstone.Fingerprint, version = MoGlowstone.VERSION, dependencies = MoGlowstone.DEPENDENCIES, updateJSON = MoGlowstone.updateJSON, acceptedMinecraftVersions = MoGlowstone.acceptedMinecraftVersions)
public class MoGlowstone {

	public static final String MODID = "moglowstone";
	public static final String MODNAME = "Mo' Glowstone";
	public static final String VERSION = "1.5.5";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.2,];after:albedo";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/Mo-Glowstone.json";
	public static final String acceptedMinecraftVersions = "1.12.2";
	public static final String Fingerprint = "b50fe22651b9d97d9d6631514a6a57cd6174b0dc";

	public static final CreativeTab creativeTab = new CreativeTab();

	@Instance
	public static MoGlowstone instance = new MoGlowstone();
	public static Logger logger;

	@SidedProxy(clientSide = "com.themastergeneral.moglowstone.proxy.ClientProxy", serverSide = "com.themastergeneral.moglowstone.proxy.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Mo' Glowstone is gonna brighten your world up!");
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		logger.info("Your world wills shine bright now, thanks to Mo' Glowstone!");
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for Mo' Glowstone! TheMasterGeneral will not support this version!");
	}
}
