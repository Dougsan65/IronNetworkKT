package com.envyus.ironnetworkkt.Listeners

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import java.net.http.WebSocket.Listener

class LeaveJoinListener : Listener, org.bukkit.event.Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent){
        val p = e.player

        fun sendColoredMessageFromPlayer(message: String) {
            val coloredMessage = ChatColor.translateAlternateColorCodes('&', message)
            p.sendMessage(coloredMessage)
        }



        val teste = p.displayName
        val ping = p.ping
        val max =

            sendColoredMessageFromPlayer("&b$teste entrou no servidor com o ping de $ping")


    }
}