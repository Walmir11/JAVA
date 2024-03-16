package Lista3.Q5;

import java.util.Scanner;

public class MainQ5 {
    public static void main(String[] args) {
        Calculo calculo;
        Scanner wn = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = wn.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = wn.nextDouble();
        System.out.println("Selecione a operação desejada: ");

        for (MenuCalculo menuCalculo : MenuCalculo.values()){
            System.out.println(menuCalculo);
        }

        int operacao = wn.nextInt();
        MenuCalculo menuCalculo = MenuCalculo.values()[operacao-1];

        switch (menuCalculo){
            case SOMA:
                calculo = new Soma();
                System.out.println(calculo.conta(numero1,numero2));
                break;
            case SUBTRACAO:
                calculo = new Subtracao();
                System.out.println(calculo.conta(numero1,numero2));
                break;
            case MULTIPLICACAO:
                calculo = new Multiplicacao();
                System.out.println(calculo.conta(numero1,numero2));
                break;
            case DIVISAO:
                calculo = new Divisao();
                System.out.println(calculo.conta(numero1,numero2));
                break;

        }

    }
}
