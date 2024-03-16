package Lista2.objeto;

import java.util.Calendar;

public class PessoaObj {
    private String nome;
    private int datanasc;
    private double altura;
    public double salario;

    public PessoaObj(String nome, int datanasc, double altura) {
        this.nome = nome;
        this.datanasc = datanasc;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSalario(double salario){
        if (salario>0){
            this.salario = salario;
        }
    }

    public int idade(){
        return Calendar.getInstance().get(Calendar.YEAR) - datanasc;
    }

    public void Remuneração(){
        if(salario> 15*1212 ){
            System.out.println("Sua classe social é A");
        }
        else if(salario< 15*1212 && salario > (5*1212)){
            System.out.println("Sua classe social é B");
        }
        else if(salario< 5*1212 && salario>(3*1212)){
            System.out.println("Sua classe social é C");
        }
        else if(salario< 3*1212 && salario>(1212) ){
            System.out.println("Sua classe social é D");
        }
        else if (salario<=(1212)){
            System.out.println("Sua classe social é E");
        }

    }

    public void Impressão(){
        System.out.println("O nome é: "+nome);
        System.out.println("A altura é: "+altura);
        System.out.println("Data de nascimento é: "+datanasc);
        System.out.println("A idade é de: "+idade());
    }
}
