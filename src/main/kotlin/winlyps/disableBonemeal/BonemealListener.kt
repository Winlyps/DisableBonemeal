package winlyps.disableBonemeal

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.plugin.java.JavaPlugin

class BonemealListener(private val plugin: JavaPlugin) : Listener {

    @EventHandler
    fun onPlayerInteract(event: PlayerInteractEvent) {
        // Check if the player is using bonemeal
        if (event.action == Action.RIGHT_CLICK_BLOCK && event.item?.type?.name?.contains("BONE_MEAL") == true) {
            event.isCancelled = true
        }
    }
}