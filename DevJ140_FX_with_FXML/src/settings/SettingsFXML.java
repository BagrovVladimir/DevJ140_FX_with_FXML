
package settings;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class SettingsFXML {
    
    Properties properties;
    
    public final static String URL = "url";
    public final static String LOGIN = "login";
    public final static String PSW = "psw";

    public SettingsFXML() {
        properties = new Properties();
        File file = new File("properties.prop");  
        try { 
            if(!file.exists())
                file.createNewFile();
                properties.load(new  FileReader(file));
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
    public String getValue(String key){
        String value = properties.getProperty(key);
        return value;
    } 
}
