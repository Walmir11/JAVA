public interface IBalancedTree<T extends Comparable<T>> extends IBinarySearchTree<T> {
    
    // Método para balancear a árvore após uma inserção
    void balancearAposInsercao(Node<T> no);

    // Método para balancear a árvore após uma remoção
    void balancearAposRemocao(Node<T> no);

    // Método de rotação à esquerda
    void rotacionarEsquerda(Node<T> no);

    // Método de rotação à direita
    void rotacionarDireita(Node<T> no);
}
