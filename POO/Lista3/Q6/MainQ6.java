package Lista3.Q6;

import java.util.Scanner;

public class MainQ6 {
    public static void main(String[] args) {
        Impressao impressao;
        int folhas = 10;
        int nivelC = 100;
        int nivelP = 100;
        Scanner wn = new Scanner(System.in);

        System.out.println("Existe " + folhas + " folhas disponíveis");
        System.out.println("Quantas serão as impressões?");
        int qtd = wn.nextInt();

        for (int i = 0; i < qtd ; i++) {
            System.out.println("Qual o tipo da impresão?");
            if (folhas == 0){
                System.out.println("!!As folhas acabaram!!");
            }else {
                for (MenuTipo menuTipo : MenuTipo.values()) {
                    System.out.println(menuTipo);
                }

                int escolha = wn.nextInt();
                MenuTipo menuTipo = MenuTipo.values()[escolha - 1];

                System.out.println("Impressora: \n1- laser\n2- tinta");
                int tipoimp = wn.nextInt();

                if (tipoimp==1 ){
                    System.out.println("A impressão a laser foi concluida");

                }else if (tipoimp==2){
                    switch (menuTipo) {
                        case TEXTO:
                            impressao = new PretoBranco();
                            System.out.println(impressao.tipoImpressao(1,nivelP));
                            nivelP = nivelP-10;
                            break;
                        case IMAGEM:
                            impressao = new Colorido();
                            System.out.println(impressao.tipoImpressao(1,nivelC));
                            nivelC = nivelC-20;
                            break;
                        case IMAGEMTEXTO:
                            impressao = new Colorido();
                            System.out.println(impressao.tipoImpressao(2,nivelC));
                            nivelC = nivelC-10;
                            PretoBranco pretoBranco1 = new PretoBranco();
                            System.out.println(pretoBranco1.tipoImpressao(1,nivelP));
                            nivelP = nivelP-10;
                            break;
                    }
                    System.out.println("A impressão a tinta foi concluida");
                }

                folhas--;
            }

        }


    }
}



