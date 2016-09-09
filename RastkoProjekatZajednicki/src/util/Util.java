/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Rastko
 */
public class Util {

     private Properties properties;
    private static Util instance;
    
    public static final String MAP_KEY_SOKET = "soket";
    
    public static final int SERVER_STATUS_OPERACIJA_OK = 1;
    
    public static final int OPERACIJA_VRATI_SVE_KLIJENTE = 0;
    public static final int OPERACIJA_UBACI_ARANZMAN_U_BAZU = 2;
    public static final int OPERACIJA_VRATI_LISTU_ARANZMANA = 3;
    public static final int OPERACIJA_VRATI_DRZAVE_ZA_ARANZMAN = 4;
    public static final int OPERACIJA_UBACI_DRZAVU_U_BAZU = 5;
    public static final int OPERACIJA_VRATI_LISTU_MESTA = 6;
    public static final int OPERACIJA_VRATI_LISTU_ARANZMANA_PRAVIH = 7;
    public static final int OPERACIJA_UNESI_KLIJENTA = 8;
    public static final int OPERACIJA_VRATI_LISTU_RACUNA = 9;
    public static final int OPERACIJA_VRATI_RADNIKA = 10;
    
    
     private Util() throws FileNotFoundException, IOException {
        properties = new Properties();
        properties.load(new FileInputStream("db.properties"));
    }

    public static Util getInstance() throws IOException {
        if (instance == null) {
            instance = new Util();
        }
        return instance;

    }

    public String getDriver() {
        return properties.getProperty(properties.getProperty("current_db") + "_driver");
    }

    public String getUrl() {
        return properties.getProperty(properties.getProperty("current_db") + "_url");
    }

    public String getUser() {
        return properties.getProperty(properties.getProperty("current_db") + "_user");
    }

    public String getPassword() {
        return properties.getProperty(properties.getProperty("current_db") + "_password");
    }

    public void setCurrent_db(String value) {
        properties.setProperty("current_db", value);
    }
    
}
