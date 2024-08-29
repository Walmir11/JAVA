package EstruturaDeDados2;

public class No<T> {
    private T dado;
    private No<T> esquerdo;
    private No<T> direito;
    private int altura;

    public No(T dado) {
        this.dado = dado;
        this.esquerdo = null;
        this.direito = null;
        this.altura = 1; // Inicializa a altura como 1
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No<T> esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No<T> getDireito() {
        return direito;
    }

    public void setDireito(No<T> direito) {
        this.direito = direito;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}