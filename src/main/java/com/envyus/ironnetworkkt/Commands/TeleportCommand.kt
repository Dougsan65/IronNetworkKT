package com.envyus.ironnetworkkt.Commands

import org.bukkit.Location
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class TeleportCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (args.size == 3) {
                val x = args[0].toDouble()
                val y = args[1].toDouble()
                val z = args[2].toDouble()

                val location = Location(sender.world, x, y, z)
                sender.teleport(location)
                sender.sendMessage("Teleported to location: $x, $y, $z")
            } else {
                sender.sendMessage("Usage: /teleport <x> <y> <z>")
            }
        } else {
            sender.sendMessage("This command can only be used by players!")
        }
        return true
    }
}





