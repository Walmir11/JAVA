package Prova1;

public class Main {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();
        Cachorro cachorro = new Cachorro("Adolfo", "Amarelo");
        Gato gato = new Gato("Amendoin","Preto");


        logistica.planejarAnimal("cachorro");
        System.out.println();
        logistica.planejarAnimal("Gato");

        System.out.println("_______________________________________");

        Animal gato1 = gato.clonar();
        gato1.criar();
        gato1.cor("vermelho");
        gato1.acao();
        gato1.imprimirAnimal();

        System.out.println();

        Animal cachorro1 = cachorro.clonar();
        cachorro1.criar();
        cachorro1.cor("Azul");
        cachorro1.acao();
        cachorro1.imprimirAnimal();

    }
}
