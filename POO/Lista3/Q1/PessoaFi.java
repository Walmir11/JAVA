package Lista3.Q1;

public class PessoaFi extends Pessoa {
    public int dependentes;

    public PessoaFi(String nome, double rendaAnual,int dependentes) {
        super(nome, rendaAnual);
        this.dependentes = dependentes;
    }

    public int getDependentes() {
        return dependentes;
    }

    @Override
    public Double impostoRenda() {
        double imposto = 0;
        if(getRendaAnual()>20000){
            imposto = getRendaAnual()*0.05;
        } else if (getRendaAnual()>30000) {
            imposto = getRendaAnual()*0.10;
        } else if (getRendaAnual()>50000) {
            imposto = getRendaAnual()*0.15;
        } else if (getRendaAnual()>70000) {
            imposto = getRendaAnual()*0.25;
        }

        imposto = imposto + imposto*(getDependentes()*0.03);
        return imposto;
    }
    }

