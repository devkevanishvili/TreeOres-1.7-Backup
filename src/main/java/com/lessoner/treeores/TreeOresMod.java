package com.lessoner.treeores;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.Handlers.DropHandler;
import com.lessoner.treeores.Handlers.UpdateHandler;
import com.lessoner.treeores.IC2.TreeOresIC2;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.MFR.MFRIntegration;
import com.lessoner.treeores.MFR.TreeOrestPlantable;
import com.lessoner.treeores.Proxy.CommonProxy;
import com.lessoner.treeores.TConstruct.TreeOresTConstruct;
import com.lessoner.treeores.Thaumcraft.TreeOresThaumcraft;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import powercrystals.minefactoryreloaded.api.FactoryRegistry;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME)

public class TreeOresMod {

    public static CreativeTabs treeOresTab;

    @SidedProxy(clientSide = References.CLIENTSIDEPROXY, serverSide = References.SERVERSIDEPROXY)
    public static CommonProxy proxy;

    private static void OreDict() {

        for (int i = 0; i < 4; i++) {
            OreDictionary.registerOre(References.oreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresLeaves1, 1, i));
            OreDictionary.registerOre(References.oreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresLeaves2, 1, i));
            OreDictionary.registerOre(References.oreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresBossLeaves1, 1, i));
            OreDictionary.registerOre(References.oreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresBossLeaves2, 1, i));
            OreDictionary.registerOre(References.oreDictLogs, new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, i));
            OreDictionary.registerOre(References.oreDictLogs, new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, i));
            OreDictionary.registerOre(References.oreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, i));
            OreDictionary.registerOre(References.oreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, i));
            OreDictionary.registerOre(References.oreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresBossSaplings1, 1, i));
            OreDictionary.registerOre(References.oreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresBossSaplings2, 1, i));
        }
        for (int i = 0; i < 3; i++) {
            OreDictionary.registerOre(References.oreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresLeaves3, 1, i));
            OreDictionary.registerOre(References.oreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresBossLeaves3, 1, i));
            OreDictionary.registerOre(References.oreDictLogs, new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, i));
            OreDictionary.registerOre(References.oreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, i));
            OreDictionary.registerOre(References.oreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresBossSaplings3, 1, i));
        }
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        References.ironTree = config.getBoolean("EnableIronTreeCrafting", "Trees", true, "Do you want to enable iron sapling crafting recipe?");
        References.goldTree = config.getBoolean("EnableGoldTreeCrafting", "Trees", true, "Do you want to enable gold sapling crafting recipe?");
        References.coalTree = config.getBoolean("EnableCoalTreeCrafting", "Trees", true, "Do you want to enable coal sapling crafting recipe?");
        References.redstoneTree = config.getBoolean("EnableRedstoneTreeCrafting", "Trees", true, "Do you want to enable redstone sapling crafting recipe?");
        References.emeraldTree = config.getBoolean("EnableEmeraldTreeCrafting", "Trees", true, "Do you want to enable emerald sapling crafting recipe?");
        References.diamondTree = config.getBoolean("EnableDiamondTreeCrafting", "Trees", true, "Do you want to enable diamond sapling crafting recipe?");
        References.lapisTree = config.getBoolean("EnableLapisTreeCrafting", "Trees", true, "Do you want to enable lapis crafting recipe?");
        References.obsidianTree = config.getBoolean("EnableObsidianTreeCrafting", "Trees", true, "Do you want to enable obsidian sapling crafting recipe?");
        References.quartzTree = config.getBoolean("EnableGlowstoneTreeCrafting", "Trees", true, "Do you want to enable glowstone sapling crafting recipe?");
        References.glowstoneTree = config.getBoolean("EnableQuartzTreeCrafting", "Trees", true, "Do you want to enable quartz sapling crafting recipe?");
        References.xpTree = config.getBoolean("EnableXpTreeCrafting", "Trees", true, "Do you want to enable xp sapling crafting recipe?");
        References.enableChops = config.getBoolean("EnableChops", "Trees", true, "Do you want to enable chops?");
        References.canFertilize = config.getBoolean("EnableBonemeal", "Trees", true, "Do you want to enable bonemeal?");
        References.oreDictLeaves = config.getString("oreDictLeaves", "Trees", "treeLeaves", "Ore Dictionary name for leaves");
        References.oreDictLogs = config.getString("oreDictLogs", "Trees", "logWood", "Ore Dictionary name for logs");
        References.oreDictSaplings = config.getString("oreDictSaplings", "Trees", "treeSapling", "Ore Dictionary name for saplings");
        if(Loader.isModLoaded("IC2")){
            References.copperTree = config.getBoolean("EnableCopperTreeCrafting", "TreesIC2", true, "Do you want to enable copper sapling crafting recipe?");
            References.tinTree = config.getBoolean("EnableTinTreeCrafting", "TreesIC2", true, "Do you want to enable tin sapling crafting recipe?");
            References.uraniumTree = config.getBoolean("EnableUraniumTreeCrafting", "TreesIC2", true, "Do you want to enable uranium sapling crafting recipe?");
            References.leadTree = config.getBoolean("EnableLeadTreeCrafting", "TreesIC2", true, "Do you want to enable lead sapling crafting recipe?");

            References.oreDictIC2Leaves = config.getString("oreDictIC2Leaves", "TreesIC2", "treeLeaves", "Ore Dictionary name for ic2 leaves");
            References.oreDictIC2Logs = config.getString("oreDictIC2Logs", "TreesIC2", "logWood", "Ore Dictionary name for ic2 logs");
            References.oreDictIC2Saplings = config.getString("oreDictIC2Saplings", "TreesIC2", "treeSapling", "Ore Dictionary name for ic2 saplings");
        }
        if (Loader.isModLoaded("Thaumcraft")) {
            References.thaumiumTree = config.getBoolean("EnableThaumiumTreeCrafting", "TreesTHC", true, "Do you want to enable thaumium sapling crafting recipe?");
            References.airTree = config.getBoolean("EnableAirTreeCrafting", "TreesTHC", true, "Do you want to enable air sapling crafting recipe?");
            References.fireTree = config.getBoolean("EnableFireTreeCrafting", "TreesTHC", true, "Do you want to enable fire sapling crafting recipe?");
            References.waterTree = config.getBoolean("EnableWaterTreeCrafting", "TreesTHC", true, "Do you want to enable water sapling crafting recipe?");
            References.earthTree = config.getBoolean("EnableEarthTreeCrafting", "TreesTHC", true, "Do you want to enable earth sapling crafting recipe?");
            References.orderTree = config.getBoolean("EnableOrderTreeCrafting", "TreesTHC", true, "Do you want to enable order sapling crafting recipe?");
            References.entropyTree = config.getBoolean("EnableEntropyTreeCrafting", "TreesTHC", true, "Do you want to enable entropy sapling crafting recipe?");
            References.cinnabarTree = config.getBoolean("EnableCinnabarTreeCrafting", "TreesTHC", true, "Do you want to enable cinnabar sapling crafting recipe?");

            References.oreDictTHCLeaves = config.getString("oreDictTHCLeaves", "TreesTHC", "treeLeaves", "Ore Dictionary name for thaumcraft leaves");
            References.oreDictTHCLogs = config.getString("oreDictTHCLogs", "TreesTHC", "logWood", "Ore Dictionary name for thaumcraft logs");
            References.oreDictTHCSaplings = config.getString("oreDictTHCSaplings", "TreesTHC", "treeSapling", "Ore Dictionary name for thaumcraft saplings");
        }
        if(Loader.isModLoaded("TConstruct")){
            References.arditeTree = config.getBoolean("EnableArditeTreeCrafintg", "TreesTC", true, "Do you want to enable ardite sapling crafting recipe?");
            References.cobaltTree = config.getBoolean("EnableCobaltTreeCrafting", "TreesTC", true, "Do you want to enable cobalt sapling crafting recipe?");

            References.oreDictTCLeaves = config.getString("oreDictTCLeaves", "TreesTC", "treeLeaves", "Ore Dictionary name for tc leaves");
            References.oreDictTCLogs = config.getString("oreDictTCLogs", "TreesTC", "logWood", "Ore Dictionary name for tc logs");
            References.oreDictTCSaplings = config.getString("oreDictTCSaplings", "TreesTC", "treeSapling", "Ore Dictionary name for tc saplings");
        }

        config.save();

        treeOresTab = new CreativeTabs("treeOresTab") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.sapling);
            }
        };
        TreeOresBlocks.init();
        TreeOresItems.init();
        if(Loader.isModLoaded("IC2")){
            TreeOresIC2.preInit();
        }
        if(Loader.isModLoaded("TConstruct")){
            TreeOresTConstruct.preInit();
        }
        if (Loader.isModLoaded("Thaumcraft")) {
            TreeOresThaumcraft.preInit();
        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        TreeOresBlocks.registerBlocks();
        TreeOresItems.registerItems();
        TreeOresCrafting.addRecipes();
        proxy.registerRenderers();
        proxy.registerEntities();
        MinecraftForge.EVENT_BUS.register(new DropHandler());
        FMLCommonHandler.instance().bus().register(new UpdateHandler());
        if(Loader.isModLoaded("IC2")){
            TreeOresIC2.init();
        }
        if(Loader.isModLoaded("TConstruct")){
            TreeOresTConstruct.init();
        }
        if (Loader.isModLoaded("Thaumcraft")) {
            TreeOresThaumcraft.init();
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        OreDict();
        if(Loader.isModLoaded("MineFactoryReloaded")) {
            MFRIntegration.Integrate();
        }
    }


}
