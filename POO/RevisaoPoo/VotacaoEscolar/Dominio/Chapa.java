package RevisaoPoo.VotacaoEscolar.Dominio;

public class Chapa {
    public String nome;
    public Aluno lider;
    public Aluno viceLider;

    public int cont;

    public Chapa(String nome, Aluno lider,Aluno viceLider) {
        this.nome = nome;
        this.lider = lider;
        this.viceLider=viceLider;
        this.cont=0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getLider() {
        return lider;
    }

    public void setLider(Aluno lider) {
        this.lider = lider;
    }

    public Aluno getViceLider() {
        return viceLider;
    }

    public void setViceLider(Aluno viceLider) {
        this.viceLider = viceLider;
    }
}
