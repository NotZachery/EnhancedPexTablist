package me.notzachery.enhancedpextablist.Listeners;

import org.bukkit.entity.Player;
import ru.tehkode.permissions.PermissionGroup;
import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

import java.util.ArrayList;

public class Pex {
    public static PermissionManager pex = PermissionsEx.getPermissionManager();

    public static String[] getGroups() {
        PermissionGroup[] groups;
        ArrayList<String> groupList = new ArrayList<String>();
        for (PermissionGroup g : groups = pex.getGroups()) {
            groupList.add(g.getName());
        }
        String[] groupArray = groupList.toArray(new String[groupList.size()]);
        return groupArray;
    }

    public static String getPlayerGroup(Player player) {
        String playerName = player.getName();
        PermissionUser user = pex.getUser(playerName);
        String[] playerGroups = user.getGroupsNames();
        String playerGroup = playerGroups[0];
        return playerGroup;
    }
}