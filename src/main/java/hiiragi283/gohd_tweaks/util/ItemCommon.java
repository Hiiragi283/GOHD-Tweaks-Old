package hiiragi283.gohd_tweaks.util;

import com.google.common.collect.Lists;
import hiiragi283.gohd_tweaks.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemCommon extends Item {
    //Itemを定義するメソッド
    public ItemCommon(String ID) {
        super();
        this.setRegistryName(Reference.MOD_ID, ID); //IDの設定
        this.setCreativeTab(CreativeTabs.MISC); //表示するクリエイティブタブの設定
        this.setUnlocalizedName(ID); //翻訳キーをIDから取得する
        this.setHasSubtypes(true); //メタデータを使用する
    }

    //メタデータの最大値を返すメソッド
    public int getMaxMeta() {
        //デフォルトは15が最大値
        return 15;
    }

    //メタデータを取得するメソッド
    @Override
    public int getMetadata(int damage) {
        //代入した値とメタデータの最大値を比較し、小さい方を返す
        return Math.min(damage, getMaxMeta());
    }

    //翻訳キーを取得するメソッド
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        //取得した値とメタデータの最大値を比較し、小さい方を返す
        int j = Math.min(stack.getMetadata(), getMaxMeta());
        //メタデータごとに異なる翻訳キーを返す
        return super.getUnlocalizedName() + "." + j;
    }

    //メタデータ付きアイテムをクリエイティブタブに登録するメソッド
    @Override
    @SideOnly(Side.CLIENT) //Client側のみ
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems) {
        if (this.isInCreativeTab(tab)) {
            List<ItemStack> list = Lists.newArrayList();
            //メタデータの最大値まで処理を繰り返す
            for (int i = 0; i < getMaxMeta() + 1; i++) {
                list.add(new ItemStack(this, 1, i));
            }
            subItems.addAll(list);
        }
    }
}
