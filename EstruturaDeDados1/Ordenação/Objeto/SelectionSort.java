package EstruturaDeDados1.Ordenação.Objeto;

public class SelectionSort {

    int aux;
    int pos_menor;
    int vetor[]= new int[10];

    public void ordenacao(){
        for(int i = 0; i<vetor.length;i++){
            pos_menor = i;
            for (int j = i+1; j<vetor.length-1;j++){
                if (vetor[j]>vetor[j+1]){
                    pos_menor= j;
                }
            }
            aux = vetor[pos_menor];
            vetor[pos_menor] = vetor[i];
            vetor[i] = aux;
        }
        for (int i=0; i< vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
}
