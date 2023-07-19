package de.tomjuri.cropmaster.macro

import de.tomjuri.cropmaster.enumeration.YawRotation
import de.tomjuri.cropmaster.util.KeyBindUtil.KeyBindConfig
import de.tomjuri.cropmaster.util.KeyBindUtil.a
import de.tomjuri.cropmaster.util.KeyBindUtil.attack
import de.tomjuri.cropmaster.util.KeyBindUtil.d
import de.tomjuri.cropmaster.util.KeyBindUtil.w
import org.lwjgl.input.Keyboard

class GenericSShapedMacro : Macro(YawRotation.NINETY, 0f) {

    override fun tick() {
        if (state) {
            state.getKeyBindConfig().keys.forEach {
                Keyboard.setKeyState(it, false)
            }
        }
    }

    private enum class State(private val keyBindConfig: KeyBindConfig) : MacroState {
        FORWARDS(KeyBindConfig(listOf(w, attack))),
        LEFT(KeyBindConfig(listOf(a, attack))),
        RIGHT(KeyBindConfig(listOf(d, attack)));
        override fun getKeyBindConfig(): KeyBindConfig = keyBindConfig
    }
}
