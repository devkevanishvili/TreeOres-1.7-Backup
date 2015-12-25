package com.lessoner.treeores.TConstruct;

import com.lessoner.treeores.References;
import com.lessoner.treeores.TConstruct.Blocks.TreeOresTCBlocks;
import com.lessoner.treeores.TConstruct.Items.TreeOresTCItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Anguarmas on 9/29/2015.
 */
public class TreeOresTConstruct {

    public static void preInit(){
        TreeOresTCBlocks.init();
        TreeOresTCItems.init();
    }

    public static void init(){
        TreeOresTCBlocks.registerBlocks();
        TreeOresTCItems.registerItems();
        oreDict();
        TreeOresTCRecipes.addRecipes();
    }

    private static void oreDict(){
        for (int i = 0; i < 2; i++) {
            OreDictionary.registerOre(References.oreDictTCLeaves, new ItemStack(TreeOresTCBlocks.TreeOresTCLeaves, 1, i));
            OreDictionary.registerOre(References.oreDictTCLeaves, new ItemStack(TreeOresTCBlocks.TreeOresTCBossLeaves, 1, i));
            OreDictionary.registerOre(References.oreDictTCLogs, new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, i));
            OreDictionary.registerOre(References.oreDictTCSaplings, new ItemStack(TreeOresTCBlocks.TreeOresTCSaplings, 1, i));
            OreDictionary.registerOre(References.oreDictTCSaplings, new ItemStack(TreeOresTCBlocks.TreeOresTCBossSaplings, 1, i));
        }
    }
}
