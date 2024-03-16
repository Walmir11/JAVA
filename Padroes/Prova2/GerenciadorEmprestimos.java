package Prova2;

public class GerenciadorEmprestimos {
    public void realizarEmprestimo(Livro livro, Usuario usuario){
        Emprestimo emprestimo = new Emprestimo(livro,usuario);
        System.out.println("Emprestimo realizado para o usuário "+usuario.getNome()+" do livro "+livro.getTitulo());
    }
}
