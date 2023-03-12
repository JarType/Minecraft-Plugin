package me.jartype.firstplugin.managers;

import java.io.*;
import java.util.HashMap;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import me.jartype.firstplugin.FirstPlugin;

public class CurrencyManager {

    private HashMap<UUID, Integer> currency = new HashMap<UUID, Integer>();

    public FirstPlugin plugin;

    public CurrencyManager(FirstPlugin plugin) {
        this.plugin = plugin;
    }
    public void saveCurrencyFile() throws FileNotFoundException, IOException {
        for (OfflinePlayer p : Bukkit.getOfflinePlayers()) {
            File file = new File("CurrencyData/currency.dat");
            ObjectOutputStream output = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream(file)));

            UUID uuid = p.getUniqueId();
            if (currency.get(uuid) != null) {
                currency.put(uuid, currency.get(uuid));
            }

            try {
                output.writeObject(currency);
                output.flush();
                output.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void loadCurrencyFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("CurrencyData/currency.dat");

        if (file != null) {
            ObjectInputStream input = new ObjectInputStream(new GZIPInputStream(new FileInputStream(file)));
            Object readObject = input.readObject();
            input.close();

            if (!(readObject instanceof HashMap))
                throw new IOException("Data is not hashmap");
            currency = (HashMap<UUID, Integer>) readObject;
            for (UUID key : currency.keySet()) {
                currency.put(key, currency.get(key));
            }
        }
    }
}
