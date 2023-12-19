package PadroesProjeto.Builder.Atividade4;

public class PersonagemBuilderImpl implements PersonagemBuilder {

    private Personagem personagem;

    @Override
    public void construirNome(String nome) {
        personagem.setNome(nome);
    }

    @Override
    public void construirClasse(String classe) {
        personagem.setClasse(classe);
    }

    @Override
    public void construirNivel(int nivel) {
        personagem.setNivel(nivel);
    }

    @Override
    public void construirArma(String arma) {
        personagem.setArma(arma);
    }
    public Personagem getPersonagem() {
        return personagem;
    }

}
