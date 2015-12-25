package com.lessoner.treeores.Blocks;

import com.lessoner.treeores.LeafColors;
import com.lessoner.treeores.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

/**
 * Created by Anguarmas on 9/23/2015.
 */
public class TreeOresBossLeaves2 extends BlockOldLeaf {
    public static final String[][] leaf_types = new String[][]{{"tleaves_diamond", "tleaves_emerald", "tleaves_lapis", "tleaves_obsidian"}, {"tleaves_diamond_opaque", "tleaves_emerald_opaque", "tleaves_lapis_opaque", "tleaves_obsidian_opaque"}};
    private static final String __OBFID = "CL_00000280";

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int meta) {
        return (meta & 3) == 0 ? LeafColors.diamond() : ((meta & 3) == 1 ? LeafColors.emerald() : ((meta & 3) == 2 ? LeafColors.lapis() : ((meta & 3) == 3 ? LeafColors.obsidian() : super.getRenderColor(meta))));
    }

    public Item getItemDropped(int i, Random random, int k) {
        return Item.getItemFromBlock(TreeOresBlocks.TreeOresBossSaplings2);
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z) {
        int meta = iBlockAccess.getBlockMetadata(x, y, z);
        return (meta & 3) == 0 ? LeafColors.diamond() : ((meta & 3) == 1 ? LeafColors.emerald() : ((meta & 3) == 2 ? LeafColors.lapis() : ((meta & 3) == 3 ? LeafColors.obsidian() : super.colorMultiplier(iBlockAccess, x, y, z))));
    }

    protected void func_150124_c(World world, int x, int y, int z, int meta, int i) {
        if (((meta & 3) == 0) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.diamond, 1, 0));
        }
        if (((meta & 3) == 1) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.emerald, 1, 0));
        }
        if (((meta & 3) == 2) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.dye, 1, 5));
        }
        if (((meta & 3) == 3) && (world.rand.nextInt(i) == 0)) {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(Blocks.obsidian, 1, 0));
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
                this.field_150129_M[i][j] = iconRegister.registerIcon(References.MODID + ":" + leaf_types[i][j]);
            }
        }
    }

    public String[] func_150125_e() {
        return TreeOresLogs2.types;
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
