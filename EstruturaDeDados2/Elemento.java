package EstruturaDeDados2;

public class Elemento<T> {
    private T dado;
    private Elemento<T> esquerdo;
    private Elemento<T> direito;

    public Elemento(T dado) {
        this.dado = dado;
        this.esquerdo = null;
        this.direito = null;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Elemento<T> getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Elemento<T> esquerdo) {
        this.esquerdo = esquerdo;
    }

    public Elemento<T> getDireito() {
        return direito;
    }

    public void setDireito(Elemento<T> direito) {
        this.direito = direito;
    }
}
