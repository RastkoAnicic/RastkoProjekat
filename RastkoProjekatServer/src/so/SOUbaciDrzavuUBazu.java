/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import db.DBKomunikacija;
import domen.Drzava;
import domen.Klijent;

/**
 *
 * @author Rastko
 */
public class SOUbaciDrzavuUBazu  extends OpstaSO{
    
    protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        DBKomunikacija.getInstance().ubaciDrzavuUBazu((Drzava)odo);
        
    }
}
