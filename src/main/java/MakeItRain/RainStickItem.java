package MakeItRain;

import io.knaught.makeItRain.MakeItRain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RainStickItem extends Item {
    public RainStickItem() {
        setUnlocalizedName("rainStick");
        setCreativeTab(CreativeTabs.tabMisc);
        //setTextureName(MakeItRain.MOD_ID + ":rainStick");
    }
}
