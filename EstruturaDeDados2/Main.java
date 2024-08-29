package EstruturaDeDados2;

public class Main {
    public static void main(String[] args) {
        ArvoreAVL<Integer> arvore = new ArvoreAVL<>();

        arvore.adicionar(10);
        arvore.adicionar(5);
        arvore.adicionar(15);
        arvore.adicionar(3);
        arvore.adicionar(7);
        arvore.adicionar(12);
        arvore.adicionar(18);

        // Percorrer a árvore em ordem
        System.out.println("Percurso em ordem:");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("Percurso em pré-ordem:");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("Percurso em pós-ordem:");
        arvore.posOrdem(arvore.getRaiz());

        System.out.println("Buscando o elemento 7:");
        No<Integer> noBuscado = arvore.buscar(7);
        System.out.println("Elemento encontrado: " + noBuscado.getDado());
        System.out.println("Elemento não encontrado.");


        // Remover um elemento
        System.out.println("Removendo o elemento 10:");
        arvore.remover(10);
        System.out.println("Percurso em ordem após remoção:");
        arvore.emOrdem(arvore.getRaiz());
    }
}