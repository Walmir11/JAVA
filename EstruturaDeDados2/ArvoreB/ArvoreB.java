package EstruturaDeDados2.ArvoreB;

public class ArvoreB {
    private NoB raiz;
    private int t; // Ordem mínima da árvore B

    public ArvoreB(int t) {
        this.raiz = null;
        this.t = t;
    }

    // Função de inserir chave
    public void inserir(int chave) {
        if (raiz == null) {
            raiz = new NoB(t, true); // Se a raiz for nula, criar uma nova folha
            raiz.getChaves()[0] = chave; // Inserir a chave
        } else {
            if (raiz.getNumChaves() == 2 * t - 1) {
                NoB s = new NoB(t, false);
                s.getFilhos()[0] = raiz;
                dividirFilho(s, 0, raiz);
                int i = 0;
                if (s.getChaves()[0] < chave) {
                    i++;
                }
                inserirNoCheio(s.getFilhos()[i], chave);
                raiz = s;
            } else {
                inserirNoCheio(raiz, chave);
            }
        }
    }

    // Função auxiliar para inserir em um nó não cheio
    private void inserirNoCheio(NoB noAtual, int chave) {
        int i = noAtual.getNumChaves() - 1;

        if (noAtual.isFolha()) {
            while (i >= 0 && noAtual.getChaves()[i] > chave) {
                noAtual.getChaves()[i + 1] = noAtual.getChaves()[i];
                i--;
            }
            noAtual.getChaves()[i + 1] = chave;
            noAtual.setNumChaves(noAtual.getNumChaves() + 1);
        } else {
            while (i >= 0 && noAtual.getChaves()[i] > chave) {
                i--;
            }
            if (noAtual.getFilhos()[i + 1].getNumChaves() == 2 * t - 1) {
                dividirFilho(noAtual, i + 1, noAtual.getFilhos()[i + 1]);
                if (noAtual.getChaves()[i + 1] < chave) {
                    i++;
                }
            }
            inserirNoCheio(noAtual.getFilhos()[i + 1], chave);
        }
    }

    // Função para dividir um nó filho
    private void dividirFilho(NoB noPai, int i, NoB noFilho) {
        NoB novoNo = new NoB(t, noFilho.isFolha());
        novoNo.setNumChaves(t - 1);

        for (int j = 0; j < t - 1; j++) {
            novoNo.getChaves()[j] = noFilho.getChaves()[j + t];
        }

        if (!noFilho.isFolha()) {
            for (int j = 0; j < t; j++) {
                novoNo.getFilhos()[j] = noFilho.getFilhos()[j + t];
            }
        }

        noFilho.setNumChaves(t - 1);

        for (int j = noPai.getNumChaves(); j >= i + 1; j--) {
            noPai.getFilhos()[j + 1] = noPai.getFilhos()[j];
        }

        noPai.getFilhos()[i + 1] = novoNo;

        for (int j = noPai.getNumChaves() - 1; j >= i; j--) {
            noPai.getChaves()[j + 1] = noPai.getChaves()[j];
        }

        noPai.getChaves()[i] = noFilho.getChaves()[t - 1];
        noPai.setNumChaves(noPai.getNumChaves() + 1);
    }

    // Função de remoção de uma chave
    public void remover(int chave) {
        if (raiz == null) {
            System.out.println("A árvore está vazia.");
            return;
        }

        removerDaArvore(raiz, chave);

        if (raiz.getNumChaves() == 0) {
            if (raiz.isFolha()) {
                raiz = null;
            } else {
                raiz = raiz.getFilhos()[0];
            }
        }
    }

    private void removerDaArvore(NoB noAtual, int chave) {
        int idx = encontrarChave(noAtual, chave);

        if (idx < noAtual.getNumChaves() && noAtual.getChaves()[idx] == chave) {
            if (noAtual.isFolha()) {
                removerDeFolha(noAtual, idx);
            } else {
                removerDeNoFolha(noAtual, idx);
            }
        } else {
            if (noAtual.isFolha()) {
                System.out.println("A chave " + chave + " não está na árvore.");
                return;
            }

            boolean flag = (idx == noAtual.getNumChaves());
            if (noAtual.getFilhos()[idx].getNumChaves() < t) {
                preencher(noAtual, idx);
            }
            if (flag && idx > noAtual.getNumChaves()) {
                removerDaArvore(noAtual.getFilhos()[idx - 1], chave);
            } else {
                removerDaArvore(noAtual.getFilhos()[idx], chave);
            }
        }
    }

    // Remover uma chave de um nó folha
    private void removerDeFolha(NoB noAtual, int idx) {
        for (int i = idx + 1; i < noAtual.getNumChaves(); ++i) {
            noAtual.getChaves()[i - 1] = noAtual.getChaves()[i];
        }
        noAtual.setNumChaves(noAtual.getNumChaves() - 1);
    }

    // Remover uma chave de um nó não folha
    private void removerDeNoFolha(NoB noAtual, int idx) {
        int chave = noAtual.getChaves()[idx];
        if (noAtual.getFilhos()[idx].getNumChaves() >= t) {
            int pred = getPredecessor(noAtual, idx);
            noAtual.getChaves()[idx] = pred;
            removerDaArvore(noAtual.getFilhos()[idx], pred);
        } else if (noAtual.getFilhos()[idx + 1].getNumChaves() >= t) {
            int succ = getSucessor(noAtual, idx);
            noAtual.getChaves()[idx] = succ;
            removerDaArvore(noAtual.getFilhos()[idx + 1], succ);
        } else {
            fundir(noAtual, idx);
            removerDaArvore(noAtual.getFilhos()[idx], chave);
        }
    }

