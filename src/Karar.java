/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Karar extends javax.swing.JFrame {

    /**
     * Creates new form Karar
     */
    public Karar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        m_bevet = new javax.swing.JButton();
        m_bhayır = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ödeme işlemini şimdi yapmak istiyorsanız \"EVET\" i, sonra yapmak istiyorsanız \"HAYIR\" ı seçiniz:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        m_bevet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m_bevet.setText("EVET");
        m_bevet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_bevetActionPerformed(evt);
            }
        });
        getContentPane().add(m_bevet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        m_bhayır.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m_bhayır.setText("HAYIR");
        m_bhayır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_bhayırActionPerformed(evt);
            }
        });
        getContentPane().add(m_bhayır, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 40, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f4.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_bevetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_bevetActionPerformed
       Ödeme öde = new Ödeme();
       öde.setVisible(true);
       dispose();
    }//GEN-LAST:event_m_bevetActionPerformed

    private void m_bhayırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_bhayırActionPerformed

       Sonlandır son = new Sonlandır();
       son.setVisible(true);
       dispose();
    }//GEN-LAST:event_m_bhayırActionPerformed

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
            java.util.logging.Logger.getLogger(Karar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton m_bevet;
    private javax.swing.JButton m_bhayır;
    // End of variables declaration//GEN-END:variables
}
