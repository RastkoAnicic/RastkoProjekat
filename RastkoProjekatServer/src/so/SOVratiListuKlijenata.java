/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Klijent;
import java.util.List;

/**
 *
 * @author Rastko
 */
public class SOVratiListuKlijenata  extends OpstaSO{
    
     private List<Klijent> lk;

    @Override
    protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        lk = db.DBKomunikacija.getInstance().vratiListuKlijenata();

    }

    public List<Klijent> getList() {
        return lk;
    }
}
