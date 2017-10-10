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
    
    private String ravintolannimi;
    private String ruoka_annos;
    private Int paivamaara; 
    private Int arvo;
    private String ravintolantyyppi;
    private String arvijoija;

    public Arvio(String ravintolannimi, String ruoka_annos, Int paivamaara, Int arvo, String ravintolantyyppi, String arvijoija) {
        this.ravintolannimi = ravintolannimi;
        this.ruoka_annos = ruoka_annos;
        this.paivamaara = paivamaara;
        this.arvo = arvo;
        this.ravintolantyyppi = ravintolantyyppi;
        this.arvijoija = arvijoija;
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

    public Int getPaivamaara() {
        return paivamaara;
    }

    public void setPaivamaara(Int paivamaara) {
        this.paivamaara = paivamaara;
    }

    public Int getArvo() {
        return arvo;
    }

    public void setArvo(Int arvo) {
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
        return "Arvio{" + "ravintolannimi=" + ravintolannimi + ", ruoka_annos=" + ruoka_annos + ", paivamaara=" + paivamaara + ", arvo=" + arvo + ", ravintolantyyppi=" + ravintolantyyppi + ", arvijoija=" + arvijoija + '}';
    }


}

    

