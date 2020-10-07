package me.arythite.phantomreset;

import org.bukkit.plugin.java.JavaPlugin;

public final class PhantomReset extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("pr").setExecutor(new PhantomCommand());
    }

    @Override
    public void onDisable() {

    }
}
