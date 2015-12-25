package com.lessoner.treeores.Thaumcraft;

import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.References;
import com.lessoner.treeores.Thaumcraft.Blocks.TreeOresTHCBlocks;
import com.lessoner.treeores.Thaumcraft.Items.TreeOresTHCItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Anguarmas on 10/2/2015.
 */
public class TreeOresTHCRecipes {
    public static void addRecipes() {
        addTreeOresTHCLog1Recipes();
        addTreeOresTHCLog2Recipes();
        addTreeOresTHCChopsRecipes();
        addTreeOresTHCSpawnerRecipes();
        addTreeOresTHCSaplingRecipes();
    }

    private static void addTreeOresTHCLog1Recipes() {

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 1, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 2, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 3, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 4, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 5, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 6, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 7, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 8, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 1, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 2, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 3, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 4, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 5, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 6, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 7, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 8, 0), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 1, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 2, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 3, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 4, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 5, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 6, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 7, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 8, 1), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 1, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 2, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 3, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 4, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 5, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 6, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 7, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 8, 2), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
    }

    private static void addTreeOresTHCLog2Recipes() {

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 1, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 2, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 3, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 4, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 5, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 6, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 7, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 8, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 2)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 1, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 2, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 3, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 4, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 5, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 6, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 7, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 8, 4), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 1, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 2, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 3, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 4, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 5, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 6, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 7, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemShard"), 8, 5), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 1, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 2, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 3, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 4, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 5, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 6, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 7, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});

        GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findItem("Thaumcraft", "ItemResource"), 8, 3), new Object[]{new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new ItemStack(TreeOresItems.TreeOresTransformers, 1, 0)});
    }

    private static void addTreeOresTHCChopsRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops1, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops1, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops1, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops1, 1, 3)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops2, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 1), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops2, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops2, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCItems.TreeOresTHCChops2, 1, 3)});
    }

    private static void addTreeOresTHCSaplingRecipes() {
        if (References.thaumiumTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings1, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "blockCosmeticSolid"), 1, 4), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.airTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings1, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "blockCrystal"), 1, 0), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.fireTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings1, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "blockCrystal"), 1, 1), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.waterTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings1, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "blockCrystal"), 1, 2), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.earthTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings2, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "blockCrystal"), 1, 3), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.orderTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings2, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "blockCrystal"), 1, 4), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.entropyTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings2, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "blockCrystal"), 1, 5), Character.valueOf('S'), "treeSapling"}));
        }
        if (References.cinnabarTree) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresTHCBlocks.TreeOresTHCSaplings2, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(GameRegistry.findBlock("Thaumcraft", "itemResource"), 1, 3), Character.valueOf('S'), "treeSapling"}));
        }
    }

    private static void addTreeOresTHCSpawnerRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners1, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners1, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners1, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 2), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners1, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs1, 1, 3), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners2, 1, 0), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 0), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners2, 1, 1), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 1), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners2, 1, 2), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 2), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TreeOresTHCItems.TreeOresTHCBossSpawners2, 1, 3), new Object[]{"XXX", "XSX", "XXX", Character.valueOf('X'), new ItemStack(TreeOresTHCBlocks.TreeOresTHCLogs2, 1, 3), Character.valueOf('S'), new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 1)});
    }
}
