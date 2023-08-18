package com.envyus.ironnetworkkt

import GiveItems
import com.envyus.ironnetworkkt.Commands.TeleportCommand
import com.envyus.ironnetworkkt.Listeners.BreakBlock
import com.envyus.ironnetworkkt.Listeners.LeaveJoinListener
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Color
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin
import java.net.http.WebSocket.Listener

class IronNetworkKT : JavaPlugin() {

    fun sendColoredMessageToConsole(message: String) {
        val coloredMessage = ChatColor.translateAlternateColorCodes('&', message)
        Bukkit.getConsoleSender().sendMessage(coloredMessage)
    }

    override fun onEnable() {
        sendColoredMessageToConsole("&8Iron Network &bplugin in &1Kotlin &2was enabled")

        // Commands Implements
        getCommand("teleport")?.setExecutor(TeleportCommand())
        getCommand("diamantes")?.setExecutor((GiveItems()))

        //Listeners Implements
        val breakBlock = BreakBlock()
        val joinEvent = LeaveJoinListener()
        server.pluginManager.registerEvents(breakBlock, this)
        server.pluginManager.registerEvents(joinEvent, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
        sendColoredMessageToConsole("&8Iron Network &bplugin in &1Kotlin &cwas disabled")
    }

}
