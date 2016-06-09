
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
public class Compras {
    
    private String id, nf, fornecedor, valorNf, dtCompra, descricao;
    
    public Compras(String nf, String fornecedor, String valorNf, String dtCompra, String descricao){
        this.id = Integer.toString(Util.GerarCodigo("COMPRAS", "ID"));
        this.nf = nf;
        this.fornecedor = fornecedor;
        this.valorNf = valorNf.replace(".", "").replace(",", ".");
        this.dtCompra = Util.FormatData(dtCompra);
        this.descricao = descricao;
    }
    
    public void AdicionarCompras(){
        Connection conn;
        Statement statement;
        String querySel, queryInser;
        PreparedStatement pSelCmd, pInsCmd;
         try {
            // ABRO A CONEXÃO
            conn = Oracle.ObterConexao();
            statement = conn.createStatement();
            // QUERY PARA VERIRICAR SE JA EXISTE O PRONTUARIO CADASTRADO NA BASE
            querySel = "SELECT * FROM COMPRAS WHERE ID='" + id + "'";
            // QUERY PARA INSERIR OS DADOS DO NOVO CLIENTE
            queryInser = "INSERT INTO COMPRAS VALUES('" + id + "', '" + nf + "', '" + fornecedor + "', "
                          + "" + valorNf + ", TO_DATE('" + dtCompra + "', 'yyyy-MM-dd'), '" + descricao + "')";
            pSelCmd = conn.prepareStatement(querySel);
            pInsCmd = conn.prepareStatement(queryInser);
            ResultSet rs = pSelCmd.executeQuery();
            if (!rs.next()) {
                pInsCmd.executeUpdate();
                rs.close();
                pInsCmd.close();
                pSelCmd.close();
                pInsCmd.close();
                JOptionPane.showMessageDialog(null, "Compras salvas.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
