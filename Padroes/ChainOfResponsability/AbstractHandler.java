package PadroesProjeto.ChainOfResponsability;

public abstract class AbstractHandler implements Handler {
    private Handler successor;

    public AbstractHandler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(String request) {
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
