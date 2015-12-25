package com.lessoner.treeores.Thaumcraft.Items;

import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Anguarmas on 10/1/2015.
 */
public class TreeOresTHCItems {

    public static Item TreeOresTHCChops1;
    public static Item TreeOresTHCChops2;

    public static Item TreeOresTHCBossSpawners1;
    public static Item TreeOresTHCBossSpawners2;

    public static void init() {
        TreeOresTHCChops1 = new TreeOresTHCChops1().setUnlocalizedName("tthcchops1").setTextureName("tthcchops").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTHCChops2 = new TreeOresTHCChops2().setUnlocalizedName("tthcchops2").setTextureName("tthcchops").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresTHCBossSpawners1 = new TreeOresTHCBossSpawners1().setUnlocalizedName("bthcspawners1").setTextureName("bthcspawners").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTHCBossSpawners2 = new TreeOresTHCBossSpawners2().setUnlocalizedName("bthcspawners2").setTextureName("bthcspawners").setCreativeTab(TreeOresMod.treeOresTab);
    }

    public static void registerItems() {
        GameRegistry.registerItem(TreeOresTHCChops1, TreeOresTHCChops1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresTHCChops2, TreeOresTHCChops2.getUnlocalizedName());

        GameRegistry.registerItem(TreeOresTHCBossSpawners1, TreeOresTHCBossSpawners1.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresTHCBossSpawners2, TreeOresTHCBossSpawners2.getUnlocalizedName());
    }
}
