/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Владимир
 */
public class Settings {
    
    Properties properties;
    
    public final static String URL = "url";
    public final static String LOGIN = "login";
    public final static String PSW = "psw";

    public Settings() {
        properties = new Properties();
        File file = new File("settings.prop");  
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
