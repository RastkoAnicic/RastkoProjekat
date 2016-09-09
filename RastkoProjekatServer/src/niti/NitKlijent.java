/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import db.DBKomunikacija;
import domen.Aranzman;
import domen.Drzava;
import domen.Klijent;
import domen.Mesto;
import domen.Racun;
import domen.Radnik;
import domen.TipAranzmana;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import javax.swing.JOptionPane;
import so.OpstaSO;
import so.SOUnesiKlijenta;
import so.SOVratiListuAranzmana;
import so.SOVratiListuAranzmanaPravih;
import so.SOVratiListuDrzava;
import so.SOVratiListuKlijenata;
import so.SOVratiListuMesta;
import so.SOVratiListuRacuna;
import so.SOVratiRadnika;

import transferObjekat.KlijentTransferObjekat;
import transferObjekat.ServerTransferObjekat;

/**
 *
 * @author Nadin kompjuter
 */
public class NitKlijent extends Thread {

    Socket ks;

    ObjectInputStream in;
    ObjectOutputStream out;
    public boolean kraj = false;

    public NitKlijent(Socket soket) {

        ks = soket;
        // start();
    }

    @Override
    public void run() {
        try {

            while (true) {
                ObjectInputStream in = new ObjectInputStream(ks.getInputStream());
                KlijentTransferObjekat kto = (KlijentTransferObjekat) in.readObject();
                int operacija = kto.getOperacija();
                switch (operacija) {

                    case util.Util.OPERACIJA_UNESI_KLIJENTA: {

                        Klijent klijent = (Klijent) kto.getParametar();
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        OpstaSO so = new SOUnesiKlijenta();
                        so.izvrsi(klijent);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                        break;
                    }

                    case util.Util.OPERACIJA_VRATI_SVE_KLIJENTE: {
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        Object odo = kto.getParametar();
                        OpstaSO so = new SOVratiListuKlijenata();                       
                        so.izvrsi(odo);                        
                        List<Klijent> klijenti = ((SOVratiListuKlijenata)so).getList();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(klijenti);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                        break;
                    }

                    case util.Util.OPERACIJA_UBACI_ARANZMAN_U_BAZU:

                        Aranzman ar = (Aranzman) kto.getParametar();
                         {
                            ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                            ServerTransferObjekat sto = new ServerTransferObjekat();
                            
                            DBKomunikacija.getInstance().unesiAranzman(ar);
                            sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);

                            out.writeObject(sto);
                            break;
                        }

                    case util.Util.OPERACIJA_VRATI_LISTU_ARANZMANA: {
                        
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        Object odo = kto.getParametar();
                        OpstaSO so = new SOVratiListuAranzmana();                       
                        so.izvrsi(odo);
                        List<TipAranzmana> aranzmani = ((SOVratiListuAranzmana)so).getList();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(aranzmani);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                        break;
                    }
                    

                    case util.Util.OPERACIJA_VRATI_DRZAVE_ZA_ARANZMAN: {

                        TipAranzmana tipar = (TipAranzmana) kto.getParametar();
                        ObjectOutputStream outp = new ObjectOutputStream(ks.getOutputStream());
                        OpstaSO so = new SOVratiListuDrzava();                       
                        so.izvrsi(tipar);                        
                        List<Drzava> drzave = ((SOVratiListuDrzava)so).getList();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(drzave);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        outp.writeObject(sto);
                        break;
                    }

                    case util.Util.OPERACIJA_UBACI_DRZAVU_U_BAZU: {

                        Drzava dr = (Drzava) kto.getParametar();
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        DBKomunikacija.getInstance().ubaciDrzavuUBazu(dr);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);

                        out.writeObject(sto);

                        break;
                    }

                    case util.Util.OPERACIJA_VRATI_LISTU_MESTA: {

                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        
                        Object odo = kto.getParametar();
                        OpstaSO so = new SOVratiListuMesta();                       
                        so.izvrsi(odo);                        
                        
                        List<Mesto> mesta = ((SOVratiListuMesta)so).getList();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(mesta);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);

                        break;
                    }

                    case util.Util.OPERACIJA_VRATI_LISTU_ARANZMANA_PRAVIH: {

                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        Object odo = kto.getParametar();
                        OpstaSO so = new SOVratiListuAranzmanaPravih();                       
                        so.izvrsi(odo);                        
                        List<Aranzman> aranzmani = ((SOVratiListuAranzmanaPravih)so).getList();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(aranzmani);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);

                        break;
                    }
                    case util.Util.OPERACIJA_VRATI_LISTU_RACUNA: {
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        Object odo = kto.getParametar();
                        OpstaSO so = new SOVratiListuRacuna();                       
                        so.izvrsi(odo);                        
                        List<Racun> racuni = ((SOVratiListuRacuna)so).getList();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(racuni);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                        break;
                    }
                    case util.Util.OPERACIJA_VRATI_RADNIKA: {
                        
                        Radnik r = (Radnik) kto.getParametar();
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());

                        OpstaSO so = new SOVratiRadnika();
                        so.izvrsi(r);
                        Radnik radnik = ((SOVratiRadnika)so).getR();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(radnik);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                        
                        break;
                    }
                    default:
                        System.out.println("Zaboravio si da napisis kejs");

                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

}
