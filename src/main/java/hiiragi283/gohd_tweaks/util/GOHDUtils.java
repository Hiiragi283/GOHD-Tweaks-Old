package hiiragi283.gohd_tweaks.util;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class GOHDUtils {

    //液体名からFluidを取得するメソッド
    public static Fluid getFluid(String name) {
        return net.minecraftforge.fluids.FluidRegistry.getFluid(name);
    }

    //ResourceLocationからItemを取得するメソッド
    public static Item getItem(String domain, String path) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(domain, path));
    }
}
