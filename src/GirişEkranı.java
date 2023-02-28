
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class GirişEkranı extends javax.swing.JFrame {
        String name = "Elif";
        String password = "12345";
    /**
     * Creates new form GirişEkranı
     */
    
    public GirişEkranı() {
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

        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        m_kullanıcıadı = new javax.swing.JTextField();
        m_giriş = new javax.swing.JButton();
        m_check = new javax.swing.JCheckBox();
        m_şifre = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(250, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setText("Kullanıcı adı:");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setText("Şifre");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        m_kullanıcıadı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_kullanıcıadıActionPerformed(evt);
            }
        });
        getContentPane().add(m_kullanıcıadı, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 86, -1));

        m_giriş.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m_giriş.setText("Giriş");
        m_giriş.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_girişActionPerformed(evt);
            }
        });
        getContentPane().add(m_giriş, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        m_check.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        m_check.setText("Şifreyi göster");
        m_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_checkActionPerformed(evt);
            }
        });
        getContentPane().add(m_check, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        m_şifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_şifreActionPerformed(evt);
            }
        });
        getContentPane().add(m_şifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 86, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setText("Giriş Ekranı");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e3.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_girişActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_girişActionPerformed
        // TODO add your handling code here:
     /*   String name = "Elif";
        String password = "12345";
        */
        if(m_kullanıcıadı.getText().equals(name) && m_şifre.getText().equals(password)){
            JOptionPane.showMessageDialog(null, "Giriş başarılı");
           
            BilgiEkranı tablo2 = new BilgiEkranı();
            tablo2.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre hatalı");   
        }
    }//GEN-LAST:event_m_girişActionPerformed

    private void m_kullanıcıadıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_kullanıcıadıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_kullanıcıadıActionPerformed

    private void m_şifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_şifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_şifreActionPerformed

    private void m_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_checkActionPerformed
        // TODO add your handling code here:
        if(m_check.isSelected()){
            m_şifre.setEchoChar((char)0);
        }
        else{
            m_şifre.setEchoChar('*');
        }
        
    }//GEN-LAST:event_m_checkActionPerformed

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
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirişEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new GirişEkranı().setIconImage(otopark.png);
                new GirişEkranı().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JCheckBox m_check;
    private javax.swing.JButton m_giriş;
    private javax.swing.JTextField m_kullanıcıadı;
    private javax.swing.JPasswordField m_şifre;
    // End of variables declaration//GEN-END:variables
}
