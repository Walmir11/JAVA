package RevisaoPoo.Biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private String anoPubli;
    private String status;

    public Livro(String titulo, String autor, String anoPubli, String status) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(String anoPubli) {
        this.anoPubli = anoPubli;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
