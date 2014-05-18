package raulscraft.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;

/**
 * Created by raulsmail on 18/05/2014.
 */
@Mod(modid = "RaulsCraft", name = "RaulsCraft",
        version = RaulsCraft.version)
public class RaulsCraft {
    public static final String version = "0.1.0";

    @Mod.Instance("RaulsCraft")
    public static RaulsCraft instance;

    @SidedProxy(clientSide = "raulscraft.client.core.ClientProxy", serverSide = "itfellfromthesky.common.core.CommonProxy")
    public static CommonProxy proxy;
}
