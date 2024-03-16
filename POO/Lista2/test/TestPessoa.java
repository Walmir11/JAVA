package Lista2.test;

import Lista2.objeto.PessoaObj;

public class TestPessoa {
    public static void main(String[] args) {
        PessoaObj pessoa = new PessoaObj("Giniceu", 2002, 1.73);
        pessoa.Impressão();
        pessoa.Remuneração();
        pessoa.setSalario(5005);
    }
}
