package RevisaoPoo.Calculadora_Exceptions;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c=new Calculadora();
        DivizorZeroException divizorZeroException =new DivizorZeroException();

        try {
            c.divisao2(8,0);
        }catch (ArithmeticException e){
            System.out.println("Occorreu uma exceção: "+e.getMessage());
        }

        try {
            c.divisao2(8,0);
        }catch (ArithmeticException e){
            divizorZeroException.getMessage();
        }





    }
}
