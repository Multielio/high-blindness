package fr.polielio.project2;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class project2 extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new eventl(), this);
        new Updater(this).run();
    }
    @Override
    public void onDisable(){

    }
}
