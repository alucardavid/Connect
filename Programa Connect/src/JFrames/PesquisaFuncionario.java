
package JFrames;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.Oracle;

/**
 *
 * @author David
 */
public class PesquisaFuncionario extends javax.swing.JInternalFrame {

    public PesquisaFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        tbxNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Funcionario");

        lblNome.setText("Nome");

        tbxNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxNomeKeyReleased(evt);
            }
        });

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prontuario", "Nome", "Cargo", "Salário", "Endereço", "Data de Admissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionarios);

        btnEditar.setText("Editar Informações");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbxNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxNomeKeyReleased
        try {
            AtualizarTabelaFuncionarios();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tbxNomeKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            CadastFuncionario ncadasCadastFuncionario = new CadastFuncionario(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 0).toString(), 
                                                                              tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 1).toString(), 
                                                                              tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 2).toString(), 
                                                                              tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 3).toString(), 
                                                                              tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 4).toString(), 
                                                                              tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 5).toString());
            this.getParent().add(ncadasCadastFuncionario);
            this.setIcon(true);
            ncadasCadastFuncionario.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void tblFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionariosMouseClicked
        if (tblFuncionarios.getSelectedRowCount()==1) {
            btnEditar.setEnabled(true);
        }
        else{
            btnEditar.setEnabled(false);
        }
    }//GEN-LAST:event_tblFuncionariosMouseClicked
    
    private void AtualizarTabelaFuncionarios(){
        Connection conn;
        Statement statement;
        String querySel;
        ResultSet rs;
        String header[] = new String[]{"Prontuario", "Nome", "Cargo", "Salário", "Endereço", "Data de Admissão"};
        DefaultTableModel dtm = new DefaultTableModel(0,0);
        dtm.setColumnIdentifiers(header);
        try {
            // ABRO A CONEXÃO
            conn = Oracle.ObterConexao();
            statement = conn.createStatement();
            // QUERY PARA SELECIONAR OS REGISTROS
            querySel = "SELECT PRONTUARIO, NOME, CARGO, TO_CHAR(SALARIO, 'FM999G999G999D90', 'nls_numeric_characters='',.'''), " 
                     + "ENDERECO, TO_CHAR(DATA_ADMISSAO, 'dd/MM/yyyy') FROM FUNCIONARIOS WHERE NOME LIKE '%" + tbxNome.getText() + "%'";
            PreparedStatement pSelCmd = conn.prepareStatement(querySel);
            rs = pSelCmd.executeQuery();
            while (rs.next()) {                
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            tblFuncionarios.setModel(dtm);
            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve algum incidente ao conectar na base de dados, favor informar ao administrador do sistema.");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField tbxNome;
    // End of variables declaration//GEN-END:variables
}
