package EstruturaDeDados2.Arvore_B_Mais;

public class Main {
    public static void main(String[] args) {
        ArvoreBMais arvoreBMais = new ArvoreBMais(3); // Ordem 3

        // Inserindo chaves na árvore B+
        arvoreBMais.inserir(10);
        arvoreBMais.inserir(20);
        arvoreBMais.inserir(5);
        arvoreBMais.inserir(6);
        arvoreBMais.inserir(12);
        arvoreBMais.inserir(30);
        arvoreBMais.inserir(7);
        arvoreBMais.inserir(17);

        // Imprimindo a árvore B+ após inserções
        System.out.println("Árvore B+ após inserções:");
        arvoreBMais.exibir();

        // Removendo algumas chaves
        arvoreBMais.remover(6);
        arvoreBMais.remover(13); // Chave não existente
        arvoreBMais.remover(7);
        arvoreBMais.remover(4);  // Chave não existente
        arvoreBMais.remover(10);

        // Imprimindo a árvore B+ após remoções
        System.out.println("\nÁrvore B+ após remoções:");
        arvoreBMais.exibir();
    }
}