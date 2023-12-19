package PadroesProjeto.Decorator;

public abstract class NotificacaoDecorator implements Notificacao{
    private Notificacao notificacaoDecorator;

    public NotificacaoDecorator(Notificacao notificacaoDecorator) {
        this.notificacaoDecorator = notificacaoDecorator;
    }

    @Override
    public String acao() {
        return notificacaoDecorator.acao();
    }

    public Notificacao getCafe() {
        return notificacaoDecorator;
    }
}
