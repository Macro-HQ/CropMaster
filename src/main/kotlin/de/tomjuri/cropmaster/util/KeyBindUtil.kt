package de.tomjuri.cropmaster.util

import de.tomjuri.cropmaster.mixin.MinecraftInvoker
import net.minecraft.client.settings.KeyBinding

object KeyBindUtil {
    fun leftClick() { (mc as MinecraftInvoker).invokeClickMouse() }
    fun rightClick() { (mc as MinecraftInvoker).invokeRightClickMouse() }

    fun setKeys(vararg ids: Int, heldDown: Boolean) {
        ids.forEach {
            KeyBinding.setKeyBindState(it, heldDown)
        }
    }

    fun setKeys(keyBindConfig: KeyBindConfig) {
        keyBindConfig.keys.forEach {
            KeyBinding.setKeyBindState(it, true)
        }
    }

    val w: Int get() = mc.gameSettings.keyBindForward.keyCode
    val a: Int get() = mc.gameSettings.keyBindLeft.keyCode
    val s: Int get() = mc.gameSettings.keyBindBack.keyCode
    val d: Int get() = mc.gameSettings.keyBindRight.keyCode
    val space: Int get() = mc.gameSettings.keyBindJump.keyCode
    val attack: Int get() = mc.gameSettings.keyBindAttack.keyCode

    data class KeyBindConfig(val keys: List<Int>)
}
