
package main.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    private String jdbcDriver = "org.h2.Driver";
    private String dbUrl = "jdbc:h2:~/filial13;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
    private String nomeUsuario = "sa";
    private String senha = "7428";

    public ConfiguracaoJDBC() {
    }
    public Connection conectarComBancoDeDados() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}