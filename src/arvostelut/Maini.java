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
        
        System.out.println("Anna ravintolan nimi :");
        String ravintolannimi = lukija.nextLine();
        System.out.println("Ruoka-annos");
        String ruoka_annos = lukija.nextLine();
        System.out.println("Anna päivämäärä");
        int paivamaara = lukija.nextInt();
        System.out.println("Anna päivämäärä");
        int arvosana = lukija.nextInt();
        
        yhteysTietokantaan.lisaaArvio(new Arvio(ravintolannimi));
        
    }
    
}
