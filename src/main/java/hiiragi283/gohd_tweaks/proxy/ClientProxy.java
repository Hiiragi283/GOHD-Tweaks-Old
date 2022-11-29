package hiiragi283.gohd_tweaks.proxy;

import hiiragi283.gohd_tweaks.GOHDTweaks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {

    //代入されたItemとmetaに応じてモデルファイルのパスを登録するメソッド
    @SideOnly(Side.CLIENT)
    public static void setModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName() + "_" + meta, "inventory"));
    }

    //各Itemのモデルファイルのパスを指定するメソッド
    public void setModels() {
        setModel(GOHDTweaks.ItemBlockDust, 0);
        setModel(GOHDTweaks.ItemBlockDust, 1);
        setModel(GOHDTweaks.ItemBlockDust, 2);
        setModel(GOHDTweaks.ItemBlockDust, 3);
        setModel(GOHDTweaks.ItemBlockDust, 4);
        setModel(GOHDTweaks.ItemBlockDust, 5);
        setModel(GOHDTweaks.ItemBookSpawn, 0);
        setModel(GOHDTweaks.ItemBookSyntax, 0);
        setModel(GOHDTweaks.ItemGroutFormed, 0);
        setModel(GOHDTweaks.ItemGroutFormed, 1);
        setModel(GOHDTweaks.ItemGroutFormed, 2);
        setModel(GOHDTweaks.ItemPartsAssembly, 0);
        setModel(GOHDTweaks.ItemPartsAssembly, 1);
        setModel(GOHDTweaks.ItemPartsAssembly, 2);
        setModel(GOHDTweaks.ItemPartsAssembly, 3);
        setModel(GOHDTweaks.ItemPartsAssembly, 4);
        setModel(GOHDTweaks.ItemRagiTicket, 0);
    }

    //Client側のProxyで行われる処理をまとめたメソッド
    public void register() {
        setModels();
    }
}
