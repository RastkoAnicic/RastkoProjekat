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
public class Aranzman implements Serializable   {

    private int aranzmanID;
    private String naziv;
    private TipAranzmana tipAranzmana;
    private Mesto mesto;

    public Aranzman() {
    }

    public Aranzman(int aranzmanID, String naziv, TipAranzmana tipAranzmana, Mesto mesto) {
        this.aranzmanID = aranzmanID;
        this.naziv = naziv;
        this.tipAranzmana = tipAranzmana;
        this.mesto = mesto;
    }

    public TipAranzmana getTipAranzmana() {
        return tipAranzmana;
    }

    public void setTipAranzmana(TipAranzmana tipAranzmana) {
        this.tipAranzmana = tipAranzmana;
    }

    public int getAranzmanID() {
        return aranzmanID;
    }

    public void setAranzmanID(int aranzmanID) {
        this.aranzmanID = aranzmanID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
}
