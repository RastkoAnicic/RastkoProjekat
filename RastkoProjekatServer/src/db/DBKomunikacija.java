/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.Aranzman;
import domen.Drzava;
import domen.Klijent;
import domen.Mesto;
import domen.Racun;
import domen.StavkaRacuna;
import domen.Termin;
import domen.TipAranzmana;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rastko
 */
public class DBKomunikacija {

    Connection konekcija;

    private static DBKomunikacija instanca;

    public static DBKomunikacija getInstance() {
        if (instanca == null) {
            instanca = new DBKomunikacija();
        }
        return instanca;
    }

    private DBKomunikacija() {
        ucitajDrajver();
        otvoriKonekciju();

    }

    public void ucitajDrajver() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Nije ucitan drajver");
        }
    }

    public void otvoriKonekciju() {
        try {
            konekcija = DriverManager.getConnection("jdbc:mysql://localhost:3306/turistickaagencija", "root", "");
            konekcija.setAutoCommit(false);
        } catch (SQLException ex) {
            System.err.println("Nije otvorena konekcija");
        }
    }

    public void zatvoriKonekciju() {
        try {
            konekcija.close();
        } catch (SQLException ex) {
            System.err.println("Nije zatvorena konekcija");
        }
    }

    public void commit() {
        try {
            konekcija.commit();
        } catch (SQLException ex) {
            System.out.println("Nije izvrsen commit");
        }
    }

    public void rollback() {
        try {
            konekcija.rollback();
        } catch (SQLException ex) {
            System.out.println("Nije izvrsen rollback");
        }
    }

    public void unesiKlijenta(Klijent klijent) throws SQLException {
        System.out.println("usao u metodu ubaci klijenta");
        String sql = "INSERT INTO klijent(jmbg,ime  ,prezime,mejl,telefon) VALUES (?,?,?,?,?)";
        PreparedStatement ps = konekcija.prepareStatement(sql);
        ps.setString(1, klijent.getJmbg());
        ps.setString(2, klijent.getIme());
        ps.setString(3, klijent.getPrezime());
        ps.setString(4, klijent.getMejl());
        ps.setString(5, klijent.getTelefon());
        ps.executeUpdate();
        commit();
    }

    public void unesiAranzman(Aranzman ar) throws SQLException {

        String sql = "INSERT INTO aranzman(nazivaranzmana,tiparanzmanaid,mestoid) VALUES (?,?,?)";
        PreparedStatement ps = konekcija.prepareStatement(sql);

        ps.setString(1, ar.getNaziv());
        ps.setInt(2, ar.getTipAranzmana().getTipAranzmanaID());
        ps.setInt(3, ar.getMesto().getMestoID());

        ps.executeUpdate();
        commit();
    }

    public List<Klijent> vratiListuKlijenata() throws Exception {

        try {
            List<Klijent> klijenti = new LinkedList<>();
            String upit = "select * from klijent";
            Statement sta = konekcija.createStatement();
            ResultSet rs = sta.executeQuery(upit);

            while (rs.next()) {
                Klijent k = new Klijent();
                k.setIme(rs.getString("ime"));
                k.setPrezime(rs.getString("prezime"));
                k.setTelefon(rs.getString("telefon"));
                k.setJmbg(rs.getString("jmbg"));
                k.setMejl(rs.getString("mejl"));
                klijenti.add(k);
            }
            //  System.out.println(prijave);
            rs.close();
            sta.close();
            commit();
            return klijenti;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new Exception("Nije uspesno vracena lista klijenata");
        }

    }

    public List<TipAranzmana> vratiListuAranzmana() throws Exception {

        List<TipAranzmana> tipoviaranzmana = new LinkedList<>();
        String upit = "select * from tiparanzmana";
        Statement sta = konekcija.createStatement();
        ResultSet rs = sta.executeQuery(upit);

        while (rs.next()) {

            TipAranzmana tip = new TipAranzmana();

            tip.setNaziv(rs.getString("nazivtipaaranzmana"));
            tip.setTipAranzmanaID(rs.getInt("tiparanzmanaid"));
            tipoviaranzmana.add(tip);
        }
        //  System.out.println(prijave);
        rs.close();
        sta.close();
        commit();
        return tipoviaranzmana;

    }

    public List<Drzava> vratiListuDrzava(TipAranzmana aranzman) throws SQLException {

        List<Drzava> drzave = new LinkedList<>();

        String upit = "";

        switch (aranzman.getTipAranzmanaID()) {

            case 1:
                upit = "select * from drzava where drzavaid > 0 and drzavaid < 100";
                break;
            case 2:
                upit = "select * from drzava where drzavaid > 99 and drzavaid < 200";
                break;
            case 3:
                upit = "select * from drzava where drzavaid > 299 and drzavaid < 400";
                break;
            case 4:
                upit = "select * from drzava where drzavaid > 199 and drzavaid < 300";
                break;
            case 5:
                upit = "select * from drzava where drzavaid = 1";
                break;
            default:
                System.out.println(aranzman.getTipAranzmanaID());
                upit = "select * from drzava";
        }

        Statement s = konekcija.createStatement();
        ResultSet rs = s.executeQuery(upit);

        while (rs.next()) {

            Drzava dr = new Drzava();

            dr.setNaziv(rs.getString("nazivDrzave"));
            dr.setDrzavaID(rs.getInt("drzavaid"));
            drzave.add(dr);
        }
        rs.close();
        s.close();
        commit();
        return drzave;
    }

    public void ubaciDrzavuUBazu(Drzava drzava) throws SQLException {

        String upit = "insert into drzava values (?,?)";
        PreparedStatement ps = konekcija.prepareStatement(upit);

        ps.setString(2, drzava.getNaziv());

        ps.executeUpdate();
        commit();
    }

    public List<Mesto> vratiListuMesta() throws SQLException {

        List<Mesto> mesta = new LinkedList<>();

        String upit = "select * from mesto";
        Statement sta = konekcija.createStatement();
        ResultSet rs = sta.executeQuery(upit);

        while (rs.next()) {

            Mesto mesto = new Mesto();
            Drzava drzava = new Drzava();
            mesto.setNaziv(rs.getString("nazivMesta"));
            mesto.setMestoID(rs.getInt("mestoid"));
            mesto.setDrzava(drzava);
            drzava.setDrzavaID(rs.getInt("drzavaid"));
            mesta.add(mesto);
        }
        //  System.out.println(prijave);
        rs.close();
        sta.close();

        commit();
        return mesta;

    }

    public List<Aranzman> vratiListuAranzmanaPravih() throws SQLException {

        List<Aranzman> aranzmani = new LinkedList<>();
        String upit = "SELECT * FROM aranzman a JOIN mesto "
                + "m ON a.`mestoID` = m.`mestoID` JOIN tiparanzmana tip ON a."
                + "`tipAranzmanaID`=tip.`tipAranzmanaID` JOIN drzava d ON "
                + "m.`drzavaID` =d.`drzavaID` ; ";

        Statement sta = konekcija.createStatement();
        ResultSet rs = sta.executeQuery(upit);

        while (rs.next()) {

            Aranzman aranzman = new Aranzman();
            Mesto mesto = new Mesto();
            Drzava drzava = new Drzava();
            TipAranzmana tip = new TipAranzmana();

            aranzman.setAranzmanID(rs.getInt("aranzmanid"));
            aranzman.setNaziv(rs.getString("nazivAranzmana"));

            drzava.setNaziv(rs.getString("nazivdrzave"));
            drzava.setDrzavaID(rs.getInt("drzavaid"));

            mesto.setMestoID(rs.getInt("mestoid"));
            mesto.setNaziv(rs.getString("nazivMesta"));

            tip.setTipAranzmanaID(rs.getInt("tiparanzmanaid"));
            tip.setNaziv(rs.getString("nazivtipaaranzmana"));
            mesto.setDrzava(drzava);
            aranzman.setMesto(mesto);

            aranzman.setTipAranzmana(tip);

            aranzmani.add(aranzman);
        }
        //  System.out.println(prijave);
        rs.close();
        sta.close();
        commit();
        return aranzmani;

    }

    public List<Racun> vratiListuRacuna() throws Exception {

        List<Racun> racuni = new LinkedList<>();

        String upit = "select * from racun r join klijent k on r.jmbg = k.jmbg"
                + " join termin t on t.terminid = r.terminid "
                + "join aranzman a on r.aranzmanid = a.aranzmanid";
        Statement sta = konekcija.createStatement();
        ResultSet rs = sta.executeQuery(upit);

        while (rs.next()) {

            Racun racun = new Racun();
            Klijent klijent = new Klijent();
            Termin termin = new Termin();
            Aranzman aranzman = new Aranzman();
            Mesto mesto = new Mesto();
            TipAranzmana tipAranzmana = new TipAranzmana();

            klijent.setIme(rs.getString("ime"));
            klijent.setJmbg(rs.getString("jmbg"));
            klijent.setPrezime(rs.getString("prezime"));
            klijent.setMejl(rs.getString("mejl"));
            klijent.setTelefon(rs.getString("telefon"));

            racun.setBrojRacuna(rs.getInt("brojracuna"));
            racun.setDatum(rs.getDate("datumracuna"));
            racun.setUkupanIznos((rs.getDouble("ukupanIznos")));

            //JOS MESTO DRZAVU I TIP ARANZMANA NISAM UBACIO OVDE
            //tipAranzmana.setNaziv("nazivtipaaranzmana");
            aranzman.setAranzmanID(rs.getInt("aranzmanid"));
            aranzman.setCena(rs.getDouble("ukupaniznos"));
            aranzman.setNaziv(rs.getString("nazivaranzmana"));
            aranzman.setMesto(mesto);
            aranzman.setTipAranzmana(tipAranzmana);

            termin.setTerminID(rs.getInt("terminid"));
            termin.setDatumDo(rs.getDate("Datumdo"));
            termin.setDatumOd(rs.getDate("Datumod"));
            termin.setAranzman(aranzman);

            racun.setKlijent(klijent);
            racun.setAranzman(aranzman);
            racun.setTermin(termin);

            racuni.add(racun);
        }
        //  System.out.println(prijave);
        rs.close();
        sta.close();

        commit();
        return racuni;

    }
}
