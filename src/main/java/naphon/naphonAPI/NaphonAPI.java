package naphon.naphonAPI;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NaphonAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(Utils.pluginMessage("&aPlugin " + getName() + " enabled!"));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(Utils.pluginMessage("&cPlugin " + getName() + " disabled!"));
    }
}
