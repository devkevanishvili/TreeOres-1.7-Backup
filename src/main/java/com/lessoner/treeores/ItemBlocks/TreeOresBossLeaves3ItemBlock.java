package com.lessoner.treeores.ItemBlocks;

import com.lessoner.treeores.Blocks.TreeOresLogs3;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Anguarmas on 9/23/2015.
 */
public class TreeOresBossLeaves3ItemBlock extends ItemBlock {

    public TreeOresBossLeaves3ItemBlock(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresLogs3.types.length)) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + TreeOresLogs3.types[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
