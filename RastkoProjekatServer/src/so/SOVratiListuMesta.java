/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Mesto;
import java.util.List;

/**
 *
 * @author Rastko
 */
public class SOVratiListuMesta  extends OpstaSO{
    
     private List<Mesto> lm;

    @Override
    protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        lm = db.DBKomunikacija.getInstance().vratiListuMesta();

    }

    public List<Mesto> getList() {
        return lm;
    }
}
