package me.notzachery.enhancedpextablist.Listeners;

import me.notzachery.enhancedpextablist.EnhancedPexTablist;
import java.util.HashMap;

public class Config {
    private EnhancedPexTablist plugin;
    public static HashMap<String, String> groupColors = new HashMap();

    public Config(EnhancedPexTablist plugin)
    {
        this.plugin = plugin;
    }

    public void update() {
        String[] groups;
        for (String g : groups = Pex.getGroups()) {
            if (this.plugin.getConfig().getString(g) != null) continue;
            this.plugin.getConfig().set(g, "\u00a7a");
        }
        this.plugin.saveConfig();
    }

    public void updateColors() {
        String[] gS;
        this.plugin.reloadConfig();
        groupColors.clear();
        for (String g : gS = Pex.getGroups()) {
            String c = this.plugin.getConfig().getString(g);
            c = c.replaceAll("&", "\u00a7");
            groupColors.put(g, c);
        }
    }
}
