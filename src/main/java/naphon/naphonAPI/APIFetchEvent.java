package naphon.naphonAPI;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;

import java.util.Map;

public class APIFetchEvent extends Event implements Cancellable {
    String name;
    Map<String, Object> params;
    boolean isCancelled;
    private static final HandlerList handlers = new HandlerList();
    public APIFetchEvent(String name, Map<String, Object> params){
        this.name = name;
        this.params = params;
        this.isCancelled = false;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList(){
        return handlers;
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getParams() {
        return params;
    }


    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }
}
