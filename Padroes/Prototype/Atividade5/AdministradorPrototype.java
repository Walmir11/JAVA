package PadroesProjeto.Prototype.Atividade5;

public class AdministradorPrototype extends Usuario{

    private String cargo;

    public AdministradorPrototype(AdministradorPrototype adm) {
        this.setNome(adm.getNome());
        this.setTelefone(adm.getTelefone());
        this.setEndereco(adm.getEndereco());
        this.setCargo(adm.getCargo());
    }

    public AdministradorPrototype(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String imprimirInfo() {
        return "Administrador [nome: " + getNome() + ", Cargo: " + getCargo() + ", Telefone: " + getTelefone() + ", Endereço: "+getEndereco()+"]";
    }

    @Override
    public AdministradorPrototype clonar() {
        return new AdministradorPrototype(this);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
