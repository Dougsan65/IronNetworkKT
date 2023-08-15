package com.envyus.ironnetworkkt

import com.envyus.ironnetworkkt.Commands.TeleportCommand
import com.envyus.ironnetworkkt.Listeners.BreakBlock
import org.bukkit.plugin.java.JavaPlugin
import java.net.http.WebSocket.Listener

class IronNetworkKT : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Teleport plugin was enabled")
        getCommand("teleport")?.setExecutor(TeleportCommand())
        val breakBlock = BreakBlock()
        server.pluginManager.registerEvents(breakBlock, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Teleport plugin was disabled")
    }
}
