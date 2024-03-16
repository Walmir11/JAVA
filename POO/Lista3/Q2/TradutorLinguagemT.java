package Lista3.Q2;

public class TradutorLinguagemT implements TradutorLinguagem{

    @Override
    public String traducao(String texto) {
        String[] palavras = texto.split(" ");
        String textoTraduzido = "T"+palavras[0];
        for(int i = 1; i<palavras.length; i++){
            palavras[i] = "T"+palavras[i];
            textoTraduzido += " "+palavras[i];
        }
        return textoTraduzido;
    }
}
