package Lista1.test;

import Lista1.objeto.Cliente;
import Lista1.objeto.Conta;

public class TestConta {
    public static void main(String[] args) {
        Cliente danilo = new Cliente("Danilo", "123456789");
        Cliente alan = new Cliente("Alan", "453123451");

        danilo.getConta().deposito(100);
        System.out.println(danilo.getConta().extrato());
        danilo.getConta().saque(50);
        System.out.println(danilo.getConta().extrato());

        danilo.getConta().transferencia(10, alan.getConta());
        System.out.println(danilo.getConta().extrato());
        System.out.println(alan.getConta().extrato());
    }
}
