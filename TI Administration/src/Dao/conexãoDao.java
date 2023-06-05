package Dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tecnico.daniel
 */
public class conexãoDao {

    public Connection conectaBD() {

        Connection conn = null;
        try {
            String url = "jdbc:mysql://10.127.184.2:3306/usuarios?user=(AQUI IRÁ O USUARIO DO BANCO)&password=(AQUI IRA A SENHA DO BANCO)";
            conn = DriverManager.getConnection(url);
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " TIAdministration está com erro na conexão com o banco de dados, erro: " + erro.getMessage());
        }
        return conn;
    } //conjunto que irá iniciar a conexão com o banco de dados e se der falha irá retornar um erro
}
