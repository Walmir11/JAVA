public class Fubonacci {

    public int n1=0;
    public int n2=1;
    public int n3;
    public int fubonaci(int n){
        for (int i = 0; i<n;i++){
            System.out.println(n1);//0,1,1,2
            n3=n1;
            n1=n1+n2;
            n2=n3;
        }
        return n1;
    }


}
