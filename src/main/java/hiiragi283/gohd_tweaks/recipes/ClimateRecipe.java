package hiiragi283.gohd_tweaks.recipes;

import defeatedcrow.hac.api.climate.DCAirflow;
import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.api.climate.DCHumidity;
import defeatedcrow.hac.api.recipe.RecipeAPI;
import hiiragi283.gohd_tweaks.util.GOHDUtils;
import net.minecraft.item.ItemStack;

public class ClimateRecipe {
    public static void Init() {
        //気候精錬のレシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage"), 1, 6), DCHeatTier.UHT, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 0));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage"), 1, 7), DCHeatTier.UHT, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 1));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage"), 1, 8), DCHeatTier.UHT, DCHumidity.UNDERWATER, DCAirflow.WIND, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 2));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage_alloy"), 1, 1), DCHeatTier.SMELTING, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 3));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage_alloy"), 1, 2), DCHeatTier.SMELTING, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 4));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage_alloy"), 1, 4), DCHeatTier.SMELTING, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 5));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("tconstruct", "casting"), 1, 0), DCHeatTier.KILN, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "grout_formed"), 1, 0));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("tconstruct", "casting"), 1, 1), DCHeatTier.KILN, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "grout_formed"), 1, 1));
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("tconstruct", "channel"), 1, 0), DCHeatTier.KILN, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "grout_formed"), 1, 2));
    }
}
