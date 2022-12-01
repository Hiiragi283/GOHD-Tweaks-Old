package hiiragi283.gohd_tweaks.recipes;

import hiiragi283.gohd_tweaks.GOHDTweaks;
import net.minecraftforge.fml.common.Loader;

public class IntegrationCore {
    public static void Init() {
        //HaCとの連携レシピの登録
        ClimateRecipe.Init();
        //Thermal Expansionが読み込まれている場合
        if (Loader.isModLoaded("thermal_expansion")) {
            try {
                //Thermalとの連携レシピの登録
                ThermalRecipe.Init();
            } catch (Exception e) {
                //失敗した場合、エラーをログに吐く
                GOHDTweaks.LoggerGOHD.info("Loading ThermalRecipe is failed!");
            }
        }
    }
}
