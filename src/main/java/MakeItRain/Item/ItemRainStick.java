package MakeItRain.Item;

import MakeItRain.Data.ItemData;
import MakeItRain.Data.ModData;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRainStick extends Item {
    public ItemRainStick() {
        super();
        setUnlocalizedName("rainStick");
        setTextureName(ModData.ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
