package me.arythite.phantomreset;

import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PhantomCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p;
        if (sender instanceof Player) {
            p = (Player) sender;
        } else {
            return true;
        }

        if (p.hasPermission("sleep.use"))
            p.setStatistic(Statistic.TIME_SINCE_REST, 0);
        else
            p.sendMessage(ChatColor.RED + "You do not have permission to use this command");

        return true;
    }
}
