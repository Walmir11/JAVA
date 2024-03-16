package Lista3.Q6;

public class PretoBranco implements Impressao {

    @Override
    public String tipoImpressao(int tipo, int nivel) {
        if(tipo==1){
            nivel = nivel - 10;
            return "O nível da tinta preto e branco diminuiu para " + nivel + "%";
        }else
            return "O nível da tinta preto e branco não diminuiu";
    }


}
