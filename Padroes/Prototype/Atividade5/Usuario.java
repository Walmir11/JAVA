package PadroesProjeto.Prototype.Atividade5;

public abstract class Usuario {
    private String nome;
    private String telefone;
    private String endereco;

    public abstract String imprimirInfo();

    public abstract Usuario clonar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
