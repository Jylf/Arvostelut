/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvostelut;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author s1700331
 */
public class Yhteydenhallinta {
    
        // static luo luokkakohtaisen metodin jota kutsutaan luokannimi.metodinimi esum Yhteydenhallinta.avaaYhteys(url,kayttaja,salasana);
    public static Connection avaaYhteys(String ajuri, String url, String kayttaja, String salasana){
        
        try{
            Class.forName(ajuri).newInstance();
            return DriverManager.getConnection(url, kayttaja, salasana);
        }catch (Exception e) {
            System.out.println("Virhe "+e);
            return null;
        }
    
    
    }
}
