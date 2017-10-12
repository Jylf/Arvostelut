
package arvostelut;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Yhteys {
    
    private String ajuri="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://10.9.0.60/s1700330?useSSL=false";
    private String kayttaja = "s1700330";
    private String salasana = "17RY_Xie";
    
    private String ravintolaLisaysSQL = "insert into RavintolanArvostelu(pvm,ravnimi,ruokannos,sanarvos,numarvo,ravtyypp,arvnimi) values(?,?,?,?,?,?,?)";
    private String tiedonHakuSQL = "select * from RavintolanArvostelu where Ravintola_ID=?";
    
    
    public void lisaaArvio(Arvio uusi){
        Connection yhteys=null;
        try{
           yhteys = Yhteydenhallinta.avaaYhteys(ajuri,url,kayttaja,salasana);
           
        }catch(Exception e){
            System.out.println("Tietovarasto ei toimi");
            
        }
        try{
           PreparedStatement ravintolanLisays = yhteys.prepareStatement(ravintolaLisaysSQL);
           ravintolanLisays.setString(1, uusi.getPaivamaara());
           ravintolanLisays.setString(2, uusi.getRavintolannimi());
           ravintolanLisays.setString(3, uusi.getRuoka_annos());
           ravintolanLisays.setString(4, uusi.getArvostelu());
           ravintolanLisays.setInt(5, uusi.getArvo());
           ravintolanLisays.setString(6, uusi.getRavintolantyyppi());
           ravintolanLisays.setString(7, uusi.getArvijoija());
//           henkilonLisays.setString(2, uusi.getSukunimi());
//           henkilonLisays.setInt(3,uusi.getSyntvuosi());
           
           ravintolanLisays.executeUpdate();
           ravintolanLisays.close();
           

        }catch(Exception e){
            
            System.out.println("Lisäys ei onnistunut ");
        }
    }
          public Arvio haeArvio(int id){
        Connection yhteys=null;
        try{
           yhteys = Yhteydenhallinta.avaaYhteys(ajuri,url,kayttaja,salasana);
           
        }catch(Exception e){
            System.out.println("Tietovarasto ei toimi");
        } 
        
        try{
          PreparedStatement tiedonHaku = yhteys.prepareStatement(tiedonHakuSQL);
          tiedonHaku.setInt(1, id);
           ResultSet hakutulos = tiedonHaku.executeQuery();
           while(hakutulos.next()){
               Arvio a = new Arvio(hakutulos.getString(2),
                                   hakutulos.getString(3),
                                   hakutulos.getString(4),
                                   hakutulos.getString(5),
                                   hakutulos.getInt(6),
                                   hakutulos.getString(7),
                                   hakutulos.getString(8));
               return a;
           }
           
           
           
           }catch(Exception e){
               System.out.println("Haku ei onnistunut");
           }
       
    
    
                return null;
              }
              }

