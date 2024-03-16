package RevisaoPoo.Calculadora_Exceptions;

public class Calculadora {

    public void divisao1(int num1,int num2) {
        try {
            int divisao = num1 / num2;
            System.out.println("a divisão é: "+divisao);
        }catch (ArithmeticException e){
            System.out.println("Occorreu uma exceção: "+e.getMessage());
        }
    }

    public void divisao2(int num1, int num2)throws ArithmeticException {
        if(num2==0){
            throw new ArithmeticException("Não existe divisão por 0!!!");
        }else{
            int divisao = num1 / num2;
            System.out.println("a divisão é: "+divisao);
        }
    }

    public void divisao3(int num1,int num2)throws DivizorZeroException {
        if(num2==0){
            throw new DivizorZeroException();
        }else{
            int divisao = num1 / num2;
            System.out.println("a divisão é: "+divisao);
        }
    }
}
