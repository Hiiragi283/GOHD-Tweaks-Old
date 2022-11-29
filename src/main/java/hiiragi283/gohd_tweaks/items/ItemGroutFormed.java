package hiiragi283.gohd_tweaks.items;

import hiiragi283.gohd_tweaks.GOHDTweaks;
import hiiragi283.gohd_tweaks.util.ItemBlockCommon;

public class ItemGroutFormed extends ItemBlockCommon {
    public ItemGroutFormed() {
        super(GOHDTweaks.BlockGroutFormed);
    }

    public int getMaxMeta() {
        return 2;
    }
}
