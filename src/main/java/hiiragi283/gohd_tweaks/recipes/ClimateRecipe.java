package hiiragi283.gohd_tweaks.recipes;

import defeatedcrow.hac.api.climate.DCAirflow;
import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.api.climate.DCHumidity;
import defeatedcrow.hac.api.recipe.RecipeAPI;
import hiiragi283.gohd_tweaks.util.GOHDUtils;
import net.minecraft.item.ItemStack;

public class ClimateRecipe {
    public static void Init() {
        //Block of Platinumの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage"), 1, 6), DCHeatTier.UHT, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 0));
        //Block of Iridiumの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage"), 1, 7), DCHeatTier.UHT, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 1));
        //Block of Mana Infused Metalの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage"), 1, 8), DCHeatTier.UHT, DCHumidity.UNDERWATER, DCAirflow.WIND, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 2));
        //Block of Electrumの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage_alloy"), 1, 1), DCHeatTier.SMELTING, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 3));
        //Block of Invarの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage_alloy"), 1, 2), DCHeatTier.SMELTING, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 4));
        //Block of Constantanの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("thermalfoundation", "storage_alloy"), 1, 4), DCHeatTier.SMELTING, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "dustblock"), 1, 5));
        //Casting Tableの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("tconstruct", "casting"), 1, 0), DCHeatTier.KILN, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "grout_formed"), 1, 0));
        //Casting Basinの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("tconstruct", "casting"), 1, 1), DCHeatTier.KILN, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "grout_formed"), 1, 1));
        //Casting Channelの気候精錬レシピの登録
        RecipeAPI.registerSmelting.addRecipe(new ItemStack(GOHDUtils.getItem("tconstruct", "channel"), 1, 0), DCHeatTier.KILN, null, DCAirflow.TIGHT, new ItemStack(GOHDUtils.getItem("gohd_tweaks", "grout_formed"), 1, 2));
    }
}
