package com.lessoner.treeores.ItemBlocks;

import com.lessoner.treeores.Blocks.TreeOresLogs1;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

/**
 * Created by Anguarmas on 9/23/2015.
 */
public class TreeOresBossSaplings1ItemBlock extends ItemBlockWithMetadata {

    public TreeOresBossSaplings1ItemBlock(Block block) {
        super(block, block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresLogs1.types.length)) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + TreeOresLogs1.types[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
