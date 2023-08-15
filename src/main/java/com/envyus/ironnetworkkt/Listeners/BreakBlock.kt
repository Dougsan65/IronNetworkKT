package com.envyus.ironnetworkkt.Listeners


import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Location
import org.bukkit.event.EventHandler
import java.net.http.WebSocket.Listener
import org.bukkit.Material
import org.bukkit.entity.Cow
import org.bukkit.entity.Entity
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.block.BlockBreakEvent


class BreakBlock : Listener, org.bukkit.event.Listener {

    @EventHandler
    fun onBreakEvent(e: BlockBreakEvent){

        val blockTypeDebug = e.block.type.toString()
        val blockType = e.block.type
        val p = e.player

        val blockLocation: Location = e.block.location //Pega a localização do bloco.
        val newYLocation = blockLocation.y + 1 // Pega a localização do bloco e aumenta no Y +1.
        val newLocation = Location(blockLocation.world, blockLocation.x, newYLocation, blockLocation.z) //Seta a nova localização, com a variavel newY

        p.sendMessage(blockTypeDebug)
        if (blockType == Material.GRASS_BLOCK){
            p.sendMessage("§9é uma grama")



            val cow = newLocation.world?.spawnEntity(newLocation, EntityType.LIGHTNING)
            val pig = newLocation.world?.spawnEntity(newLocation, EntityType.PIG)
            val creeper = newLocation.world?.spawnEntity(newLocation, EntityType.CREEPER)
            val firework = newLocation.world?.spawnEntity(newLocation, EntityType.FIREWORK)


        }else{
            p.sendMessage("§cnão é uma grama")
        }


    }

}