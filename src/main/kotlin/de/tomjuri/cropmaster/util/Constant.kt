package de.tomjuri.cropmaster.util

import net.minecraft.client.Minecraft
import net.minecraft.client.entity.EntityPlayerSP
import net.minecraft.world.World

val mc: Minecraft get() = Minecraft.getMinecraft()
val player: EntityPlayerSP get() = mc.thePlayer
val world: World get() = mc.theWorld