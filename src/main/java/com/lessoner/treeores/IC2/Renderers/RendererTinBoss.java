package com.lessoner.treeores.IC2.Renderers;

import com.lessoner.treeores.IC2.Entities.EntityTinBoss;
import com.lessoner.treeores.References;
import com.lessoner.treeores.Renderers.ModelBoss;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class RendererTinBoss extends RenderBiped {
    public static final ResourceLocation texture = new ResourceLocation(References.tinBossTexture);
    protected ModelBoss modelEntity;
    private Object ModelBipedMobRightarm;

    public RendererTinBoss(ModelBiped mb, float f) {
        super(mb, f);
        this.modelEntity = ((ModelBoss) this.modelEntity);
    }

    public void renderTinBoss(EntityTinBoss entity, double x, double y, double z, float u, float v) {
        BossStatus.setBossStatus(entity, true);
        super.doRender(entity, x, y, z, u, v);
    }

    public void doRenderLiving(EntityLiving entityl, double x, double y, double z, float u, float v) {
        renderTinBoss((EntityTinBoss) entityl, x, y, z, u, v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v) {
        renderTinBoss((EntityTinBoss) entity, x, y, z, u, v);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }
}
