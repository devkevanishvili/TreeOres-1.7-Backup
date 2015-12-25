package com.lessoner.treeores.Handlers;

import com.lessoner.treeores.References;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckUpdates {
    public static boolean newversion;
    public static float versionnew = Float.parseFloat(References.VERSION) + 0.1F;

    public static void checkUpdate()
            throws IOException {
        URL url = new URL("https://dl.dropboxusercontent.com/u/79165610/TreeOres-1.7.10-" + String.valueOf(versionnew) + ".jar");
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        int responseCode = huc.getResponseCode();
        if (responseCode == 200) {
            newversion = true;
        }
    }
}
