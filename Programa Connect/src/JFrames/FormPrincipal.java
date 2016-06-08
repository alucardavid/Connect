package JFrames;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        dkpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        mbClientes = new javax.swing.JMenu();
        jmiCadastrarCliente = new javax.swing.JMenuItem();
        jmiConsultarCliente = new javax.swing.JMenuItem();
        jmnProjetos = new javax.swing.JMenu();
        jmiCadastrarProjeto = new javax.swing.JMenuItem();
        jmnRH = new javax.swing.JMenu();
        jmiCadastrarFuncionario = new javax.swing.JMenuItem();
        jmiPesquisarFuncionario = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect");

        dkpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dkpPrincipalLayout = new javax.swing.GroupLayout(dkpPrincipal);
        dkpPrincipal.setLayout(dkpPrincipalLayout);
        dkpPrincipalLayout.setHorizontalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        dkpPrincipalLayout.setVerticalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        mbClientes.setText("Clientes");

        jmiCadastrarCliente.setText("Cadastrar Clientes");
        jmiCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarClienteActionPerformed(evt);
            }
        });
        mbClientes.add(jmiCadastrarCliente);

        jmiConsultarCliente.setText("Consultar Cliente");
        jmiConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarClienteActionPerformed(evt);
            }
        });
        mbClientes.add(jmiConsultarCliente);

        jMenuBar2.add(mbClientes);

        jmnProjetos.setText("Projetos");

        jmiCadastrarProjeto.setText("Cadastrar Projeto");
        jmiCadastrarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarProjetoActionPerformed(evt);
            }
        });
        jmnProjetos.add(jmiCadastrarProjeto);

        jMenuBar2.add(jmnProjetos);

        jmnRH.setText("RH");

        jmiCadastrarFuncionario.setText("Cadastrar Funcionario");
        jmiCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jmnRH.add(jmiCadastrarFuncionario);

        jmiPesquisarFuncionario.setText("Pesquisar Funcionario");
        jmnRH.add(jmiPesquisarFuncionario);

        jMenuBar2.add(jmnRH);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarClienteActionPerformed
        // CRIO UMA NOVA INSTANCIA DO JFRAME CADASTRO DE CLIENTE E EXIBO ELA.
        CadastCliente nCadastCliente = new CadastCliente();
        dkpPrincipal.add(nCadastCliente);
        nCadastCliente.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarClienteActionPerformed

    private void jmiConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarClienteActionPerformed
        PesquisaClientes nPesquisaClientes = new PesquisaClientes();
        dkpPrincipal.add(nPesquisaClientes);
        nPesquisaClientes.setVisible(true);
    }//GEN-LAST:event_jmiConsultarClienteActionPerformed

    private void jmiCadastrarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarProjetoActionPerformed
        CadastProjeto nCadastProjeto =  new CadastProjeto();
        dkpPrincipal.add(nCadastProjeto);
        nCadastProjeto.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarProjetoActionPerformed

    private void jmiCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarFuncionarioActionPerformed
        CadastFuncionario nCadastFuncionario = new CadastFuncionario();
        dkpPrincipal.add(nCadastFuncionario);
        nCadastFuncionario.setVisible(true);
    }//GEN-LAST:event_jmiCadastrarFuncionarioActionPerformed

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkpPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jmiCadastrarCliente;
    private javax.swing.JMenuItem jmiCadastrarFuncionario;
    private javax.swing.JMenuItem jmiCadastrarProjeto;
    private javax.swing.JMenuItem jmiConsultarCliente;
    private javax.swing.JMenuItem jmiPesquisarFuncionario;
    private javax.swing.JMenu jmnProjetos;
    private javax.swing.JMenu jmnRH;
    private javax.swing.JMenu mbClientes;
    // End of variables declaration//GEN-END:variables
}
