package me.jartype.firstplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveMessages implements Listener {
        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent e) {
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&a&l+ " + e.getPlayer().getName() + " &a&ljoined the server"));
        }
        @EventHandler
        public void onPlayerQuit(PlayerQuitEvent e) {
            e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&c&l- " + e.getPlayer().getName() + " &c&lleft the server"));
}}

