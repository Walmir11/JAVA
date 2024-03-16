package Prova2;

public class Main {
    public static void main(String[] args) {
        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade();

        Livro livro = new Livro("Alice no país das maravilhas", 5862);
        Usuario usuario = new Usuario("Ana",5);

        bibliotecaFacade.adicionarLivro(livro);
        bibliotecaFacade.cadastrarUsuario(usuario);
        bibliotecaFacade.realizarEmprestimo(livro,usuario);
    }
}
