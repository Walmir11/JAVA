package EstruturaDeDados1.Ordenação.Objeto;

public class QuickSort {

    public void operacao(int v[], int esq, int dir){
        if (esq< dir){
            int p = separar(v,esq, dir);
            operacao(v,esq, p - 1);
            operacao(v, p+1, dir);
        }
    }

    private int separar(int v[], int esq, int dir){
        int meio = (int) (esq + dir) / 2;
        int pivot = v[meio];
        int i = esq - 1;
        int j = dir + 1;
        while (true){
            do{
                i++;
            }while(v[i] < pivot);
            do{
                j--;
            }while(v[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = v[i];
            v[i] = v[j];
            v[j] = aux;
        }
    }


}
