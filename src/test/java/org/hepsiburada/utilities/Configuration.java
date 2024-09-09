package org.hepsiburada.utilities;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Configuration {

    private final Properties configProp = new Properties();
    private Configuration()
    {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            configProp.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class LazyHolder
    {
        private static final Configuration INSTANCE = new Configuration();
    }

    public static Configuration getInstance()
    {
        return LazyHolder.INSTANCE;
    }

    public String getProperty(String key){
        return configProp.getProperty(key);
    }

    public Set<String> getAllPropertyNames(){
        return configProp.stringPropertyNames();
    }

    public boolean containsKey(String key){
        return configProp.containsKey(key);
    }

    public void setProperty(String key, String value){
        configProp.setProperty(key, value);
    }

    public void flush() throws FileNotFoundException, IOException {
        try (final OutputStream outputstream
                     = new FileOutputStream("config.properties");) {
            configProp.store(outputstream,"File Updated");
        }
    }
}
