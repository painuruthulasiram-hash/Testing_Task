package oops.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExceptionHandling {

    Properties prop = new Properties();

    public ExceptionHandling() {

        try {
            FileInputStream fis =
                new FileInputStream("config.properties");

            prop.load(fis);
            fis.close();

        } catch (IOException e) {
            System.out.println("Config file not found: " + e.getMessage());
        }
    }

    public String getRequiredValue(String key) {

        String value = prop.getProperty(key);

        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Property not found: " + key);
        }

        return value;
    }
}



