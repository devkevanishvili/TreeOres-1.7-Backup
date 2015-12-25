package com.lessoner.treeores.Thaumcraft.Renderers;

import com.lessoner.treeores.References;
import com.lessoner.treeores.Renderers.ModelBoss;
import com.lessoner.treeores.Thaumcraft.Entities.EntityAirBoss;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class RendererAirBoss extends RenderBiped {
    public static final ResourceLocation texture = new ResourceLocation(References.airBossTexture);
    protected ModelBoss modelEntity;
    private Object ModelBipedMobRightarm;

    public RendererAirBoss(ModelBiped mb, float f) {
        super(mb, f);
        this.modelEntity = ((ModelBoss) this.modelEntity);
    }

    public void renderAirBoss(EntityAirBoss entity, double x, double y, double z, float u, float v) {
        BossStatus.setBossStatus(entity, true);
        super.doRender(entity, x, y, z, u, v);
    }

    public void doRenderLiving(EntityLiving entityl, double x, double y, double z, float u, float v) {
        renderAirBoss((EntityAirBoss) entityl, x, y, z, u, v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v) {
        renderAirBoss((EntityAirBoss) entity, x, y, z, u, v);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }
}
