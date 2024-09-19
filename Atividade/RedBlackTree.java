public class RedBlackTree<T extends Comparable<T>> extends AbstractBinarySearchTree<T> {

    // Construtor da árvore rubro-negra
    public RedBlackTree() {
        super();
    }

    // Método para inserir um valor na árvore
    @Override
    public void inserir(T dado) {
        Node<T> novoNo = new Node<>(dado);
        root = inserirRec(root, novoNo);
        balancearAposInsercao(novoNo);
        if (root != null) {
            root.setCor(false); // A raiz deve ser preta
        }
    }

    // Método auxiliar para inserir um nó na árvore
    private Node<T> inserirRec(Node<T> raiz, Node<T> novoNo) {
        if (raiz == null) {
            return novoNo;
        }

        if (novoNo.getDado().compareTo(raiz.getDado()) < 0) {
            Node<T> esquerda = inserirRec(raiz.getEsquerda(), novoNo);
            raiz.setEsquerda(esquerda);
            esquerda.setPai(raiz);
        } else if (novoNo.getDado().compareTo(raiz.getDado()) > 0) {
            Node<T> direita = inserirRec(raiz.getDireita(), novoNo);
            raiz.setDireita(direita);
            direita.setPai(raiz);
        }

        return raiz;
    }

    // Método para balancear a árvore após a inserção
    @Override
    public void balancearAposInsercao(Node<T> no) {
        while (no != null && no != root && no.getPai().isCor()) {
            if (no.getPai() == no.getPai().getPai().getEsquerda()) {
                Node<T> tio = no.getPai().getPai().getDireita();
                if (tio != null && tio.isCor()) {
                    no.getPai().setCor(false);
                    tio.setCor(false);
                    no.getPai().getPai().setCor(true);
                    no = no.getPai().getPai();
                } else {
                    if (no == no.getPai().getDireita()) {
                        no = no.getPai();
                        rotacionarEsquerda(no);
                    }
                    no.getPai().setCor(false);
                    no.getPai().getPai().setCor(true);
                    rotacionarDireita(no.getPai().getPai());
                }
            } else {
                Node<T> tio = no.getPai().getPai().getEsquerda();
                if (tio != null && tio.isCor()) {
                    no.getPai().setCor(false);
                    tio.setCor(false);
                    no.getPai().getPai().setCor(true);
                    no = no.getPai().getPai();
                } else {
                    if (no == no.getPai().getEsquerda()) {
                        no = no.getPai();
                        rotacionarDireita(no);
                    }
                    no.getPai().setCor(false);
                    no.getPai().getPai().setCor(true);
                    rotacionarEsquerda(no.getPai().getPai());
                }
            }
        }
    }

    // Método para remover um valor da árvore
    @Override
    public void remover(T dado) {
        Node<T> noParaRemover = buscarNo(root, dado);
        if (noParaRemover != null) {
            root = removerRec(root, noParaRemover);
            if (root != null) {
                root.setCor(false); // A raiz deve ser preta
            }
        }
    }

    // Método auxiliar para buscar um nó na árvore
    private Node<T> buscarNo(Node<T> raiz, T dado) {
        if (raiz == null || dado.compareTo(raiz.getDado()) == 0) {
            return raiz;
        }

        if (dado.compareTo(raiz.getDado()) < 0) {
            return buscarNo(raiz.getEsquerda(), dado);
        } else {
            return buscarNo(raiz.getDireita(), dado);
        }
    }

    // Método auxiliar para remover um nó da árvore
    private Node<T> removerRec(Node<T> raiz, Node<T> noParaRemover) {
        if (noParaRemover.getEsquerda() == null || noParaRemover.getDireita() == null) {
            Node<T> substituto = noParaRemover;
            if (noParaRemover.getEsquerda() != null) {
                substituto = noParaRemover.getEsquerda();
            } else {
                substituto = noParaRemover.getDireita();
            }

            if (substituto != null) {
                substituto.setPai(noParaRemover.getPai());
            }

            if (noParaRemover.getPai() == null) {
                raiz = substituto;
            } else if (noParaRemover == noParaRemover.getPai().getEsquerda()) {
                noParaRemover.getPai().setEsquerda(substituto);
            } else {
                noParaRemover.getPai().setDireita(substituto);
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
        Node<T> atual = no.getDireita();
        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual;
    }

    // Método para balancear a árvore após a remoção
    @Override
    public void balancearAposRemocao(Node<T> no) {
        while (no != root && !no.isCor()) {
            if (no == no.getPai().getEsquerda()) {
                Node<T> irmao = no.getPai().getDireita();
                if (irmao.isCor()) {
                    irmao.setCor(false);
                    no.getPai().setCor(true);
                    rotacionarEsquerda(no.getPai());
                    irmao = no.getPai().getDireita();
                }

                if (!irmao.getEsquerda().isCor() && !irmao.getDireita().isCor()) {
                    irmao.setCor(true);
                    no = no.getPai();
                } else {
                    if (!irmao.getDireita().isCor()) {
                        irmao.getEsquerda().setCor(false);
                        irmao.setCor(true);
                        rotacionarDireita(irmao);
                        irmao = no.getPai().getDireita();
                    }

                    irmao.setCor(no.getPai().isCor());
                    no.getPai().setCor(false);
                    irmao.getDireita().setCor(false);
                    rotacionarEsquerda(no.getPai());
                    no = root;
                }
            } else {
                Node<T> irmao = no.getPai().getEsquerda();
                if (irmao.isCor()) {
                    irmao.setCor(false);
                    no.getPai().setCor(true);
                    rotacionarDireita(no.getPai());
                    irmao = no.getPai().getEsquerda();
                }

                if (!irmao.getDireita().isCor() && !irmao.getEsquerda().isCor()) {
                    irmao.setCor(true);
                    no = no.getPai();
                } else {
                    if (!irmao.getEsquerda().isCor()) {
                        irmao.getDireita().setCor(false);
                        irmao.setCor(true);
                        rotacionarEsquerda(irmao);
                        irmao = no.getPai().getEsquerda();
                    }

                    irmao.setCor(no.getPai().isCor());
                    no.getPai().setCor(false);
                    irmao.getEsquerda().setCor(false);
                    rotacionarDireita(no.getPai());
                    no = root;
                }
            }
        }
        no.setCor(false);
    }

    // Método de rotação à esquerda
    @Override
    public void rotacionarEsquerda(Node<T> no) {
        Node<T> novoRaiz = no.getDireita();
        no.setDireita(novoRaiz.getEsquerda());

        if (novoRaiz.getEsquerda() != null) {
            novoRaiz.getEsquerda().setPai(no);
        }

        novoRaiz.setPai(no.getPai());

        if (no.getPai() == null) {
            root = novoRaiz;
        } else if (no == no.getPai().getEsquerda()) {
            no.getPai().setEsquerda(novoRaiz);
        } else {
            no.getPai().setDireita(novoRaiz);
        }

        novoRaiz.setEsquerda(no);
        no.setPai(novoRaiz);
    }

    // Método de rotação à direita
    @Override
    public void rotacionarDireita(Node<T> no) {
        Node<T> novoRaiz = no.getEsquerda();
        no.setEsquerda(novoRaiz.getDireita());

        if (novoRaiz.getDireita() != null) {
            novoRaiz.getDireita().setPai(no);
        }

        novoRaiz.setPai(no.getPai());

        if (no.getPai() == null) {
            root = novoRaiz;
        } else if (no == no.getPai().getDireita()) {
            no.getPai().setDireita(novoRaiz);
        } else {
            no.getPai().setEsquerda(novoRaiz);
        }

        novoRaiz.setDireita(no);
        no.setPai(novoRaiz);
    }

    // Método para buscar um valor na árvore
    @Override
    public boolean buscar(T dado) {
        return buscarNo(root, dado) != null;
    }

    // Método auxiliar para buscar um valor na árvore
    private Node<T> buscarNo(Node<T> raiz, T dado) {
        if (raiz == null || dado.compareTo(raiz.getDado()) == 0) {
            return raiz;
        }

        if (dado.compareTo(raiz.getDado()) < 0) {
            return buscarNo(raiz.getEsquerda(), dado);
        } else {
            return buscarNo(raiz.getDireita(), dado);
        }
    }

    // Método para imprimir a árvore (opcional para visualização)
    public void imprimirArvore() {
        imprimirArvore(root, "", true);
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
