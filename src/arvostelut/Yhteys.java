/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvostelut;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author s1700331
 */
public class Yhteys {
    
    private String ajuri="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://10.9.0.60/s1700330?useSSL=false";
    private String kayttaja = "s1700330";
    private String salasana = "17RY_Xie";
    
    private String ravintolaLisaysSQL = "insert into RavintolaArv(ravintolannimi) values(?)";
    private String ravintolanHakuSQL = "select * from RavintolaArv where Ravintola_ID=?";
    
    
    public void lisaaArvio(Arvio uusi){
        Connection yhteys=null;
        try{
           yhteys = Yhteydenhallinta.avaaYhteys(ajuri,url,kayttaja,salasana);
           
        }catch(Exception e){
            System.out.println("Tietovarasto ei toimi");
            
        }
        try{
           PreparedStatement ravintolanLisays = yhteys.prepareStatement(ravintolaLisaysSQL);
           ravintolanLisays.setString(1, uusi.getRavintolannimi());
//           henkilonLisays.setString(2, uusi.getSukunimi());
//           henkilonLisays.setInt(3,uusi.getSyntvuosi());
           
           ravintolanLisays.executeUpdate();
           ravintolanLisays.close();
            
        }catch(Exception e){
            
            System.out.println("Lisäys ei onnistunut ");
        }
    }   
    
    
}