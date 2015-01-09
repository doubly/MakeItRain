package MakeItRain;

import MakeItRain.Handler.MakeItRainEventHandler;
import MakeItRain.Proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.Logger;

@Mod(modid = MakeItRain.ID, name = MakeItRain.NAME, version = MakeItRain.VERSION)
public class MakeItRain {

    public static final String ID = "makeitrain";
    public static final String NAME = "Make It Rain";
    public static final String VERSION = "1.0";

    @Instance(MakeItRain.ID)
    public static MakeItRain instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "MakeItRain.Proxy.ClientProxy", serverSide = "MakeItRain.Proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Starting Make It Rain");

        MinecraftForge.EVENT_BUS.register(new MakeItRainEventHandler());

        MakeItRainItem.registerItems();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();

        MakeItRainRecipe.registerCraftingRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
