package JFrames;
import java.net.URL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import oracle.Oracle;

/**
 *
 * @author David
 */
public class Login extends javax.swing.JFrame {
    String user, pwd;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbxUser = new javax.swing.JTextField();
        btnLogar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        tbxPwd = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnDB = new javax.swing.JMenu();
        jmiConfigurarDB = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect");
        setName("frLogin"); // NOI18N

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        jmnDB.setText("Banco de dados");

        jmiConfigurarDB.setText("Configurar");
        jmiConfigurarDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConfigurarDBActionPerformed(evt);
            }
        });
        jmnDB.add(jmiConfigurarDB);

        jMenuBar1.add(jmnDB);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbxUser, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(tbxPwd)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbxPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogar)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblUser");
        jLabel2.getAccessibleContext().setAccessibleName("lblPwd");
        tbxUser.getAccessibleContext().setAccessibleName("tbxUser");
        btnLogar.getAccessibleContext().setAccessibleName("btnLogar");

        getAccessibleContext().setAccessibleName("frLogin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        ValidarLogin();
    }//GEN-LAST:event_btnLogarActionPerformed

    private void jmiConfigurarDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConfigurarDBActionPerformed
        ConfigurarDB nConfigurarDB = new ConfigurarDB();
        nConfigurarDB.setLocationRelativeTo(null);
        nConfigurarDB.setVisible(true);
    }//GEN-LAST:event_jmiConfigurarDBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void ValidarLogin(){
        // PRIMEIRO VALIDO OS CAMPOS
        if(ValidarCampos() == true){ // SE ESTIVEREN PREENCHIDOS EU VERIFICO NA BASE DE DADOS O USUARIO E SENHA
            try {
                //MÉTODO PARA OBTER OS DADOS DO BANCO
                Connection conn = Oracle.ObterConexao();
                Statement statement = conn.createStatement();
                // COMANDO SQL QUERY
                String query = "SELECT * FROM TS_LOGIN WHERE NOME='" + tbxUser.getText() + "' AND PWD='" + tbxPwd.getText() + "'";
                ResultSet resultSet = statement.executeQuery(query);
                // VERIFICAR SE RETORNOU ALGO DA BASE
                if (resultSet.next()) {
                    // MOSTRO UMA MENSAGEM DE BOA VINDA E PROSSIGO PARA O FORM PRINCIPAL
                    JOptionPane.showMessageDialog(null, "Bem vindo " + resultSet.getString("NOME"));
                    FormPrincipal nFormPrincipal = new FormPrincipal();
                    URL urlFavIconUrl = Login.class.getResource("/imgs/favicon.png");
                    ImageIcon img = new ImageIcon(urlFavIconUrl);
                    nFormPrincipal.setIconImage(img.getImage());
                    nFormPrincipal.setLocationRelativeTo(null);
                    setVisible(false);
                    nFormPrincipal.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuario ou password incorreto.");
                }
                resultSet.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Os campos usuario e password são obrigatorios.");
        }
    }

    private boolean  ValidarCampos(){
        boolean valido = true;
        if (tbxUser.getText().equals("")){
            valido = false;
        }
        if (tbxPwd.getText().equals("")){
            valido = false;
        }
        return valido;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiConfigurarDB;
    private javax.swing.JMenu jmnDB;
    public javax.swing.JLabel lblLogo;
    public javax.swing.JPasswordField tbxPwd;
    public javax.swing.JTextField tbxUser;
    // End of variables declaration//GEN-END:variables
}
