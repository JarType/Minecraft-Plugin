package me.jartype.firstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player) {
            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, 9, ChatColor.LIGHT_PURPLE + "Crystal Shop");


            ItemStack air1 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemStack air2 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemStack air3 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemStack stats = new ItemStack(Material.DIAMOND_SWORD);
            ItemStack comming1 = new ItemStack(Material.BARRIER);
            ItemStack comming2 = new ItemStack(Material.BARRIER);
            ItemStack air4 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemStack air5 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemStack air6 = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);



            ItemMeta air1_meta = air1.getItemMeta();
            air1_meta.setDisplayName(ChatColor.BLACK + "Nothing");
            ArrayList<String> air1_lore = new ArrayList<>();
            air1_lore.add(ChatColor.WHITE + "");
            air1_meta.setLore(air1_lore);
            air1.setItemMeta(air1_meta);


            ItemMeta air2_meta = air2.getItemMeta();
            air2_meta.setDisplayName(ChatColor.BLACK + "Nothing");
            ArrayList<String> air2_lore = new ArrayList<>();
            air2_lore.add(ChatColor.WHITE + "");
            air2_meta.setLore(air2_lore);
            air2.setItemMeta(air2_meta);


            ItemMeta air3_meta = air3.getItemMeta();
            air3_meta.setDisplayName(ChatColor.BLACK + "Nothing");
            ArrayList<String> air3_lore = new ArrayList<>();
            air3_lore.add(ChatColor.WHITE + "");
            air3_meta.setLore(air3_lore);
            air3.setItemMeta(air3_meta);

            
            ItemMeta stats_meta = stats.getItemMeta();
            stats_meta.setDisplayName(ChatColor.RED + "Stats");
            ArrayList<String> stats_lore = new ArrayList<>();
            stats_lore.add(ChatColor.WHITE + "U can upgrade your stats here.");
            stats_meta.setLore(stats_lore);
            stats.setItemMeta(stats_meta);


            ItemMeta comming1_meta = comming1.getItemMeta();
            comming1_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lComming Soon"));
            ArrayList<String> comming1_lore = new ArrayList<>();
            comming1_lore.add(ChatColor.RED + "Let him cook!");
            comming1_meta.setLore(comming1_lore);
            comming1.setItemMeta(comming1_meta);

            ItemMeta comming2_meta = comming2.getItemMeta();
            comming2_meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lComming Soon"));
            ArrayList<String> comming2_lore = new ArrayList<>();
            comming2_lore.add(ChatColor.RED + "Let him cook!");
            comming2_meta.setLore(comming2_lore);
            comming2.setItemMeta(comming2_meta);


            ItemMeta air4_meta = air4.getItemMeta();
            air4_meta.setDisplayName(ChatColor.BLACK + "Nothing");
            ArrayList<String> air4_lore = new ArrayList<>();
            air4_lore.add(ChatColor.WHITE + "");
            air4_meta.setLore(air4_lore);
            air4.setItemMeta(air4_meta);


            ItemMeta air5_meta = air5.getItemMeta();
            air5_meta.setDisplayName(ChatColor.BLACK + "Nothing");
            ArrayList<String> air5_lore = new ArrayList<>();
            air5_lore.add(ChatColor.WHITE + "");
            air5_meta.setLore(air5_lore);
            air5.setItemMeta(air5_meta);


            ItemMeta air6_meta = air6.getItemMeta();
            air6_meta.setDisplayName(ChatColor.BLACK + "Nothing");
            ArrayList<String> air6_lore = new ArrayList<>();
            air6_lore.add(ChatColor.WHITE + "");
            air6_meta.setLore(air6_lore);
            air6.setItemMeta(air6_meta);






            ItemStack[] menu_items = {air1, air2, air3, stats, comming1, comming2, air4, air5, air6};
            gui.setContents(menu_items);
            player.openInventory(gui);
        }




        return true;
    }
}
