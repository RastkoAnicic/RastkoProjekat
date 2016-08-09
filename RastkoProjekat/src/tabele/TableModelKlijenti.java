/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabele;

import domen.Klijent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rastko
 */
public class TableModelKlijenti extends AbstractTableModel {

    List<Klijent> klijenti;

    public TableModelKlijenti(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }

    @Override
    public int getRowCount() {
        return klijenti.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Klijent k = klijenti.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return k.getIme();
            case 1:
                return k.getPrezime();

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {

        switch (column) {
            case 0:
                return "ime";
            case 1:
                return "prezime";

            default:
                return "Nema";
        }
    }

    public Klijent vratiKlijenta(int red) {
        
        return klijenti.get(red);
    }

}
