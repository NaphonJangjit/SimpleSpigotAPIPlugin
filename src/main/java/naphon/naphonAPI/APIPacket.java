package naphon.naphonAPI;

import org.bukkit.plugin.Plugin;

public class APIPacket {
    private String name;
    private Plugin sender;
    private String data;
    private String auth;
    public APIPacket(String name, Plugin sender, String data, String auth){
        this.name = name;
        this.sender = sender;
        this.data = data;
        this.auth = auth;
    }

    public String getName() {
        return name;
    }

    public Plugin getSender() {
        return sender;
    }

    public String getData(String auth) {
        if(auth.equals(this.auth)){
            return data;
        }
        return "NULL";
    }



}
