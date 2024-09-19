package Atividade;

public class RedBlackTree<T extends Comparable<T>> extends AbstractBinarySearchTree<T> {

    // Construtor da árvore rubro-negra
    public RedBlackTree() {
        super();
    }

    // Método para inserir um valor na árvore
    @Override
    public void inserir(T dado) {
        Node<T> novoNo = new Node<>(dado);
        raiz = inserirRec(raiz, novoNo);
        balancearAposInsercao(novoNo);
        if (raiz != null) {
            raiz.setCor(false); // A raiz deve ser preta
        }
    }

    // Método auxiliar para inserir um nó na árvore
    private Node<T> inserirRec(Node<T> raiz, Node<T> novoNo) {
        if (raiz == null) {
            return novoNo;
        }

        if (novoNo.getDado().compareTo(raiz.getDado()) < 0) {
            Node<T> esquerda = inserirRec(raiz.getEsquerdo(), novoNo);
            raiz.setEsquerdo(esquerda);
            esquerda.setPai(raiz);
        } else if (novoNo.getDado().compareTo(raiz.getDado()) > 0) {
            Node<T> direita = inserirRec(raiz.getDireito(), novoNo);
            raiz.setDireito(direita);
            direita.setPai(raiz);
        }

        return raiz;
    }

    // Método para balancear a árvore após a inserção
    @Override
    public void balancearAposInsercao(Node<T> no) {
        while (no != null && no != raiz && no.getPai().isCor()) {
            if (no.getPai() == no.getPai().getPai().getEsquerdo()) {
                Node<T> tio = no.getPai().getPai().getDireito();
                if (tio != null && tio.isCor()) {
                    no.getPai().setCor(false);
                    tio.setCor(false);
                    no.getPai().getPai().setCor(true);
                    no = no.getPai().getPai();
                } else {
                    if (no == no.getPai().getDireito()) {
                        no = no.getPai();
                        rotacionarEsquerda(no);
                    }
                    no.getPai().setCor(false);
                    no.getPai().getPai().setCor(true);
                    rotacionarDireita(no.getPai().getPai());
                }
            } else {
                Node<T> tio = no.getPai().getPai().getEsquerdo();
                if (tio != null && tio.isCor()) {
                    no.getPai().setCor(false);
                    tio.setCor(false);
                    no.getPai().getPai().setCor(true);
                    no = no.getPai().getPai();
                } else {
                    if (no == no.getPai().getEsquerdo()) {
                        no = no.getPai();
                        rotacionarDireita(no);
                    }
                    no.getPai().setCor(false);
                    no.getPai().getPai().setCor(true);
                    rotacionarEsquerda(no.getPai().getPai());
                }
            }
        }
        raiz.setCor(false);
    }

    // Método para remover um valor da árvore
    @Override
    public void remover(T dado) {
        Node<T> noParaRemover = buscarNoAux(raiz, dado);
        if (noParaRemover != null) {
            raiz = removerRec(raiz, noParaRemover);
            if (raiz != null) {
                raiz.setCor(false); // A raiz deve ser preta
            }
        }
    }

    // Método auxiliar para buscar um nó na árvore
    private Node<T> buscarNoAux(Node<T> raiz, T dado) {
        if (raiz == null || dado.compareTo(raiz.getDado()) == 0) {
            return raiz;
        }

        if (dado.compareTo(raiz.getDado()) < 0) {
            return buscarNoAux(raiz.getEsquerdo(), dado);
        } else {
            return buscarNoAux(raiz.getDireito(), dado);
        }
    }

    // Método auxiliar para remover um nó da árvore
    private Node<T> removerRec(Node<T> raiz, Node<T> noParaRemover) {
        if (noParaRemover.getEsquerdo() == null || noParaRemover.getDireito() == null) {
            Node<T> substituto = noParaRemover;
            if (noParaRemover.getEsquerdo() != null) {
                substituto = noParaRemover.getEsquerdo();
            } else {
                substituto = noParaRemover.getDireito();
            }

            if (substituto != null) {
                substituto.setPai(noParaRemover.getPai());
            }

            if (noParaRemover.getPai() == null) {
                raiz = substituto;
            } else if (noParaRemover == noParaRemover.getPai().getEsquerdo()) {
                noParaRemover.getPai().setEsquerdo(substituto);
            } else {
                noParaRemover.getPai().setDireito(substituto);
            }

            if (!noParaRemover.isCor()) {
                balancearAposRemocao(substituto);
            }
        } else {
            Node<T> sucessor = obterSucessor(noParaRemover);
            noParaRemover.setDado(sucessor.getDado());
            raiz = removerRec(raiz, sucessor);
        }
        return raiz;
    }

