package PadroesProjeto.Decorator;

public class ComImagem extends NotificacaoDecorator{
    public ComImagem(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public String acao() {
        return super.acao() + "\nEnviando notificação com imagem: {conteúdo da notificação}";
    }
}
