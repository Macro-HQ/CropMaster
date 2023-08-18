package de.tomjuri.cropmaster.util

object AngleUtil {
    fun get360RotationYaw(yaw: Float): Float {
        return (yaw % 360 + 360) % 360
    }
}