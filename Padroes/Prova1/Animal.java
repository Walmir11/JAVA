package Prova1;

public abstract class Animal {
    public String nome;
    public String cor;

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public abstract void criar();

    public abstract void acao();

    public abstract void cor(String cor);

    public abstract void imprimirAnimal();

    public abstract Animal clonar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
