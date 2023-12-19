package PadroesProjeto.Builder.MaratonaJAVA;

public class Test {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PersonBiulder()
                .email("walmirneto1990@gmail.com")
                .firstname("Walmir")
                .lastName("akjda")
                .userName("kajld").build();
    }
}
