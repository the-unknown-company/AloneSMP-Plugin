package me.rishipatwardhan.alonesmppublic

import me.rishipatwardhan.alonesmppublic.listeners.PlayerJumpListener
import org.bukkit.plugin.java.JavaPlugin

class AloneSmpPublic : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Server Loaded!")

        registerListeners()
    }

    private fun registerListeners() {
        server.pluginManager.registerEvents(PlayerJumpListener(), this)


        logger.info("Listeners Have Been Registered (v0.1)")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Server Unloaded!")
    }
}
