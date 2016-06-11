package oracle;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public final class Oracle {
    
    public static String host = "@localhost", port = "1521", sid = "xe", user = "ADMIN", pwd = "mudar123";
    
    public static void main(String[] args) {
        
    }
    
    public static Connection ObterConexao(){
        Connection conexao = null;
        try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             conexao = DriverManager.getConnection("jdbc:oracle:thin:" + host + ":" + port + ":" + sid + "", user, pwd);
        } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
        }
         return conexao;
    }
}
