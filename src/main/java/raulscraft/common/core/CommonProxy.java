package raulscraft.common.core;

import raulscraft.common.RaulsCraft;
import raulscraft.common.block.BlockBlueStone;
import raulscraft.common.creativetab.CreativeTabRaulsCraft;

/**
 * Created by raulsmail on 18/05/2014.
 */
public class CommonProxy {
    public void initMod()
    {
        RaulsCraft.creativeTabBlocks = new CreativeTabRaulsCraft();

        RaulsCraft.blockBlueStone = (new BlockBlueStone()).setCreativeTab(RaulsCraft.creativeTabBlocks).setHardness(0.8F).setBlockName("blueStone");
    }
}
