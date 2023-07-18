package de.tomjuri.cropmaster.util

import de.tomjuri.cropmaster.mixin.MinecraftInvoker
import net.minecraft.client.settings.KeyBinding

object KeyBindUtil {
    fun leftClick() { (mc as MinecraftInvoker).invokeClickMouse() }
    fun rightClick() { (mc as MinecraftInvoker).invokeRightClickMouse() }
    fun setKeys(vararg ids: Int, heldDown: Boolean) { ids.forEach { KeyBinding.setKeyBindState(it, heldDown) } }

}
