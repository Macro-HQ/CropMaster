package de.tomjuri.cropmaster.macro

import de.tomjuri.cropmaster.enumeration.Crop
import de.tomjuri.cropmaster.enumeration.FarmType

abstract class Macro(val farmType: FarmType, vararg val crops: Crop, val yaw: Float, val pitch: Float) {
    var running = false
    protected abstract var state: State
    abstract fun tick()
    interface State { fun bgalls() }
}
