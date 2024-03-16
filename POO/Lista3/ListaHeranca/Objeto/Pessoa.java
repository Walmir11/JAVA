package Lista3.ListaHeranca.Objeto;

public class Pessoa {
    public String nome;
    public int anoNascimeto;

    public Pessoa(String nome, int anoNascimeto) {
        this.nome = nome;
        this.anoNascimeto = anoNascimeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimeto() {
        return anoNascimeto;
    }

    public void setAnoNascimeto(int anoNascimeto) {
        this.anoNascimeto = anoNascimeto;
    }

    public Pessoa maisVelha(Pessoa pessoa,Pessoa outra){
        String maisVelho;
        if (pessoa.getAnoNascimeto()> outra.getAnoNascimeto()){
            System.out.println("O mais velho é: "+outra.getNome());
            return outra;
        }else {
            System.out.println("O mais velho é: "+pessoa.getNome());
            return pessoa;
        }
    }

    public String toString(){
        return "Nome: "+getNome()+"\nData de nascimento: "+getAnoNascimeto();
    }
}
