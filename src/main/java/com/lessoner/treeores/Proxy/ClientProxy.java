package com.lessoner.treeores.Proxy;

import com.lessoner.treeores.Entities.*;
import com.lessoner.treeores.Handlers.EntityHandler;
import com.lessoner.treeores.IC2.Entities.EntityCopperBoss;
import com.lessoner.treeores.IC2.Entities.EntityLeadBoss;
import com.lessoner.treeores.IC2.Entities.EntityTinBoss;
import com.lessoner.treeores.IC2.Entities.EntityUraniumBoss;
import com.lessoner.treeores.IC2.Renderers.RendererCopperBoss;
import com.lessoner.treeores.IC2.Renderers.RendererLeadBoss;
import com.lessoner.treeores.IC2.Renderers.RendererTinBoss;
import com.lessoner.treeores.IC2.Renderers.RendererUraniumBoss;
import com.lessoner.treeores.Renderers.*;
import com.lessoner.treeores.TConstruct.Entities.EntityArditeBoss;
import com.lessoner.treeores.TConstruct.Entities.EntityCobaltBoss;
import com.lessoner.treeores.TConstruct.Renderers.RendererArditeBoss;
import com.lessoner.treeores.TConstruct.Renderers.RendererCobaltBoss;
import com.lessoner.treeores.Thaumcraft.Entities.*;
import com.lessoner.treeores.Thaumcraft.Renderers.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Loader;

/**
 * Created by Anguarmas on 9/24/2015.
 */
public class ClientProxy extends CommonProxy {

    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityIronBoss.class, new RendererIronBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGoldBoss.class, new RendererGoldBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoalBoss.class, new RendererCoalBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRedstoneBoss.class, new RendererRedstoneBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDiamondBoss.class, new RendererDiamondBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEmeraldBoss.class, new RendererEmeraldBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLapisBoss.class, new RendererLapisBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityObsidianBoss.class, new RendererObsidianBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityQuartzBoss.class, new RendererQuartzBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlowstoneBoss.class, new RendererGlowstoneBoss(new ModelBoss(), 1.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityXpBoss.class, new RendererXpBoss(new ModelBoss(), 1.0F));

        if(Loader.isModLoaded("IC2")){
            RenderingRegistry.registerEntityRenderingHandler(EntityCopperBoss.class, new RendererCopperBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityTinBoss.class, new RendererTinBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityUraniumBoss.class, new RendererUraniumBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityLeadBoss.class, new RendererLeadBoss(new ModelBoss(), 1.0F));
        }
        if (Loader.isModLoaded("Thaumcraft")) {
            RenderingRegistry.registerEntityRenderingHandler(EntityThaumiumBoss.class, new RendererThaumiumBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityAirBoss.class, new RendererAirBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityFireBoss.class, new RendererFireBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityWaterBoss.class, new RendererWaterBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityEarthBoss.class, new RendererEarthBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityOrderBoss.class, new RendererOrderBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityEntropyBoss.class, new RendererEntropyBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityCinnabarBoss.class, new RendererCinnabarBoss(new ModelBoss(), 1.0F));
        }
        if(Loader.isModLoaded("TConstruct")){
            RenderingRegistry.registerEntityRenderingHandler(EntityArditeBoss.class, new RendererArditeBoss(new ModelBoss(), 1.0F));
            RenderingRegistry.registerEntityRenderingHandler(EntityCobaltBoss.class, new RendererCobaltBoss(new ModelBoss(), 1.0F));
        }
    }

    public void registerEntities() {
        EntityHandler.registerMonsters(EntityIronBoss.class, "IronTreeBoss", 0);
        EntityHandler.registerMonsters(EntityGoldBoss.class, "GoldTreeBoss", 1);
        EntityHandler.registerMonsters(EntityCoalBoss.class, "CoalTreeBoss", 2);
        EntityHandler.registerMonsters(EntityRedstoneBoss.class, "RedstoneTreeBoss", 3);
        EntityHandler.registerMonsters(EntityDiamondBoss.class, "DiamondTreeBoss", 4);
        EntityHandler.registerMonsters(EntityEmeraldBoss.class, "EmeraldTreeBoss", 5);
        EntityHandler.registerMonsters(EntityLapisBoss.class, "LapisTreeBoss", 6);
        EntityHandler.registerMonsters(EntityQuartzBoss.class, "QuartzTreeBoss", 7);
        EntityHandler.registerMonsters(EntityGlowstoneBoss.class, "GlowstoneTreeBoss", 8);
        EntityHandler.registerMonsters(EntityObsidianBoss.class, "ObsidianTreeBoss", 9);
        EntityHandler.registerMonsters(EntityXpBoss.class, "XPTreeBoss", 10);
        if(Loader.isModLoaded("IC2")){
            EntityHandler.registerMonsters(EntityCopperBoss.class, "CopperTreeBoss", 11);
            EntityHandler.registerMonsters(EntityTinBoss.class, "TinTreeBoss", 12);
            EntityHandler.registerMonsters(EntityUraniumBoss.class, "UraniumTreeBoss", 13);
            EntityHandler.registerMonsters(EntityLeadBoss.class, "LeadTreeBoss", 14);
        }
        if(Loader.isModLoaded("TConstruct")){
            EntityHandler.registerMonsters(EntityArditeBoss.class, "ArditeTreeBoss", 15);
            EntityHandler.registerMonsters(EntityCobaltBoss.class, "CobaltTreeBoss", 16);
        }
        if (Loader.isModLoaded("Thaumcraft")) {
            EntityHandler.registerMonsters(EntityThaumiumBoss.class, "ThaumiumTreeBoss", 17);
            EntityHandler.registerMonsters(EntityAirBoss.class, "AirTreeBoss", 18);
            EntityHandler.registerMonsters(EntityFireBoss.class, "FireTreeBoss", 19);
            EntityHandler.registerMonsters(EntityWaterBoss.class, "WaterTreeBoss", 20);
            EntityHandler.registerMonsters(EntityEarthBoss.class, "EarthTreeBoss", 21);
            EntityHandler.registerMonsters(EntityOrderBoss.class, "OrderTreeBoss", 22);
            EntityHandler.registerMonsters(EntityEntropyBoss.class, "EntropyTreeBoss", 23);
            EntityHandler.registerMonsters(EntityCinnabarBoss.class, "CinnabarTreeBoss", 24);
        }
    }
}
