//Temp class. Will merge into CTD Core.
package com.themastergeneral.moglowstone.items;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ModItemBlocks extends BlockItem
{
    public ModItemBlocks(Block blockIn)
    {
        super(blockIn, new Item.Properties().group(MoGlowstone.ITEMGROUP));
        this.setRegistryName(blockIn.getRegistryName());
    }
}
