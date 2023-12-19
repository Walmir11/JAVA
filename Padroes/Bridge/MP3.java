package PadroesProjeto.Bridge;

public class MP3 implements AudioImplementado{
    @Override
    public void reproduzirAudio(String titulo) {
        System.out.println(titulo + " - MP3");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão MP3");
    }
}
