package JFrames;

import java.awt.Component;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import programa.connect.Projeto;


/**
 *
 * @author David
 */
public class CadastProjeto extends javax.swing.JInternalFrame {

    public CadastProjeto(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        tbxNome = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        lblOrcamento = new javax.swing.JLabel();
        tbxOrcamento = new javax.swing.JTextField();
        lblDtInicio = new javax.swing.JLabel();
        lblDtConclusao = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        tbxDtInicio = new javax.swing.JTextField();
        tbxDtConclusao = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastrar Projeto");

        lblNome.setText("Nome");

        lblDescricao.setText("Descrição");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        lblOrcamento.setText("Orçamento");

        tbxOrcamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxOrcamentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbxOrcamentoKeyTyped(evt);
            }
        });

        lblDtInicio.setText("Data de Ínicio");

        lblDtConclusao.setText("Data de Conclusão");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        tbxDtInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxDtInicioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbxDtInicioKeyTyped(evt);
            }
        });

        tbxDtConclusao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbxDtConclusaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbxDtConclusaoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGravar)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDtConclusao)
                            .addComponent(lblDtInicio)
                            .addComponent(lblOrcamento)
                            .addComponent(lblDescricao)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                            .addComponent(tbxNome)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tbxDtConclusao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tbxDtInicio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tbxOrcamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrcamento)
                    .addComponent(tbxOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtInicio)
                    .addComponent(tbxDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtConclusao)
                    .addComponent(tbxDtConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnGravar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        
    }
    
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Projeto nProjeto = new Projeto((tbxNome.getText()), txaDescricao.getText(), tbxOrcamento.getText(), tbxDtInicio.getText(), tbxDtConclusao.getText());
        if (ValidarCampos()) {
            nProjeto.GravarProjeto();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void tbxDtInicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtInicioKeyReleased
        FormatarCampoData(tbxDtInicio);
    }//GEN-LAST:event_tbxDtInicioKeyReleased

    private void tbxDtInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtInicioKeyTyped
        NegarInputTexto(evt);
    }//GEN-LAST:event_tbxDtInicioKeyTyped

    private void tbxDtConclusaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtConclusaoKeyTyped
        NegarInputTexto(evt);
    }//GEN-LAST:event_tbxDtConclusaoKeyTyped

    private void tbxDtConclusaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxDtConclusaoKeyReleased
        FormatarCampoData(tbxDtConclusao);
    }//GEN-LAST:event_tbxDtConclusaoKeyReleased

    private void tbxOrcamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxOrcamentoKeyReleased
        FormatarCampoValor(tbxOrcamento);
    }//GEN-LAST:event_tbxOrcamentoKeyReleased

    private void tbxOrcamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbxOrcamentoKeyTyped
        NegarInputTexto(evt);
    }//GEN-LAST:event_tbxOrcamentoKeyTyped

    private void FormatarCampoData(JTextField campo){
        String data, dia, mes, ano, tmp;
        int count;
        data = campo.getText().replace("/", "");
        dia = campo.getText().replace("/", "");
        mes = campo.getText().replace("/", "");
        ano = campo.getText().replace("/", "");
        count = data.length();
        switch (count){
            case 2:
                campo.setText(data);
                break;
            case 3:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 3);
                campo.setText(tmp);
                break;
            case 4:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4);
                campo.setText(tmp);
                break;
            case 5:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,5);
                campo.setText(tmp); 
                break;
            case 6:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,6);
                campo.setText(tmp); 
                break;
            case 7:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,7);
                campo.setText(tmp); 
                break;
            case 8:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,8);
                campo.setText(tmp); 
                break;
            case 9:
                tmp = dia.substring(0, 2) + "/" + mes.substring(2, 4) + "/" + ano.substring(4,8);
                campo.setText(tmp); 
                break;
        }
    }
    
    private void NegarInputTexto(java.awt.event.KeyEvent evt){
        String carac = "0987654321";
        if (!carac.contains(evt.getKeyChar()+"")) {
            evt.consume();
        }
    }
    
    private void FormatarCampoValor(JTextField campo){
        String tmp, tmp2, valor;
        int count;
        valor = campo.getText().replace(",", "").replace(".", "");
        count = valor.length();
        switch(count){
            case 2:
                campo.setText(valor);
                break;
            case 3:
                tmp = valor.substring(0, 2) + "," + valor.substring(2, 3);
                campo.setText(tmp);
                break;
            case 4:
                tmp = valor.substring(0, 2) + "," + valor.substring(2, 4);
                campo.setText(tmp);
                break;
            case 5:
                tmp = valor.substring(0, 3) + "," + valor.substring(3, 5);
                campo.setText(tmp);
                break;
            case 6:
                tmp = valor.substring(0, 1) + "." + valor.substring(1, 4) + "," + valor.substring(4, 6);
                campo.setText(tmp);
                break;
            case 7:
                tmp = valor.substring(0, 2) + "." + valor.substring(2, 5) + "," + valor.substring(5, 7);
                campo.setText(tmp);
                break;
            case 8:
                tmp = valor.substring(0, 3) + "." + valor.substring(3, 6) + "," + valor.substring(6, 8);
                campo.setText(tmp);
                break;
            case 9:
                tmp = valor.substring(0, 1) + "." + valor.substring(1, 4) + "." + valor.substring(4, 7) + "," + valor.substring(7, 9);
                campo.setText(tmp);
                break;
        }
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDtConclusao;
    private javax.swing.JLabel lblDtInicio;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrcamento;
    private javax.swing.JTextField tbxDtConclusao;
    private javax.swing.JTextField tbxDtInicio;
    private javax.swing.JTextField tbxNome;
    private javax.swing.JTextField tbxOrcamento;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
}
