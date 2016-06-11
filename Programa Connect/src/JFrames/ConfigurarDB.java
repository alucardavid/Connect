
package JFrames;

import java.sql.Connection;
import javax.swing.JOptionPane;
import oracle.Oracle;
import programa.connect.Util;

/**
 *
 * @author David
 */
public class ConfigurarDB extends javax.swing.JFrame {

    public ConfigurarDB() {
        initComponents();
        tbxHost.setText(Oracle.host);
        tbxPorta.setText(Oracle.port);
        tbxSid.setText(Oracle.sid);
        tbxUser.setText(Oracle.user);
        tbxPwd.setText(Oracle.pwd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHost = new javax.swing.JLabel();
        tbxHost = new javax.swing.JTextField();
        lblPorta = new javax.swing.JLabel();
        tbxPorta = new javax.swing.JTextField();
        lblSid = new javax.swing.JLabel();
        tbxSid = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        tbxUser = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        tbxPwd = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnTestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar DB");

        lblHost.setText("Host");

        lblPorta.setText("Porta");

        lblSid.setText("SID");
        lblSid.setToolTipText("");

        lblUser.setText("User");

        lblPwd.setText("Pwd");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnTestar.setText("Testar");
        btnTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPorta)
                    .addComponent(lblHost)
                    .addComponent(lblSid)
                    .addComponent(lblUser)
                    .addComponent(lblPwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbxHost)
                    .addComponent(tbxPorta)
                    .addComponent(tbxSid)
                    .addComponent(tbxUser)
                    .addComponent(tbxPwd))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnTestar)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHost)
                    .addComponent(tbxHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorta)
                    .addComponent(tbxPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSid)
                    .addComponent(tbxSid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(tbxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd)
                    .addComponent(tbxPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnTestar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (Util.ValidarCampoTextoVazio(this)) {
            Oracle.host = tbxHost.getText();
            Oracle.port = tbxPorta.getText();
            Oracle.sid = tbxSid.getText();
            Oracle.user = tbxUser.getText();
            Oracle.pwd = tbxPwd.getText();
            JOptionPane.showMessageDialog(null, "As informações foram atualizadas.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestarActionPerformed
        try {
            if (Util.ValidarCampoTextoVazio(this)) {
                Oracle.host = tbxHost.getText();
                Oracle.port = tbxPorta.getText();
                Oracle.sid = tbxSid.getText();
                Oracle.user = tbxUser.getText();
                Oracle.pwd = tbxPwd.getText();
                Connection conn = Oracle.ObterConexao();
                if (conn != null) {
                    JOptionPane.showMessageDialog(null, "Conexão configurada com sucesso");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnTestarActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigurarDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurarDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurarDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurarDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurarDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTestar;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblPorta;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblSid;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField tbxHost;
    private javax.swing.JTextField tbxPorta;
    private javax.swing.JTextField tbxPwd;
    private javax.swing.JTextField tbxSid;
    private javax.swing.JTextField tbxUser;
    // End of variables declaration//GEN-END:variables
}
