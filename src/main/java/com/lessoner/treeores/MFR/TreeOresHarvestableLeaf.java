package com.lessoner.treeores.MFR;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import powercrystals.minefactoryreloaded.api.HarvestType;
import powercrystals.minefactoryreloaded.api.IFactoryHarvestable;

import java.util.*;

/**
 * Created by P8 on 13-Dec-15.
 */
public class TreeOresHarvestableLeaf implements IFactoryHarvestable {

    private Block plant;

    public TreeOresHarvestableLeaf(Block plant){
        this.plant = plant;
    }

    @Override
    public Block getPlant() {
        return this.plant;
    }

    @Override
    public HarvestType getHarvestType() {
        return HarvestType.TreeLeaf;
    }

    @Override
    public boolean breakBlock() {
        return true;
    }

    @Override
    public boolean canBeHarvested(World world, Map<String, Boolean> harvesterSettings, int x, int y, int z) {
        return true;
    }

    @Override
    public List<ItemStack> getDrops(World world, Random rand, Map<String, Boolean> harvesterSettings, int x, int y, int z) {
        if (harvesterSettings.get("silkTouch") != null && harvesterSettings.get("silkTouch"))
        {
            ArrayList<ItemStack> drops = Lists.newArrayList();
            drops.add(new ItemStack(getPlant(), 1, world.getBlockMetadata(x, y, z)));
            return drops;
        }
        else
        {
            return getPlant().getDrops(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
        }
    }

    @Override
    public void preHarvest(World world, int x, int y, int z) {

    }

    @Override
    public void postHarvest(World world, int x, int y, int z) {

    }
}
