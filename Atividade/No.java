public class Node<T extends Comparable<T>> {
    private T dado;               // Dado armazenado no nó
    private Node<T> esquerda;      // Filho à esquerda
    private Node<T> direita;       // Filho à direita
    private Node<T> pai;           // Pai do nó
    private boolean cor;           // Cor do nó (true = vermelho, false = preto)

    // Construtor do nó
    public Node(T dado) {
        this.dado = dado;
        this.esquerda = null;
        this.direita = null;
        this.pai = null;
        this.cor = true;  // Nós novos são inicialmente vermelhos
    }

    // Getters e Setters

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Node<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node<T> esquerda) {
        this.esquerda = esquerda;
    }

    public Node<T> getDireita() {
        return direita;
    }

    public void setDireita(Node<T> direita) {
        this.direita = direita;
    }

    public Node<T> getPai() {
        return pai;
    }

    public void setPai(Node<T> pai) {
        this.pai = pai;
    }

    public boolean isCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }
}
