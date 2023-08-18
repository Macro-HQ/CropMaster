package de.tomjuri.cropmaster.macro

import de.tomjuri.cropmaster.enumeration.YawRotation
import de.tomjuri.cropmaster.util.KeyBindUtil.KeyBindConfig
import de.tomjuri.cropmaster.util.gameSettings
import org.lwjgl.input.Keyboard

class GenericSShapedMacro : Macro(YawRotation.NINETY, 0f) {

    override fun tick() {

    }

    private enum class State(private val keyBindConfig: KeyBindConfig) : MacroState {
        FORWARDS(KeyBindConfig(listOf(gameSettings.keyBindForward, gameSettings.keyBindSprint, gameSettings.keyBindAttack))),
        LEFT(KeyBindConfig(listOf(gameSettings.keyBindLeft, gameSettings.keyBindSprint, gameSettings.keyBindAttack))),
        RIGHT(KeyBindConfig(listOf(gameSettings.keyBindRight, gameSettings.keyBindSprint, gameSettings.keyBindAttack)));
        override fun getKeyBindConfig(): KeyBindConfig = keyBindConfig
    }
}
