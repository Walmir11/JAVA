package PadroesProjeto.Builder.Atividade4;

public class Director {
    public void construirPersonagem(PersonagemBuilderImpl builder){
        builder.construirNome("Arnaldo");
        builder.construirArma("M4");
        builder.construirClasse("Soldado");
        builder.construirNivel(100);
    }
}
