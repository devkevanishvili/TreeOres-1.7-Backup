package com.lessoner.treeores.TConstruct;

import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.References;
import com.lessoner.treeores.TConstruct.Blocks.TreeOresTCBlocks;
import com.lessoner.treeores.TConstruct.Items.TreeOresTCItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Anguarmas on 9/29/2015.
 */
public class TreeOresTCRecipes {

    public static void addRecipes() {
        addTreeOresTCLogRecipes();
        addTreeOresTCSaplingRecipes();
        addTreeOresTCChopsRecipes();
        addTreeOresTCSpawnerRecipes();
    }

    private static void addTreeOresTCLogRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 1, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 2, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 3, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 4, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 5, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 6, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 7, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 8, 4), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 1, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 2, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 3, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 4, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 5, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 6, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 7, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 8, 3), new Object[]{new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});
    }

    private static void addTreeOresTCChopsRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTCItems.TreeOresTCChops, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTCItems.TreeOresTCChops, 1, 1)});

    }

    private static void addTreeOresTCSaplingRecipes() {
        if (References.arditeTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTCBlocks.TreeOresTCSaplings, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("TConstruct", "MetalBlock"),1,1), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.cobaltTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTCBlocks.TreeOresTCSaplings, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("TConstruct", "MetalBlock"),1,0), Character.valueOf('S'), "treeSapling"}));
        }

    }

    private static void addTreeOresTCSpawnerRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresTCItems.TreeOresTCBossSpawners, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTCItems.TreeOresTCBossSpawners, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTCBlocks.TreeOresTCLogs, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

    }
}
