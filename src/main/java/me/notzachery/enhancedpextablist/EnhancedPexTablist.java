package me.notzachery.enhancedpextablist;

import me.notzachery.enhancedpextablist.Commands.EPTCommand;
import me.notzachery.enhancedpextablist.Listeners.Config;
import me.notzachery.enhancedpextablist.Listeners.Listeners;
import me.notzachery.enhancedpextablist.Listeners.Pex;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class EnhancedPexTablist extends JavaPlugin {
    private Config config;

    public void onEnable() {
        if (Bukkit.getServer().getPluginManager().getPlugin("PermissionsEx").equals(null)) {
            this.getLogger().info(ChatColor.RED + "PermissionsEx is needed for EnhancedPexTablist to work!");
            Bukkit.getServer().getPluginManager().disablePlugin(this);
        } else {
            getLogger().info(ChatColor.GREEN + "SimplyASpawn 1.0-SNAPSHOT Enabled");
            Bukkit.getServer().getPluginManager().registerEvents(new Listeners(), this);
            getCommand("EPT").setExecutor(new EPTCommand());
            this.saveConfig();
            this.config = new Config(this);
            this.config.update();
            this.config.updateColors();
            this.reloadConfig();
        }
    }

    public void onDisable() {
        this.config = null;
        Pex.pex = null;
        Config.groupColors = null;
        this.reloadConfig();
        getLogger().info(ChatColor.RED + "SimplyASpawn 1.0-SNAPSHOT Disabled");
    }
}