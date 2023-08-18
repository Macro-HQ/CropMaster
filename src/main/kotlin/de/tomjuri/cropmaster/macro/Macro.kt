package de.tomjuri.cropmaster.macro

import de.tomjuri.cropmaster.enumeration.YawRotation
import de.tomjuri.cropmaster.util.KeyBindUtil.KeyBindConfig

abstract class Macro(yawRotation: YawRotation, pitch: Float) {
    var running = false
    protected lateinit var state: MacroState
    abstract fun tick()
    interface MacroState { fun getKeyBindConfig(): KeyBindConfig }
}