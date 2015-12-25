package com.lessoner.treeores.TConstruct.Blocks;

import com.lessoner.treeores.TConstruct.ItemBlocks.*;
import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * Created by Anguarmas on 9/29/2015.
 */
public class TreeOresTCBlocks{

    public static Block TreeOresTCLogs;
    public static Block TreeOresTCLeaves;
    public static Block TreeOresTCSaplings;

    public static Block TreeOresTCBossLeaves;
    public static Block TreeOresTCBossSaplings;

    public static void init(){
        TreeOresTCLogs = new TreeOresTCLogs().setBlockName("ttclogs").setBlockTextureName("ttclogs").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTCLeaves = new TreeOresTCLeaves().setBlockName("ttcleaves").setBlockTextureName("ttcleaves").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTCSaplings = new TreeOresTCSaplings().setBlockName("ttcsaplings").setBlockTextureName("ttcsaplings").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresTCBossLeaves = new TreeOresTCBossLeaves().setBlockName("btcleaves").setBlockTextureName("ttcleaves").setCreativeTab(null);
        TreeOresTCBossSaplings = new TreeOresTCBossSaplings().setBlockName("btcsaplings").setBlockTextureName("ttcsaplings").setCreativeTab(TreeOresMod.treeOresTab);


    }

    public static void registerBlocks(){

        GameRegistry.registerBlock(TreeOresTCLogs, TreeOresTCLogsItemBlock.class, TreeOresTCLogs.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTCLeaves, TreeOresTCLeavesItemBlock.class, TreeOresTCLeaves.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTCSaplings, TreeOresTCSaplingsItemBlock.class, TreeOresTCSaplings.getUnlocalizedName());

        GameRegistry.registerBlock(TreeOresTCBossLeaves, TreeOresTCBossLeavesItemBlock.class, TreeOresTCBossLeaves.getUnlocalizedName());
        GameRegistry.registerBlock(TreeOresTCBossSaplings, TreeOresTCBossSaplingsItemBlock.class, TreeOresTCBossSaplings.getUnlocalizedName());
        Blocks.fire.setFireInfo(TreeOresTCLogs, 5, 5);
        Blocks.fire.setFireInfo(TreeOresTCLeaves, 30, 60);
        Blocks.fire.setFireInfo(TreeOresTCBossLeaves, 30, 60);
    }
}
