package JFrames;

import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import oracle.Oracle;

/**
 *
 * @author David
 */
public class PesquisaClientes extends javax.swing.JInternalFrame {

   public PesquisaClientes() {
        initComponents();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        tbxNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Pesquisar Cliente");

        lblNome.setText("Nome");

        tbxNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxNomeKeyReleased(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Rua", "Cidade", "Cep", "CNPJ_CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbxNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxNomeKeyReleased
        try {
            AtualizarTabelaClientes();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }//GEN-LAST:event_tbxNomeKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            CadastCliente nCadastCliente = new CadastCliente(tblClientes.getValueAt(tblClientes.getSelectedRow(), 1).toString(), 
                                                         tblClientes.getValueAt(tblClientes.getSelectedRow(), 2).toString(), 
                                                         tblClientes.getValueAt(tblClientes.getSelectedRow(), 3).toString(), 
                                                         tblClientes.getValueAt(tblClientes.getSelectedRow(), 4).toString(), 
                                                         tblClientes.getValueAt(tblClientes.getSelectedRow(), 5).toString(), 
                                                         tblClientes.getValueAt(tblClientes.getSelectedRow(), 6).toString(),
                                                         tblClientes.getValueAt(tblClientes.getSelectedRow(), 0).toString());
            this.getParent().add(nCadastCliente);
            this.setIcon(true);
            nCadastCliente.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        if (tblClientes.getSelectedRowCount()== 1) {
            btnEditar.setEnabled(true);
        }
        else{
            btnEditar.setEnabled(false);
        }
        
    }//GEN-LAST:event_tblClientesMouseClicked

        
    private void AtualizarTabelaClientes(){
        Connection conn = null;
        Statement statement;
        String querySel;
        ResultSet rs;
        String header[] = new String[]{"Codigo", "Nome", "Rua", "Cidade", "Cep", "Telefone", "CNPJ_CPF"};
        String linhas[] = new String[]{"", "", "", "", "", "", ""};
        DefaultTableModel dtm = new DefaultTableModel(0,0);
        dtm.setColumnIdentifiers(header);
        try {
            // ABRO A CONEXÃO
            conn = Oracle.ObterConexao();
            statement = conn.createStatement();
            // QUERY PARA SELECIONAR OS REGISTROS
            querySel = "SELECT * FROM CLIENTES WHERE NOME LIKE '%" + tbxNome.getText() + "%'";
            PreparedStatement pSelCmd = conn.prepareStatement(querySel);
            rs = pSelCmd.executeQuery();
            while (rs.next()) {                
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6) ,rs.getString(7)});
            }
            tblClientes.setModel(dtm);
            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField tbxNome;
    // End of variables declaration//GEN-END:variables
}
