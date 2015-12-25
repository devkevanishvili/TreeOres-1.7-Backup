package com.lessoner.treeores.Items;

import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Anguarmas on 9/22/2015.
 */
public class TreeOresItems {

    public static Item TreeOresChops1;
    public static Item TreeOresChops2;
    public static Item TreeOresChops3;
    public static Item TreeOresBossSpawners1;
    public static Item TreeOresBossSpawners2;
    public static Item TreeOresBossSpawners3;
    public static Item TreeOresTransformers;
    public static Item TreeOresSpawnerParts;
    public static Item TreeOresNormalApples1;
    public static Item TreeOresNormalApples2;
    public static Item TreeOresNormalApples3;
    public static Item TreeOresEnchantedApples1;
    public static Item TreeOresEnchantedApples2;
    public static Item TreeOresEnchantedApples3;

    public static void init() {

        TreeOresChops1 = new TreeOresChops1().setTextureName("tchops").setUnlocalizedName("tchops1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresChops2 = new TreeOresChops2().setTextureName("tchops").setUnlocalizedName("tchops2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresChops3 = new TreeOresChops3().setTextureName("tchops").setUnlocalizedName("tchops3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresNormalApples1 = new TreeOresNormalApples1(10,10,false).setAlwaysEdible().setTextureName("tapples").setUnlocalizedName("tapples1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresNormalApples2 = new TreeOresNormalApples2(10,10,false).setAlwaysEdible().setTextureName("tapples").setUnlocalizedName("tapples2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresNormalApples3 = new TreeOresNormalApples3(10,10,false).setAlwaysEdible().setTextureName("tapples").setUnlocalizedName("tapples3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresEnchantedApples1 = new TreeOresEnchantedApples1(10,10,false).setAlwaysEdible().setTextureName("tapples").setUnlocalizedName("bapples1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresEnchantedApples2 = new TreeOresEnchantedApples2(10,10,false).setAlwaysEdible().setTextureName("tapples").setUnlocalizedName("bapples2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresEnchantedApples3 = new TreeOresEnchantedApples3(10,10,false).setAlwaysEdible().setTextureName("tapples").setUnlocalizedName("bapples3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresBossSpawners1 = new TreeOresBossSpawners1().setTextureName("bspawner").setUnlocalizedName("bspawner1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSpawners2 = new TreeOresBossSpawners2().setTextureName("bspawner").setUnlocalizedName("bspawner2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSpawners3 = new TreeOresBossSpawners3().setTextureName("bspawner").setUnlocalizedName("bspawner3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresTransformers = new TreeOresTransformers().setTextureName("transformers").setUnlocalizedName("transformers").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresSpawnerParts = new TreeOresSpawnerParts().setTextureName("bparts").setUnlocalizedName("bparts").setCreativeTab(TreeOresMod.treeOresTab);


    }

    public static void registerItems() {
        GameRegistry.registerItem(TreeOresChops1, TreeOresChops1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresChops2, TreeOresChops2.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresChops3, TreeOresChops3.getUnlocalizedName());

        GameRegistry.registerItem(TreeOresNormalApples1, TreeOresNormalApples1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresNormalApples2, TreeOresNormalApples2.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresNormalApples3, TreeOresNormalApples3.getUnlocalizedName());

        GameRegistry.registerItem(TreeOresEnchantedApples1, TreeOresEnchantedApples1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresEnchantedApples2, TreeOresEnchantedApples2.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresEnchantedApples3, TreeOresEnchantedApples3.getUnlocalizedName());

        GameRegistry.registerItem(TreeOresBossSpawners1, TreeOresBossSpawners1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresBossSpawners2, TreeOresBossSpawners2.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresBossSpawners3, TreeOresBossSpawners3.getUnlocalizedName());

        GameRegistry.registerItem(TreeOresTransformers, TreeOresTransformers.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresSpawnerParts, TreeOresSpawnerParts.getUnlocalizedName());

    }
}
