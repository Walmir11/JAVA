package PadroesProjeto.Prototype.Atividade5;

public class ClientePrototype extends Usuario{
    private String idCliente;

    public ClientePrototype(ClientePrototype cliente) {
        this.setNome(cliente.getNome());
        this.setTelefone(cliente.getTelefone());
        this.setEndereco(cliente.getEndereco());
        this.setIdCliente(cliente.getIdCliente());
    }

    public ClientePrototype(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String imprimirInfo() {
        return "Cliente [nome: " + getNome() + ", IdCliente: " + getIdCliente() + ", Telefone: " + getTelefone() + ", Endereço: "+getEndereco()+"]";
    }

    @Override
    public ClientePrototype clonar() {
        return new ClientePrototype(this);
    }
}
