package RevisaoPoo.Calculadora_Exceptions;

public class DivizorZeroException extends Exception {
    @Override
    public String getMessage(){
        return "Você não pode dividir por zero!";
    }
}
