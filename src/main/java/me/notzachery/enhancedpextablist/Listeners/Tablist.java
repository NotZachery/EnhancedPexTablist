package me.notzachery.enhancedpextablist.Listeners;

import java.util.HashMap;
import org.bukkit.entity.Player;

public class Tablist {
    public static void apply(Player player, String playerGroup) {
        String longDisplayName;
        String displayName = longDisplayName = Config.groupColors.get(playerGroup) + player.getName();
        if (longDisplayName.length() > 16) {
            displayName = longDisplayName.substring(0, 16);
        }
        player.setPlayerListName(displayName);
    }
}

