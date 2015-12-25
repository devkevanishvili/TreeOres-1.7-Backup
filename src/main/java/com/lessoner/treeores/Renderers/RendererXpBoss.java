package com.lessoner.treeores.Renderers;

import com.lessoner.treeores.Entities.EntityXpBoss;
import com.lessoner.treeores.References;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

public class RendererXpBoss
        extends RenderBiped {
    public static final ResourceLocation texture = new ResourceLocation(References.xpBossTexture);
    protected ModelBoss modelEntity;
    private Object ModelBipedMobRightarm;

    public RendererXpBoss(ModelBiped mb, float f) {
        super(mb, f);
        this.modelEntity = ((ModelBoss) this.modelEntity);
    }

    public void renderXpBoss(EntityXpBoss entity, double x, double y, double z, float u, float v) {
        BossStatus.setBossStatus(entity, true);
        super.doRender(entity, x, y, z, u, v);
    }

    public void doRenderLiving(EntityLiving entityl, double x, double y, double z, float u, float v) {
        renderXpBoss((EntityXpBoss) entityl, x, y, z, u, v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v) {
        renderXpBoss((EntityXpBoss) entity, x, y, z, u, v);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }
}
