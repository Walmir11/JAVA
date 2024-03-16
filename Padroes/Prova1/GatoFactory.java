package Prova1;

public class GatoFactory extends AnimalFactory{
    @Override
    public Gato criarAnimal() {
        return new Gato("lolla", "ciano");
    }
}
