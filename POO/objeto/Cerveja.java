package Lab2.objeto;

public class Cerveja extends Bebida{
    public String temperatura;

    public Cerveja(String nome, double tamanho, double preco, String caracteristica) {
        super(nome, tamanho, preco, caracteristica);
        this.temperatura=caracteristica;
    }

    @Override
    public double getPreco(){
        if (this.temperatura.equalsIgnoreCase("gelada")){
            return preco + (preco * 0.1);
        }else {
            return preco;
        }

    }
}
