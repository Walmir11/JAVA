package Lista3.Q2;

public class TradutorLinguagemP implements TradutorLinguagem{

    @Override
    public String traducao(String texto) {
        String[] palavras = texto.split(" ");
        String textoTraduzido = "P"+palavras[0];
        for(int i = 1; i<palavras.length; i++){
            palavras[i] = "P"+palavras[i];
            textoTraduzido += " "+palavras[i];
        }
        return textoTraduzido;
    }
}
