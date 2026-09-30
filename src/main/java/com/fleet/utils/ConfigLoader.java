package com.fleet.utils;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigLoader {

    private static final Properties properties = new Properties();
    private static final String CONFIG_FILE = "config.properties";

    private ConfigLoader(){};

    static {
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream(CONFIG_FILE)){
            if (input == null) {
                System.err.println("Could not find " + CONFIG_FILE);
            }
            properties.load(input);
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public static String getProperty(String key, String defaultValue) {
        if (!properties.containsKey(key)){
            return defaultValue;
        }
        return properties.getProperty(key,defaultValue);
    }

    public static int getPropertyInt(String key, int defaultValue) {
        String value = properties.getProperty(key, null);
        if (value == null) {
            return defaultValue;
        }
            try {
                return Integer.parseInt(value.strip());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                return defaultValue;
            }
    }
}
