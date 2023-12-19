package PadroesProjeto.Adapter;

public class CSVAdapter extends FormatoCSV implements Formato{
    @Override
    public void carregarFormato(String nome) {
        carregarCSV(nome);
    }

    @Override
    public void desenharFormato(int posX, int posY, int largura, int altura) {
        desenharCSV(posX, posY);
    }
}
