package PadroesProjeto.AtividadeProxy;

public class ArquivoReal {
    private String nome;

    public ArquivoReal(String nome) {
        this.nome = nome;
    }


    public void ler() {
        System.out.println("Lendo o arquivo real: " + nome);
    }


    public void escrever() {
        System.out.println("Escrevendo no arquivo real: " + nome);
    }

    public void atualizar(){
        System.out.println("Atualizando Arquivo: " + nome);
    }

    public void excluir(){
        System.out.println("Excluindo Arquivo: " + nome);
    }

}

