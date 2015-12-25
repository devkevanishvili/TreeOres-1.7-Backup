package com.lessoner.treeores.IC2;

import com.lessoner.treeores.IC2.Blocks.TreeOresIC2Blocks;
import com.lessoner.treeores.IC2.Items.TreeOresIC2Items;
import com.lessoner.treeores.References;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2 {

    public static void preInit() {
        TreeOresIC2Items.init();
        TreeOresIC2Blocks.init();
    }

    public static void init() {
        TreeOresIC2Blocks.registerBlocks();
        TreeOresIC2Items.registerItems();
        OreDict();
        TreeOresIC2Recipes.addRecipes();

    }

    private static void OreDict() {
        for (int i = 0; i < 4; i++) {
            OreDictionary.registerOre(References.oreDictIC2Leaves, new ItemStack(TreeOresIC2Blocks.TreeOresIC2Leaves, 1, i));
            OreDictionary.registerOre(References.oreDictIC2Leaves, new ItemStack(TreeOresIC2Blocks.TreeOresIC2BossLeaves, 1, i));
            OreDictionary.registerOre(References.oreDictIC2Logs, new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, i));
            OreDictionary.registerOre(References.oreDictIC2Saplings, new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, i));
            OreDictionary.registerOre(References.oreDictIC2Saplings, new ItemStack(TreeOresIC2Blocks.TreeOresIC2BossSaplings, 1, i));

        }
    }
}
