package EstruturaDeDados1.Ordenação.Objeto;

public class InsertionSort {

    public void operacao(int vetor[]){
        int aux, j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
    }
}
