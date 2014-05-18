package raulscraft.common.creativetab;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import raulscraft.common.RaulsCraft;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabRaulsCraft extends CreativeTabs
{
    public CreativeTabRaulsCraft()
    {
        super("raulscraft");
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(RaulsCraft.blockBlueStone);
    }
}
