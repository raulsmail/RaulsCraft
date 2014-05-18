package raulscraft.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import raulscraft.common.core.CommonProxy;

/**
 * Created by raulsmail on 18/05/2014.
 */
@Mod(modid = "RaulsCraft", name = "RaulsCraft",
        version = RaulsCraft.version)
public class RaulsCraft {
    public static final String version = "0.1.0";

    @Mod.Instance("RaulsCraft")
    public static RaulsCraft instance;

    @SidedProxy(clientSide = "raulscraft.client.core.ClientProxy", serverSide = "raulscraft.common.core.CommonProxy")
    public static CommonProxy proxy;

    private static final Logger logger = LogManager.getLogger("RaulsCraft");

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
        proxy.initMod();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void postLoad(FMLPostInitializationEvent event)
    {
    }

    public static void console(String s, boolean warning)
    {
        StringBuilder sb = new StringBuilder();
        logger.log(warning ? Level.WARN : Level.INFO, sb.append("[").append(version).append("-RaulsCraft] ").append(s).toString());
    }
}
