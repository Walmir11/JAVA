package Prova2;

public class BibliotecaFacade {
    private GerenciadorLivros gerenciadorLivros;
    private GerenciadorUsuarios gerenciadorUsuarios;
    private GerenciadorEmprestimos gerenciadorEmprestimos;

    public BibliotecaFacade() {
        this.gerenciadorLivros = new GerenciadorLivros();
        this.gerenciadorUsuarios = new GerenciadorUsuarios();
        this.gerenciadorEmprestimos = new GerenciadorEmprestimos();
    }

    public void adicionarLivro(Livro livro) {
        gerenciadorLivros.adicionarLivro(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        gerenciadorUsuarios.cadastrarUsuario(usuario);
    }

    public void realizarEmprestimo(Livro livro, Usuario usuario) {
        gerenciadorEmprestimos.realizarEmprestimo(livro, usuario);
    }
}
