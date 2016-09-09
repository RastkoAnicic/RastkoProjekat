/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import db.DBKomunikacija;
import domen.Radnik;

/**
 *
 * @author Rastko
 */
public class SOVratiRadnika extends OpstaSO{
    
    Radnik r;

    public Radnik getR() {
        return r;
    }

    public void setR(Radnik r) {
        this.r = r;
    }
    
     protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        r = DBKomunikacija.getInstance().vratiRadnika((Radnik)odo);
        
    }
}
