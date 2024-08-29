package EstruturaDeDados2;

public class ArvoreB<T extends Comparable> {
    private No<T> raiz;
    int ordem;

    public ArvoreB(int ordem) {
        this.raiz = null;
        this.ordem = ordem;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public void adicionar(T valor){
        No<T> novoElemento = new No<T>(valor);
        if(raiz == null){
            this.raiz = novoElemento;
        }else {
            No<T> atual = this.raiz;
            while (true) {
                if (novoElemento.getDado().compareTo(atual.getDado()) < 0) {
                    if (atual.getEsquerdo() != null) {
                        atual = atual.getEsquerdo();
                    } else {
                        atual.setEsquerdo(novoElemento);
                        break;
                    }
                } else {
                    if (atual.getDireito() != null) {
                        atual = atual.getDireito();
                    } else {
                        atual.setDireito(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public void remover(){

    }

    public void buscar(){

    }

    public void emOrdem(){

    }

    public void preOrdem(){

    }

    public void posOrdem(){

    }


}
