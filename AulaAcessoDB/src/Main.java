import java.sql.*;

public class Main {


    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Figuras; CREATE TABLE Figuras"
            + "("
            + " Id INT PRIMARY KEY,"
            + " Figura VARCHAR(50) NOT NULL,"
            + " Cor VARCHAR(50) NOT NULL"
            +")";

    private static final String sqlInsert1 = "INSERT INTO Figuras (Id, Figura, Cor) VALUES (1, 'Círculo', 'Vermelho')";
    private static final String sqlInsert2 = "INSERT INTO Figuras (Id, Figura, Cor) VALUES (2, 'Círculo', 'Vermelho')";
    private static final String sqlInsert3 = "INSERT INTO Figuras (Id, Figura, Cor) VALUES (3, 'Quadrado', 'Amarelo')";
    private static final String sqlInsert4 = "INSERT INTO Figuras (Id, Figura, Cor) VALUES (4, 'Quadrado', 'Verde')";
    private static final String sqlInsert5 = "INSERT INTO Figuras (Id, Figura, Cor) VALUES (5, 'Quadrado', 'Amarelo')";



    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = getConexao();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            mostraFigura(connection);





        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void mostraFigura(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Figuras where Figura = 'Círculo' and Cor = 'Vermelho'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while(resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2)  + " - " + resultSet.getString(3));
        }
    }

    public static Connection getConexao() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}