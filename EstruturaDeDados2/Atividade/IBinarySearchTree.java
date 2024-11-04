package Atividade;

public interface IBinarySearchTree<T extends Comparable<T>> {

    // Método para inserir um dado na árvore
    void inserir(T dado);

    // Método para remover um dado da árvore
    void remover(T dado);

    // Método para buscar um dado na árvore; retorna true se encontrado, false caso contrário
    boolean buscar(T dado);
}
