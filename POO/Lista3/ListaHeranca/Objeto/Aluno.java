package Lista3.ListaHeranca.Objeto;

public class Aluno extends Pessoa {
    public double notas;

    public Aluno(String nome, int anoNascimeto, double notas) {
        super(nome, anoNascimeto);
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String toString(){
        return "Nome: "+getNome()+"\nData de nascimento: "+getAnoNascimeto()+"\nNota: "+getNotas();
    }
}
