package Atividade;

public class Main {
    public static void main(String[] args) {
        // Cria uma nova árvore rubro-negra
        RedBlackTree<Integer> arvore = new RedBlackTree<>();

        // Inserindo elementos na árvore
        arvore.inserir(20);
        arvore.inserir(15);
        arvore.inserir(25);
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(30);

        // Exibindo a árvore após inserções
        System.out.println("Árvore após inserções:");
        arvore.imprimirArvore();

        // Buscando um elemento na árvore
        System.out.println("\nBuscando o número 15: " + (arvore.buscar(15) ? "Encontrado" : "Não encontrado"));

        // Removendo um elemento da árvore
        arvore.remover(15);
        System.out.println("\nÁrvore após remover o número 15:");
        arvore.imprimirArvore();

        // Buscando o número 15 novamente
        System.out.println("\nBuscando o número 15 após remoção: " + (arvore.buscar(15) ? "Encontrado" : "Não encontrado"));
    }
}