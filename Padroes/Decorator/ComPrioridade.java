package PadroesProjeto.Decorator;

public class ComPrioridade extends NotificacaoDecorator{
    public ComPrioridade(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public String acao() {
        return super.acao() + "\nEnviando notificacao com prioridade!!!";
    }
}
