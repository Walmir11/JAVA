package EstruturaDeDados2;

public class ArvoreBinaria<T extends Comparable> {
    private Elemento<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public Elemento<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento<T> raiz) {
        this.raiz = raiz;
    }

    public void adicionar(T dado){
        Elemento<T> novoElemento = new Elemento<T>(dado);
        if(raiz == null){
            this.raiz = novoElemento;
        }else {
            Elemento<T> atual = this.raiz;
            while (true){
                if(novoElemento.getDado().compareTo(atual.getDado())==-1){
                    if(atual.getEsquerdo() != null){
                        atual = atual.getEsquerdo();
                    }else {
                        atual.setEsquerdo(novoElemento);
                        break;
                    }
                }else {
                    if (atual.getDireito() != null){
                        atual = atual.getDireito();
                    }else {
                        atual.setDireito(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public void emOrdem(Elemento<T> atual){
        if(atual != null){
            emOrdem(atual.getEsquerdo());
            System.out.println(atual.getDado());
            emOrdem((atual.getDireito()));
        }
    }

    public void preOrdem(Elemento<T> atual){
        if(atual != null){
            System.out.println(atual.getDado());
            preOrdem(atual.getEsquerdo());
            preOrdem((atual.getDireito()));
        }
    }

    public void posOrdem(Elemento<T> atual){
        if(atual != null){
            posOrdem(atual.getEsquerdo());
            posOrdem((atual.getDireito()));
            System.out.println(atual.getDado());
        }
    }
}
