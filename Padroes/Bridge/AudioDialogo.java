package PadroesProjeto.Bridge;

public class AudioDialogo extends AudioAbstrato{

    public AudioDialogo(AudioImplementado audio) {
        super(audio);
    }

    @Override
    public void desenhar() {
        reproduzirAudio("Reproduzindo arquivo de aúdio");
        desenharBotao("Play");
        desenharBotao("Pause");
        desenharBotao("Stop");
        desenharBotao("Avançar");
        desenharBotao("Retroceder");
    }

    @Override
    public void acao(String acao) {
        if (acao.equalsIgnoreCase("Play")){
            System.out.println("O áudio está sendo reproduzido");
        } else if (acao.equalsIgnoreCase("Pause")) {
            System.out.println("O áudio foi pausado");
        } else if (acao.equalsIgnoreCase("Stop")){
            System.out.println("O áudio vai reiniciar");
        } else if (acao.equalsIgnoreCase("Avançar")) {
            System.out.println("Avançando áudio");
        } else if (acao.equalsIgnoreCase("Retroceder")) {
            System.out.println("Retrocedendo áudio");
        }
    }
}
