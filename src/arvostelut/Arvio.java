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

    public String getRavintolannimi() {
        return ravintolannimi;
    }

    public void setRavintolannimi(String ravintolannimi) {
        this.ravintolannimi = ravintolannimi;
    }

    public Arvio(String ravintolannimi) {
        this.ravintolannimi = ravintolannimi;
    }

    @Override
    public String toString() {
        return "Arvio{" + "ravintolannimi=" + ravintolannimi + '}';
    }
}

    

