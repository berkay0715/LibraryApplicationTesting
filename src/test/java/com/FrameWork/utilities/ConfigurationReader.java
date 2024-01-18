package com.FrameWork.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try{
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName){
        return properties.getProperty(keyName);
    }
    public static void setProperty(String key, String value) {
        properties.setProperty(key,value);

        // Güncellenmiş şifreyi properties dosyasına yaz
        try (FileOutputStream fileOutput = new FileOutputStream("configuration.properties")) {
            properties.store(fileOutput, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Güncellendikten sonra properties dosyasını tekrar yükle
        try (FileInputStream fileInput = new FileInputStream("configuration.properties")) {
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
