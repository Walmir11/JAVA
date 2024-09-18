public abstract class AbstractBinarySearchTree<T extends Comparable<T>> {

    protected Node<T> raiz;

    // Método para inserir um dado na árvore
    public abstract void inserir(T dado);

    // Método para remover um dado da árvore
    public abstract void remover(T dado);

    // Método para balancear após a inserção
    protected abstract void balancearAposInsercao(Node<T> no);

    // Método para balancear após a remoção
    protected abstract void balancearAposRemocao(Node<T> no);

    // Método de busca básica na árvore
    public Node<T> buscar(T dado) {
        return buscarArvore(raiz, dado);
    }

    // Busca recursiva
    protected Node<T> buscarArvore(Node<T> no, T dado) {
        if (no == null || no.getDado().equals(dado)) {
            return no;
        }

        if (dado.compareTo(no.getDado()) < 0) {
            return buscarArvore(no.getEsquerdo(), dado);
        } else {
            return buscarArvore(no.getDireito(), dado);
        }
    }

    // Retorna o nó com o menor valor na subárvore
    protected Node<T> encontrarMinimo(Node<T> no) {
        while (no.getEsquerdo() != null) {
            no = no.getEsquerdo();
        }
        return no;
    }

    // Substitui um nó por outro (usado em remoções)
    protected void substituirNo(Node<T> antigo, Node<T> novoNo) {
        if (antigo.getPai() == null) {
            raiz = novoNo;
        } else if (antigo == antigo.getPai().getEsquerdo()) {
            antigo.getPai().setEsquerdo(novoNo);
        } else {
            antigo.getPai().setDireito(novoNo);
        }

        if (novoNo != null) {
            novoNo.setPai(antigo.getPai());
        }
    }

    // Verifica se a árvore está vazia
    public boolean estaVazia() {
        return raiz == null;
    }

    // Exibição in-order (em ordem) da árvore
    public void exibirInOrder() {
        exibirInOrder(raiz);
    }

    private void exibirInOrder(Node<T> no) {
        if (no != null) {
            exibirInOrder(no.getEsquerdo());
            System.out.print(no.getDado() + " ");
            exibirInOrder(no.getDireito());
        }
    }

    // Exibição pré-ordem
    public void exibirPreOrder() {
        exibirPreOrder(raiz);
    }

    private void exibirPreOrder(Node<T> no) {
        if (no != null) {
            System.out.print(no.getDado() + " ");
            exibirPreOrder(no.getEsquerdo());
            exibirPreOrder(no.getDireito());
        }
    }

    // Exibição pós-ordem
    public void exibirPostOrder() {
        exibirPostOrder(raiz);
    }

    private void exibirPostOrder(Node<T> no) {
        if (no != null) {
            exibirPostOrder(no.getEsquerdo());
            exibirPostOrder(no.getDireito());
            System.out.print(no.getDado() + " ");
        }
    }

    // Método para encontrar a altura da árvore
    public int altura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(Node<T> no) {
        if (no == null) {
            return -1;
        }
        int alturaEsquerda = calcularAltura(no.getEsquerdo());
        int alturaDireita = calcularAltura(no.getDireito());
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    // Método para contar o número de nós na árvore
    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(Node<T> no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.getEsquerdo()) + contarNos(no.getDireito());
    }
}
