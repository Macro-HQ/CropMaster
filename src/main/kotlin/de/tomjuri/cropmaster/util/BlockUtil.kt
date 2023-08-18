package de.tomjuri.cropmaster.util

import de.tomjuri.cropmaster.util.AngleUtil.get360RotationYaw
import net.minecraft.block.Block
import net.minecraft.init.Blocks
import net.minecraft.util.BlockPos
import kotlin.math.ceil

object BlockUtil {

    private fun getUnitX(modYaw: Float): Int {
        return if (get360RotationYaw(modYaw) < 45 || get360RotationYaw(modYaw) > 315) 0
        else if (get360RotationYaw(modYaw) < 135) -1
        else if (get360RotationYaw(modYaw) < 225) 0
        else 1
    }

    private fun getUnitZ(modYaw: Float): Int {
        return if (get360RotationYaw(modYaw) < 45 || get360RotationYaw(modYaw) > 315) 1
        else if (get360RotationYaw(modYaw) < 135) 0
        else if (get360RotationYaw(modYaw) < 225) -1
        else 0
    }

    fun getRelativeBlock(x: Float, y: Float, z: Float): Block {
        return mc.theWorld.getBlockState(
                BlockPos(
                        mc.thePlayer.posX + getUnitX(player.rotationYaw) * z + getUnitZ(player.rotationYaw) * -1 * x,
                        (if (mc.thePlayer.posY % 1 > 0.7) ceil(mc.thePlayer.posY) else mc.thePlayer.posY) + y,
                        mc.thePlayer.posZ + getUnitZ(player.rotationYaw) * z + getUnitX(player.rotationYaw) * x
                )).block
    }

    fun isWalkable(block: Block) : Boolean {
        val walkables = listOf(Blocks.air, Blocks.water, Blocks.flowing_water, Blocks.carpet)
    }
}