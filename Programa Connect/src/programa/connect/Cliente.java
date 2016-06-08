package programa.connect;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
import oracle.Oracle;

/**
 *
 * @author David
 */
public class Cliente {
    private  String nome, rua, cidade, cep, telefone, cpfCnpj, id;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String rua, String cidade, String cep, String telefone, String cpfCnpj, String id){
        this.nome= nome;
        this.rua = rua;
        this.cidade = cidade;
        this.cep= cep;
        this.telefone = telefone;
        this.cpfCnpj = cpfCnpj;
        this.id = id;
    }
    
    public void AdicionarCliente(){
        try {
            // ABRO A CONEXÃO
            Connection conn = Oracle.ObterConexao();
            Statement statement = conn.createStatement();
            // QUERY PARA VERIRICAR SE JA EXISTE O CNPJ OU CPF CADASTRADO NA BASE
            String querySel = "SELECT * FROM CLIENTES WHERE CNPJ_CPF='" + cpfCnpj + "'";
            // QUERY PARA INSERIR OS DADOS DO NOVO CLIENTE
            String querIns = "INSERT INTO CLIENTES VALUES('" + id + "', '" + nome + "', '" + rua + "', "
                          + "'" + cidade + "', '" + cep + "', '" + telefone + "', '" + cpfCnpj +  "')";
            PreparedStatement pSelCmd = conn.prepareStatement(querySel);
            PreparedStatement pInsCmd = conn.prepareStatement(querIns);
            ResultSet rs = pSelCmd.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Cliente ja existente;");
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
    
    public void ExcluirCliente(){
        Connection conn = null;
        PreparedStatement psSel = null;
        PreparedStatement psDel = null;
        ResultSet rs = null;
        String cmdSel = "SELECT * FROM CLIENTES WHERE ID='" + id + "'";
        String cmdDel = "DELETE FROM CLIENTES WHERE ID='" + id + "'";
        try {
            conn = Oracle.ObterConexao();
            psSel = conn.prepareStatement(cmdSel);
            rs= psSel.executeQuery();
            if (rs.next()) {
                psDel = conn.prepareStatement(cmdDel);
                psDel.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente inexistente.");
            }
            psDel.close();
            psSel.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void AlterarCliente(){
        Connection conn;
        PreparedStatement psSel, psUpd;
        ResultSet rs;
        String cmdSel = "SELECT * FROM CLIENTES WHERE ID='" + id + "'";
        String cmdUpt = "UPDATE CLIENTES SET NOME='" + nome + "', RUA='" + rua + "', CIDADE='" + cidade + "', " 
                      + "CEP='" + cep + "', TELEFONE='" + telefone + "', CNPJ_CPF='" + cpfCnpj + "' WHERE ID='" + id +"'";
        try {
            conn = Oracle.ObterConexao();
            psSel = conn.prepareStatement(cmdSel);
            psUpd = conn.prepareStatement(cmdUpt);
            rs= psSel.executeQuery();
            if (rs.next()) {
                
                psUpd.executeUpdate();
                JOptionPane.showMessageDialog(null, "As informações foram atualizadas para esse cliente.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente inexistente.");
            }
            psUpd.close();
            psSel.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
       
}
