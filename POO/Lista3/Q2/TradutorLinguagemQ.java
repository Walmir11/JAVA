package Lista3.Q2;

public class TradutorLinguagemQ implements TradutorLinguagem {
    @Override
    public String traducao(String texto) {
        String[] palavras = texto.split(" ");
        String textoTraduzido = "Q"+palavras[0];
        for(int i = 1; i<palavras.length; i++){
            palavras[i] = "Q"+palavras[i];
            textoTraduzido += " "+palavras[i];
        }
        return textoTraduzido;
    }
}
