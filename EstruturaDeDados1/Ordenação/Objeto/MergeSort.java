package EstruturaDeDados1.Ordenação.Objeto;

public class MergeSort {

    public void operacao(int v[],int w[],int ini, int fim){
        if (ini<fim){
            int meio = (ini+fim)/2;
            operacao(v,w,ini,meio);
            operacao(v,w,meio+1,fim);
            intercalar(v,w,ini,meio,fim);
        }
    }

    private void intercalar(int v[], int w[], int ini,int meio, int fim){
        for (int k = ini; k<= fim; k++){
            w[k] = v[k];
        }

        int i = ini;
        int j = meio + 1;

        for(int k = ini; k <= fim; k++) {
            if (i > meio) {
                v[k] = w[j++];
            } else if (j > fim) {
                v[k] = w[i++];
            } else if (w[i] < w[j]) {
                v[k] = w[i++];
            } else {
                v[k] = w[j++];
            }
        }
    }


}

