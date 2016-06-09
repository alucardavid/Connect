package JFrames;

import javax.swing.JOptionPane;
import programa.connect.Compras;
import programa.connect.Util;

/**
 *
 * @author David
 */
public class CadastCompras extends javax.swing.JInternalFrame {

    public CadastCompras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNf = new javax.swing.JLabel();
        lblValorNf = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblDtCompra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        tbxDtCompra = new javax.swing.JTextField();
        tbxFornecedor = new javax.swing.JTextField();
        tbxValor = new javax.swing.JTextField();
        tbxNumNf = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Compras");

        lblNf.setText("N° da NF");

        lblValorNf.setText("Valor da NF");

        lblFornecedor.setText("Fornecedor");

        lblDescricao.setText("Descrição dos produtos");

        lblDtCompra.setText("Data da compra");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        tbxDtCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxDtCompraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbxDtCompraKeyTyped(evt);
            }
        });

        tbxValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxValorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbxValorKeyTyped(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(lblFornecedor)
                    .addComponent(lblDtCompra)
                    .addComponent(lblValorNf)
                    .addComponent(lblNf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tbxNumNf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(tbxValor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tbxDtCompra, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSalvar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                            .addComponent(tbxFornecedor))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNf)
                    .addComponent(tbxNumNf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorNf)
                    .addComponent(tbxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtCompra)
                    .addComponent(tbxDtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(tbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbxValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxValorKeyReleased
        Util.FormatarCampoValor(tbxValor);
    }//GEN-LAST:event_tbxValorKeyReleased

    private void tbxValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxValorKeyTyped
        Util.NegarInputTexto(evt);
    }//GEN-LAST:event_tbxValorKeyTyped

    private void tbxDtCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtCompraKeyReleased
        Util.FormatarCampoData(tbxDtCompra);
    }//GEN-LAST:event_tbxDtCompraKeyReleased

    private void tbxDtCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtCompraKeyTyped
        Util.NegarInputTexto(evt);
    }//GEN-LAST:event_tbxDtCompraKeyTyped

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if (Util.ValidarCampoTextoVazio(this)) {
            try {
                Compras nCompras = new Compras(tbxNumNf.getText(), tbxFornecedor.getText(), tbxValor.getText(), tbxDtCompra.getText(), txaDescricao.getText());
                nCompras.AdicionarCompras();
            } catch (Exception e) {
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Util.LimparCamposTexto(this);
        txaDescricao.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDtCompra;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblNf;
    private javax.swing.JLabel lblValorNf;
    private javax.swing.JTextField tbxDtCompra;
    private javax.swing.JTextField tbxFornecedor;
    private javax.swing.JTextField tbxNumNf;
    private javax.swing.JTextField tbxValor;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
}
