package de.tomjuri.cropmaster.util

import de.tomjuri.cropmaster.CropMaster
import de.tomjuri.cropmaster.CropMasterConfig
import net.minecraft.client.Minecraft
import net.minecraft.client.entity.EntityPlayerSP
import net.minecraft.client.settings.GameSettings
import net.minecraft.world.World

val mc: Minecraft get() = Minecraft.getMinecraft()
val player: EntityPlayerSP get() = mc.thePlayer
val world: World get() = mc.theWorld
val config: CropMasterConfig get() = CropMaster.instance.config
val gameSettings: GameSettings get() = mc.gameSettings