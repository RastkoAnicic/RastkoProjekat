/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Aranzman;
import domen.TipAranzmana;
import java.util.List;

/**
 *
 * @author Rastko
 */
public class SOVratiListuAranzmanaPravih  extends OpstaSO {
    
     private List<Aranzman> la;

    @Override
    protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        la = db.DBKomunikacija.getInstance().vratiListuAranzmanaPravih();

    }

    public List<Aranzman> getList() {
        return la;
    }
}
