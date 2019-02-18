package me.notzachery.enhancedpextablist.Commands;

import me.notzachery.enhancedpextablist.EnhancedPexTablist;
import me.notzachery.enhancedpextablist.Listeners.Pex;
import me.notzachery.enhancedpextablist.Listeners.Tablist;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class EPTCommand implements CommandExecutor {

    public Plugin plugin = EnhancedPexTablist.getPlugin(EnhancedPexTablist.class);

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("EPT"))
        {
            if (sender.hasPermission("EnhancedPexTablist.update")) {
                sender.sendMessage(ChatColor.AQUA + "EnhancedPexTablist" + ChatColor.GREEN + " Config reloaded!");
                plugin.reloadConfig();
                Player player = (Player) sender;
                String playerGroup = Pex.getPlayerGroup(player);
                Tablist.apply(player, playerGroup);
            }
            else
            {
                sender.sendMessage(ChatColor.RED + "You do not have permission to execute this command!");
            }
        }
        return true;
    }
}
