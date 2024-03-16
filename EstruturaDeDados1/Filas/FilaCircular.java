package EstruturaDeDados1.Fila.Objeto;

public class FilaCircular<T> {
    private No<T> noCabeca;
    private int tamanho;

    public void enfileirar(T dado){
        No<T> nonoNo = new No<T>(dado);
        if(getNoCabeca()==null){
            noCabeca.setProximo(nonoNo);
            noCabeca.setAnterior(nonoNo);
            setNoCabeca(nonoNo);
        }else {
            No<T> ultimoNo = noCabeca.getAnterior();
            ultimoNo.setProximo(nonoNo);
            nonoNo.setAnterior(ultimoNo);
            nonoNo.setProximo(noCabeca);
            noCabeca.setAnterior(nonoNo);
        }
        tamanho++;
    }

    public T desenfileirar(){
        if(getNoCabeca()==null){
            System.out.println("A lista está vazia");
            return null;
        }
        No<T> auxCabeca = getNoCabeca();
        if(getTamanho()==1){
            noCabeca = null;
        }else {
            No<T> auxNovoCabeca = auxCabeca.getProximo();
            noCabeca.setProximo(auxNovoCabeca.getProximo());
            auxNovoCabeca.getProximo().setAnterior(noCabeca);
            setNoCabeca(auxNovoCabeca);
        }
        tamanho--;
        return auxCabeca.getDado();

    }

    public No<T> getNoCabeca() {
        return noCabeca;
    }

    public void setNoCabeca(No<T> noCabeca) {
        this.noCabeca = noCabeca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
