//Temp class. Will merge into CTD Core.
package com.themastergeneral.moglowstone.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class ModItemBlocks extends BlockItem
{
    public ModItemBlocks(Block blockIn, Properties propertiesIn)
    {
        super(blockIn, propertiesIn);
        this.setRegistryName(blockIn.getRegistryName());
    }
}
