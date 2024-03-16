package EstruturaDeDados1.Ordenação.Test;



import EstruturaDeDados1.Ordenação.Objeto.MergeSort;
import EstruturaDeDados1.Ordenação.Objeto.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int vetor1[] = {6,8,9,3,12,15,8,6,3,7,5};
        int v[] = new int[vetor1.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.operacao(vetor1,v,0,vetor1.length-1);
        //System.out.println("A ordem é: " + Arrays.toString(vetor1));

        QuickSort quickSort = new QuickSort();
        quickSort.operacao(vetor1,0, vetor1.length-1);
        System.out.println("A ordem é: " + Arrays.toString(vetor1));



    }



}
