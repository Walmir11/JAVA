package Lista3.Q6;

public enum MenuTipo {
    TEXTO(1,"Apenas texto"),
    IMAGEMTEXTO(2,"Imagem e texto"),
    IMAGEM(3,"Apenas imagem");

    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    MenuTipo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return getId()+"-"+getDescricao();
    }

}

