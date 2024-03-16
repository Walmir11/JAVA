package Lista1.objeto;

import java.util.ArrayList;

public class Empresa {
    public String nome;
    public int cnpj;
    public ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Empresa(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void inserirfuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public String toString(){
        String impressora= "Nome: "+this.nome+ "\nCNPJ: "+this.cnpj;
        impressora = impressora + "\nFuncionarios: ";
        for (Funcionario funcionario:funcionarios){
            impressora = impressora + funcionario.toString();
        }
        return impressora;
    }

    public Funcionario buscaFuncionario(String nome){
        for(Funcionario func : funcionarios){
            if(func.getNome().equalsIgnoreCase(nome)){
                return func;
            }
        }
        return null;
    }

    public double totalFolhaNormal(){
        double total = 0;
        for (Funcionario func: funcionarios){
            total= total + func.getSalario();
        }
        return total;
    }



}
