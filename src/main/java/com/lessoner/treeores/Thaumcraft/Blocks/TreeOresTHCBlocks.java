package com.lessoner.treeores.Thaumcraft.Blocks;

import com.lessoner.treeores.Thaumcraft.ItemBlocks.*;
import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * Created by Anguarmas on 10/1/2015.
 */
public class TreeOresTHCBlocks {

    public static Block TreeOresTHCLogs1;
    public static Block TreeOresTHCLogs2;

    public static Block TreeOresTHCLeaves1;
    public static Block TreeOresTHCLeaves2;

    public static Block TreeOresTHCSaplings1;
    public static Block TreeOresTHCSaplings2;

    public static Block TreeOresTHCBossLeaves1;
    public static Block TreeOresTHCBossLeaves2;

    public static Block TreeOresTHCBossSaplings1;
    public static Block TreeOresTHCBossSaplings2;

    public static void init() {

        TreeOresTHCLogs1 = new TreeOresTHCLogs1().setBlockName("tthclogs1").setBlockTextureName("tthclogs").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTHCLogs2 = new TreeOresTHCLogs2().setBlockName("tthclogs2").setBlockTextureName("tthclogs").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresTHCLeaves1 = new TreeOresTHCLeaves1().setBlockName("tthcleaves1").setBlockTextureName("tthcleaves").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTHCLeaves2 = new TreeOresTHCLeaves2().setBlockName("tthcleaves2").setBlockTextureName("tthcleaves").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresTHCSaplings1 = new TreeOresTHCSaplings1().setBlockName("tthcsaplings1").setBlockTextureName("tthcsaplings").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTHCSaplings2 = new TreeOresTHCSaplings2().setBlockName("tthcsaplings2").setBlockTextureName("tthcsaplings").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresTHCBossLeaves1 = new TreeOresTHCBossLeaves1().setBlockName("bthcleaves1").setBlockTextureName("tthcleaves").setCreativeTab(null);
        TreeOresTHCBossLeaves2 = new TreeOresTHCBossLeaves2().setBlockName("bthcleaves2").setBlockTextureName("tthcleaves").setCreativeTab(null);

        TreeOresTHCBossSaplings1 = new TreeOresTHCBossSaplings1().setBlockName("bthcsaplings1").setBlockTextureName("tthcsaplings").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTHCBossSaplings2 = new TreeOresTHCBossSaplings2().setBlockName("bthcsaplings2").setBlockTextureName("tthcsaplings").setCreativeTab(TreeOresMod.treeOresTab);


    }

    public static void registerBlocks() {

        GameRegistry.registerBlock(TreeOresTHCLogs1, TreeOresTHCLogs1ItemBlock.class, TreeOresTHCLogs1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTHCLogs2, TreeOresTHCLogs2ItemBlock.class, TreeOresTHCLogs2.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresTHCLeaves1, TreeOresTHCLeaves1ItemBlock.class, TreeOresTHCLeaves1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTHCLeaves2, TreeOresTHCLeaves2ItemBlock.class, TreeOresTHCLeaves2.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresTHCSaplings1, TreeOresTHCSaplings1ItemBlock.class, TreeOresTHCSaplings1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTHCSaplings2, TreeOresTHCSaplings2ItemBlock.class, TreeOresTHCSaplings2.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresTHCBossLeaves1, TreeOresTHCBossLeaves1ItemBlock.class, TreeOresTHCBossLeaves1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTHCBossLeaves2, TreeOresTHCBossLeaves2ItemBlock.class, TreeOresTHCBossLeaves2.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresTHCBossSaplings1, TreeOresTHCBossSaplings1ItemBlock.class, TreeOresTHCBossSaplings1.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTHCBossSaplings2, TreeOresTHCBossSaplings2ItemBlock.class, TreeOresTHCBossSaplings2.getUnlocalizedName());
        Blocks.fire.setFireInfo(TreeOresTHCLogs1, 5, 5);
        Blocks.fire.setFireInfo(TreeOresTHCLeaves1, 30, 60);
        Blocks.fire.setFireInfo(TreeOresTHCBossLeaves1, 30, 60);
        Blocks.fire.setFireInfo(TreeOresTHCLogs2, 5, 5);
        Blocks.fire.setFireInfo(TreeOresTHCLeaves2, 30, 60);
        Blocks.fire.setFireInfo(TreeOresTHCBossLeaves2, 30, 60);
    }
}
