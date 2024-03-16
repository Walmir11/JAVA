package Lista3.Q3;

public abstract class ControlUnv {

    protected String comando;

    public ControlUnv(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public abstract int volume();
}
