package Lab2.objeto;

public class Vodka extends Bebida{
    public String qualidade;

    public Vodka(String nome, double tamanho, double preco, String caracteristica) {
        super(nome, tamanho, preco, caracteristica);
        this.qualidade=caracteristica;
    }

    @Override
    public double getPreco(){
        if (this.qualidade.equalsIgnoreCase("premium")){
            return preco + (preco * 0.3);
        }else {
            return preco;
        }

    }
}
