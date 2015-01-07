package MakeItRain;

import MakeItRain.Item.ItemRainStick;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class MakeItRainItem {

    public static Item rainStickItem;

    public static void registerItems()
    {
        rainStickItem = new ItemRainStick();
        GameRegistry.registerItem(rainStickItem, "RainStickItem");
    }
}
