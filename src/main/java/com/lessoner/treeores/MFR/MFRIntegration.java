package com.lessoner.treeores.MFR;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.IC2.Blocks.TreeOresIC2Blocks;
import com.lessoner.treeores.IC2.TreeOresIC2;
import com.lessoner.treeores.TConstruct.Blocks.TreeOresTCBlocks;
import com.lessoner.treeores.Thaumcraft.Blocks.TreeOresTHCBlocks;
import cpw.mods.fml.common.Loader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import powercrystals.minefactoryreloaded.api.FactoryRegistry;

/**
 * Created by P8 on 13-Dec-15.
 */
public class MFRIntegration {

    public static void Integrate(){
        registerPlantable(TreeOresBlocks.TreeOresSaplings1);
        registerPlantable(TreeOresBlocks.TreeOresSaplings2);
        registerPlantable(TreeOresBlocks.TreeOresSaplings3);
        registerPlantable(TreeOresBlocks.TreeOresBossSaplings1);
        registerPlantable(TreeOresBlocks.TreeOresBossSaplings2);
        registerPlantable(TreeOresBlocks.TreeOresBossSaplings3);
        registerHarvestableTree(TreeOresBlocks.TreeOresLogs1);
        registerHarvestableTree(TreeOresBlocks.TreeOresLogs2);
        registerHarvestableTree(TreeOresBlocks.TreeOresLogs3);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresLeaves1);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresLeaves2);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresLeaves3);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresBossLeaves1);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresBossLeaves2);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresBossLeaves3);

        if(Loader.isModLoaded("IC2")){
            registerPlantable(TreeOresIC2Blocks.TreeOresIC2Saplings);
            registerPlantable(TreeOresIC2Blocks.TreeOresIC2BossSaplings);
            registerHarvestableTree(TreeOresIC2Blocks.TreeOresIC2Logs);
            registerHarvestableLeaf(TreeOresIC2Blocks.TreeOresIC2Leaves);
            registerHarvestableLeaf(TreeOresIC2Blocks.TreeOresIC2BossLeaves);
        }
        if(Loader.isModLoaded("TConstruct")){
            registerPlantable(TreeOresTCBlocks.TreeOresTCSaplings);
            registerPlantable(TreeOresTCBlocks.TreeOresTCBossSaplings);
            registerHarvestableTree(TreeOresTCBlocks.TreeOresTCLogs);
            registerHarvestableLeaf(TreeOresTCBlocks.TreeOresTCLeaves);
            registerHarvestableLeaf(TreeOresTCBlocks.TreeOresTCBossLeaves);
        }
        if(Loader.isModLoaded("Thaumcraft")){
            registerPlantable(TreeOresTHCBlocks.TreeOresTHCSaplings1);
            registerPlantable(TreeOresTHCBlocks.TreeOresTHCBossSaplings1);
            registerHarvestableTree(TreeOresTHCBlocks.TreeOresTHCLogs1);
            registerHarvestableLeaf(TreeOresTHCBlocks.TreeOresTHCLeaves1);
            registerHarvestableLeaf(TreeOresTHCBlocks.TreeOresTHCBossLeaves1);
            registerPlantable(TreeOresTHCBlocks.TreeOresTHCSaplings2);
            registerPlantable(TreeOresTHCBlocks.TreeOresTHCBossSaplings2);
            registerHarvestableTree(TreeOresTHCBlocks.TreeOresTHCLogs2);
            registerHarvestableLeaf(TreeOresTHCBlocks.TreeOresTHCLeaves2);
            registerHarvestableLeaf(TreeOresTHCBlocks.TreeOresTHCBossLeaves2);
        }

        registerPlantable(TreeOresBlocks.TreeOresSaplings2);
        registerPlantable(TreeOresBlocks.TreeOresSaplings3);
        registerPlantable(TreeOresBlocks.TreeOresBossSaplings1);
        registerPlantable(TreeOresBlocks.TreeOresBossSaplings2);
        registerPlantable(TreeOresBlocks.TreeOresBossSaplings3);
        registerHarvestableTree(TreeOresBlocks.TreeOresLogs1);
        registerHarvestableTree(TreeOresBlocks.TreeOresLogs2);
        registerHarvestableTree(TreeOresBlocks.TreeOresLogs3);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresLeaves1);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresLeaves2);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresLeaves3);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresBossLeaves1);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresBossLeaves2);
        registerHarvestableLeaf(TreeOresBlocks.TreeOresBossLeaves3);
    }

    public static void registerPlantable(Block block)
    {
        FactoryRegistry.sendMessage("registerPlantable", new TreeOrestPlantable(Item.getItemFromBlock(block)));
    }
    public static void registerHarvestableTree(Block block)
    {
        FactoryRegistry.sendMessage("registerHarvestable", new TreeOresHarvestableTree(block));
    }
    public static void registerHarvestableLeaf(Block block)
    {
        FactoryRegistry.sendMessage("registerHarvestable", new TreeOresHarvestableLeaf(block));
    }
}
