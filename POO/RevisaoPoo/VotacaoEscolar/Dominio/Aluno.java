package RevisaoPoo.VotacaoEscolar.Dominio;

public class Aluno extends Eleitor{

    private String turma;

    private double media;
    private int voto;

    public Aluno(String nome, String matricula, String turma) {
        super(nome, matricula);
        this.turma = turma;
        this.voto=0;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
}
