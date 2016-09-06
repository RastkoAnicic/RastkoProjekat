/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Rastko
 */
public class Racun implements Serializable {
    
    private int brojRacuna;
    private double ukupanIznos;
    private Date datumRacuna;
    private Klijent klijent;
    private Aranzman aranzman;
    private Termin termin;
    
    LinkedList<StavkaRacuna> stavkeRacuna;

    public Racun() {
        stavkeRacuna = new LinkedList<>();
    }

    public Racun(int brojRacuna, double iznos, Date datum, Klijent klijent, Termin termin, Aranzman aranzman) {
        this.brojRacuna = brojRacuna;
        this.ukupanIznos = iznos;
        this.datumRacuna = datum;
        this.klijent = klijent;
        this.aranzman = aranzman;
        this.termin = termin;
        stavkeRacuna = new LinkedList<>();
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

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double iznos) {
        this.ukupanIznos = iznos;
    }

    public Date getDatum() {
        return datumRacuna;
    }

    public void setDatum(Date datum) {
        this.datumRacuna = datum;
    }

    public Aranzman getAranzman() {
        return aranzman;
    }

    public void setAranzman(Aranzman aranzman) {
        this.aranzman = aranzman;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }
    
    
    
}
