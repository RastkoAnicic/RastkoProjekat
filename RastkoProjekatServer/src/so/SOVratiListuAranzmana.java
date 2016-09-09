/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import domen.TipAranzmana;
import java.util.List;

/**
 *
 * @author Rastko
 */
public class SOVratiListuAranzmana extends OpstaSO{
    
    private List<TipAranzmana> lta;

    @Override
    protected void izvrisiKonkretnuOperaciju(Object odo) throws Exception {
        lta = db.DBKomunikacija.getInstance().vratiListuAranzmana();

    }

    public List<TipAranzmana> getList() {
        return lta;
    }
}
