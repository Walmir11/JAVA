package PadroesProjeto.ChainOfResponsability;

public class ConcreteHandlerB extends AbstractHandler{
    public ConcreteHandlerB(Handler successor) {
        super(successor);
    }

    public void handleRequest(String request) {
        if ("B".equals(request)) {
            System.out.println("ConcreteHandlerB está lidando com a solicitação.");
        } else {
            super.handleRequest(request);
        }
    }
}
