package PadroesProjeto.Bridge;

public class Test {
    public static void main(String[] args) {
        AudioAbstrato audio = new AudioDialogo(new MP3());
        audio.desenhar();
        audio.acao("paUse");
    }
}