    // Método para obter o sucessor de um nó
    private Node<T> obterSucessor(Node<T> no) {
        Node<T> atual = no.getDireito();
        while (atual.getEsquerdo() != null) {
            atual = atual.getEsquerdo();
        }
        return atual;
    }

    // Método para balancear a árvore após a remoção
    @Override
    public void balancearAposRemocao(Node<T> no) {
        while (no != raiz && !no.isCor()) {
            if (no == no.getPai().getEsquerdo()) {
                Node<T> irmao = no.getPai().getDireito();
                if (irmao.isCor()) {
                    irmao.setCor(false);
                    no.getPai().setCor(true);
                    rotacionarEsquerda(no.getPai());
                    irmao = no.getPai().getDireito();
                }

                if (!irmao.getEsquerdo().isCor() && !irmao.getDireito().isCor()) {
                    irmao.setCor(true);
                    no = no.getPai();
                } else {
                    if (!irmao.getDireito().isCor()) {
                        irmao.getEsquerdo().setCor(false);
                        irmao.setCor(true);
                        rotacionarDireita(irmao);
                        irmao = no.getPai().getDireito();
                    }

                    irmao.setCor(no.getPai().isCor());
                    no.getPai().setCor(false);
                    irmao.getDireito().setCor(false);
                    rotacionarEsquerda(no.getPai());
                    no = raiz;
                }
            } else {
                Node<T> irmao = no.getPai().getEsquerdo();
                if (irmao.isCor()) {
                    irmao.setCor(false);
                    no.getPai().setCor(true);
                    rotacionarDireita(no.getPai());
                    irmao = no.getPai().getEsquerdo();
                }

                if (!irmao.getDireito().isCor() && !irmao.getEsquerdo().isCor()) {
                    irmao.setCor(true);
                    no = no.getPai();
                } else {
                    if (!irmao.getEsquerdo().isCor()) {
                        irmao.getDireito().setCor(false);
                        irmao.setCor(true);
                        rotacionarEsquerda(irmao);
                        irmao = no.getPai().getEsquerdo();
                    }

                    irmao.setCor(no.getPai().isCor());
                    no.getPai().setCor(false);
                    irmao.getEsquerdo().setCor(false);
                    rotacionarDireita(no.getPai());
                    no = raiz;
                }
            }
        }
        no.setCor(false);
    }

    // Método de rotação à esquerda
    public void rotacionarEsquerda(Node<T> no) {
        Node<T> novoRaiz = no.getDireito();
        no.setDireito(novoRaiz.getEsquerdo());

        if (novoRaiz.getEsquerdo() != null) {
            novoRaiz.getEsquerdo().setPai(no);
        }

        novoRaiz.setPai(no.getPai());

        if (no.getPai() == null) {
            raiz = novoRaiz;
        } else if (no == no.getPai().getEsquerdo()) {
            no.getPai().setEsquerdo(novoRaiz);
        } else {
            no.getPai().setDireito(novoRaiz);
        }

        novoRaiz.setEsquerdo(no);
        no.setPai(novoRaiz);
    }

    // Método de rotação à direita
    public void rotacionarDireita(Node<T> no) {
        Node<T> novoRaiz = no.getEsquerdo();
        no.setEsquerdo(novoRaiz.getDireito());

        if (novoRaiz.getDireito() != null) {
            novoRaiz.getDireito().setPai(no);
        }

        novoRaiz.setPai(no.getPai());

        if (no.getPai() == null) {
            raiz = novoRaiz;
        } else if (no == no.getPai().getDireito()) {
            no.getPai().setDireito(novoRaiz);
        } else {
            no.getPai().setEsquerdo(novoRaiz);
        }

        novoRaiz.setDireito(no);
        no.setPai(novoRaiz);
    }

    // Método para buscar um valor na árvore
    @Override
    public boolean buscar(T dado) {
        return buscarNoAux(raiz, dado) != null;
    }

    // Método para imprimir a árvore (opcional para visualização)
    public void imprimirArvore() {
        imprimirArvore(raiz, "", true);
    }

    private void imprimirArvore(Node<T> no, String indentacao, boolean ultimaPosicao) {
        if (no != null) {
            System.out.print(indentacao);
            if (ultimaPosicao) {
                System.out.print("└── ");
                indentacao += "    ";
            } else {
                System.out.print("├── ");
                indentacao += "|   ";
            }
            System.out.println(no.getDado() + " (" + (no.isCor() ? "Vermelho" : "Preto") + ")");
            imprimirArvore(no.getEsquerdo(), indentacao, false);
            imprimirArvore(no.getDireito(), indentacao, true);
        }
    }
}