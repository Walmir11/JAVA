package EstruturaDeDados1.Fila.Objeto;

public class FilaDupla<T> {

    public No<T> inicio;
    public No<T> ultimo;
    public int tamanho;


    public void add(T dado){
        No<T> node = new No<T>(dado);
        if(getInicio() == null){
            setInicio(node);
            node.setAnterior(null);
        }else{
            getUltimo().setProximo(node);
            node.setAnterior(getUltimo());
        }
        setUltimo(node);
        node.setProximo(null);
        tamanho++;
    }

    public T removeInicio(){
        if(getInicio()==null){
            return null;
        }
        T aux = getInicio().getDado();
        setInicio(getInicio().getProximo());
        if(getInicio()!= null){
            getInicio().setAnterior(null);
        }else {
            setUltimo(null);
        }
        tamanho--;
        return aux;
    }


    public void tamanho(){
        System.out.println("O tamanho é: " + getTamanho());
    }

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(No<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
