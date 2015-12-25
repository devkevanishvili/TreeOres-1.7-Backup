package com.lessoner.treeores.IC2;

import com.lessoner.treeores.IC2.Blocks.TreeOresIC2Blocks;
import com.lessoner.treeores.IC2.Items.TreeOresIC2Items;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2Recipes {

    public static void addRecipes() {
        addTreeOresIC2LogRecipes();
        addTreeOresIC2SaplingRecipes();
        addTreeOresIC2ChopsRecipes();
        addTreeOresIC2SpawnerRecipes();
    }

    private static void addTreeOresIC2LogRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 1, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 2, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 3, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 4, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 5, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 6, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 7, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 8, 0), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 1, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 2, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 3, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 4, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 5, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 6, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 7, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 8, 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 1), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 2), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 3), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 4), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 6), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 7), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemUran238"), 8), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 1, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 2, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 3, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 4, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 5, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 6, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 7, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 8, 5), new Object[]{new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
    }

    private static void addTreeOresIC2ChopsRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Items.TreeOresIC2Chops, 1, 3)});
    }

    private static void addTreeOresIC2SaplingRecipes() {
        if (References.copperTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "blockMetal"), 1, 0), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.tinTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "blockMetal"), 1, 1), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.uraniumTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "blockMetal"), 1, 3), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.leadTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresIC2Blocks.TreeOresIC2Saplings, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("IC2", "blockMetal"), 1, 4), Character.valueOf('S'), "treeSapling"}));
        }
    }

    private static void addTreeOresIC2SpawnerRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 2), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresIC2Items.TreeOresIC2BossSpawners, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresIC2Blocks.TreeOresIC2Logs, 1, 3), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});
    }
}
