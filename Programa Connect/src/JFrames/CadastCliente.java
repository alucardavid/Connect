package JFrames;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import jdk.nashorn.internal.runtime.options.Options;
import programa.connect.Cliente;

/**
 *
 * @author David
 */
public class CadastCliente extends javax.swing.JInternalFrame {

    public CadastCliente() {
        initComponents();
        tbxCodigo.setText(Integer.toString(Cliente.GerarCodigo()));
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    public static void main(String[] args) {
        
    }
    
    private boolean ValidarCampos(){
        Component[] components = this.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextComponent sObject = (JTextComponent) component;
                if (sObject.getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        tbxNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tbxCnpjCpf = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        tbxCidade = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        tbxTelefone = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        tbxCep = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        tbxRua = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        tbxCodigo = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Cliente");

        lblNome.setText("Nome");

        jLabel1.setText("CNPJ/CPF");

        lblCidade.setText("Cidade");

        lblTelefone.setText("Telefone");

        lblCep.setText("CEP");

        lblRua.setText("Rua");

        lblCodigo.setText("Código");

        tbxCodigo.setEditable(false);

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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGravar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(jLabel1)
                            .addComponent(lblNome)
                            .addComponent(lblCidade)
                            .addComponent(lblCep)
                            .addComponent(lblRua)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbxNome)
                                .addComponent(tbxCnpjCpf)
                                .addComponent(tbxCidade)
                                .addComponent(tbxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbxRua, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(tbxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAlterar)
                                    .addComponent(tbxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(btnExcluir)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(tbxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbxCnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(tbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(tbxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRua)
                    .addComponent(tbxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(tbxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        int n;
        if (ValidarCampos()) {
            try {
                Cliente nCliente = new Cliente(tbxNome.getText(), tbxRua.getText(), tbxCidade.getText(), tbxCep.getText(), tbxTelefone.getText(), tbxCnpjCpf.getText(), tbxCodigo.getText());
                nCliente.AdicionarCliente();
                n = JOptionPane.showOptionDialog(null, "Gostaria de adicionar outro cliente?", "Connect", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, iconable);
                if (n==0) {
                    LimparCampos();
                    tbxCodigo.setText(Integer.toString(Cliente.GerarCodigo()));
                }
                else{
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
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
        if (ValidarCampos()) {
            try {
                Cliente nCliente = new Cliente(tbxNome.getText(), tbxRua.getText(), tbxCidade.getText(), tbxCep.getText(), tbxTelefone.getText(), tbxCnpjCpf.getText(), tbxCodigo.getText());
                nCliente.AlterarCliente();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (ValidarCampos()) {
            try {
                Cliente nCliente = new Cliente(tbxNome.getText(), tbxRua.getText(), tbxCidade.getText(), tbxCep.getText(), tbxTelefone.getText(), tbxCnpjCpf.getText(), tbxCodigo.getText());
                nCliente.ExcluirCliente();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            LimparCampos();
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatorios");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void LimparCampos(){
        try {
            Component[] components = this.getContentPane().getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    JTextComponent sObject = (JTextComponent) component;
                    sObject.setText("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField tbxCep;
    private javax.swing.JTextField tbxCidade;
    private javax.swing.JTextField tbxCnpjCpf;
    private javax.swing.JTextField tbxCodigo;
    private javax.swing.JTextField tbxNome;
    private javax.swing.JTextField tbxRua;
    private javax.swing.JTextField tbxTelefone;
    // End of variables declaration//GEN-END:variables
}
