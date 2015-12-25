package com.lessoner.treeores.IC2.Blocks;

import com.lessoner.treeores.IC2.ItemBlocks.*;
import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2Blocks {

    public static Block TreeOresIC2Logs;
    public static Block TreeOresIC2Leaves;
    public static Block TreeOresIC2Saplings;
    public static Block TreeOresIC2BossLeaves;
    public static Block TreeOresIC2BossSaplings;

    public static void init() {

        TreeOresIC2Logs = new TreeOresIC2Logs().setBlockTextureName("tic2logs").setBlockName("tic2logs").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresIC2Leaves = new TreeOresIC2Leaves().setBlockTextureName("tic2leaves").setBlockName("tic2leaves").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresIC2Saplings = new TreeOresIC2Saplings().setBlockTextureName("tic2saplings").setBlockName("tic2saplings").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresIC2BossLeaves = new TreeOresIC2BossLeaves().setBlockTextureName("tic2leaves").setBlockName("bic2leaves").setCreativeTab(null);
        TreeOresIC2BossSaplings = new TreeOresIC2BossSaplings().setBlockTextureName("tic2saplings").setBlockName("bic2saplings").setCreativeTab(TreeOresMod.treeOresTab);


    }

    public static void registerBlocks() {

        GameRegistry.registerBlock(TreeOresIC2Logs, TreeOresIC2LogsItemBlock.class, TreeOresIC2Logs.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresIC2Leaves, TreeOresIC2LeavesItemBlock.class, TreeOresIC2Leaves.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresIC2Saplings, TreeOresIC2SaplingsItemBlock.class, TreeOresIC2Saplings.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresIC2BossLeaves, TreeOresIC2BossLeavesItemBlock.class, TreeOresIC2BossLeaves.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresIC2BossSaplings, TreeOresIC2BossSaplingsItemBlock.class, TreeOresIC2BossSaplings.getUnlocalizedName());
        Blocks.fire.setFireInfo(TreeOresIC2Logs, 5, 5);
        Blocks.fire.setFireInfo(TreeOresIC2Leaves, 30, 60);
        Blocks.fire.setFireInfo(TreeOresIC2BossLeaves, 30, 60);
    }
}
