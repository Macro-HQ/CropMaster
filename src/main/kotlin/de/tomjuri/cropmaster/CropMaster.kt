package de.tomjuri.cropmaster

import cc.polyfrost.oneconfig.utils.commands.CommandManager
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = "cropmaster", name = "CropMaster", version = "%%VERSION%%")
class CropMaster {

    companion object {
        @Mod.Instance("cropmaster")
        lateinit var instance: CropMaster
    }

    lateinit var config: CropMasterConfig

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        config = CropMasterConfig()
        CommandManager.register(CropMasterCommand())
    }
}
