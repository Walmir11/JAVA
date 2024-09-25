package EstruturaDeDados2.Arvore_B_Mais;

import java.util.ArrayList;
import java.util.Collections;

public class ArvoreBMais {
    private int ordem;              // Ordem da árvore B+
    private NoBMais raiz;           // Raiz da árvore

    public ArvoreBMais(int ordem) {
        this.ordem = ordem;
        this.raiz = new NoBMais(true);  // Inicialmente, a raiz é um nó folha
    }

    // Método privado para dividir um nó
    private void dividirNo(NoBMais no, NoBMais pai, int pos) {
        int meio = ordem / 2;
        int chaveDoMeio = no.getChaves().get(meio);

        // Criando novo nó
        NoBMais novoNo = new NoBMais(no.isFolha());
        novoNo.setChaves(new ArrayList<>(no.getChaves().subList(meio, no.getChaves().size())));
        no.setChaves(new ArrayList<>(no.getChaves().subList(0, meio)));

        if (!no.isFolha()) {
            novoNo.setFilhos(new ArrayList<>(no.getFilhos().subList(meio + 1, no.getFilhos().size())));
            no.setFilhos(new ArrayList<>(no.getFilhos().subList(0, meio + 1)));
        }

        pai.getFilhos().add(pos + 1, novoNo);
        pai.getChaves().add(pos, chaveDoMeio);
    }

    // Método privado para inserir em um nó não cheio
    private void inserirNaoCheio(NoBMais no, int chave) {
        if (no.isFolha()) {
            no.getChaves().add(chave);
            Collections.sort(no.getChaves());
        } else {
            int pos = no.getChaves().size() - 1;
            while (pos >= 0 && chave < no.getChaves().get(pos)) {
                pos--;
            }
            pos++;

            NoBMais filho = no.getFilhos().get(pos);
            if (filho.getChaves().size() == ordem) {
                dividirNo(filho, no, pos);
                if (chave > no.getChaves().get(pos)) {
                    pos++;
                }
            }
            inserirNaoCheio(no.getFilhos().get(pos), chave);
        }
    }

    // Método público para inserir uma chave
    public void inserir(int chave) {
        NoBMais r = raiz;
        if (r.getChaves().size() == ordem) {
            NoBMais novoNo = new NoBMais(false);
            novoNo.getFilhos().add(raiz);
            dividirNo(raiz, novoNo, 0);
            inserirNaoCheio(novoNo, chave);
            raiz = novoNo;
        } else {
            inserirNaoCheio(r, chave);
        }
    }

    // Método para remover uma chave (simplificado)
    public void remover(int chave) {
        removerNo(raiz, chave);
    }

    private void removerNo(NoBMais no, int chave) {
        if (no.getChaves().contains(chave)) {
            no.getChaves().remove((Integer) chave);
        } else if (!no.isFolha()) {
            int pos = 0;
            while (pos < no.getChaves().size() && chave > no.getChaves().get(pos)) {
                pos++;
            }
            removerNo(no.getFilhos().get(pos), chave);
        }
    }

    // Método para exibir a árvore
    public void exibir() {
        exibir(raiz, 0);
    }

    private void exibir(NoBMais no, int nivel) {
        System.out.println("Nível " + nivel + ": " + no.getChaves());
        if (!no.isFolha()) {
            for (NoBMais filho : no.getFilhos()) {
                exibir(filho, nivel + 1);
            }
        }
    }
}
