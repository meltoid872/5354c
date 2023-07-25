package com.example.warpplugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.example.warpplugin.SetWarpCommand;
import com.example.warpplugin.WarpCommand;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("setwarp").setExecutor(new SetWarpCommand(this));
        getCommand("warp").setExecutor(new WarpCommand(this));

        saveDefaultConfig();

        getLogger().info("il plugin è stato abilitato");
    }

    @Override
    public void onDisable() {
        getLogger().info("il plugin è stato disabilitato");
    }
}
