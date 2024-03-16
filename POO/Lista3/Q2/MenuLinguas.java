package Lista3.Q2;

public enum MenuLinguas {
    LINGUAP(1, "Lingua do P"),
    LINGUAQ(2, "Lingua do Q"),
    LINGUAX(3, "Lingua do X"),
    LINGUAT(4, "Lingua do T");

    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    MenuLinguas(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getId()+"-"+getDescricao();
    }
}
