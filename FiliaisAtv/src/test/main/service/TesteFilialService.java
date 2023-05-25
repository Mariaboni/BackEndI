package test.main.service;


import main.config.ConfiguracaoJDBC;
import main.dao.impl.FilialDAO;
import main.model.Filial;
import main.service.FilialService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteFilialService {


    public FilialService filialService = new FilialService(new FilialDAO(new ConfiguracaoJDBC()));

    public TesteFilialService() {
    }

    @Test
     void devecadastrarFilial() {
        Filial filial = new Filial("Filial1","Rua 1","1234","Sao Paulo","SP",true);
        Filial filial2 = new Filial("Filial2","Rua 2","1232","Natal","RN",true);
        Filial filial3 = new Filial("Filial3","Rua 3","1238","Macapá","AP",false);
        Filial filial4 = new Filial("Filial4","Rua 4","1239","Manaus","AM",true);
        Filial filial5 = new Filial("Filial5","Rua 5","1230","Curitiba","PR",false);


        this.filialService.cadastrarFilial(filial);
        Assertions.assertNotNull(filial.getId());

        this.filialService.cadastrarFilial(filial2);
        Assertions.assertNotNull(filial2.getId());

        this.filialService.cadastrarFilial(filial3);
        Assertions.assertNotNull(filial3.getId());

        this.filialService.cadastrarFilial(filial4);
        Assertions.assertNotNull(filial4.getId());

        this.filialService.cadastrarFilial(filial5);
        Assertions.assertNotNull(filial5.getId());
    }








}
