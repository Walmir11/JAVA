package EstruturaDeDados2;

public class ArvoreB<T extends Comparable> {
    private No<T> raiz;

    public ArvoreB() {
        this.raiz = null;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
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

    public void remover(T valor){
        No<T> atual = this.raiz;
        No<T> paiAtual = null;
        while (atual != null && atual.getDado() != valor){
            paiAtual = atual;
            if(valor.compareTo(atual.getDado()) < 0) {
                atual = atual.getEsquerdo() ;
            }else {
                atual = atual.getDireito();
            }
        }

        if (atual == null) {
            return;
        }

        if (atual.getEsquerdo() == null && atual.getDireito() == null) {
            if (atual == this.raiz) {
                raiz = null;
            } else if (paiAtual.getEsquerdo() == atual) {
                paiAtual.setEsquerdo(null);
            } else {
                paiAtual.setDireito(null);
            }
        } else if (atual.getEsquerdo() == null) {
            if (atual == this.raiz){
                raiz = atual.getDireito();
            } else if (paiAtual.getEsquerdo() == atual) {
                paiAtual.setEsquerdo(atual.getDireito());
            } else {
                paiAtual.setDireito(atual.getDireito());
            }
        } else if (atual.getDireito() == null) {
            if (atual == this.raiz){
                raiz = atual.getEsquerdo();
            } else if (paiAtual.getEsquerdo() == atual) {
                paiAtual.setEsquerdo(atual.getEsquerdo());
            } else {
                paiAtual.setDireito(atual.getEsquerdo());
            }
        } else {
            No<T> sucessor = atual.getDireito();
            No<T> paiSucessor = atual;
            while (sucessor.getEsquerdo() != null) {
                paiSucessor = sucessor;
                sucessor = sucessor.getEsquerdo();
            }
            if (paiSucessor != atual) {
                paiSucessor.setEsquerdo(sucessor.getDireito());
                sucessor.setDireito(atual.getDireito());
            }
            sucessor.setEsquerdo(atual.getEsquerdo());

            if (atual == this.raiz) {
                raiz = sucessor;
            } else if (paiAtual.getEsquerdo() == atual) {
                paiAtual.setDireito(sucessor);
            } else {
                paiAtual.setDireito(sucessor);
            }
        }
    }

    public No<T> buscar(T valor){
        No<T> atual = this.raiz;
        while (atual != null){
            if (valor.compareTo(atual.getDado()) == 0){
                return atual;
            } else if (valor.compareTo(atual.getDado()) < 0){
                atual = atual.getEsquerdo();
            } else {
                atual = atual.getDireito();
            }
        }
        return null;
    }

    public void emOrdem(No<T> atual){
        if (atual != null){
            emOrdem(atual.getEsquerdo());
            System.out.println(atual.getDado());
            emOrdem(atual.getDireito());
        }
    }

    public void preOrdem(No<T> atual){
        if (atual != null){
            System.out.println(atual.getDado());
            preOrdem(atual.getEsquerdo());
            preOrdem(atual.getDireito());
        }
    }

    public void posOrdem(No<T> atual){
        if (atual != null) {
            posOrdem(atual.getEsquerdo());
            posOrdem(atual.getDireito());
            System.out.println(atual.getDado());
        }
    }
}
