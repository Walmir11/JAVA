package EstruturaDeDados1.Pilha.Objeto;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PilhaVet<T> {

    private int tamVetor;
    private T[] v;
    private int vlIncremento;
    private int topo;

    public PilhaVet() {
        tamVetor = 10;
        v = (T[]) new Object[tamVetor];
        topo = 0;
        vlIncremento = 10;

    }

    public PilhaVet(int vlIncremento, int tamVetor) {
        tamVetor = tamVetor;
        v = (T[]) new Object[tamVetor];
        topo = 0;
        vlIncremento = vlIncremento;

    }

    private Iterator<T> myIterator = new Iterator<T>() {

        private int posicao = 0;

        @Override
        public boolean hasNext() {
            if (posicao < topo) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public T next() throws NoSuchElementException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                T elemento = v[posicao];
                posicao++;
                return elemento;
            }
        }
    };

    public T top(){
        if(!this.estaVazia()){
            return v[topo-1];
        }
        return null;
    }

    public void limpar(){
        v = (T[]) new Object[tamVetor];
        tamVetor = 0;
    }

    public int tamanho(){
        return this.topo;
    }

    public void redimensionar(){
        if(topo==tamVetor){
            T[] vetor1 = (T[])new Object[tamVetor + vlIncremento];
            for (int i = 0; i<tamVetor;i++){
                vetor1[i]=v[i];
            }
            v=vetor1;
        }
    }

    public boolean estaVazia(){
        if (topo == 0){
            return true;
        }
        return false;
    }

    public boolean contem(T elemento){
        for (int i = 0; i< topo; i++){
            if (v[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }

    public int distancia(T elemento){
        int cont = 0;
        for (int i = 0; i< topo; i++){
            if (v[i].equals(elemento)){
                return cont;
            }
            cont++;
        }
        return 0;
    }

    public void empilhar(T elemento) {
        this.redimensionar();
        v[topo] = elemento;
        topo++;
    }

    public void demepilhar(){
        if(!estaVazia()){
            T elemento = this.top();
            v[topo-1] = null;
            topo--;
        }
    }

    public void imprimir(){

        System.out.println("Lista selecionada:");
        System.out.println(Arrays.toString(v));

    }

    public Iterator<T> iterator() {
        return myIterator;
    }

}
