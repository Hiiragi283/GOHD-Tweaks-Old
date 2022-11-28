package hiiragi283.gohd_tweaks.items;

import hiiragi283.gohd_tweaks.util.ItemBlockCommon;

import static hiiragi283.gohd_tweaks.GOHDTweaks.BlockDust;

public class ItemBlockDust extends ItemBlockCommon {
    public ItemBlockDust() {
        super(BlockDust);
    }

    public int getMaxMeta() {
        return 5;
    }
}
