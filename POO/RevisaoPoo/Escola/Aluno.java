package RevisaoPoo.Escola;

public class Aluno {

    private int nrMatricula;
    private String nome;
    private String status;
    private double media;

    public Aluno(int nrMatricula, String nome, double media, String status) {
        this.nrMatricula = nrMatricula;
        this.nome = nome;
        this.media = media;
        this.status = "A";
    }

    public int getNrMatricula() {
        return nrMatricula;
    }

    public void setNrMatricula(int nrMatricula) {
        this.nrMatricula = nrMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
