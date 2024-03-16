package Lista3.Q1;

public class MainQ1 {
    public static void main(String[] args) {
        Pessoa juridica = new PessoaJu("IFS", 10000.00, 10);
        System.out.println(juridica.impostoRenda());

        Pessoa fisica = new PessoaFi("Giniceu", 20000.10, 0);
        System.out.println(fisica.impostoRenda());
    }
}
