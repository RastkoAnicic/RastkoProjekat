/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabele;

import domen.Aranzman;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rastko
 */
public class TableModelAranzmani extends AbstractTableModel {

    List<Aranzman> aranzmani;

    public TableModelAranzmani(List<Aranzman> aranzmani) {
        this.aranzmani = aranzmani;
    }

    public int getRowCount() {
        return aranzmani.size();
    }

    @Override
    public int getColumnCount() {

        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Aranzman aranzman = aranzmani.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return aranzman.getAranzmanID();
            case 1:
                return aranzman.getNaziv();

            case 2:
                return aranzman.getTipAranzmana();
            case 3:
                return aranzman.getMesto();
            default:
                return "n/a";
        }

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "aranzmanID";
            case 1:
                return "naziv";
            case 2:
                return "tiparanzmana";
            case 3:
                return "mesto";
            default:
                return "nista";
        }
    }

}
