/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import db.DBKomunikacija;

/**
 *
 * @author Rastko
 */
public abstract class OpstaSO {
    
 public void izvrsi(Object odo) throws Exception {
        try {
            proveriPreduslov(odo);
            izvrisiKonkretnuOperaciju(odo);
            potvrdi();
        } catch (Exception ex) {
            ponisti();
            ex.printStackTrace();
            throw new Exception("Greska kod izvrsenja so" + ex.getMessage());
        }
    }

    public void proveriPreduslov(Object odo) throws Exception {

    }

    protected abstract void izvrisiKonkretnuOperaciju(Object odo) throws Exception;

    private void potvrdi() throws Exception {
        DBKomunikacija.getInstance().commit();
    }

    private void ponisti() throws Exception {
        DBKomunikacija.getInstance().rollback();
    }
}
