package fr.polielio.project2;

import org.bukkit.plugin.java.JavaPlugin;

public class Updater implements Runnable
{
    private JavaPlugin _plugin;

    public Updater(JavaPlugin plugin)
    {
        _plugin = plugin;
        _plugin.getServer().getScheduler().scheduleSyncRepeatingTask(_plugin, this, 0L, 1L);
    }

    public void run()
    {
        for (UpdateType updateType : (UpdateType[])UpdateType.class.getEnumConstants()) {
            if (updateType.Elapsed()) {
                _plugin.getServer().getPluginManager().callEvent(new UpdateEvent(updateType));
            }
        }
    }
}