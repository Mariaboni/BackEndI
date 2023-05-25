package main.dao.impl;

import main.config.ConfiguracaoJDBC;
import main.dao.Idao;
import main.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDAO implements Idao<Filial> {

    private ConfiguracaoJDBC configuracaoJDBC;
    private static final Logger logger = Logger.getLogger(FilialDAO.class);




    public FilialDAO(ConfiguracaoJDBC configuracaoJDBC) { this.configuracaoJDBC = configuracaoJDBC; }

    @Override
    public Filial cadastrar(Filial filial) {

        logger.debug("Cadastrando nova Filial: " + filial.toString());
        Connection connection = this.configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO filial (nome_filial, rua_filial, numero, cidade, estado, cinco_estrelas) VALUES " +
                "('%s', '%s', '%s', '%s', '%s', '%s')", filial.getNome_filial(), filial.getRua_filial(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.isCinco_estrelas());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                filial.setId(generatedKeys.getInt(1));
                statement.close();
                connection.close();
            }
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return filial;
        }





    }



