package Lista3.Q2;

public class TradutorLinguagemX implements TradutorLinguagem{

    @Override
    public String traducao(String texto) {
        String[] palavras = texto.split(" ");
        String textoTraduzido = "X"+palavras[0];
        for(int i = 1; i<palavras.length; i++){
            palavras[i] = "X"+palavras[i];
            textoTraduzido += " "+palavras[i];
        }
        return textoTraduzido;
    }
}
