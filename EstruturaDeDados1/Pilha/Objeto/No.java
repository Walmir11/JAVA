package EstruturaDeDados1.Pilha.Objeto;

public class No<T> {
    private T dado;
    private No<T> prox;
    private No<T> ant;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }

    public No(T dado, No<T> prox) {
        this.dado = dado;
        this.prox = prox;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    public No<T> getAnt() {
        return ant;
    }

    public void setAnt(No<T> ant) {
        this.ant = ant;
    }
}
