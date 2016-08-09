/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import javax.swing.JFrame;
import oracle.jrockit.jfr.JFR;

/**
 *
 * @author Rastko
 */
public class FMGlavna extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FMGlavna() {
        initComponents();
        pozicionirajFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        klijent = new javax.swing.JMenu();
        pretragaKlijenata = new javax.swing.JMenuItem();
        unosKlijenata = new javax.swing.JMenuItem();
        aranzman = new javax.swing.JMenu();
        pretraga_aranzmana = new javax.swing.JMenuItem();
        unos_aranzmana = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Turisticka agencija");

        klijent.setText("Klijent");

        pretragaKlijenata.setText("Pretraga klijenata");
        pretragaKlijenata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretragaKlijenataActionPerformed(evt);
            }
        });
        klijent.add(pretragaKlijenata);

        unosKlijenata.setText("Unos klijenata");
        unosKlijenata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unosKlijenataActionPerformed(evt);
            }
        });
        klijent.add(unosKlijenata);

        jMenuBar1.add(klijent);

        aranzman.setText("Aranzman");

        pretraga_aranzmana.setText("Pretraga aranzmana");
        pretraga_aranzmana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretraga_aranzmanaActionPerformed(evt);
            }
        });
        aranzman.add(pretraga_aranzmana);

        unos_aranzmana.setText("Unos aranzmana");
        unos_aranzmana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unos_aranzmanaActionPerformed(evt);
            }
        });
        aranzman.add(unos_aranzmana);

        jMenuBar1.add(aranzman);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unosKlijenataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unosKlijenataActionPerformed
        // TODO add your handling code here:
        FMUnosKlijenata fmunos = new FMUnosKlijenata(this, true);
        fmunos.setVisible(true);
    }//GEN-LAST:event_unosKlijenataActionPerformed

    private void pretragaKlijenataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretragaKlijenataActionPerformed
        FMPretragaKlijenata  pretraga = new FMPretragaKlijenata(this, false);
        pretraga.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_pretragaKlijenataActionPerformed

    private void pretraga_aranzmanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretraga_aranzmanaActionPerformed
        
        FMPretragaAranzmana pretAranz = new FMPretragaAranzmana(this, true);
        pretAranz.setVisible(true);
    }//GEN-LAST:event_pretraga_aranzmanaActionPerformed

    private void unos_aranzmanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unos_aranzmanaActionPerformed
        
        FMUnosAranzmana unos = new FMUnosAranzmana(this, true);
        unos.setVisible(true);
    }//GEN-LAST:event_unos_aranzmanaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FMGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMGlavna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aranzman;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu klijent;
    private javax.swing.JMenuItem pretragaKlijenata;
    private javax.swing.JMenuItem pretraga_aranzmana;
    private javax.swing.JMenuItem unosKlijenata;
    private javax.swing.JMenuItem unos_aranzmana;
    // End of variables declaration//GEN-END:variables

private void pozicionirajFormu(){
    //setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

}
}
