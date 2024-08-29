package EstruturaDeDados2;

public class ArvoreAVL<T extends Comparable<T>> {
    private No<T> raiz;

    public ArvoreAVL() {
        this.raiz = null;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    private int altura(No<T> no) {
        return no == null ? 0 : no.getAltura();
    }

    private int fatorBalanceamento(No<T> no) {
        return no == null ? 0 : altura(no.getEsquerdo()) - altura(no.getDireito());
    }

    private No<T> rotacaoDireita(No<T> y) {
        No<T> x = y.getEsquerdo();
        No<T> T2 = x.getDireito();

        x.setDireito(y);
        y.setEsquerdo(T2);

        y.setAltura(Math.max(altura(y.getEsquerdo()), altura(y.getDireito())) + 1);
        x.setAltura(Math.max(altura(x.getEsquerdo()), altura(x.getDireito())) + 1);

        return x;
    }

    private No<T> rotacaoEsquerda(No<T> x) {
        No<T> y = x.getDireito();
        No<T> T2 = y.getEsquerdo();

        y.setEsquerdo(x);
        x.setDireito(T2);

        x.setAltura(Math.max(altura(x.getEsquerdo()), altura(x.getDireito())) + 1);
        y.setAltura(Math.max(altura(y.getEsquerdo()), altura(y.getDireito())) + 1);

        return y;
    }

    public void adicionar(T valor) {
        this.raiz = adicionarRec(this.raiz, valor);
    }

    private No<T> adicionarRec(No<T> no, T valor) {
        if (no == null) {
            return new No<>(valor);
        }

        if (valor.compareTo(no.getDado()) < 0) {
            no.setEsquerdo(adicionarRec(no.getEsquerdo(), valor));
        } else if (valor.compareTo(no.getDado()) > 0) {
            no.setDireito(adicionarRec(no.getDireito(), valor));
        } else {
            return no;
        }

        no.setAltura(1 + Math.max(altura(no.getEsquerdo()), altura(no.getDireito())));

        int balance = fatorBalanceamento(no);

        if (balance > 1 && valor.compareTo(no.getEsquerdo().getDado()) < 0) {
            return rotacaoDireita(no);
        }

        if (balance < -1 && valor.compareTo(no.getDireito().getDado()) > 0) {
            return rotacaoEsquerda(no);
        }

        if (balance > 1 && valor.compareTo(no.getEsquerdo().getDado()) > 0) {
            no.setEsquerdo(rotacaoEsquerda(no.getEsquerdo()));
            return rotacaoDireita(no);
        }

        if (balance < -1 && valor.compareTo(no.getDireito().getDado()) < 0) {
            no.setDireito(rotacaoDireita(no.getDireito()));
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void remover(T valor) {
        this.raiz = removerRec(this.raiz, valor);
    }

    private No<T> removerRec(No<T> no, T valor) {
        if (no == null) {
            return no;
        }

        if (valor.compareTo(no.getDado()) < 0) {
            no.setEsquerdo(removerRec(no.getEsquerdo(), valor));
        } else if (valor.compareTo(no.getDado()) > 0) {
            no.setDireito(removerRec(no.getDireito(), valor));
        } else {
            if (no.getEsquerdo() == null || no.getDireito() == null) {
                No<T> temp = no.getEsquerdo() != null ? no.getEsquerdo() : no.getDireito();
                if (temp == null) {
                    temp = no;
                    no = null;
                } else {
                    no = temp;
                }
            } else {
                No<T> temp = getMinValueNode(no.getDireito());
                no.setDado(temp.getDado());
                no.setDireito(removerRec(no.getDireito(), temp.getDado()));
            }
        }

        if (no == null) {
            return no;
        }

        no.setAltura(Math.max(altura(no.getEsquerdo()), altura(no.getDireito())) + 1);

        int balance = fatorBalanceamento(no);

        if (balance > 1 && fatorBalanceamento(no.getEsquerdo()) >= 0) {
            return rotacaoDireita(no);
        }

        if (balance > 1 && fatorBalanceamento(no.getEsquerdo()) < 0) {
            no.setEsquerdo(rotacaoEsquerda(no.getEsquerdo()));
            return rotacaoDireita(no);
        }

        if (balance < -1 && fatorBalanceamento(no.getDireito()) <= 0) {
            return rotacaoEsquerda(no);
        }

        if (balance < -1 && fatorBalanceamento(no.getDireito()) > 0) {
            no.setDireito(rotacaoDireita(no.getDireito()));
            return rotacaoEsquerda(no);
        }

        return no;
    }

    private No<T> getMinValueNode(No<T> no) {
        No<T> current = no;
        while (current.getEsquerdo() != null) {
            current = current.getEsquerdo();
        }
        return current;
    }

    public No<T> buscar(T valor) {
        No<T> atual = this.raiz;
        while (atual != null) {
            if (valor.compareTo(atual.getDado()) == 0) {
                return atual;
            } else if (valor.compareTo(atual.getDado()) < 0) {
                atual = atual.getEsquerdo();
            } else {
                atual = atual.getDireito();
            }
        }
        return null;
    }

    public void emOrdem(No<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerdo());
            System.out.println(atual.getDado());
            emOrdem(atual.getDireito());
        }
    }

    public void preOrdem(No<T> atual) {
        if (atual != null) {
            System.out.println(atual.getDado());
            preOrdem(atual.getEsquerdo());
            preOrdem(atual.getDireito());
        }
    }

    public void posOrdem(No<T> atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerdo());
            posOrdem(atual.getDireito());
            System.out.println(atual.getDado());
        }
    }
}