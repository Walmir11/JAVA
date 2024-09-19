package EstruturaDeDados2.ArvoreB;

public class NoB {
    private int[] chaves;
    private NoB[] filhos;
    private int t; // Ordem mínima da árvore B
    private boolean folha;
    private int numChaves;

    public NoB(int t, boolean folha) {
        this.t = t;
        this.folha = folha;
        this.chaves = new int[2 * t - 1]; // Máximo de chaves em um nó
        this.filhos = new NoB[2 * t]; // Máximo de filhos em um nó
        this.numChaves = 0;
    }

    // Getters e Setters
    public int[] getChaves() {
        return chaves;
    }

    public void setChaves(int[] chaves) {
        this.chaves = chaves;
    }

    public NoB[] getFilhos() {
        return filhos;
    }

    public void setFilhos(NoB[] filhos) {
        this.filhos = filhos;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public boolean isFolha() {
        return folha;
    }

    public void setFolha(boolean folha) {
        this.folha = folha;
    }

    public int getNumChaves() {
        return numChaves;
    }

    public void setNumChaves(int numChaves) {
        this.numChaves = numChaves;
    }
}