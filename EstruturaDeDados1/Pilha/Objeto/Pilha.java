package EstruturaDeDados1.Pilha.Objeto;

public class Pilha<T> {

    private No<T> inicio;
    private No<T> topo;
    private int tamanho;

    public void empilhar(T dado){
        No<T> no = new No<T>(dado);
        no.setProx(null);
        if(getTamanho()==0){
            setInicio(no);
        }else {
            getTopo().setProx(no);
        }
        setTopo(no);
        tamanho++;
    }

    public T desempilhar(){
        if(getTopo()==null){
            System.out.println("lista vazia");
            return null;
        }
        T aux = getTopo().getDado();
        if(getTamanho() == 0){
            setInicio(null);
            setTopo(null);
        }else {
            No<T> atual = getInicio();
            while (atual.getProx()!=getTopo()){
                atual = atual.getProx();
            }
            atual.setProx(null);
            setTopo(atual);
            tamanho--;
        }
        System.out.println("Removeu o "+aux);
        return aux;
    }

    public String toString(){
        if(getTamanho() == 0){
            return "Lista vazia";
        }else {
            System.out.println("O tamanho da lista é: " + getTamanho());
        }

        StringBuilder builder = new StringBuilder("A pilha é: ");
        No<T> atual = getInicio();
        for (int i = 0; i<getTamanho()-1; i++){
            builder.append(atual.getDado()).append(",");
            atual = atual.getProx();
        }
        builder.append(atual.getDado()).append(".");
        return builder.toString();
    }

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getTopo() {
        return topo;
    }

    public void setTopo(No<T> fim) {
        this.topo = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
