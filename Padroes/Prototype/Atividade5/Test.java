package PadroesProjeto.Prototype.Atividade5;

public class Test {
    public static void main(String[] args) {
        AdministradorPrototype administradorPrototype = new AdministradorPrototype("Gerente");
        ClientePrototype clientePrototype = new ClientePrototype("5623r23jhbda");
        FuncionarioPrototype funcionarioPrototype = new FuncionarioPrototype(10000,"Programador");

        Usuario admClone = administradorPrototype.clonar();
        admClone.setNome("João");
        admClone.setEndereco("Rua armandoP");
        admClone.setTelefone("799123456");

        Usuario clienteClone = clientePrototype.clonar();
        clienteClone.setNome("Jonata");
        clienteClone.setEndereco("Rua 2");
        clienteClone.setTelefone("41256389");

        Usuario funcionarioClone = funcionarioPrototype.clonar();
        funcionarioClone.setNome("Giniceu");
        funcionarioClone.setEndereco("Rua A");
        funcionarioClone.setTelefone("51982378");

        System.out.println(admClone.imprimirInfo());
        System.out.println(clienteClone.imprimirInfo());
        System.out.println(funcionarioClone.imprimirInfo());
    }
}
