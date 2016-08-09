/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author Rastko
 */
public class Drzava implements Serializable {
    
    private int drzavaID;
    private String naziv;

    public Drzava() {
    }
    
    public Drzava(int drzavaID, String naziv) {
        this.drzavaID = drzavaID;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getDrzavaID() {
        return drzavaID;
    }

    public void setDrzavaID(int drzavaID) {
        this.drzavaID = drzavaID;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
}
