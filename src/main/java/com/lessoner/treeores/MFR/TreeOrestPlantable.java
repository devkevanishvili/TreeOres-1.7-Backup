package com.lessoner.treeores.MFR;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import powercrystals.minefactoryreloaded.api.IFactoryPlantable;
import powercrystals.minefactoryreloaded.api.ReplacementBlock;

/**
 * Created by P8 on 05-Dec-15.
 */
public class TreeOrestPlantable implements IFactoryPlantable {

    private Item seed;

    public TreeOrestPlantable(Item seed){
        this.seed = seed;
    }

    @Override
    public Item getSeed() {
        return this.seed;
    }

    @Override
    public boolean canBePlanted(ItemStack stack, boolean forFermenting) {
        return true;
    }

    @Override
    public ReplacementBlock getPlantedBlock(World world, int x, int y, int z, ItemStack stack) {
        ReplacementBlock rb = new ReplacementBlock(this.seed);
        rb.setMeta(true);
        return rb;
    }

    @Override
    public boolean canBePlantedHere(World world, int x, int y, int z, ItemStack stack) {
        Block plant = Block.getBlockFromItem(this.seed);
        if ((!world.isAirBlock(x, y, z)) || (plant == null)) {
            return false;
        }
        Block ground = world.getBlock(x, y - 1, z);

        boolean correctGround = (ground != null) && ((ground.equals(Blocks.dirt)) || (ground.equals(Blocks.grass)));
        boolean canPlace = (plant.canPlaceBlockAt(world, x, y, z)) && (plant.canReplace(world, x, y, z, 0, stack));
        return (correctGround) && (canPlace);
    }

    @Override
    public void prePlant(World world, int x, int y, int z, ItemStack stack) {
    }

    @Override
    public void postPlant(World world, int x, int y, int z, ItemStack stack) {

    }
}
