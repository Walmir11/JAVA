package Lista3.ListaHeranca.Test;

import Lista3.ListaHeranca.Objeto.Aluno;
import Lista3.ListaHeranca.Objeto.Pessoa;

public class Test {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Giniceu",2002);
        Pessoa pessoa1 = new Pessoa("Arnaldo",2003);
        Aluno aluno = new Aluno("Jubileu",2000, 9.5);
        System.out.println(pessoa.toString());
        System.out.println(pessoa1.toString());
        System.out.println(aluno.toString());
        System.out.println(pessoa.maisVelha(aluno,pessoa1));
    }
}
