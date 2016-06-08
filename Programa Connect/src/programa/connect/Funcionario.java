
package programa.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import oracle.Oracle;

/**
 *
 * @author David
 */
public class Funcionario {
    private String prontuario, nome, cargo, salario, endereco, dtAdmissao;
    
    public Funcionario(String prontuario, String nome, String cargo, String salario, String endereco, String dtAdmissao){
        this.prontuario = prontuario;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario.replace(".", "").replace(",", ".");
        this.endereco = endereco;
        this.dtAdmissao = Util.FormatData(dtAdmissao);
    }
    
    public void AdicionarFuncionario(){
        Connection conn;
        Statement statement;
        String querySel, queryInser;
        PreparedStatement pSelCmd, pInsCmd;
         try {
            // ABRO A CONEXÃO
            conn = Oracle.ObterConexao();
            statement = conn.createStatement();
            // QUERY PARA VERIRICAR SE JA EXISTE O PRONTUARIO CADASTRADO NA BASE
            querySel = "SELECT * FROM FUNCIONARIOS WHERE PRONTUARIO='" + prontuario + "'";
            // QUERY PARA INSERIR OS DADOS DO NOVO CLIENTE
            queryInser = "INSERT INTO FUNCIONARIOS VALUES('" + prontuario + "', '" + nome + "', '" + cargo + "', "
                          + "" + salario + ", '" + endereco + "', TO_DATE('" + dtAdmissao + "', 'yyyy-MM-dd'))";
            pSelCmd = conn.prepareStatement(querySel);
            pInsCmd = conn.prepareStatement(queryInser);
            ResultSet rs = pSelCmd.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Funcionário ja existente;");
            }
            else{
                pInsCmd.executeUpdate();
                rs.close();
                pSelCmd.close();
                pInsCmd.close();
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void AlterarFuncionario(){
        Connection conn;
        PreparedStatement psSel, psUpd;
        ResultSet rs;
        String cmdSel = "SELECT * FROM FUNCIONARIOS WHERE PRONTUARIO='" + prontuario + "'";
        String cmdUpt = "UPDATE FUNCIONARIOS SET NOME='" + nome + "', CARGO='" + cargo + "', SALARIO=" + salario + ", " 
                      + "ENDERECO='" + endereco + "', DATA_ADMISSAO=TO_DATE('" + dtAdmissao + "', 'yyyy-MM-dd') " 
                      + "WHERE PRONTUARIO='" + prontuario +"'";
        try {
            conn = Oracle.ObterConexao();
            psSel = conn.prepareStatement(cmdSel);
            psUpd = conn.prepareStatement(cmdUpt);
            rs= psSel.executeQuery();
            if (rs.next()) {
                psUpd.executeUpdate();
                JOptionPane.showMessageDialog(null, "As informações foram atualizadas para esse funcionário.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Funcionario inexistente.");
            }
            psUpd.close();
            psSel.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void ExcluirFuncionario(){
        Connection conn;
        PreparedStatement psSel, psDel;
        ResultSet rs;
        String cmdSel = "SELECT * FROM FUNCIONARIOS WHERE PRONTUARIO='" + prontuario + "'";
        String cmdDel = "DELETE FROM FUNCIONARIOS WHERE PRONTUARIO='" + prontuario + "'";
        try {
            conn = Oracle.ObterConexao();
            psSel = conn.prepareStatement(cmdSel);
            psDel = conn.prepareStatement(cmdDel);
            rs= psSel.executeQuery();
            if (rs.next()) {
                psDel.executeUpdate();
                JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Funcionário inexistente.");
            }
            psDel.close();
            psSel.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
