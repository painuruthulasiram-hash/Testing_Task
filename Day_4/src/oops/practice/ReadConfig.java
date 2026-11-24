
package oops.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    public static void main(String[] args) throws IOException {

       
        Properties prop = new Properties();

        
        FileInputStream fis =
                new FileInputStream("config.properties");

       
        prop.load(fis);

        
        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        fis.close();
    }
}

	


