package Lab2.objeto;

public class Venda {
    private Cliente cliente;
    private Bebida bebida;

    public Venda(Cliente cliente, Bebida bebida) {
        this.cliente = cliente;
        this.bebida = bebida;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public Bebida getBebida() {
        return bebida;
    }

    public double valor(){
        if(cliente.getCpf().equalsIgnoreCase("07908545745")){
            return bebida.getPreco() - (bebida.getPreco() * 0.2);
        }else {
        return bebida.getPreco();
        }
    }
}
