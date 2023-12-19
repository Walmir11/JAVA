package PadroesProjeto.AtividadeProxy;


public class Main {
    public static void main(String[] args) {

        ProxyArquivo arquivo = new ProxyArquivo("arquivo.txt", "dono_do_arquivo");

        arquivo.ler();
        arquivo.escrever();
        arquivo.atualizar();
        arquivo.excluir();


        arquivo = new ProxyArquivo("arquivo.txt", "outro_usuario");

        arquivo.ler();
        arquivo.escrever();
        arquivo.atualizar();
        arquivo.excluir();


    }
}

