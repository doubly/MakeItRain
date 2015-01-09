package MakeItRain.Item;

import MakeItRain.MakeItRain;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRainStick extends Item {
    public ItemRainStick() {
        super();
        setUnlocalizedName("rainStick");
        setTextureName(MakeItRain.ID + ":" + getUnlocalizedName().replace("item.", ""));
        setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public void registerIcons(IIconRegister p_94581_1_) {
        super.registerIcons(p_94581_1_);
    }
}
