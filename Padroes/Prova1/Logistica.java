package Prova1;

public class Logistica {
    public void planejarAnimal(String tipoAnimal){
        AnimalFactory animalFactory;

        if(tipoAnimal.equalsIgnoreCase("Cachorro")){
            animalFactory = new CachorroFactory();
        }else if(tipoAnimal.equalsIgnoreCase("Gato")){
            animalFactory = new GatoFactory();
        }else{
            throw new IllegalArgumentException("animal inválido.");
        }

        Animal animal = animalFactory.criarAnimal();
        animal.criar();
        animal.acao();
        animal.imprimirAnimal();
    }
}
