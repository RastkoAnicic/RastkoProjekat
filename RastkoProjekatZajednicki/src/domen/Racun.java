/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rastko
 */
public class Racun implements Serializable {
    
    private int brojRacuna;
    private double iznos;
    private Date datum;
    private Klijent klijent;

    public Racun() {
    }

    public Racun(int brojRacuna, double iznos, Date datum, Klijent klijent) {
        this.brojRacuna = brojRacuna;
        this.iznos = iznos;
        this.datum = datum;
        this.klijent = klijent;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
    
    
    
}
