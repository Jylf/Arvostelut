/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvostelut;

/**
 *
 * @author s1700331
 */
public class Arvio {
    
    private int paivamaara;
    private String ravintolannimi;
    private String ruoka_annos; 
    private String arvostelu;
    private int arvo;
    private String ravintolantyyppi;
    private String arvijoija;

    public Arvio(int paivamaara, String ravintolannimi, String ruoka_annos, String arvostelu, int arvo, String ravintolantyyppi, String arvijoija) {
        this.paivamaara = paivamaara;
        this.ravintolannimi = ravintolannimi;
        this.ruoka_annos = ruoka_annos;
        this.arvostelu = arvostelu;
        this.arvo = arvo;
        this.ravintolantyyppi = ravintolantyyppi;
        this.arvijoija = arvijoija;
    }

    public int getPaivamaara() {
        return paivamaara;
    }

    public void setPaivamaara(int paivamaara) {
        this.paivamaara = paivamaara;
    }



    public String getRavintolannimi() {
        return ravintolannimi;
    }

    public void setRavintolannimi(String ravintolannimi) {
        this.ravintolannimi = ravintolannimi;
    }

    public String getRuoka_annos() {
        return ruoka_annos;
    }

    public void setRuoka_annos(String ruoka_annos) {
        this.ruoka_annos = ruoka_annos;
    }

    public String getArvostelu() {
        return arvostelu;
    }

    public void setArvostelu(String arvostelu) {
        this.arvostelu = arvostelu;
    }

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public String getRavintolantyyppi() {
        return ravintolantyyppi;
    }

    public void setRavintolantyyppi(String ravintolantyyppi) {
        this.ravintolantyyppi = ravintolantyyppi;
    }

    public String getArvijoija() {
        return arvijoija;
    }

    public void setArvijoija(String arvijoija) {
        this.arvijoija = arvijoija;
    }

    @Override
    public String toString() {
        return "Arvio{" + "paivamaara=" + paivamaara + ", ravintolannimi=" + ravintolannimi + ", ruoka_annos=" + ruoka_annos + ", arvostelu=" + arvostelu + ", arvo=" + arvo + ", ravintolantyyppi=" + ravintolantyyppi + ", arvijoija=" + arvijoija + '}';
    }
    
    
    
    
    
    
    
}
