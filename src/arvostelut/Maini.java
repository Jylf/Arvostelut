/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvostelut;

import java.util.Scanner;

/**
 *
 * @author s1700331
 */
public class Maini {
    public static void main(String[] args) {
  
        Yhteys yhteysTietokantaan = new Yhteys();
        
        
       
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna ravintolan nimi :");
        String ravintolannimi = lukija.nextLine();
        System.out.print("Anna päivämäärä :");
        int paivamaara = lukija.nextInt();
        System.out.print("Anna ravintolan tyyppi :");
        String tyyppi = lukija.nextLine();
        System.out.print("Anna ruoka-annos: ");
        String ruokaannos = lukija.nextLine();
        
        
        yhteysTietokantaan.lisaaArvio(new Arvio(ravintolannimi));
        
    }
    
}
