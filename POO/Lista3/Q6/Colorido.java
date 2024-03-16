package Lista3.Q6;

public class Colorido implements Impressao {


    @Override
    public String tipoImpressao(int tipo, int nivel) {
        if (tipo==1){
            nivel = nivel - 20;
            return "O nível da tinta colorida diminuiu para "+ nivel + "%";
        }else if (tipo==2){
            nivel = nivel - 10;
            return "O nível da tinta colorida diminuiu para " + nivel + "%";
        }else
            return "O nível da tinta colorida não foi alterado";
    }

}
