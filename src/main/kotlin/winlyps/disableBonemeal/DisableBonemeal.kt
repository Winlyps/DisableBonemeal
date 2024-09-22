package winlyps.disableBonemeal

import org.bukkit.plugin.java.JavaPlugin

class DisableBonemeal : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(BonemealListener(this), this)

        logger.info("DisableBonemeal plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("DisableBonemeal plugin has been disabled.")
    }
}