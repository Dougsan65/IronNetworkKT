import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class GiveItems : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if (sender is Player) {
            if (label.equals("diamantes", ignoreCase = true)) {
                if (args.size == 1) {
                    try {
                        val amount = args[0].toInt()
                        val items = ItemStack(Material.DIAMOND, amount)
                        sender.inventory.addItem(items)
                        sender.sendMessage("§bGanhou diamantes! =D")
                    } catch (e: NumberFormatException) {
                        sender.sendMessage("§bO argumento deve ser um número inteiro.")
                    }
                } else {
                    sender.sendMessage("§bO uso correto deste comando é /diamantes (quantidade)")
                }
            } else {
                sender.sendMessage("qq tu fez maluco")
            }
        }else{
            Bukkit.getConsoleSender().sendMessage("O comando só pode ser enviado por jogadores")
        }
        return true
    }
}