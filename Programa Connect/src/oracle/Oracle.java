package oracle;

import java.sql.*;

/**
 *
 * @author David
 */
public class Oracle {
    public static void main(String[] args) throws SQLException {
        Connection conexao = ObterConexao();
        Statement statement = conexao.createStatement();
        String query = "SELECT * FROM TS_LOGIN";
        ResultSet resultSet = statement.executeQuery(query);
        if (resultSet.next()) {
            System.out.println(resultSet.getDate("NOME"));
        }
    }
    
    public static Connection ObterConexao(){
        Connection conexao = null;
        try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             conexao = DriverManager.getConnection(
                                "jdbc:oracle:thin:@localhost:1521:xe", "ADMIN", "mudar123");
        } catch (ClassNotFoundException e) {
                 e.printStackTrace();
        } catch (SQLException e) {
                 e.printStackTrace();
        }
         return conexao;
    }
}
