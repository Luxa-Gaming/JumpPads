package de.luxa;

import de.luxa.Listener.EVENTpads;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    public void onEnable() {



        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new EVENTpads(), this);



        System.out.println("JumpPads] Enabled");
    }
}
