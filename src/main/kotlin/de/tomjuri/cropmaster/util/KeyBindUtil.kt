package de.tomjuri.cropmaster.util

import de.tomjuri.cropmaster.mixin.MinecraftInvoker
import net.minecraft.client.settings.KeyBinding

object KeyBindUtil {

    private val activeKeys = mutableListOf<KeyBinding>()

    fun leftClick() { (mc as MinecraftInvoker).invokeClickMouse() }
    fun rightClick() { (mc as MinecraftInvoker).invokeRightClickMouse() }

    private fun setPressed(key: KeyBinding, pressed: Boolean) {
        KeyBinding.setKeyBindState(key.keyCode, pressed)
        if (pressed) activeKeys.add(key) else activeKeys.remove(key)
    }

    fun setPressed(keys: KeyBindConfig) {
        stop()
        keys.keys.forEach {
            setPressed(it, true)
        }
    }

    fun stop() {
        activeKeys.forEach {
            KeyBinding.setKeyBindState(it.keyCode, false)
        }
    }

    data class KeyBindConfig(val keys: List<KeyBinding>)
}
