
package programa.connect;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
import oracle.Oracle;

/**
 *
 * @author David
 */
public class Projeto {
    private String nome, descricao, orcamento, dtInicio, dtConclusao;
    
    public Projeto(String nome, String descricao, String orcamento, String dtInicio, String dtConclusao){
        this.nome = nome;
        this.descricao = descricao;
        this.orcamento = orcamento.replace(".", "").replace(",", ".");
        this.dtInicio = Util.FormatData(dtInicio);
        this.dtConclusao = Util.FormatData(dtConclusao);
    }
    
    public void GravarProjeto(){
        Connection conn;
        Statement statement;
        PreparedStatement pSelCmd, pInsCmd;
        String querySel, queryInser;
        ResultSet rs;
        try {
            // ABRO A CONEXÃO
            conn = Oracle.ObterConexao();
            statement = conn.createStatement();
            // QUERY PARA VERIRICAR SE JA EXISTE O CNPJ OU CPF CADASTRADO NA BASE
                querySel = "SELECT * FROM PROJETOS WHERE NOME='" + nome + "'";
            // QUERY PARA INSERIR OS DADOS DO NOVO CLIENTE
            queryInser = "INSERT INTO PROJETOS VALUES('" + Util.GerarCodigo("PROJETO", "ID") + "', '" + nome + "', '" + descricao + "', "
                          + "" + orcamento + ", TO_DATE('" + dtInicio + "', 'yyyy-MM-dd'), TO_DATE('" + dtConclusao + "', 'yyyy-MM-dd'))";
            pSelCmd = conn.prepareStatement(querySel);
            pInsCmd = conn.prepareStatement(queryInser);
            rs = pSelCmd.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Projeto ja existente;");
            }
            else{
                pInsCmd.executeQuery();
                rs.close();
                pSelCmd.close();
                pInsCmd.close();
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    
}
