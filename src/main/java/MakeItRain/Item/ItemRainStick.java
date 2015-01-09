package MakeItRain.Item;

import MakeItRain.MakeItRain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRainStick extends Item {
    public ItemRainStick() {
        super();
        setUnlocalizedName("rainStick");
        setTextureName(MakeItRain.ID + ":" + "rainStick");
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
