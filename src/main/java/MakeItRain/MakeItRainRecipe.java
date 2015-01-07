package MakeItRain;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MakeItRainRecipe {

    public static void registerCraftingRecipes() {

        // Add the rain stick recipe
        GameRegistry.addRecipe(new ItemStack(MakeItRainItem.rainStickItem),
                " zz", "xyz", "xx ",
                'x', Items.stick,
                'y', Items.ender_pearl,
                'z', Items.bone);
    }

}
