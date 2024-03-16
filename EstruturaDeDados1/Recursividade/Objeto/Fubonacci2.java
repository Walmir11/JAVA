public class Fubonacci2 {
    int n1=0;
    int n2=1;
    int n3;
    int somatotal=0;
    public void formulaFibonacci(int x) {
        if (x > 0) {
            System.out.print(" "+n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            somatotal+=n1;
            formulaFibonacci(x-1);
        }else {
            System.out.print(" "+somatotal);
        }
    }
}
