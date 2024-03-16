package Lab2.objeto;

public class Bebida {
    public String nome;
    public double tamanho;
    public double preco;

    public Bebida(String nome, double tamanho, double preco, String caracteristica) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
