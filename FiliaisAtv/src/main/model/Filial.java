package main.model;

public class Filial {
    private int id;
    private String nome_filial;
    private String rua_filial;
    private String numero;
    private String cidade;
    private String estado;
    private boolean cinco_estrelas;

    public Filial(int id, String nome_filial, String rua_filial, String numero, String cidade, String estado, boolean cinco_estrelas) {
        this.id = id;
        this.nome_filial = nome_filial;
        this.rua_filial = rua_filial;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cinco_estrelas = cinco_estrelas;
    }

    public Filial(String nome_filial, String rua_filial, String numero, String cidade, String estado, boolean cinco_estrelas) {
        this.nome_filial = nome_filial;
        this.rua_filial = rua_filial;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cinco_estrelas = cinco_estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nome_filial='" + rua_filial + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cinco estrelas =" + cinco_estrelas +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_filial() {
        return nome_filial;
    }

    public void setNome_filial(String nome_filial) {
        this.nome_filial = nome_filial;
    }

    public String getRua_filial() {
        return rua_filial;
    }

    public void setRua_filial(String rua_filial) {
        this.rua_filial = rua_filial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isCinco_estrelas() {
        return cinco_estrelas;
    }

    public void setCinco_estrelas(boolean cinco_estrelas) {
        this.cinco_estrelas = cinco_estrelas;
    }




}
