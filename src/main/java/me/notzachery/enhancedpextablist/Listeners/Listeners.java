package me.notzachery.enhancedpextablist.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listeners
        implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();

        String playerGroup = Pex.getPlayerGroup(player);

        Tablist.apply(player, playerGroup);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event)
    {
        Player player = event.getPlayer();

        String playerGroup = Pex.getPlayerGroup(player);

        Tablist.apply(player, playerGroup);
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event)
    {
        Player player = event.getPlayer();

        String playerGroup = Pex.getPlayerGroup(player);

        Tablist.apply(player, playerGroup);
    }
}
