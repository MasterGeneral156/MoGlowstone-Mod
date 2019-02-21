//Temp class. Will merge into CTD Core.
package com.themastergeneral.moglowstone.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ModItemBlocks extends ItemBlock
{
    public ModItemBlocks(Block blockIn, Properties propertiesIn)
    {
        super(blockIn, propertiesIn);
        this.setRegistryName(blockIn.getRegistryName());
    }
}
