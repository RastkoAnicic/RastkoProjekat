/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabele;

import domen.Aranzman;
import domen.StavkaRacuna;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rastko
 */
public class TableModelStavkeRacuna extends AbstractTableModel {

    private List<StavkaRacuna> stavkeRacuna;
    

    public TableModelStavkeRacuna() {
    }

    public TableModelStavkeRacuna(List<StavkaRacuna> stavkeRacuna) {
        this.stavkeRacuna = stavkeRacuna;
    }
    

    @Override
    public int getRowCount() {
        if (stavkeRacuna != null) {
            return stavkeRacuna.size();
        }

        return 0;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        StavkaRacuna sr = stavkeRacuna.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return sr.getRedniBrojStavke();
            case 1:
                return sr.getAranzman().getNaziv();
            case 2:
             //   return sr.getTermin().getDatumOd();
            case 3:
             //   return sr.getTermin().getDatumDo();
            case 4:
                return sr.getKolicina();
            default:
                return "N/A";
        }
    }

    public List<StavkaRacuna> getStavkeRacuna() {
        return stavkeRacuna;
    }

    public void setStavkeRacuna(List<StavkaRacuna> stavkeRacuna) {
        this.stavkeRacuna.add(stavkeRacuna.get(0));
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "RB";
            case 1:
                return "Ime aranzmana";
            case 2:
                return "Datum od";
            case 3:
                return "Datum do";
            case 4:
                return "Kolicina";
            default:
                return "n/a";
        }

    }

}
