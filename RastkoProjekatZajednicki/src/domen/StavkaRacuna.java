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
public class StavkaRacuna implements Serializable {
    
    private int redniBrojStavke;
    private Racun racun;
    private Aranzman aranzman;
    private Termin termin;
    private int kolicina;

    public StavkaRacuna() {
    }

    public StavkaRacuna(int redniBrojStavke, Racun racun, Aranzman aranzman, Termin termin, int kolicina) {
        this.redniBrojStavke = redniBrojStavke;
        this.racun = racun;
        this.aranzman = aranzman;
        this.termin = termin;
        this.kolicina = kolicina;
    }


    public int getRedniBrojStavke() {
        return redniBrojStavke;
    }

    public void setRedniBrojStavke(int redniBrojStavke) {
        this.redniBrojStavke = redniBrojStavke;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
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

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    
    
}
