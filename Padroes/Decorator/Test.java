package PadroesProjeto.Decorator;

public class Test {
    public static void main(String[] args) {
        Notificacao n = new NotificacaoBase();
        n = new ComSom(n);
        System.out.println(n.acao());

        n = new ComImagem(n);
        System.out.println(n.acao());
    }
}
