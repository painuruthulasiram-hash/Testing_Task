package oops.practice;





import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Create Properties object
    Properties prop = new Properties();

    // Load config.properties file
    public ConfigReader() {
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            prop.load(fis);
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read required value
    public String getRequiredValue(String key) {

        String value = prop.getProperty(key);

        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Missing configuration value: " + key
            );
        }

        return value;
    }
}

