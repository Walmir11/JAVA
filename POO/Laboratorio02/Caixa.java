package Lab2.objeto;

import java.util.ArrayList;

public class Caixa {
    public ArrayList<Venda>vendas=new ArrayList<Venda>();
    public ArrayList<Cliente>clientes=new ArrayList<Cliente>();
    public Estoque estoque;

    public Estoque getEstoque() {
        return estoque;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }


    public Cliente buscaCliente(String cpf){
        for (Cliente cliente : clientes){
            if (cliente.getCpf().equalsIgnoreCase(cpf)){
                return cliente;
            }
        }
        return null;
    }


    public void realizarVenda(String cliente, Bebida bebida) {
        Venda venda = new Venda(buscaCliente(cliente),estoque.buscaBebida(bebida));
        if (venda.getBebida() != null && venda.getCliente() != null && venda.getCliente().idade()>18) {
            vendas.add(venda);
            estoque.removeBebida(venda.getBebida());
        } else if (venda.getBebida() == null) {
            System.out.println("Não tem no estoque.");
        } else if (venda.getCliente() == null) {
            System.out.println("Cliente não consta no caixa.");
        } else if (venda.getCliente().idade() < 18) {
            System.out.println("Cliente menor de idade.");
        }
    }

    public void faturamento(Bebida bebida) {
        double soma = 0;
        for (Venda venda : vendas) {
            if (venda.getBebida().preco != 0) {
                soma += venda.getBebida().preco;
            }
        }
        System.out.println("Total faturado no caixa " + soma + " R$");
    }


}
