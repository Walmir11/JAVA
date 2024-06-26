package Prova1;

public class Cachorro extends Animal{

    public Cachorro(Cachorro cachorro) {
        super(cachorro.getNome(), cachorro.getCor());
    }

    public Cachorro(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public void criar() {
        System.out.println("Cachorro criado");
    }

    @Override
    public void acao() {
        System.out.println("O cachorro late");
    }

    @Override
    public void cor(String cor) {
        setCor(cor);
    }

    @Override
    public void imprimirAnimal() {
        System.out.println("O nome do cachorro é "+getNome()+" e sua cor é "+getCor());
    }

    @Override
    public Animal clonar() {
        return new Cachorro(this);
    }
}
