package EstruturaDeDados1.Recursividade.Objeto;

public class Fatorial2 {
    double multiplica=1;
    public void x(int n){
        multiplica = multiplica*n;
        if (n==1){
            System.out.println(multiplica);
        }else{
            x(n-1);
        }
    }
}
