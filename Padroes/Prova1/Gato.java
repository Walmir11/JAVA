package Prova1;

public class Gato extends Animal{

    public Gato(Gato gato) {
        super(gato.getNome(), gato.getCor());
    }

    public Gato(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public void criar() {
        System.out.println("Gato criado");
    }

    @Override
    public void acao() {
        System.out.println("O  gato mia");
    }

    @Override
    public void cor(String cor) {
        setCor(cor);
    }

    public void imprimirAnimal(){
        System.out.println("O nome do gato é "+getNome()+" e sua cor é "+getCor());
    }

    @Override
    public Animal clonar() {
        return new Gato(this);
    }
}
