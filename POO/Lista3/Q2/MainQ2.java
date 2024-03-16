package Lista3.Q2;

import java.util.Scanner;

public class MainQ2 {
    public static void main(String[] args) {
        TradutorLinguagem traduto;
        Scanner sc = new Scanner(System.in);
        System.out.println("O que você deseja traduzir?");
        String texto = sc.nextLine();
        System.out.println("Selecione a Linguagem:");
        for(MenuLinguas menuLinguas: MenuLinguas.values()){
            System.out.println(menuLinguas);
        }
        int escolha = sc.nextInt();
        MenuLinguas menu = MenuLinguas.values()[escolha-1];

        switch(menu) {
            case LINGUAP:
                traduto = new TradutorLinguagemP();
                System.out.println(traduto.traducao(texto));
                break;
            case LINGUAQ:
                traduto = new TradutorLinguagemQ();
                System.out.println(traduto.traducao(texto));
                break;
            case LINGUAT:
                traduto = new TradutorLinguagemT();
                System.out.println(traduto.traducao(texto));
                break;
            case LINGUAX:
                traduto = new TradutorLinguagemX();
                System.out.println(traduto.traducao(texto));
                break;
        }
    }
}