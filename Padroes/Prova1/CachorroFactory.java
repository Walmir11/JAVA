package Prova1;

public class CachorroFactory extends AnimalFactory{
    @Override
    public Cachorro criarAnimal() {
        return new Cachorro("Manoel", "cinza");
    }
}
