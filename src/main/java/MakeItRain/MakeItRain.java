package MakeItRain;

import MakeItRain.Data.ModData;
import MakeItRain.Proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModData.ID, name = ModData.NAME, version = ModData.VERSION, dependencies = ModData.DEPENDENCIES)
public class MakeItRain {

    @Instance(ModData.ID)
    public static MakeItRain instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "MakeItRain.Proxy.ClientProxy", serverSide = "MakeItRain.Proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Starting Make It Rain");

        MakeItRainItem.registerItems();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();

        MakeItRainRecipe.registerCraftingRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }

}
