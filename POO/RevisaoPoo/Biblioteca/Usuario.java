package RevisaoPoo.Biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int numIdentf;
    ArrayList<Livro> LivrosEmprest = new ArrayList<Livro>();

    public Usuario(String nome, int numIdentf) {
        this.nome = nome;
        this.numIdentf = numIdentf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumIdentf() {
        return numIdentf;
    }

    public void setNumIdentf(int numIdentf) {
        this.numIdentf = numIdentf;
    }
}
