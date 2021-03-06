package com.lessoner.treeores.Thaumcraft.ItemBlocks;

import com.lessoner.treeores.Thaumcraft.Blocks.TreeOresTHCLogs1;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresTHCSaplings1ItemBlock extends ItemBlockWithMetadata {

    public TreeOresTHCSaplings1ItemBlock(Block block) {
        super(block, block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresTHCLogs1.types.length)) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + TreeOresTHCLogs1.types[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}

