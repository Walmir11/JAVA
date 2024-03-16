package EstruturaDeDados1.Pilha.Main;

import EstruturaDeDados1.Pilha.Objeto.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.empilhar(8);
        pilha.empilhar(10);
        pilha.empilhar(15);
        pilha.desempilhar();
        System.out.println(pilha.toString());
        
    }
}
