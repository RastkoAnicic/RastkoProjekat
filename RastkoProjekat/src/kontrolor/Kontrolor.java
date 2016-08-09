/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrolor;

//import db.DBKomunikacija;
import domen.Aranzman;
import domen.Drzava;
import domen.Klijent;
import domen.Mesto;
import domen.TipAranzmana;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import transferObjekat.KlijentTransferObjekat;
import transferObjekat.ServerTransferObjekat;

/**
 *
 * @author Rastko
 */
public class Kontrolor {

    private static Kontrolor instanca;
   
    private Map<String, Object> mapa;

    private Kontrolor() {
        
        mapa = new HashMap<>();
    }

    public static Kontrolor getInstance() {
        if (instanca == null) {
            instanca = new Kontrolor();
        }
        return instanca;

    }

    public Map<String, Object> getMapa() {
        return mapa;
    }

    public void setMapa(Map<String, Object> mapa) {
        this.mapa = mapa;
    }

    public void unesiKlijenta(Klijent klijent) throws Exception {
        
        Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setParametar(klijent);
        kto.setOperacija(util.Util.OPERACIJA_UNESI_KLIJENTA);
        out.writeObject(kto);
        
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        
        if (sto.getStatus() != util.Util.SERVER_STATUS_OPERACIJA_OK) {        
            throw new Exception(sto.getGreska());
        }
    }

    public List<Klijent> vratiListuKlijenata() throws Exception {

        Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setOperacija(util.Util.OPERACIJA_VRATI_SVE_KLIJENTE);
        out.writeObject(kto);

        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        if (sto.getStatus() == util.Util.SERVER_STATUS_OPERACIJA_OK) {
            return (List<Klijent>) sto.getRezultat();
        } else {
            throw new Exception(sto.getGreska());
        }

    }
    
   

    public void ubaciAranzmanUBazu(Aranzman ar) throws Exception {

        Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setParametar(ar);
        kto.setOperacija(util.Util.OPERACIJA_UBACI_ARANZMAN_U_BAZU);
        out.writeObject(kto);
        
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        
        if (sto.getStatus() != util.Util.SERVER_STATUS_OPERACIJA_OK) {        
            throw new Exception(sto.getGreska());
        }

    }

    public List<TipAranzmana> vratiListuAranzmana() throws Exception {

        Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setOperacija(util.Util.OPERACIJA_VRATI_LISTU_ARANZMANA);
        out.writeObject(kto);

        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        if (sto.getStatus() == util.Util.SERVER_STATUS_OPERACIJA_OK) {
            return (List<TipAranzmana>) sto.getRezultat();
        } else {
            throw new Exception(sto.getGreska());
        }

    }

    public List<Drzava> vratiDrzaveZaAranzman(TipAranzmana aranzman) throws Exception {

        Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setOperacija(util.Util.OPERACIJA_VRATI_DRZAVE_ZA_ARANZMAN);
        kto.setParametar(aranzman);
        out.writeObject(kto);

        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        if (sto.getStatus() == util.Util.SERVER_STATUS_OPERACIJA_OK) {
            return (List<Drzava>) sto.getRezultat();
        } else {
            throw new Exception(sto.getGreska());
        }
    }

    public void ubaciDrzavuUBazu(Drzava drzava) throws Exception {

        Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setParametar(drzava);
        kto.setOperacija(util.Util.OPERACIJA_UBACI_DRZAVU_U_BAZU);
        out.writeObject(kto);
        
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        
        if (sto.getStatus() != util.Util.SERVER_STATUS_OPERACIJA_OK) {        
            throw new Exception(sto.getGreska());
        }

    }

    public List<Mesto> vratiListuMesta() throws Exception {

       Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setOperacija(util.Util.OPERACIJA_VRATI_LISTU_MESTA);
        out.writeObject(kto);

        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        if (sto.getStatus() == util.Util.SERVER_STATUS_OPERACIJA_OK) {
            return (List<Mesto>) sto.getRezultat();
        } else {
            throw new Exception(sto.getGreska());
        }
    }

    public List<Aranzman> vratiListuAranzmanaPravih() throws Exception {

        Socket s = (Socket) getMapa().get(util.Util.MAP_KEY_SOKET);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        KlijentTransferObjekat kto = new KlijentTransferObjekat();
        kto.setOperacija(util.Util.OPERACIJA_VRATI_LISTU_ARANZMANA_PRAVIH);
        out.writeObject(kto);

        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ServerTransferObjekat sto = (ServerTransferObjekat) in.readObject();
        if (sto.getStatus() == util.Util.SERVER_STATUS_OPERACIJA_OK) {
            return (List<Aranzman>) sto.getRezultat();
        } else {
            throw new Exception(sto.getGreska());
        }

    }

}
