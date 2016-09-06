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
import domen.StavkaRacuna;
import domen.TipAranzmana;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
                        DBKomunikacija.getInstance().unesiKlijenta(klijent);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                    break;
                    }
                    
                    case util.Util.OPERACIJA_VRATI_SVE_KLIJENTE: {
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        List<Klijent> klijenti = DBKomunikacija.getInstance().vratiListuKlijenata();
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

                        
                    case util.Util.OPERACIJA_VRATI_LISTU_ARANZMANA:{
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        List<TipAranzmana> aranzmani = DBKomunikacija.getInstance().vratiListuAranzmana();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(aranzmani);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                        break;
                    }

                    case util.Util.OPERACIJA_VRATI_DRZAVE_ZA_ARANZMAN:{
                        
                        TipAranzmana tipar = (TipAranzmana) kto.getParametar();
                        
                        ObjectOutputStream outp = new ObjectOutputStream(ks.getOutputStream());
                        List<Drzava> drzave = DBKomunikacija.getInstance().vratiListuDrzava(tipar);
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(drzave);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        outp.writeObject(sto);
                        break;
                    }
                        
                    case util.Util.OPERACIJA_UBACI_DRZAVU_U_BAZU:{
                        
                        Drzava dr = (Drzava) kto.getParametar();
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        DBKomunikacija.getInstance().ubaciDrzavuUBazu(dr);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        
                        out.writeObject(sto);
                        
                        
                        
                        break;
                    }
                        
                    case util.Util.OPERACIJA_VRATI_LISTU_MESTA:{
                        
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        List<Mesto> mesta = DBKomunikacija.getInstance().vratiListuMesta();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(mesta);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                        
                        break; 
                    }
                    
                    case util.Util.OPERACIJA_VRATI_LISTU_ARANZMANA_PRAVIH: {
                    
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        List<Aranzman> aranzmani = DBKomunikacija.getInstance().vratiListuAranzmanaPravih();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(aranzmani);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                    
                        break;
                    }
                    case util.Util.OPERACIJA_VRATI_LISTU_RACUNA: {
                        ObjectOutputStream out = new ObjectOutputStream(ks.getOutputStream());
                        List<Racun> racuni = DBKomunikacija.getInstance().vratiListuRacuna();
                        ServerTransferObjekat sto = new ServerTransferObjekat();
                        sto.setRezultat(racuni);
                        sto.setStatus(util.Util.SERVER_STATUS_OPERACIJA_OK);
                        out.writeObject(sto);
                    break;
                    }
                    default: System.out.println("Zaboravio si da napisis kejs");
                       
                }

            }

        } catch (Exception e) {
            System.out.println("usao u catch u niti");
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            

        }

    }

}
