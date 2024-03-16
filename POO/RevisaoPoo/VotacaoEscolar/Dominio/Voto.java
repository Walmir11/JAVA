package RevisaoPoo.VotacaoEscolar.Dominio;

public class Voto {

    private Professor professor;
    private Aluno aluno;
    private Chapa chapa;

    public Voto( Aluno aluno, Chapa chapa) {
        this.aluno = aluno;
        this.chapa = chapa;
    }

    public Voto(Professor professor, Chapa chapa){
        this.professor=professor;
        this.chapa=chapa;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Chapa getChapa() {
        return chapa;
    }

    public void setChapa(Chapa chapa) {
        this.chapa = chapa;
    }
}
