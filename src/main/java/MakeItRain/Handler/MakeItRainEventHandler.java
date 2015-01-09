package MakeItRain.Handler;

import MakeItRain.MakeItRain;
import MakeItRain.MakeItRainItem;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class MakeItRainEventHandler {

    @SubscribeEvent
    public void handleDeathEvent(LivingDeathEvent event) {
        if (event.entityLiving instanceof EntityPlayer) {
            MakeItRain.logger.info("Lol you died... lol lol you died");

            if (event.source == DamageSource.outOfWorld) {
                EntityPlayer player = (EntityPlayer) event.entityLiving;

                ItemStack inHand = player.getHeldItem();

                if (inHand != null) {
                    if (inHand.getItem() == MakeItRainItem.rainStickItem) {
                        MakeItRain.logger.info("MAKE IT RAAAAAIN!");

                        MinecraftServer.getServer().worldServers[0].getWorldInfo().setRaining(true);
                        // TODO :: For the thunders setThundering
                        // TODO :: Add server announcement about the death and rain.
                    }
                } else {
                    MakeItRain.logger.info("Void sammiched, for no good reason!");
                }
            }

        } else {
            MakeItRain.logger.info("Awww something died.");
        }
    }

}
