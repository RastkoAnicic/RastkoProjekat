/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Aranzman;
import domen.Drzava;
import domen.Klijent;
import domen.Mesto;
import domen.TipAranzmana;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import kontrolor.Kontrolor;
import tabele.TableModelAranzmani;

/**
 *
 * @author Rastko
 */
public class FMPretragaAranzmana extends javax.swing.JDialog {

    /**
     * Creates new form UnosAranzmana
     */
    public FMPretragaAranzmana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popuniComboe();
        ubaciTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcmb_tipAranzmana = new javax.swing.JComboBox<>();
        jcmb_drzava = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_aranzmani = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unos aranzmana");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pretraga aranžmana");

        jLabel4.setText("Tip aranžmana:");

        jLabel8.setText("Država:");

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

        jtbl_aranzmani.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbl_aranzmani);

        jButton1.setText("Pretraži");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcmb_drzava, 0, 217, Short.MAX_VALUE)
                                    .addComponent(jcmb_tipAranzmana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcmb_tipAranzmana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcmb_drzava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmb_tipAranzmanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipAranzmanaActionPerformed

        TipAranzmana aranzman = (TipAranzmana) jcmb_tipAranzmana.getSelectedItem();

        try {
            List<Drzava> drzave = Kontrolor.getInstance().vratiDrzaveZaAranzman(aranzman);
            jcmb_drzava.setModel(new DefaultComboBoxModel(drzave.toArray()));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Nije uspesno vracena lista");
        }


    }//GEN-LAST:event_jcmb_tipAranzmanaActionPerformed

    private void jcmb_drzavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_drzavaActionPerformed

        List<Aranzman> aranzmani = new LinkedList<>();
        List<Drzava> drzave = new LinkedList<>();
        try {
            aranzmani = Kontrolor.getInstance().vratiListuAranzmanaPravih();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "neuspesno vraceni aranzmani");
        }
        for (Aranzman ar : aranzmani) {
            drzave.add(ar.getMesto().getDrzava());
        }

        Drzava drzava = (Drzava) jcmb_drzava.getSelectedItem();

        for (Drzava drz : drzave) {
            if (drzava == drz) {
                aranzmani.clear();

            }

        }

        TableModelAranzmani tbl = new TableModelAranzmani(aranzmani);

        jtbl_aranzmani.setModel(tbl);
    }//GEN-LAST:event_jcmb_drzavaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //  TableModelAranzmani tma = (TableModelAranzmani) jtbl_aranzmani.getModel();
        List<Aranzman> aranzmani = (List<Aranzman>) Kontrolor.getInstance().getMapa().get("aranzmani");
        System.out.println(aranzmani.get(2).getMesto().getDrzava().getNaziv() + "  " + aranzmani.get(2).getTipAranzmana().getNaziv());
        List<Aranzman> novi = new LinkedList<>();
        Drzava d = (Drzava) jcmb_drzava.getSelectedItem();
        TipAranzmana ta = (TipAranzmana) jcmb_tipAranzmana.getSelectedItem();
        for (Aranzman aranzman : aranzmani) {
            if (aranzman.getMesto().getDrzava().getDrzavaID() == d.getDrzavaID() && aranzman.getTipAranzmana().getTipAranzmanaID() == ta.getTipAranzmanaID()) {
                novi.add(aranzman);
            }
        }
        TableModelAranzmani tma = new TableModelAranzmani(novi);
        jtbl_aranzmani.setModel(tma);


    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmb_drzava;
    private javax.swing.JComboBox<String> jcmb_tipAranzmana;
    private javax.swing.JTable jtbl_aranzmani;
    // End of variables declaration//GEN-END:variables

    private void dodajAranzmanUBazu(Aranzman ar) {

        try {
            Kontrolor.getInstance().ubaciAranzmanUBazu(ar);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void popuniComboe() {

        List<TipAranzmana> aranzmani = new LinkedList<>();
        aranzmani.add(new TipAranzmana(999, "Izaberite tip"));
        try {
            aranzmani.addAll(Kontrolor.getInstance().vratiListuAranzmana());
            jcmb_tipAranzmana.setModel(new DefaultComboBoxModel(aranzmani.toArray()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }

    private void ubaciTabelu() {

        List<Drzava> drzava = new LinkedList<>();
        drzava.add(new Drzava(-1, "Izaberite aranzman"));
        jcmb_drzava.setModel(new DefaultComboBoxModel(drzava.toArray()));

        List<Aranzman> aranzmani = new LinkedList<>();
        try {
            aranzmani = Kontrolor.getInstance().vratiListuAranzmanaPravih();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ne mogu da pronadjem aranzmane");
        }
        TableModelAranzmani tbl = new TableModelAranzmani(aranzmani);

        jtbl_aranzmani.setModel(tbl);
        jtbl_aranzmani.getTableHeader().setReorderingAllowed(false);
    }
}
