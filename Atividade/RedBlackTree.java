public class RedBlackTree<T extends Comparable<T>> extends AbstractBinarySearchTree<T> {

    private static final boolean VERMELHO = true;
    private static final boolean PRETO = false;

    @Override
    public void inserir(T dado) {
        Node<T> novoNo = new Node<>(dado);
        raiz = inserirNo(raiz, novoNo);
        balancearAposInsercao(novoNo);
        raiz.setCor(PRETO); // A raiz deve sempre ser preta
    }

    // Inserção normal de árvore binária
    private Node<T> inserirNo(Node<T> atual, Node<T> novoNo) {
        if (atual == null) {
            return novoNo;
        }

        if (novoNo.getDado().compareTo(atual.getDado()) < 0) {
            atual.setEsquerdo(inserirNo(atual.getEsquerdo(), novoNo));
            atual.getEsquerdo().setPai(atual);
        } else if (novoNo.getDado().compareTo(atual.getDado()) > 0) {
            atual.setDireito(inserirNo(atual.getDireito(), novoNo));
            atual.getDireito().setPai(atual);
        }
        return atual;
    }

    @Override
    public void remover(T dado) {
        Node<T> noParaRemover = buscarArvore(raiz, dado);
        if (noParaRemover != null) {
            removerNo(noParaRemover);
        }
    }

    // Remoção de nó da árvore rubro-negra
    private void removerNo(Node<T> no) {
        Node<T> substituto = no;
        boolean corOriginal = substituto.isPreto();
        Node<T> filho;

        if (no.getEsquerdo() == null) {
            filho = no.getDireito();
            substituirNo(no, no.getDireito());
        } else if (no.getDireito() == null) {
            filho = no.getEsquerdo();
            substituirNo(no, no.getEsquerdo());
        } else {
            substituto = encontrarMinimo(no.getDireito());
            corOriginal = substituto.isPreto();
            filho = substituto.getDireito();
            if (substituto.getPai() == no) {
                if (filho != null) filho.setPai(substituto);
            } else {
                substituirNo(substituto, substituto.getDireito());
                substituto.setDireito(no.getDireito());
                substituto.getDireito().setPai(substituto);
            }
            substituirNo(no, substituto);
            substituto.setEsquerdo(no.getEsquerdo());
            substituto.getEsquerdo().setPai(substituto);
            substituto.setCor(no.isPreto());
        }

        if (corOriginal == PRETO) {
            balancearAposRemocao(filho);
        }
    }

    private void substituirNo(Node<T> antigo, Node<T> novoNo) {
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

    private Node<T> encontrarMinimo(Node<T> no) {
        while (no.getEsquerdo() != null) {
            no = no.getEsquerdo();
        }
        return no;
    }

    @Override
    public void balancearAposInsercao(Node<T> no) {
        Node<T> pai, avo;

        while (no != raiz && no.getPai().isVermelho()) {
            pai = no.getPai();
            avo = pai.getPai();

            // Caso 1: Pai é filho esquerdo do avô
            if (pai == avo.getEsquerdo()) {
                Node<T> tio = avo.getDireito();
                if (tio != null && tio.isVermelho()) { // Caso 1.1: Tio é vermelho
                    pai.setCor(PRETO);
                    tio.setCor(PRETO);
                    avo.setCor(VERMELHO);
                    no = avo;
                } else {
                    // Caso 1.2: Nó é filho direito
                    if (no == pai.getDireito()) {
                        rotacionarEsquerda(pai);
                        no = pai;
                        pai = no.getPai();
                    }
                    // Caso 1.3: Nó é filho esquerdo
                    pai.setCor(PRETO);
                    avo.setCor(VERMELHO);
                    rotacionarDireita(avo);
                }
            }
            // Caso 2: Pai é filho direito do avô
            else {
                Node<T> tio = avo.getEsquerdo();
                if (tio != null && tio.isVermelho()) { // Caso 2.1: Tio é vermelho
                    pai.setCor(PRETO);
                    tio.setCor(PRETO);
                    avo.setCor(VERMELHO);
                    no = avo;
                } else {
                    // Caso 2.2: Nó é filho esquerdo
                    if (no == pai.getEsquerdo()) {
                        rotacionarDireita(pai);
                        no = pai;
                        pai = no.getPai();
                    }
                    // Caso 2.3: Nó é filho direito
                    pai.setCor(PRETO);
                    avo.setCor(VERMELHO);
                    rotacionarEsquerda(avo);
                }
            }
        }
        raiz.setCor(PRETO);
    }

    @Override
    public void balancearAposRemocao(Node<T> no) {
        Node<T> irmao;

        while (no != raiz && no.isPreto()) {
            if (no == no.getPai().getEsquerdo()) {
                irmao = no.getPai().getDireito();

                // Caso 1: Irmão é vermelho
                if (irmao.isVermelho()) {
                    irmao.setCor(PRETO);
                    no.getPai().setCor(VERMELHO);
                    rotacionarEsquerda(no.getPai());
                    irmao = no.getPai().getDireito();
                }

                // Caso 2: Irmão e seus filhos são pretos
                if ((irmao.getEsquerdo() == null || irmao.getEsquerdo().isPreto()) &&
                    (irmao.getDireito() == null || irmao.getDireito().isPreto())) {
                    irmao.setCor(VERMELHO);
                    no = no.getPai();
                } else {
                    // Caso 3: Irmão é preto, o filho direito é preto e o filho esquerdo é vermelho
                    if (irmao.getDireito() == null || irmao.getDireito().isPreto()) {
                        if (irmao.getEsquerdo() != null) irmao.getEsquerdo().setCor(PRETO);
                        irmao.setCor(VERMELHO);
                        rotacionarDireita(irmao);
                        irmao = no.getPai().getDireito();
                    }

                    // Caso 4: Irmão é preto e o filho direito é vermelho
                    irmao.setCor(no.getPai().isPreto());
                    no.getPai().setCor(PRETO);
                    if (irmao.getDireito() != null) irmao.getDireito().setCor(PRETO);
                    rotacionarEsquerda(no.getPai());
                    no = raiz;
                }
            } else {
                irmao = no.getPai().getEsquerdo();

                // Caso 1: Irmão é vermelho
                if (irmao.isVermelho()) {
                    irmao.setCor(PRETO);
                    no.getPai().setCor(VERMELHO);
                    rotacionarDireita(no.getPai());
                    irmao = no.getPai().getEsquerdo();
                }

                // Caso 2: Irmão e seus filhos são pretos
                if ((irmao.getEsquerdo() == null || irmao.getEsquerdo().isPreto()) &&
                    (irmao.getDireito() == null || irmao.getDireito().isPreto())) {
                    irmao.setCor(VERMELHO);
                    no = no.getPai();
                } else {
                    // Caso 3: Irmão é preto, o filho esquerdo é preto e o filho direito é vermelho
                    if (irmao.getEsquerdo() == null || irmao.getEsquerdo().isPreto()) {
                        if (irmao.getDireito() != null) irmao.getDireito().setCor(PRETO);
                        irmao.setCor(VERMELHO);
                        rotacionarEsquerda(irmao);
                        irmao = no.getPai().getEsquerdo();
                    }

                    // Caso 4: Irmão é preto e o filho esquerdo é vermelho
                    irmao.setCor(no.getPai().isPreto());
                    no.getPai().setCor(PRETO);
                    if (irmao.getEsquerdo() != null) irmao.getEsquerdo().setCor(PRETO);
                    rotacionarDireita(no.getPai());
                    no = raiz;
                }
            }
        }
        no.setCor(PRETO);
    }

    // Rotação para a esquerda
    private void rotacionarEsquerda(Node<T> no) {
        Node<T> direito = no.getDireito();
        no.setDireito(direito.getEsquerdo());
        if (direito.getEsquerdo() != null) {
            direito.getEsquerdo().setPai(no);
        }
        direito.setPai(no.getPai());
        if (no.getPai() == null) {
            raiz = direito;
        } else if (no == no.getPai().getEsquerdo()) {
            no.getPai().setEsquerdo(direito);
        } else {
            no.getPai().setDireito(direito);
        }
        direito.setEsquerdo(no);
        no.setPai(direito);
    }

    // Rotação para a direita
    private void rotacionarDireita(Node<T> no) {
        Node<T> esquerdo = no.getEsquerdo();
        no.setEsquerdo(esquerdo.getDireito());
        if (esquerdo.getDireito() != null) {
            esquerdo.getDireito().setPai(no);
        }
        esquerdo.setPai(no.getPai());
        if (no.getPai() == null) {
            raiz = esquerdo;
        } else if (no == no.getPai().getDireito()) {
            no.getPai().setDireito(esquerdo);
        } else {
            no.getPai().setEsquerdo(esquerdo);
        }
        esquerdo.setDireito(no);
        no.setPai(esquerdo);
    }

    public void imprimirArvore() {
        imprimirArvore(this.raiz, "", true);
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
            System.out.println(no.dado + " (" + (no.cor ? "Vermelho" : "Preto") + ")");
            imprimirArvore(no.esquerda, indentacao, false);
            imprimirArvore(no.direita, indentacao, true);
        }
    }    

}