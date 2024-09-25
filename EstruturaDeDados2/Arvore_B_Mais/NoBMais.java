package EstruturaDeDados2.Arvore_B_Mais;

import java.util.ArrayList;
import java.util.List;

public class NoBMais {
    private boolean folha;          // Indica se o nó é uma folha
    private List<Integer> chaves;   // Lista de chaves no nó
    private List<NoBMais> filhos;   // Filhos do nó (apenas para nós internos)

    public NoBMais(boolean folha) {
        this.folha = folha;
        this.chaves = new ArrayList<>();
        this.filhos = new ArrayList<>();
    }

    // Getters e Setters
    public boolean isFolha() {
        return folha;
    }

    public void setFolha(boolean folha) {
        this.folha = folha;
    }

    public List<Integer> getChaves() {
        return chaves;
    }

    public void setChaves(List<Integer> chaves) {
        this.chaves = chaves;
    }

    public List<NoBMais> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<NoBMais> filhos) {
        this.filhos = filhos;
    }
}
