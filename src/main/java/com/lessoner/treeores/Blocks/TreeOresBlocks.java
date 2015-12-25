package com.lessoner.treeores.Blocks;

import com.lessoner.treeores.ItemBlocks.*;
import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * Created by Anguarmas on 9/22/2015.
 */
public class TreeOresBlocks {


    // Logs
    public static Block TreeOresLogs1;
    public static Block TreeOresLogs2;
    public static Block TreeOresLogs3;
    // Leaves
    public static Block TreeOresLeaves1;
    public static Block TreeOresLeaves2;
    public static Block TreeOresLeaves3;
    // Saplings
    public static Block TreeOresSaplings1;
    public static Block TreeOresSaplings2;
    public static Block TreeOresSaplings3;
    // Leaves
    public static Block TreeOresBossLeaves1;
    public static Block TreeOresBossLeaves2;
    public static Block TreeOresBossLeaves3;
    // Saplings
    public static Block TreeOresBossSaplings1;
    public static Block TreeOresBossSaplings2;
    public static Block TreeOresBossSaplings3;

    public static void init() {
        // Logs
        TreeOresLogs1 = new TreeOresLogs1().setBlockName("tlogs1").setBlockTextureName("tlogs").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLogs2 = new TreeOresLogs2().setBlockName("tlogs2").setBlockTextureName("tlogs").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLogs3 = new TreeOresLogs3().setBlockName("tlogs3").setBlockTextureName("tlogs").setCreativeTab(TreeOresMod.treeOresTab);
        // Leaves
        TreeOresLeaves1 = new TreeOresLeaves1().setBlockName("tleaves1").setBlockTextureName("tleaves").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLeaves2 = new TreeOresLeaves2().setBlockName("tleaves2").setBlockTextureName("tleaves").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLeaves3 = new TreeOresLeaves3().setBlockName("tleaves3").setBlockTextureName("tleaves").setCreativeTab(TreeOresMod.treeOresTab);
        // Saplings
        TreeOresSaplings1 = new TreeOresSaplings1().setBlockName("tsaplings1").setBlockTextureName("tsaplings").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresSaplings2 = new TreeOresSaplings2().setBlockName("tsaplings2").setBlockTextureName("tsaplings").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresSaplings3 = new TreeOresSaplings3().setBlockName("tsaplings3").setBlockTextureName("tsaplings").setCreativeTab(TreeOresMod.treeOresTab);
        // Leaves
        TreeOresBossLeaves1 = new TreeOresBossLeaves1().setBlockName("bleaves1").setBlockTextureName("tleaves").setCreativeTab(null);
        TreeOresBossLeaves2 = new TreeOresBossLeaves2().setBlockName("bleaves2").setBlockTextureName("tleaves").setCreativeTab(null);
        TreeOresBossLeaves3 = new TreeOresBossLeaves3().setBlockName("bleaves3").setBlockTextureName("tleaves").setCreativeTab(null);
        // Saplings
        TreeOresBossSaplings1 = new TreeOresBossSaplings1().setBlockName("bsaplings1").setBlockTextureName("tsaplings").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSaplings2 = new TreeOresBossSaplings2().setBlockName("bsaplings2").setBlockTextureName("tsaplings").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSaplings3 = new TreeOresBossSaplings3().setBlockName("bsaplings3").setBlockTextureName("tsaplings").setCreativeTab(TreeOresMod.treeOresTab);



    }

    public static void registerBlocks() {
        GameRegistry.registerBlock(TreeOresLogs1, TreeOresLogs1ItemBlock.class, TreeOresLogs1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresLogs2, TreeOresLogs2ItemBlock.class, TreeOresLogs2.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresLogs3, TreeOresLogs3ItemBlock.class, TreeOresLogs3.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresLeaves1, TreeOresLeaves1ItemBlock.class, TreeOresLeaves1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresLeaves2, TreeOresLeaves2ItemBlock.class, TreeOresLeaves2.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresLeaves3, TreeOresLeaves3ItemBlock.class, TreeOresLeaves3.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresSaplings1, TreeOresSaplings1ItemBlock.class, TreeOresSaplings1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresSaplings2, TreeOresSaplings2ItemBlock.class, TreeOresSaplings2.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresSaplings3, TreeOresSaplings3ItemBlock.class, TreeOresSaplings3.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresBossLeaves1, TreeOresBossLeaves1ItemBlock.class, TreeOresBossLeaves1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresBossLeaves2, TreeOresBossLeaves2ItemBlock.class, TreeOresBossLeaves2.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresBossLeaves3, TreeOresBossLeaves3ItemBlock.class, TreeOresBossLeaves3.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresBossSaplings1, TreeOresBossSaplings1ItemBlock.class, TreeOresBossSaplings1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresBossSaplings2, TreeOresBossSaplings2ItemBlock.class, TreeOresBossSaplings2.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresBossSaplings3, TreeOresBossSaplings3ItemBlock.class, TreeOresBossSaplings3.getUnlocalizedName());
        Blocks.fire.setFireInfo(TreeOresLogs1, 5, 5);
        Blocks.fire.setFireInfo(TreeOresLogs2, 5, 5);
        Blocks.fire.setFireInfo(TreeOresLogs3, 5, 5);
        Blocks.fire.setFireInfo(TreeOresLeaves1, 30, 60);
        Blocks.fire.setFireInfo(TreeOresLeaves2, 30, 60);
        Blocks.fire.setFireInfo(TreeOresLeaves3, 30, 60);
        Blocks.fire.setFireInfo(TreeOresBossLeaves1, 30, 60);
        Blocks.fire.setFireInfo(TreeOresBossLeaves2, 30, 60);
        Blocks.fire.setFireInfo(TreeOresBossLeaves3, 30, 60);
    }
}