    // Funções auxiliares
    private int encontrarChave(NoB noAtual, int chave) {
        int idx = 0;
        while (idx < noAtual.getNumChaves() && noAtual.getChaves()[idx] < chave) {
            idx++;
        }
        return idx;
    }

    private int getPredecessor(NoB noAtual, int idx) {
        NoB cur = noAtual.getFilhos()[idx];
        while (!cur.isFolha()) {
            cur = cur.getFilhos()[cur.getNumChaves()];
        }
        return cur.getChaves()[cur.getNumChaves() - 1];
    }

    private int getSucessor(NoB noAtual, int idx) {
        NoB cur = noAtual.getFilhos()[idx + 1];
        while (!cur.isFolha()) {
            cur = cur.getFilhos()[0];
        }
        return cur.getChaves()[0];
    }

    private void preencher(NoB noAtual, int idx) {
        if (idx != 0 && noAtual.getFilhos()[idx - 1].getNumChaves() >= t) {
            pegarDoAnterior(noAtual, idx);
        } else if (idx != noAtual.getNumChaves() && noAtual.getFilhos()[idx + 1].getNumChaves() >= t) {
            pegarDoProximo(noAtual, idx);
        } else {
            if (idx != noAtual.getNumChaves()) {
                fundir(noAtual, idx);
            } else {
                fundir(noAtual, idx - 1);
            }
        }
    }

    private void pegarDoAnterior(NoB noAtual, int idx) {
        NoB filho = noAtual.getFilhos()[idx];
        NoB irmao = noAtual.getFilhos()[idx - 1];

        for (int i = filho.getNumChaves() - 1; i >= 0; --i) {
            filho.getChaves()[i + 1] = filho.getChaves()[i];
        }

        if (!filho.isFolha()) {
            for (int i = filho.getNumChaves(); i >= 0; --i) {
                filho.getFilhos()[i + 1] = filho.getFilhos()[i];
            }
        }

        filho.getChaves()[0] = noAtual.getChaves()[idx - 1];
        if (!noAtual.isFolha()) {
            filho.getFilhos()[0] = irmao.getFilhos()[irmao.getNumChaves()];
        }

        noAtual.getChaves()[idx - 1] = irmao.getChaves()[irmao.getNumChaves() - 1];
        filho.setNumChaves(filho.getNumChaves() + 1);
        irmao.setNumChaves(irmao.getNumChaves() - 1);
    }

    private void pegarDoProximo(NoB noAtual, int idx) {
        NoB filho = noAtual.getFilhos()[idx];
        NoB irmao = noAtual.getFilhos()[idx + 1];

        filho.getChaves()[filho.getNumChaves()] = noAtual.getChaves()[idx];

        if (!filho.isFolha()) {
            filho.getFilhos()[filho.getNumChaves() + 1] = irmao.getFilhos()[0];
        }

        noAtual.getChaves()[idx] = irmao.getChaves()[0];

        for (int i = 1; i < irmao.getNumChaves(); ++i) {
            irmao.getChaves()[i - 1] = irmao.getChaves()[i];
        }

        if (!irmao.isFolha()) {
            for (int i = 1; i <= irmao.getNumChaves(); ++i) {
                irmao.getFilhos()[i - 1] = irmao.getFilhos()[i];
            }
        }

        filho.setNumChaves(filho.getNumChaves() + 1);
        irmao.setNumChaves(irmao.getNumChaves() - 1);
    }

    private void fundir(NoB noAtual, int idx) {
        NoB filho = noAtual.getFilhos()[idx];
        NoB irmao = noAtual.getFilhos()[idx + 1];

        filho.getChaves()[t - 1] = noAtual.getChaves()[idx];

        for (int i = 0; i < irmao.getNumChaves(); ++i) {
            filho.getChaves()[i + t] = irmao.getChaves()[i];
        }

        if (!filho.isFolha()) {
            for (int i = 0; i <= irmao.getNumChaves(); ++i) {
                filho.getFilhos()[i + t] = irmao.getFilhos()[i];
            }
        }

        for (int i = idx + 1; i < noAtual.getNumChaves(); ++i) {
            noAtual.getChaves()[i - 1] = noAtual.getChaves()[i];
        }

        for (int i = idx + 2; i <= noAtual.getNumChaves(); ++i) {
            noAtual.getFilhos()[i - 1] = noAtual.getFilhos()[i];
        }

        filho.setNumChaves(filho.getNumChaves() + irmao.getNumChaves() + 1);
        noAtual.setNumChaves(noAtual.getNumChaves() - 1);
    }

    public void imprimir() {
        if (raiz != null) {
            imprimirRecursivo(raiz);
        }
    }

    private void imprimirRecursivo(NoB noAtual) {
        int i;
        for (i = 0; i < noAtual.getNumChaves(); i++) {
            if (!noAtual.isFolha()) {
                imprimirRecursivo(noAtual.getFilhos()[i]);
            }
            System.out.print(noAtual.getChaves()[i] + " ");
        }
        if (!noAtual.isFolha()) {
            imprimirRecursivo(noAtual.getFilhos()[i]);
        }
    }
}