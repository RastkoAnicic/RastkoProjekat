/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabele;

import domen.Racun;
import domen.StavkaRacuna;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rastko
 */
public class TableModelRacun extends AbstractTableModel {

    private LinkedList<Racun> racuni;

    public TableModelRacun() {
        racuni = new LinkedList<>();
    }

    public TableModelRacun(LinkedList<Racun> stavkeRacuna) {
        this.racuni = stavkeRacuna;
        stavkeRacuna = new LinkedList<>();
    }

    @Override
    public int getRowCount() {

        if (racuni == null) {
            JOptionPane.showMessageDialog(null, "Lista nije inicijalizovana.");
        }
        return racuni.size();

    }

    @Override
    public int getColumnCount() {

        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Racun r = racuni.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return r.getBrojRacuna();
            case 1:
                return r.getAranzman().getNaziv();
            case 2:
                return r.getAranzman().getMesto().getNaziv();
            case 3:
                return r.getTermin().getDatumOd() + " " + r.getTermin().getDatumDo();
            case 4:
                return "";
            case 5:
                return r.getAranzman().getCena();

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {

        switch (column) {
            case 0:
                return "Tip aranzmana";
            case 1:
                return "Aranzman";
            case 2:
                return "Mesto";
            case 3:
                return "Termin";
            case 4:
                return "Kolicina";
            case 5:
                return "Cena";

            default:
                return "Nema";
        }
    }

    public LinkedList<Racun> getStavkeRacuna() {
        return racuni;
    }

    public void setStavkeRacuna(LinkedList<Racun> stavkeRacuna) {
        this.racuni = stavkeRacuna;
    }

}
