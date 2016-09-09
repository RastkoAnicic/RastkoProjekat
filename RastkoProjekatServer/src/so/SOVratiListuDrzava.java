/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Drzava;
import domen.TipAranzmana;
import java.util.List;

/**
 *
 * @author Rastko
 */
public class SOVratiListuDrzava  extends OpstaSO{
    
     private List<Drzava> ld;

    @Override
    protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        ld = db.DBKomunikacija.getInstance().vratiListuDrzava((TipAranzmana) odo);

    }

    public List<Drzava> getList() {
        return ld;
    }
}
