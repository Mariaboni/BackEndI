package main.service;

import main.dao.Idao;
import main.model.Filial;

import java.util.List;

public class FilialService {
    private Idao<Filial> filialDAO;

    public FilialService(Idao<Filial> filialDAO) {
        this.filialDAO = filialDAO;
    }

    public Filial cadastrarFilial(Filial filial) {
        this.filialDAO.cadastrar(filial);
        return filial;
    }





}
