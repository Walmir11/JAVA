package Lista3.Q3;

public class MainQ3 {
    public static void main(String[] args) {
        ControlUnv tv = new Tv("+",25);
        ControlUnv caixa = new CaixaDeSom("-",10);
        ControlUnv notbook = new Notebook("x",23);

        System.out.println(tv.volume());
        System.out.println(caixa.volume());
        System.out.println(notbook.volume());
    }
}
