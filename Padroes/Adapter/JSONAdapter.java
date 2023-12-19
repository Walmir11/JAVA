package PadroesProjeto.Adapter;

public class JSONAdapter extends FormatoJSON implements Formato{
    @Override
    public void carregarFormato(String nome) {
        carregarJSON(nome);
    }

    @Override
    public void desenharFormato(int posX, int posY, int largura, int altura) {
        desenharJSON(posX, posY, largura, altura);
    }
}
