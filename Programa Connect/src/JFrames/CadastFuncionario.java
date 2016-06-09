package JFrames;

import javax.swing.*;
import programa.connect.Funcionario;
import programa.connect.Util;

/**
 *
 * @author David
 */
public class CadastFuncionario extends javax.swing.JInternalFrame {

    public CadastFuncionario() {
        initComponents();
        tbxProntuario.setText(Integer.toString(Util.GerarCodigo("FUNCIONARIOS", "PRONTUARIO")));
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    public CadastFuncionario(String prontuario, String nome, String cargo, String salario, String endereco, String dtAdmissao){
        initComponents();
        tbxNome.setText(nome);
        tbxProntuario.setText(prontuario);
        tbxCargo.setText(cargo);
        tbxSalario.setText(salario);
        tbxEndereco.setText(endereco);
        tbxDtAdmissao.setText(dtAdmissao);
        btnGravar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        tbxNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        tbxCargo = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        tbxSalario = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        tbxEndereco = new javax.swing.JTextField();
        lblDtAdmissao = new javax.swing.JLabel();
        tbxDtAdmissao = new javax.swing.JTextField();
        lblProntuario = new javax.swing.JLabel();
        tbxProntuario = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Funcionario");

        lblNome.setText("Nome");

        lblCargo.setText("Cargo");

        lblSalario.setText("Salário");

        tbxSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxSalarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbxSalarioKeyTyped(evt);
            }
        });

        lblEndereco.setText("Endereço");

        lblDtAdmissao.setText("Data de Admissão");

        tbxDtAdmissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxDtAdmissaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbxDtAdmissaoKeyTyped(evt);
            }
        });

        lblProntuario.setText("Prontuário");

        tbxProntuario.setEnabled(false);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(lblCargo)
                    .addComponent(lblNome)
                    .addComponent(lblProntuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbxNome)
                    .addComponent(tbxEndereco)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterar))
                            .addComponent(tbxCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(tbxProntuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSalario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbxSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDtAdmissao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbxDtAdmissao)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addGap(74, 74, 74)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(tbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalario)
                    .addComponent(tbxSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(tbxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtAdmissao)
                    .addComponent(tbxDtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProntuario)
                    .addComponent(tbxProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        int n;
        if (Util.ValidarCampoTextoVazio(this)) {
            try {
                Funcionario nFuncionario = new Funcionario(tbxProntuario.getText(), 
                                                           tbxNome.getText(), 
                                                           tbxCargo.getText(), 
                                                           tbxSalario.getText(), 
                                                           tbxEndereco.getText(), 
                                                           tbxDtAdmissao.getText());
                nFuncionario.AdicionarFuncionario();
                n = JOptionPane.showOptionDialog(null, "Gostaria de adicionar outro funcionário?", "Connect", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, iconable);
                if (n==0) {
                    Util.LimparCamposTexto(this);
                    tbxProntuario.setText(Integer.toString(Util.GerarCodigo("FUNCIONARIOS", "PRONTUARIO")));
                }
                else {
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                    btnGravar.setEnabled(false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios");
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (Util.ValidarCampoTextoVazio(this)) {
            try {
                Funcionario nFuncionario = new Funcionario(tbxProntuario.getText(), 
                                                           tbxNome.getText(), 
                                                           tbxCargo.getText(), 
                                                           tbxSalario.getText(), 
                                                           tbxEndereco.getText(), 
                                                           tbxDtAdmissao.getText());
                nFuncionario.AlterarFuncionario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tbxSalarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxSalarioKeyReleased
        Util.FormatarCampoValor(tbxSalario);
    }//GEN-LAST:event_tbxSalarioKeyReleased

    private void tbxSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxSalarioKeyTyped
        Util.NegarInputTexto(evt);
    }//GEN-LAST:event_tbxSalarioKeyTyped

    private void tbxDtAdmissaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtAdmissaoKeyReleased
        Util.FormatarCampoData(tbxDtAdmissao);
    }//GEN-LAST:event_tbxDtAdmissaoKeyReleased

    private void tbxDtAdmissaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtAdmissaoKeyTyped
        Util.NegarInputTexto(evt);
    }//GEN-LAST:event_tbxDtAdmissaoKeyTyped

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (Util.ValidarCampoTextoVazio(this)) {
            try {
                Funcionario nFuncionario = new Funcionario(tbxProntuario.getText(), 
                                                           tbxNome.getText(), 
                                                           tbxCargo.getText(), 
                                                           tbxSalario.getText(), 
                                                           tbxEndereco.getText(), 
                                                           tbxDtAdmissao.getText());
                nFuncionario.ExcluirFuncionario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            Util.LimparCamposTexto(this);
            tbxProntuario.setText(Integer.toString(Util.GerarCodigo("FUNCIONARIOS", "PRONTUARIO")));
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDtAdmissao;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProntuario;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField tbxCargo;
    private javax.swing.JTextField tbxDtAdmissao;
    private javax.swing.JTextField tbxEndereco;
    private javax.swing.JTextField tbxNome;
    private javax.swing.JTextField tbxProntuario;
    private javax.swing.JTextField tbxSalario;
    // End of variables declaration//GEN-END:variables
}
