package PadroesProjeto.ChainOfResponsability;

public class Client {
    public static void main(String[] args) {
        Handler handlerChain = new ConcreteHandlerA(new ConcreteHandlerB(null));

        // Uso do padrão Chain of Responsibility
        handlerChain.handleRequest("A");  // ConcreteHandlerA está lidando com a solicitação.
        handlerChain.handleRequest("B");  // ConcreteHandlerB está lidando com a solicitação.
        handlerChain.handleRequest("C");  // (nenhuma saída para 'C' porque nenhum manipulador pode lidar com isso)
    }
}
