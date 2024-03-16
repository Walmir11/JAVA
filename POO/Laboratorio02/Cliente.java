package Lab2.objeto;

public class Cliente {
    public String nome;
    public String cpf;
    public int anoNascimento;

    public Cliente(String nome, String cpf, int anoNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int idade(){
        return 2022 - anoNascimento;
    }
}
