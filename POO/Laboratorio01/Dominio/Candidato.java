package Laboratorio01.Dominio;

public class Candidato {
    private String nome;
    private String partido;
    private String numero;
    private String cargo;

    public Candidato(String nome, String partido, String numero, String cargo) {
        this.nome = nome;
        this.partido = partido;
        this.numero = numero;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
