package Lista1.objeto;

import java.util.ArrayList;

public class Conta {
    public String numconta;
    public double saldo = 0;
    public ArrayList<String>movimentos = new ArrayList<String>();

    public Conta(String numconta) {
        this.numconta = numconta;
        this.saldo = saldo;
    }

    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(String numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposito(double valor){
        this.saldo = this.saldo + valor;
        movimentos.add("-Deposito: " +valor);
    }

    public void saque(double valor){
        this.saldo -= valor;
        movimentos.add("-Saque: " +valor);
    }

    public void transferencia(double valor, Conta destino){
        this.saque(valor);
        destino.deposito(valor);
        movimentos.add("Transferencia para: "+destino+ "no valor de "+valor);
    }

    public String extrato(){
        String imprimir = "Extrato";
        for (String movimento : movimentos){
            imprimir += "\n"+movimento;
        }
        imprimir += "\n"+saldo;
        return imprimir;
    }

}
