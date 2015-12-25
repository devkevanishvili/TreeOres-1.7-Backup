package com.lessoner.treeores.TConstruct.ItemBlocks;

import com.lessoner.treeores.TConstruct.Blocks.TreeOresTCLogs;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

/**
 * Created by Anguarmas on 9/29/2015.
 */
public class TreeOresTCBossSaplingsItemBlock extends ItemBlockWithMetadata {

    public TreeOresTCBossSaplingsItemBlock(Block block) {
        super(block,block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresTCLogs.types.length)) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + TreeOresTCLogs.types[i];
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
