package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read(String key) {
        //location of the file
        String path = "Files/Config.properties";

        // reading the file in the form of bytes data type
        // specially designed class to convert bytes into maps and help with other things
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream(path);) {
            // loading bytes from fileInputStream into maps
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // System.out.println(properties.get("url"));
        return properties.getProperty(key);
    }
}
