package novamc.bettermending;

import org.bukkit.plugin.java.JavaPlugin;

public class BetterMending extends JavaPlugin {
    public static BetterMending instance;

    @Override
    public void onEnable() {
        instance = this;

        
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
