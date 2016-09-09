/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Aranzman;
import domen.Drzava;
import domen.Mesto;
import domen.TipAranzmana;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import kontrolor.Kontrolor;

/**
 *
 * @author Rastko
 */
public class FMUnosAranzmana extends javax.swing.JDialog {

    /**
     * Creates new form FMUnosAranzmana
     */
    public FMUnosAranzmana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        srediFormu();
        popuniComboe();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_sacuvaj = new javax.swing.JButton();
        jbtn_ponisti = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        errorLblDrzava = new javax.swing.JLabel();
        jcmb_tipAranzmana = new javax.swing.JComboBox<>();
        jcmb_drzava = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jtxt_nazivAranzmana = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorLblMesto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxt_novaDrzava = new javax.swing.JTextField();
        jbtn_ok = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbtn_sacuvaj.setText("Sačuvaj");
        jbtn_sacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_sacuvajActionPerformed(evt);
            }
        });

        jbtn_ponisti.setText("Poništi");
        jbtn_ponisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ponistiActionPerformed(evt);
            }
        });

        jLabel8.setText("Država:");

        errorLblDrzava.setText(" ");

        jcmb_tipAranzmana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcmb_tipAranzmana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipAranzmanaActionPerformed(evt);
            }
        });

        jcmb_drzava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_drzavaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unos aranžmana");

        jtxt_nazivAranzmana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nazivAranzmanaActionPerformed(evt);
            }
        });

        jLabel2.setText("Naziv aranžmana:");

        jLabel4.setText("Tip aranžmana:");

        errorLblMesto.setText(" ");

        jLabel7.setText("Mesto:");

        jtxt_novaDrzava.setText("Unesite drzavu...");
        jtxt_novaDrzava.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_novaDrzavaFocusGained(evt);
            }
        });
        jtxt_novaDrzava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxt_novaDrzavaMouseClicked(evt);
            }
        });
        jtxt_novaDrzava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_novaDrzavaActionPerformed(evt);
            }
        });

        jbtn_ok.setText("Ok");
        jbtn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_ponisti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_sacuvaj))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(50, 50, 50))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(86, 86, 86)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(91, 91, 91)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcmb_tipAranzmana, 0, 192, Short.MAX_VALUE)
                                    .addComponent(jcmb_drzava, 0, 192, Short.MAX_VALUE)
                                    .addComponent(jtxt_nazivAranzmana, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(errorLblMesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorLblDrzava, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtn_ok)
                                    .addComponent(jtxt_novaDrzava, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(57, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcmb_tipAranzmana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_nazivAranzmana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(errorLblMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_drzava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jtxt_novaDrzava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jbtn_ok)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_sacuvaj)
                            .addComponent(jbtn_ponisti))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)))
                .addComponent(errorLblDrzava, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_sacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_sacuvajActionPerformed

        //String mesto1 = jtxt_mesto.getText().toLowerCase();
//        String mesto1 = jComboBox1.getSelectedItem().toString();
//        
//        
//        List<Mesto> mesta = new LinkedList<>();
//        try {
//            mesta = Kontrolor.getInstance().vratiListuMesta();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Ne mogu da uporedim mesta");
//        }
//        List<String> lista = new LinkedList<>();
//        
//        for (Mesto mesto2 : mesta) {
//            lista.add(mesto2.getNaziv().toLowerCase());
//        }
//        
//        if (!lista.contains(mesto1)){
//            JOptionPane.showMessageDialog(this, "Mesto ne postoji u bazi.");
//            return;
//        }
        
        Aranzman ar = new Aranzman();
        Mesto mesto = (Mesto) jComboBox1.getSelectedItem();
        
//        for (Mesto mesto2 : mesta) {
//            if (jComboBox1.getSelectedItem().toString().toLowerCase().equals(mesto2.getNaziv().toLowerCase()))
//                mesto = mesto2;
//        }

        ar.setNaziv(jtxt_nazivAranzmana.getText());
        ar.setTipAranzmana((TipAranzmana) jcmb_tipAranzmana.getSelectedItem());
        ar.setMesto(mesto);
        
        //nemamo aranzman ID

        dodajAranzmanUBazu(ar);
    }//GEN-LAST:event_jbtn_sacuvajActionPerformed

    private void jbtn_ponistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ponistiActionPerformed

        jcmb_tipAranzmana.setSelectedIndex(0);
        //jtxt_mesto.setText("");
        jtxt_nazivAranzmana.setText("");
    }//GEN-LAST:event_jbtn_ponistiActionPerformed

    private void jcmb_tipAranzmanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipAranzmanaActionPerformed

        TipAranzmana aranzman = (TipAranzmana) jcmb_tipAranzmana.getSelectedItem();

        try {
            
            List<Drzava> drzave = new LinkedList<>();
            drzave.add(new Drzava(0, "Unesite novu"));            
            drzave.addAll(Kontrolor.getInstance().vratiDrzaveZaAranzman(aranzman));
            
            jcmb_drzava.setModel(new DefaultComboBoxModel(drzave.toArray()));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Nije uspesno vracena lista");
        }
    }//GEN-LAST:event_jcmb_tipAranzmanaActionPerformed

    private void jtxt_nazivAranzmanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nazivAranzmanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nazivAranzmanaActionPerformed

    private void jcmb_drzavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_drzavaActionPerformed
        
        Drzava drzava = (Drzava) jcmb_drzava.getSelectedItem();
        
        if (drzava.getDrzavaID() == 0){
            jtxt_novaDrzava.setVisible(true);
            jbtn_ok.setVisible(true);
        } else {
            jtxt_novaDrzava.setVisible(false);
            jbtn_ok.setVisible(false);
        }
        
        try {
            List<Mesto> mesta = kontrolor.Kontrolor.getInstance().vratiListuMesta();
            jComboBox1.setModel(new DefaultComboBoxModel(mesta.toArray()));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne mogu da ucitam mesta iz baze");
        }
    }//GEN-LAST:event_jcmb_drzavaActionPerformed

    private void jtxt_novaDrzavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_novaDrzavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_novaDrzavaActionPerformed

    private void jtxt_novaDrzavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxt_novaDrzavaMouseClicked
        
        
    }//GEN-LAST:event_jtxt_novaDrzavaMouseClicked

    private void jtxt_novaDrzavaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_novaDrzavaFocusGained
        
        jtxt_novaDrzava.setText("");
    }//GEN-LAST:event_jtxt_novaDrzavaFocusGained

    private void jbtn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_okActionPerformed
        
            LinkedList<Drzava> drzave = kontrolor.Kontrolor.getInstance().vratiListuDrzava();
            
            Drzava drzava = new Drzava();        
            TipAranzmana ta = (TipAranzmana) jcmb_tipAranzmana.getSelectedItem();
            
            drzava.setNaziv(jtxt_novaDrzava.getText());
            
            switch(ta.getTipAranzmanaID()){
                
            }
            
            ubaciDrzavuUBazu(drzava);
            
    }//GEN-LAST:event_jbtn_okActionPerformed

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
//            java.util.logging.Logger.getLogger(FMUnosAranzmana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FMUnosAranzmana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FMUnosAranzmana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FMUnosAranzmana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FMUnosAranzmana dialog = new FMUnosAranzmana(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel errorLblDrzava;
    private javax.swing.JLabel errorLblMesto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtn_ok;
    private javax.swing.JButton jbtn_ponisti;
    private javax.swing.JButton jbtn_sacuvaj;
    private javax.swing.JComboBox<String> jcmb_drzava;
    private javax.swing.JComboBox<String> jcmb_tipAranzmana;
    private javax.swing.JTextField jtxt_nazivAranzmana;
    private javax.swing.JTextField jtxt_novaDrzava;
    // End of variables declaration//GEN-END:variables

    private void popuniComboe() {
        
        
        try {
            List<TipAranzmana> aranzmani = Kontrolor.getInstance().vratiListuAranzmana();
            jcmb_tipAranzmana.setModel(new DefaultComboBoxModel(aranzmani.toArray()));
        } catch (Exception ex) {
            Logger.getLogger(FMUnosAranzmana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void srediFormu() {        
        jtxt_novaDrzava.setVisible(false);
        jbtn_ok.setVisible(false);
    }

    private void ubaciDrzavuUBazu(Drzava drzava) {
       
        try {
            Kontrolor.getInstance().ubaciDrzavuUBazu(drzava);
            JOptionPane.showMessageDialog(this, "Drzava uspesno uneta!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, " greska " + ex.getMessage());
        }
    }

    private void dodajAranzmanUBazu(Aranzman ar) {
        try {
            
            Kontrolor.getInstance().ubaciAranzmanUBazu(ar);
            JOptionPane.showMessageDialog(this, "Uspesno ubacen aranzman");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "geska " + ex.getMessage());
        }
    }

    
}
