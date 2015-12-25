package com.lessoner.treeores;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.Items.TreeOresItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresCrafting {

    public static void addRecipes() {
        addTreeOresLogs1Recipes();
        addTreeOresLogs2Recipes();
        addTreeOresLogs3Recipes();
        addTransformerRecipes();
        addSaplingRecipes();
        addChopRecipes();
        addSpawnerPartRecipes();
        addSpawnerRecipes();
        addNormalAppleRecipes();
        addEnchantedAppleRecipes();
    }

    private static void addTreeOresLogs1Recipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
    }

    private static void addTreeOresLogs2Recipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 4, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 5, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 6, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 7, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 8, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});
    }

    private static void addTreeOresLogs3Recipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 1), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 2), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 3), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 4), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 5), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 6), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 7), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 8), new Object[]{new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1)});
    }

    private static void addTransformerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0), new Object[]{new ItemStack(Items.iron_ingot), new ItemStack(Items.gold_ingot), new ItemStack(Items.coal), new ItemStack(Items.redstone), new ItemStack(Items.diamond), new ItemStack(Items.emerald), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.iron_sword), new ItemStack(Items.slime_ball)});

        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.TreeOresTransformers, 1, 1), new Object[]{new ItemStack(Items.glowstone_dust), new ItemStack(Items.experience_bottle), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2), new Object[]{new ItemStack(Items.emerald), new ItemStack(Items.emerald), new ItemStack(Items.emerald), new ItemStack(Items.emerald), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
    }

    private static void addSaplingRecipes() {
        if (References.ironTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.iron_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.goldTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.gold_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.coalTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.coal_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.redstoneTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.redstone_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.diamondTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.diamond_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.emeraldTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.emerald_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.lapisTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.lapis_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.obsidianTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.obsidian, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.quartzTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.quartz_block, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.glowstoneTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), Blocks.glowstone, Character.valueOf('S'), "treeSapling"}));
        }
        if (References.xpTree) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, 2), new Object[]{new ItemStack(Items.string), new ItemStack(Items.spider_eye), new ItemStack(Items.rotten_flesh), new ItemStack(Items.gunpowder), new ItemStack(Items.bone), new ItemStack(Items.diamond_sword), new ItemStack(Items.bow), new ItemStack(Items.arrow), "treeSapling"}));
        }
    }

    private static void addSpawnerPartRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1), new Object[]{new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 0), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 0), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 0), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 0)});
    }

    private static void addSpawnerRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners1, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners1, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners1, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners1, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners2, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners2, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners2, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners2, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners3, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners3, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresBossSpawners3, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});
    }

    private static void addChopRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops1, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops1, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops1, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops1, 1, 3)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops2, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops2, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops2, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops2, 1, 3)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops3, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops3, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresItems.TreeOresChops3, 1, 2)});
    }

    private static void addNormalAppleRecipes(){
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples1, 1, 0), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples1, 1, 1), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples1, 1, 2), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples2, 1, 0), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples2, 1, 1), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples2, 1, 2), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples2, 1, 3), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples3, 1, 0), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples3, 1, 1), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresNormalApples3, 1, 2), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 0)});
    }

    private static void addEnchantedAppleRecipes(){
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples1, 1, 0), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples1, 1, 1), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples1, 1, 2), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples2, 1, 0), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples2, 1, 1), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples2, 1, 2), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples2, 1, 3), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples3, 1, 0), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples3, 1, 1), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TreeOresItems.TreeOresEnchantedApples3, 1, 2), new Object[]{"XXX", "XZX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), Character.valueOf('Z'), new ItemStack(Items.golden_apple, 1, 1)});
    }
}
