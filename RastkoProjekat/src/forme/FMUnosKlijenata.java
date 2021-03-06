/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Klijent;
import java.awt.Dialog;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import kontrolor.Kontrolor;

/**
 *
 * @author Rastko
 */
public class FMUnosKlijenata extends javax.swing.JDialog {

    public FMUnosKlijenata(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        setLocationRelativeTo(null);
        validacija();

    }

    /**
     * Creates new form FMUnosKlijenataa
     */
    public FMUnosKlijenata(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        setLocationRelativeTo(null);
        validacija();
        postaviOsluskivaceZaTelefon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telefonKlijenta_txt = new javax.swing.JTextField();
        sacuvajKlijenta_btn = new javax.swing.JButton();
        lbl_naslov = new javax.swing.JLabel();
        ponisti_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ImePrezimeKlijenta_txt = new javax.swing.JTextField();
        jmbgKlijenta_txt = new javax.swing.JTextField();
        eMailKlijenta_txt = new javax.swing.JTextField();
        jerror_ime_prezime = new javax.swing.JLabel();
        jerror_mail = new javax.swing.JLabel();
        jerror_telefon = new javax.swing.JLabel();
        jerror_jmbg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unos klijenata");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefonKlijenta_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonKlijenta_txtActionPerformed(evt);
            }
        });
        getContentPane().add(telefonKlijenta_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 145, 199, -1));

        sacuvajKlijenta_btn.setText("Sačuvaj");
        sacuvajKlijenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajKlijenta_btnActionPerformed(evt);
            }
        });
        getContentPane().add(sacuvajKlijenta_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 226, -1, -1));

        lbl_naslov.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_naslov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_naslov.setText("Novi klijent");
        getContentPane().add(lbl_naslov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 428, 36));

        ponisti_btn.setText("Poništi");
        ponisti_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponisti_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ponisti_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 226, 80, -1));

        jLabel2.setText("Ime i prezime klijenta*:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 62, -1, -1));

        jLabel3.setText("e-mail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, -1));

        jLabel4.setText("Telefon:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 148, -1, -1));

        jLabel5.setText("JMBG*:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 191, -1, -1));

        ImePrezimeKlijenta_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImePrezimeKlijenta_txtActionPerformed(evt);
            }
        });
        getContentPane().add(ImePrezimeKlijenta_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 59, 199, -1));
        getContentPane().add(jmbgKlijenta_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 188, 199, -1));
        getContentPane().add(eMailKlijenta_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 102, 199, -1));

        jerror_ime_prezime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jerror_ime_prezime.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(jerror_ime_prezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 59, 250, 20));
        getContentPane().add(jerror_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 102, 250, 20));
        getContentPane().add(jerror_telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 145, 250, 20));

        jerror_jmbg.setText(" ");
        getContentPane().add(jerror_jmbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 188, 250, 20));

        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefonKlijenta_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonKlijenta_txtActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_telefonKlijenta_txtActionPerformed

    private void postaviOsluskivaceZaTelefon() {

        telefonKlijenta_txt.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String telefon = telefonKlijenta_txt.getText();
//                System.out.println(telefon + " " + telefon.length());
                if (!(telefon.matches("^[0][0-9]{8,9}$") || telefon.matches("^[+][0-9]{11,12}$"))) {
                    jerror_telefon.setVisible(true);
                    jerror_telefon.setText("Morate uneti validan broj.");
                } else {
                    jerror_telefon.setVisible(false);

                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String telefon = telefonKlijenta_txt.getText();
//                System.out.println(telefon + " " + telefon.length());
                if (!(telefon.matches("^[0][0-9]{8,9}$") || telefon.matches("^[+][0-9]{11,12}$"))) {
                    jerror_telefon.setVisible(true);
                    jerror_telefon.setText("Morate uneti validan broj.");
                } else {
                    jerror_telefon.setVisible(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String telefon = telefonKlijenta_txt.getText();
//                System.out.println(telefon + " " + telefon.length());
                if (!(telefon.matches("^[0][0-9]{8,9}$") || telefon.matches("^[+][0-9]{11,12}$"))) {
                    jerror_telefon.setVisible(true);
                    jerror_telefon.setText("Morate uneti validan broj.");
                } else {
                    jerror_telefon.setVisible(false);
                }
            }
        });

        eMailKlijenta_txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String email = eMailKlijenta_txt.getText().toLowerCase();
                if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                    jerror_mail.setVisible(true);
                    jerror_mail.setText("Morate uneti ispravnu adresu.");
                } else {
                    jerror_mail.setVisible(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String email = eMailKlijenta_txt.getText().toLowerCase();
                if (!email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                    jerror_mail.setVisible(true);
                    jerror_mail.setText("Morate uneti ispravnu adresu.");
                } else {
                    jerror_mail.setVisible(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String email = eMailKlijenta_txt.getText().toLowerCase();
                if (!email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")) {
                    jerror_mail.setVisible(true);
                    jerror_mail.setText("Morate uneti ispravnu adresu.");
                } else {
                    jerror_mail.setVisible(false);
                }
            }
        });

        jmbgKlijenta_txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String jmbg = jmbgKlijenta_txt.getText().toLowerCase();
                if (!jmbg.matches("^[0-9]{13}")) {
                    jerror_jmbg.setVisible(true);
                    jerror_jmbg.setText("Morate uneti ispravan JMBG.");
                } else {
                    jerror_jmbg.setVisible(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String jmbg = jmbgKlijenta_txt.getText().toLowerCase();
                if (!jmbg.matches("^[0-9]{13}")) {
                    jerror_jmbg.setVisible(true);
                    jerror_jmbg.setText("Morate uneti ispravan JMBG.");
                } else {
                    jerror_jmbg.setVisible(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String jmbg = jmbgKlijenta_txt.getText().toLowerCase();
                if (!jmbg.matches("^[0-9]{13}")) {
                    jerror_jmbg.setVisible(true);
                    jerror_jmbg.setText("Morate uneti ispravan JMBG.");
                } else {
                    jerror_jmbg.setVisible(false);
                }
            }
        });
    }

    private void sacuvajKlijenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajKlijenta_btnActionPerformed
        // TODO add your handling code here:
        try {
        validiraj();
            Klijent klijent = new Klijent();

            String imePrezimeKlijenta = ImePrezimeKlijenta_txt.getText();
            String[] nizImena = imePrezimeKlijenta.split(" ");

            klijent.setIme(nizImena[0]);
            klijent.setPrezime(nizImena[1]);
            klijent.setMejl(eMailKlijenta_txt.getText());
            klijent.setJmbg(jmbgKlijenta_txt.getText());
            klijent.setTelefon(telefonKlijenta_txt.getText());
          
            Kontrolor.getInstance().unesiKlijenta(klijent);
            JOptionPane.showMessageDialog(this, "Uspešno ste uneli klijenta");
        } catch (Exception ex) {
//            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_sacuvajKlijenta_btnActionPerformed

    private void ponisti_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponisti_btnActionPerformed
        // TODO add your handling code here:
        jmbgKlijenta_txt.setText("");
        telefonKlijenta_txt.setText("");
        ImePrezimeKlijenta_txt.setText("");
        eMailKlijenta_txt.setText("");
        jerror_ime_prezime.setVisible(false);
        jerror_jmbg.setVisible(false);
        jerror_mail.setVisible(false);
        jerror_telefon.setVisible(false);
    }//GEN-LAST:event_ponisti_btnActionPerformed

    private void ImePrezimeKlijenta_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImePrezimeKlijenta_txtActionPerformed

        String ime = ImePrezimeKlijenta_txt.getText();
        DocumentListener dl = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!ime.contains(" ")) {
                    jerror_ime_prezime.setText("Morate uneti Ime pa Prezime");
                }
                jerror_ime_prezime.setVisible(true);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!ime.contains(" ")) {
                    jerror_ime_prezime.setText("Morate uneti Ime pa Prezime");
                }
                jerror_ime_prezime.setVisible(true);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (!ime.contains(" ")) {
                    jerror_ime_prezime.setText("Morate uneti Ime pa Prezime");
                }
                jerror_ime_prezime.setVisible(true);
            }
        };

    }//GEN-LAST:event_ImePrezimeKlijenta_txtActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FMUnosKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FMUnosKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FMUnosKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FMUnosKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FMUnosKlijenata dialog = new FMUnosKlijenata(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ImePrezimeKlijenta_txt;
    private javax.swing.JTextField eMailKlijenta_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jerror_ime_prezime;
    private javax.swing.JLabel jerror_jmbg;
    private javax.swing.JLabel jerror_mail;
    private javax.swing.JLabel jerror_telefon;
    private javax.swing.JTextField jmbgKlijenta_txt;
    private javax.swing.JLabel lbl_naslov;
    private javax.swing.JButton ponisti_btn;
    private javax.swing.JButton sacuvajKlijenta_btn;
    private javax.swing.JTextField telefonKlijenta_txt;
    // End of variables declaration//GEN-END:variables

    void postaviVrednostiPolja(int red) {

        Klijent klijent = (Klijent) Kontrolor.getInstance().getMapa().get("klijentKojiMiTreba");

        lbl_naslov.setText("Detalji o klijentu");
        ImePrezimeKlijenta_txt.setText(klijent.getIme() + " " + klijent.getPrezime());
        telefonKlijenta_txt.setText(klijent.getTelefon());
        eMailKlijenta_txt.setText(klijent.getMejl());
        jmbgKlijenta_txt.setText(klijent.getJmbg());

        ImePrezimeKlijenta_txt.setEditable(false);
        telefonKlijenta_txt.setEditable(false);
        eMailKlijenta_txt.setEditable(false);
        jmbgKlijenta_txt.setEditable(false);
        //ImePrezimeKlijenta_txt.setEnabled(false);

        ponisti_btn.setVisible(false);
        sacuvajKlijenta_btn.setVisible(false);

    }

    private void validacija() {

        ListenerImePrezime();

    }

    private void ListenerImePrezime() {
        DocumentListener dl = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                proveriImePrezime();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                proveriImePrezime();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                proveriImePrezime();
            }

        };
        ImePrezimeKlijenta_txt.getDocument().addDocumentListener(dl);
    }

    private void proveriImePrezime() {
        String unos = ImePrezimeKlijenta_txt.getText().toLowerCase();

        if (!unos.contains(" ")) {
            jerror_ime_prezime.setText("Morate uneti jedno ime i jedno prezime");
            jerror_ime_prezime.setVisible(true);

            return;
        }

        if (unos == "") {
            jerror_ime_prezime.setText("Ovo polje je obavezno");
            return;
        }

        String[] niz = unos.split(" ");
        if (niz.length != 2) {
            jerror_ime_prezime.setText("Uneli ste vise od jednog prezimena");
            return;
        }
        jerror_ime_prezime.setVisible(false);

    }

    private void listenerTelefon() {

        String telefon = telefonKlijenta_txt.getText();

        DocumentListener dl = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                proveriTelefon(telefon);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                proveriTelefon(telefon);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                proveriTelefon(telefon);
            }
        };
        telefonKlijenta_txt.getDocument().addDocumentListener(dl);
    }

    public void proveriTelefon(String telefon) {

        jerror_telefon.setVisible(true);

        if (!telefon.contains("[0-9]{8,9}$")) {
            jerror_telefon.setVisible(true);
            jerror_telefon.setText("Morate uneti validan broj.");
            return;
        }

        if (telefon == "") {
            jerror_telefon.setVisible(true);
            jerror_telefon.setText("Ovo polje je obavezno.");
            return;
        }

        jerror_telefon.setText("");

    }

    private void validiraj() throws Exception{
        
        List<Klijent> klijenti = kontrolor.Kontrolor.getInstance().vratiListuKlijenata();
        
        for (Klijent klijent : klijenti) {
            if (jmbgKlijenta_txt.getText().equals(klijent.getJmbg()))
                throw new Exception("Klijent vec postoji u bazi");
        }
        
        if (ImePrezimeKlijenta_txt.getText().equals("")){
            throw new Exception("Morate uneti ime i prezime");
        }
        if (jmbgKlijenta_txt.getText().equals("")){
            throw new Exception("Morate uneti JMBG");
        }
        if (eMailKlijenta_txt.getText().equals("")){
            throw new Exception("Morate uneti email");
        }
        if (telefonKlijenta_txt.getText().equals("")){
            throw new Exception("Morate uneti telefon");
        }
              
        if (jerror_ime_prezime.isVisible()){
            throw new Exception("Pogresno uneto ime i prezime");
        }
        
        if (jerror_jmbg.isVisible()){
            throw new Exception("Pogresno unet jmbg");
        }
        if (jerror_mail.isVisible()){
            throw new Exception("Pogresno unet email");
        }
        if (jerror_telefon.isVisible()){
            throw new Exception("Pogresno unet broj telefona");
        }
        
        
    }

}
