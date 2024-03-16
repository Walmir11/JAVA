package EstruturaDeDados1.Ordenação.Objeto;

public class BubbleSort {


    int aux;
    int vetor[] = new int[10];

    public void ordenacao(){
        for(int i = 0; i<vetor.length;i++){
            for (int j = i + 1; j<vetor.length-1;j++){
                if (vetor[j]>vetor[j+1]){
                    aux = vetor[j];
                    vetor[j]=vetor[j+1];
                    vetor[j+1]=aux;

                }
            }
        }
        for (int i=0; i< vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }

}
