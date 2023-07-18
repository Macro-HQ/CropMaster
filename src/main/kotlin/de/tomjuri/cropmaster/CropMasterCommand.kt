package de.tomjuri.cropmaster

import cc.polyfrost.oneconfig.utils.commands.annotations.Command
import cc.polyfrost.oneconfig.utils.commands.annotations.Main
import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText

@Command(value = "examplecommand")
class CropMasterCommand {

    @Main
    private fun main() {
        Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText("§c${CropMaster.config.exampleText}"))
    }
}