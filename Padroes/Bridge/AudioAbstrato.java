package PadroesProjeto.Bridge;

public abstract class AudioAbstrato {

    protected AudioImplementado audio;

    public AudioAbstrato(AudioImplementado audio) {
        this.audio = audio;
    }

    public void reproduzirAudio(String titulo){
        audio.reproduzirAudio(titulo);
    }

    public void desenharBotao(String titulo){
        audio.desenharBotao(titulo);
    }

    public abstract void desenhar();

    public abstract void acao(String acao);
}
