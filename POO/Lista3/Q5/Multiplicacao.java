package Lista3.Q5;

public class Multiplicacao implements Calculo{
    @Override
    public double conta(double numero,double numero2) {
        double total = numero * numero2;
        return total;
    }
}
