package EstruturaDeDados1.Recursividade.Objeto;

public class Fatorial {
    public int R;

    public int fatotial(int n){

        if(n>1){
            R=n*fatotial(n-1);
        }else {
            R=1;
        }
        return R;
    }
}
