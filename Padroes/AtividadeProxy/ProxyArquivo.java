package PadroesProjeto.AtividadeProxy;

public class ProxyArquivo {
    private ArquivoReal arquivo;
    private String nomeDoUsuario;

    public ProxyArquivo(String nome, String nomeDoUsuario) {
        this.arquivo = new ArquivoReal(nome);
        this.nomeDoUsuario = nomeDoUsuario;
    }


    public void ler() {
        if (verificarPermissao()) {
            arquivo.ler();
        } else {
            System.out.println("Acesso negado: você não tem permissão para ler este arquivo.");
        }
    }

    public void escrever() {
        if (verificarPermissao()) {
            arquivo.escrever();
        } else {
            System.out.println("Acesso negado: você não tem permissão para escrever neste arquivo.");
        }
    }

    public void atualizar(){
        if (verificarPermissao()){
            arquivo.atualizar();
        }else {
            System.out.println("Acesso negado: você não tem permissão para atualizar esse arquivo.");
        }
    }

    public void excluir(){
        if(verificarPermissao()){
            arquivo.excluir();
        } else {
            System.out.println("Acesso negado: você não tem permissão para excluir esse arquivo.");
        }
    }

    private boolean verificarPermissao() {

        String donoDoArquivo = "dono_do_arquivo";

        return nomeDoUsuario.equals(donoDoArquivo);
    }
}
