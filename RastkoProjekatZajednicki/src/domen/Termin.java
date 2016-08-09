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
class Termin implements Serializable{
    
    private int terminID;
    private Date datumOd;
    private Date datumDo;
    private Aranzman aranzman;

    public Termin() {
    }

    public Termin(int terminID, Date datumOd, Date datumDo, Aranzman aranzman) {
        this.terminID = terminID;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.aranzman = aranzman;
    }

    public Aranzman getAranzman() {
        return aranzman;
    }

    public void setAranzman(Aranzman aranzman) {
        this.aranzman = aranzman;
    }

    public int getTerminID() {
        return terminID;
    }

    public void setTerminID(int terminID) {
        this.terminID = terminID;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }
    
    
}
