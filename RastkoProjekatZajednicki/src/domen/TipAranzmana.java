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
public class TipAranzmana implements Serializable{
    
    private int tipAranzmanaID;
    private String naziv;

    public TipAranzmana() {
    }

    public TipAranzmana(int tipAranzmanaID, String naziv) {
        this.tipAranzmanaID = tipAranzmanaID;
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTipAranzmanaID() {
        return tipAranzmanaID;
    }

    public void setTipAranzmanaID(int tipAranzmanaID) {
        this.tipAranzmanaID = tipAranzmanaID;
    }

    @Override
    public String toString() {
        return getNaziv();
    }
    
    
}
