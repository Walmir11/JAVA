package PadroesProjeto.Decorator;

public class ComLog extends NotificacaoDecorator{
    public ComLog(Notificacao notificacaoDecorator) {
        super(notificacaoDecorator);
    }

    @Override
    public String acao() {
        return super.acao() + "\nEnviando mensagem que possui arquivo de log";
    }
}
