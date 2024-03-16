package Lab2.objeto;

public class Whisky extends Bebida{
    public String idade;

    public Whisky(String nome, double tamanho, double preco, String caracteristica) {
        super(nome, tamanho, preco, caracteristica);
        this.idade = caracteristica;
    }

    @Override
    public double getPreco(){
        if (this.idade.equalsIgnoreCase("16")){
            return preco + (preco * 0.2);
        }else if (this.idade.equalsIgnoreCase("18")){
            return preco + (preco * 0.4);
        }else {
            return preco;
        }

    }
}
