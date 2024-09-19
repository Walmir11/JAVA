package EstruturaDeDados2.ArvoreB;

public class Main {
    public static void main(String[] args) {
        ArvoreB arvoreB = new ArvoreB(3); // Grau 3

        // Inserindo chaves na árvore B
        arvoreB.inserir(10);
        arvoreB.inserir(20);
        arvoreB.inserir(5);
        arvoreB.inserir(6);
        arvoreB.inserir(12);
        arvoreB.inserir(30);
        arvoreB.inserir(7);
        arvoreB.inserir(17);

        // Imprimindo a árvore B após inserções
        System.out.println("Árvore B após inserções:");
        arvoreB.imprimir();

        // Removendo algumas chaves
        arvoreB.remover(6);
        arvoreB.remover(13); // Chave não existente
        arvoreB.remover(7);
        arvoreB.remover(4);  // Chave não existente
        arvoreB.remover(10);

        // Imprimindo a árvore B após remoções
        System.out.println("\nÁrvore B após remoções:");
        arvoreB.imprimir();
    }
}