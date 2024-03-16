package RevisaoPoo.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livrosDisp = new ArrayList<Livro>();

    public void emprestarLivro(Usuario usuario, Livro livro){
        if (livro.getStatus().equalsIgnoreCase("disponivel")){
            livrosDisp.remove(livro);
            usuario.LivrosEmprest.add(livro);
            System.out.println("Emprestimo concluido!");
        }else if (livro.getStatus().equalsIgnoreCase("emprestado")){
            System.out.println("Livro já foi emprestado!");
        }else {
            System.out.println("Livro inexistente!");
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro){
        if(livro.getStatus().equalsIgnoreCase("emprestado")){
            livrosDisp.add(livro);
            usuario.LivrosEmprest.remove(livro);
            System.out.println("Devolução concluida");
        }else if (livro.getStatus().equalsIgnoreCase("disponivel")){
            System.out.println("Livro já está disponível");
        }else {
            System.out.println("Livro inexistente");
        }
    }

    public void buscarLivroPorTitulo(String titulo){
        for (Livro livro: livrosDisp){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("O livro "+livro+" foi encontrado com sucesso");
            }else {
                System.out.println("Livro não encontrado");
            }
        }
    }

    public void mostrarLivrosDisponiveis(){
        for (int i = 0; i<livrosDisp.size();i++){
            System.out.println(livrosDisp.indexOf(i));
        }
    }
}
