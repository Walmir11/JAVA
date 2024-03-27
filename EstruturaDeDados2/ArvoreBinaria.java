package EstruturaDeDados2;

public class ArvoreBinaria<T extends Comparable> {
    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    public void adicionar(T dado){
        No<T> novoElemento = new No<T>(dado);
        if(raiz == null){
            this.raiz = novoElemento;
        }else {
            No<T> atual = this.raiz;
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

    public void emOrdem(No<T> atual){
        if(atual != null){
            emOrdem(atual.getEsquerdo());
            System.out.println(atual.getDado());
            emOrdem((atual.getDireito()));
        }
    }

    public void preOrdem(No<T> atual){
        if(atual != null){
            System.out.println(atual.getDado());
            preOrdem(atual.getEsquerdo());
            preOrdem((atual.getDireito()));
        }
    }

    public void posOrdem(No<T> atual){
        if(atual != null){
            posOrdem(atual.getEsquerdo());
            posOrdem((atual.getDireito()));
            System.out.println(atual.getDado());
        }
    }

    public void remover(T valor){
        No<T> atual = this.raiz;
        No<T> paiAtual = null;
        while (atual != null){
            if(atual.getDado().equals(valor)){
                break;
            }else if(valor.compareTo(atual.getDado()) == -1){
                paiAtual = atual;
                atual = atual.getEsquerdo();
            }else {
                paiAtual = atual;
                atual = atual.getDireito();
            }
        }

        if (atual != null){
            //Verificar se tem 2 filhos ou somente a direita
            if (atual.getDireito() != null){

                No<T> substituto = atual.getDireito();
                No<T> paiSubstituto = atual;
                while (substituto.getEsquerdo() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerdo();
                }
                substituto.setEsquerdo(atual.getEsquerdo());
                if (paiAtual != null){
                    if (atual.getDado().compareTo(paiAtual.getDado()) == -1){
                        paiAtual.setEsquerdo(substituto);
                    }else {
                        paiAtual.setDireito(substituto);
                    }
                }else {
                    this.raiz = substituto;
                    paiSubstituto.setEsquerdo(null);
                    this.raiz.setDireito(paiSubstituto);
                    this.raiz.setEsquerdo(atual.getEsquerdo());
                }
                //removeu o elemento da árvore
                if (substituto.getDado().compareTo(paiSubstituto.getDado()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerdo(null);
                }else{
                    paiSubstituto.setDireito(null);
                }
            }
        }else if (atual.getEsquerdo() != null){ //tem filho só à esquerda
            No<T> substituto = atual.getEsquerdo();
            No<T> paiSubstituto = atual;
            while(substituto.getDireito() != null){
                paiSubstituto = substituto;
                substituto = substituto.getDireito();
            }
            if (paiAtual != null){
                if (atual.getDado().compareTo(paiAtual.getDado()) == -1){ //atual < paiAtual
                    paiAtual.setEsquerdo(substituto);
                }else{
                    paiAtual.setDireito(substituto);
                }
            }else{ //se for a raiz
                this.raiz = substituto;
            }

            //removeu o elemento da árvore
            if (substituto.getDado().compareTo(paiSubstituto.getDado()) == -1){ //substituto < paiSubstituto
                paiSubstituto.setEsquerdo(null);
            }else{
                paiSubstituto.setDireito(null);
            }
        }else{ //não tem filho
            if (paiAtual != null){
                if (atual.getDado().compareTo(paiAtual.getDado()) == -1){ //atual < paiAtual
                    paiAtual.setEsquerdo(null);
                }else{
                    paiAtual.setDireito(null);
                }
            }else{ //é a raiz
                this.raiz = null;
            }
        }
    }
}
