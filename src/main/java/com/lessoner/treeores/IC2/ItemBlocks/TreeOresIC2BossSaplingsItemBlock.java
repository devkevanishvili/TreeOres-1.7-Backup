package com.lessoner.treeores.IC2.ItemBlocks;

import com.lessoner.treeores.IC2.Blocks.TreeOresIC2Logs;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2BossSaplingsItemBlock extends ItemBlockWithMetadata {

    public TreeOresIC2BossSaplingsItemBlock(Block block) {
        super(block, block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresIC2Logs.types.length)) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + TreeOresIC2Logs.types[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}

