package PadroesProjeto.Prototype.Atividade5;

public class FuncionarioPrototype extends Usuario{
    private double salario;
    private String cargo;

    @Override
    public String imprimirInfo() {
        return "Funcionário [nome: " + getNome() + ", Cargo: " + getCargo() +", Salário: " + getSalario() + ", Telefone: " + getTelefone() + ", Endereço: "+getEndereco()+ "]";
    }

    @Override
    public FuncionarioPrototype clonar() {
        return new FuncionarioPrototype(this);
    }

    public FuncionarioPrototype(FuncionarioPrototype funcionario) {
        this.setNome(funcionario.getNome());
        this.setTelefone(funcionario.getTelefone());
        this.setEndereco(funcionario.getEndereco());
        this.setCargo(funcionario.getCargo());
        this.setSalario(funcionario.getSalario());
    }

    public FuncionarioPrototype(double salario, String cargo) {
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
