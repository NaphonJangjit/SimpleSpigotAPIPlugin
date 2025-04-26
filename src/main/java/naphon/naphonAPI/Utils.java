package naphon.naphonAPI;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;

public class Utils {

    public static String format(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static String serverMessage(String msg){
        return format("&7[&bServer&7] &r" + msg);
    }

    public static String pluginMessage(Plugin plugin, String msg){
        return format("&7[&a" + plugin.getName() + "&7] &r" + msg);
    }

    public static String apiMessage(String msg){
        return format("&7[&eAPI&7] &r" + msg);
    }

    public static String permissionMessage(String msg){
        return format("&7[&4Permission&7] &r" + msg);
    }

    public static String errorMessage(String msg){
        return format("&7[&cError&7] &r" + msg);
    }

}
