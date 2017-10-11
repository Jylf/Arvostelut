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
        
        
        System.out.println("Annatko arvostelun vai haet? A/H");
        String vastaus = lukija.nextLine();
        if(vastaus.equals("A"))
        {
        
        

        System.out.print("Anna päivämäärä: ");
        int paivamaara = lukija.nextInt();
        lukija.nextLine();
        
        System.out.print("Anna ravintolan nimi: ");
        String ravintolannimi = lukija.nextLine();
        
        System.out.print("Anna ruoka-annos: ");
        String ruoka_annos = lukija.nextLine();
        
        System.out.print("Anna arvostelu");
        String arvostelu = lukija.nextLine();
        
        System.out.print("Anna arvosana: ");
        int arvo = lukija.nextInt();
        lukija.nextLine();
        
        System.out.print("Mikä on ravintolan tyyppi?");
        String ravintolantyyppi = lukija.nextLine();
        
        System.out.print("Mikä on nimesi?");
        String arvijoija = lukija.nextLine();

        yhteysTietokantaan.lisaaArvio(new Arvio(paivamaara, ravintolannimi, ruoka_annos, arvostelu, arvo, ravintolantyyppi, arvijoija));
        }
        if(vastaus.equals("H")){
            
            
            
            
            yhteysTietokantaan.haeArvio();
        }
    }

}
