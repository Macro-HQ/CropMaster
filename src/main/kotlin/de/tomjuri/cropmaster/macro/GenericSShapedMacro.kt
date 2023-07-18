package de.tomjuri.cropmaster.macro

import de.tomjuri.cropmaster.enumeration.Crop
import de.tomjuri.cropmaster.enumeration.FarmType

class GenericSShapedMacro : Macro(
    FarmType.SSHAPE,
    Crop.WHEAT,
    Crop.POTATO,
    Crop.CARROT,
    Crop.NETHERWART,
    Crop.PUMPKIN,
    Crop.MELON
) {

    override fun tick() {
        fgds
    }
}
