package PadroesProjeto.ChainOfResponsability;

public class ConcreteHandlerA extends AbstractHandler{
    public ConcreteHandlerA(Handler successor) {
        super(successor);
    }

    public void handleRequest(String request) {
        if ("A".equals(request)) {
            System.out.println("ConcreteHandlerA está lidando com a solicitação.");
        } else {
            super.handleRequest(request);
        }
    }
}
