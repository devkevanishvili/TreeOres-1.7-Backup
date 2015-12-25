package com.lessoner.treeores.IC2.Blocks;

import com.lessoner.treeores.IC2.LeafColorsIC2;
import com.lessoner.treeores.References;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2BossLeaves extends BlockOldLeaf {
    public static final String[][] leaf_types = new String[][]{{"tic2leaves_copper", "tic2leaves_tin", "tic2leaves_uranium", "tic2leaves_lead"}, {"tic2leaves_copper_opaque", "tic2leaves_tin_opaque", "tic2leaves_uranium_opaque", "tic2leaves_lead_opaque"}};
    private static final String __OBFID = "CL_00000280";

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int meta) {
        return (meta & 3) == 0 ? LeafColorsIC2.copper() : ((meta & 3) == 1 ? LeafColorsIC2.tin() : ((meta & 3) == 2 ? LeafColorsIC2.uranium() : ((meta & 3) == 3 ? LeafColorsIC2.lead() : super.getRenderColor(meta))));
    }

    public Item getItemDropped(int i, Random random, int k) {
        return Item.getItemFromBlock(TreeOresIC2Blocks.TreeOresIC2BossSaplings);
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        int meta = iBlockAccess.getBlockMetadata(x, y, z);
        return (meta & 3) == 0 ? LeafColorsIC2.copper() : ((meta & 3) == 1 ? LeafColorsIC2.tin() : ((meta & 3) == 2 ? LeafColorsIC2.uranium() : ((meta & 3) == 3 ? LeafColorsIC2.lead() : super.colorMultiplier(iBlockAccess, x, y, z))));
    }

    protected void func_150124_c(World world, int x, int y, int z, int meta, int i) {
        if (((meta & 3) == 0) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 1, 0));
        }
        if (((meta & 3) == 1) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 1, 1));
        }
        if (((meta & 3) == 2) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(GameRegistry.findItem("IC2", "itemUran238")));
        }
        if (((meta & 3) == 3) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(GameRegistry.findItem("IC2", "itemIngot"), 1, 5));
        }
    }

    protected int func_150123_b(int meta) {
        int j = super.func_150123_b(meta);

        if ((meta & 3) == 3) {
            j = 40;
        }

        return j;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i, int meta) {
        return (meta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : ((meta & 3) == 3 ? this.field_150129_M[this.field_150127_b][3] : ((meta & 3) == 2 ? this.field_150129_M[this.field_150127_b][2] : this.field_150129_M[this.field_150127_b][0]));
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
        list.add(new ItemStack(item, 1, 3));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        for (int i = 0; i < leaf_types.length; ++i) {
            this.field_150129_M[i] = new IIcon[leaf_types[i].length];

            for (int j = 0; j < leaf_types[i].length; ++j) {
                this.field_150129_M[i][j] = iconRegister.registerIcon(References.MODID + ":IC2/" + leaf_types[i][j]);
            }
        }
    }

    public String[] func_150125_e() {
        return TreeOresIC2Logs.types;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean shouldSideBeRendered(IBlockAccess blockaccessm, int x, int y, int z, int side) {
        return true;
    }
}
