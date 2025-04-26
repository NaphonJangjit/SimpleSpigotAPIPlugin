package naphon.naphonAPI;

import org.bukkit.Bukkit;

import java.util.Map;

public class FetchAPI {

    private static Map<String, FetchProvider> providers;

    public static void registerProvider(String name, FetchProvider provider){
        providers.put(name, provider);
        Bukkit.getConsoleSender().sendMessage(Utils.apiMessage("&aProvider &7" + name + " &aregistered!"));
    }

    public static Object fetch(String name, Map<String, Object> params){
        APIFetchEvent event = new APIFetchEvent(name, params);
        Bukkit.getServer().getPluginManager().callEvent(event);
        if(event.isCancelled()){
            return null;
        }
        return providers.get(name).fetch(params);
    }
}
