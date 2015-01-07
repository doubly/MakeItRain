package MakeItRain;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = MakeItRain.MOD_ID, version = MakeItRain.VERSION, name = MakeItRain.NAME)
public class MakeItRain {

    public static final String MOD_ID = "makeitrain";
    public static final String VERSION = "0.0";
    public static final String NAME = "Make It Rain!";

    @Instance(value = MakeItRain.MOD_ID)
    public static MakeItRain instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="ClientProxy", serverSide="CommonProxy")
    public static CommonProxy proxy;

    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
        // Stub Method
    }

    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();

        Item rainStick = new RainStickItem();

        GameRegistry.registerItem(rainStick, "rainStick");

        // Add the rain stick recipe
        Object stick = Item.itemRegistry.getObject("stick");

        GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block), " xx", "x x", "xx ", 'x', stick);
    }

    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }

}
