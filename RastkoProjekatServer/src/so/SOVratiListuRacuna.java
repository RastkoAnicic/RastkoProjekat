/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.Racun;
import java.util.List;

/**
 *
 * @author Rastko
 */
public class SOVratiListuRacuna  extends OpstaSO{
    
     private List<Racun> lta;

    @Override
    protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        lta = db.DBKomunikacija.getInstance().vratiListuRacuna();

    }

    public List<Racun> getList() {
        return lta;
    }
}
