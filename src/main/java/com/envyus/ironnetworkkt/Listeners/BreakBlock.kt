package com.envyus.ironnetworkkt.Listeners


import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import java.net.http.WebSocket.Listener

class BreakBlock : Listener, org.bukkit.event.Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent){

        val p = event.player

        val teste = "zé da manga"

        p.sendMessage("doidao entrou no server $teste")

    }
}