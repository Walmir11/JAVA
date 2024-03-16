public class ListaEncOrd<T extends Comparable> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho = 0;

    public void incluirOrdem(T dado) {
        No<T> novoNo = new No<>(dado);

        if (getInicio() == null) { // Caso a lista esteja vazia
            setInicio(novoNo);
            setFim(novoNo);
        } else if (dado.compareTo(getInicio().getElemento()) < 0) { // Inserir no início
            novoNo.setProximo(getInicio());
            setInicio(novoNo);
        } else if (dado.compareTo(getFim().getElemento()) >= 0) { // Inserir no final
            getFim().setProximo(novoNo);
            setFim(novoNo);
        } else { // Inserir no meio
            No<T> atual = getInicio();
            while (atual.getProximo() != null && dado.compareTo(atual.getProximo().getElemento()) >= 0) {
                atual = atual.getProximo();
            }
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
        }
        tamanho++;
    }


    public T remover(){
        if(getInicio() == null){
            System.out.println("Lista vazia");
            return null;
        }
        T aux = getFim().getElemento();
        setFim(getFim().getAnterior());
        if(getFim()!= null){
            getFim().setProximo(null);
        }
        tamanho--;
        return aux;
    }

    public No<T> getInicio() {
        return inicio;
    }

    public String toString() {

        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getFim() {
        return fim;
    }

    public void setFim(No<T> fim) {
        this.fim = fim;
    }
}
