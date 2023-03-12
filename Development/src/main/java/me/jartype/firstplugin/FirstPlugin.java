package me.jartype.firstplugin;


import me.jartype.firstplugin.events.ClickEvent;
import me.jartype.firstplugin.listeners.JoinLeaveMessages;
import me.jartype.firstplugin.listeners.MobKills;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import me.jartype.firstplugin.commands.GUICommand;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerManagers();
        registerCommands();
        registerListeners();
        getServer().getPluginManager().registerEvents(new MobKills(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveMessages(), this);

        //vsechno k gui shopu!
        getCommand("gui").setExecutor(new GUICommand());
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);

    }

    public void registerManagers() {

    }

    public void registerCommands() {

    }

    public void registerListeners() {

    }


}