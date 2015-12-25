package com.lessoner.treeores.MFR;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import powercrystals.minefactoryreloaded.api.HarvestType;
import powercrystals.minefactoryreloaded.api.IFactoryHarvestable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by P8 on 13-Dec-15.
 */
public class TreeOresHarvestableTree implements IFactoryHarvestable {

    private Block plant;

    public TreeOresHarvestableTree(Block plant){
        this.plant = plant;
    }

    @Override
    public Block getPlant() {
        return this.plant;
    }

    @Override
    public HarvestType getHarvestType() {
        return HarvestType.Tree;
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
        return Arrays.asList(new ItemStack(plant,1,world.getBlockMetadata(x,y,z)));
    }

    @Override
    public void preHarvest(World world, int x, int y, int z) {

    }

    @Override
    public void postHarvest(World world, int x, int y, int z) {

    }
}
