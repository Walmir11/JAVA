package PadroesProjeto.Decorator;

public class ComSom extends NotificacaoDecorator{
    public ComSom(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public String acao() {
        return super.acao() + "\nEnviando notificação com som: {conteúdo da notificação}";
    }
}
