package naphon.naphonAPI;

import org.bukkit.ChatColor;

public class Utils {

    public static String format(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static String pluginMessage(String msg){
        return format("&7[&eAPI&7] &r" + msg);
    }

    public static String permissionMessage(String msg){
        return format("&7[&4Permission&7] &r" + msg);
    }

    public static String errorMessage(String msg){
        return format("&7[&cError&7] &r" + msg);
    }

}
