package hiiragi283.gohd_tweaks.util;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class GOHDUtils {
    public static Item getItem(String domain, String path) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(domain, path));
    }
}
