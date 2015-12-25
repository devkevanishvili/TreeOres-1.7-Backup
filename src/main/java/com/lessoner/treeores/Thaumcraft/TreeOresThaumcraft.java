package com.lessoner.treeores.Thaumcraft;

import com.lessoner.treeores.References;
import com.lessoner.treeores.Thaumcraft.Blocks.TreeOresTHCBlocks;
import com.lessoner.treeores.Thaumcraft.Items.TreeOresTHCItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Anguarmas on 9/30/2015.
 */
public class TreeOresThaumcraft {

    public static void preInit() {
        TreeOresTHCBlocks.init();
        TreeOresTHCItems.init();
    }

    public static void init() {
        TreeOresTHCBlocks.registerBlocks();
        TreeOresTHCItems.registerItems();
        oreDict();
        TreeOresTHCRecipes.addRecipes();
    }

    private static void oreDict() {
        for (int i = 0; i < 4; i++) {
            OreDictionary.registerOre(References.oreDictTHCLeaves, new ItemStack(TreeOresTHCBlocks.TreeOresTHCLeaves1, 1, i));
            OreDictionary.registerOre(References.oreDictTHCLeaves, new ItemStack(TreeOresTHCBlocks.TreeOresTHCBossLeaves1, 1, i));
            OreDictionary.registerOre(References.oreDictTHCLeaves, new ItemStack(TreeOresTHCBlocks.TreeOresTHCLeaves2, 1, i));
            OreDictionary.registerOre(References.oreDictTHCLeaves, new ItemStack(TreeOresTHCBlocks.TreeOresTHCBossLeaves2, 1, i));
            OreDictionary.registerOre(References.oreDictTHCLogs, new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, i));
            OreDictionary.registerOre(References.oreDictTHCLogs, new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, i));
            OreDictionary.registerOre(References.oreDictTHCSaplings, new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings1, 1, i));
            OreDictionary.registerOre(References.oreDictTHCSaplings, new ItemStack(TreeOresTHCBlocks.TreeOresTHCBossSaplings1, 1, i));
            OreDictionary.registerOre(References.oreDictTHCSaplings, new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings2, 1, i));
            OreDictionary.registerOre(References.oreDictTHCSaplings, new ItemStack(TreeOresTHCBlocks.TreeOresTHCBossSaplings2, 1, i));

        }
    }


}
