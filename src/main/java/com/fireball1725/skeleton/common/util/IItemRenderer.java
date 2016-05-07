package com.fireball1725.skeleton.common.util;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IItemRenderer {
    @SideOnly(Side.CLIENT)
    void registerItemRenderer();
}
