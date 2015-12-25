package com.lessoner.treeores.ItemBlocks;

import com.lessoner.treeores.Blocks.TreeOresLogs2;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

/**
 * Created by Anguarmas on 9/23/2015.
 */
public class TreeOresBossSaplings2ItemBlock extends ItemBlockWithMetadata {

    public TreeOresBossSaplings2ItemBlock(Block block) {
        super(block, block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresLogs2.types.length)) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + TreeOresLogs2.types[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
