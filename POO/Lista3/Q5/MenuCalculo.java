package Lista3.Q5;

public enum MenuCalculo {

    SOMA(1,"Soma"),
    SUBTRACAO(2,"Divisao"),
    MULTIPLICACAO(3,"Multiplicação"),
    DIVISAO(4,"Divisao");

    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    MenuCalculo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return getId()+"-"+getDescricao();
    }
}
