package PadroesProjeto.Builder.Atividade4;

public class Main {
    public static void main(String[] args) {
        PersonagemBuilderImpl builder = new PersonagemBuilderImpl();
        Director director = new Director();

        director.construirPersonagem(builder);
        Personagem personagem1 = builder.getPersonagem();
        personagem1.imprimir();

        PersonagemBuilderImpl builder1 = new PersonagemBuilderImpl();
        builder1.construirNome("Armando");
        builder1.construirNivel(50);
        builder1.construirClasse("Mago");
        builder1.construirArma("Varinha");
        Personagem personagem2 = builder1.getPersonagem();
        personagem2.imprimir();
    }
}
