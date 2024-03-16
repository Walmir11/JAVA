package Laboratorio01.Dominio;

public class Eleitor {
    private String nome;
    private String RG;
    private String endereco;

    public Eleitor(String nome, String RG, String endereco) {
        this.nome = nome;
        this.RG = RG;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
