package Lista1.test;

import Lista1.objeto.Jogador;

public class TestJogador {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Giniceu","ataque",2002,"brasileiro",1.73,70);
        System.out.println(jogador.toString());
        jogador.aposentadoria();

    }
}
