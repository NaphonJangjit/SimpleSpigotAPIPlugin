package naphon.naphonAPI;

import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;

public class APIInstance {

    private Map<String, APIPacket> packets = new HashMap<>();

    public void hostPacket(APIPacket packet){
        packets.put(packet.getName(), packet);
    }

    public String getData(String name, String auth){
        return packets.get(name).getData(auth);
    }

}
