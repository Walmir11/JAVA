package Lista3.Q1;

public class PessoaJu extends Pessoa{
    public int funcionarios;

    public PessoaJu(String nome, Double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    @Override
    public Double impostoRenda() {
        if(getFuncionarios()<10){
            return getRendaAnual()*0.10;
        } else if (getFuncionarios()<100) {
            return getRendaAnual()*0.15;
        }else if(getFuncionarios()<1000) {
            return getRendaAnual() * 0.20;
        }else
            return getRendaAnual()*0.30;
    }
}
