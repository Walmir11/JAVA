package Lista1.test;

import Lista1.objeto.Empresa;
import Lista1.objeto.Funcionario;

public class TestEmpresa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Jonilson",3000,"Administrador");
        Funcionario funcionario2 = new Funcionario("Giniceu",20000,"Chefe");
        Funcionario funcionario3 = new Funcionario("Vasco",1500,"Fachineiro");

        Empresa empresa = new Empresa("doisirmãos",552149861);
        empresa.inserirfuncionario(funcionario1);
        empresa.inserirfuncionario(funcionario2);
        empresa.inserirfuncionario(funcionario3);

        System.out.println(empresa.totalFolhaNormal());
        System.out.println(empresa);
        System.out.println(empresa.buscaFuncionario("Giniceu"));

    }
}
