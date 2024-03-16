package Lista1.objeto;

import java.time.Year;
import java.util.Calendar;

public class Jogador {
    private String nome;
    private String posicao;
    private int Datanasc;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, int datanasc, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.Datanasc = datanasc;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getDatanasc() {
        return Datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.Datanasc = datanasc;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getidade(){
        return 2022 - getDatanasc();
    }

    public String toString(){
        return "O nome é: " +this.nome +"\nA posição é: " +this.posicao+ "\n A data de nascimento é: " +this.Datanasc + "\nA nacionalidade é: " +this.nacionalidade+"\n A altura é: "+this.altura+"\nO peso é: "+this.peso;

    }

    public void aposentadoria(){
        int aposentar = 0;
        if (posicao.equalsIgnoreCase("defesa")){
            aposentar = 40 - getidade();
            System.out.println("O jogador vai se aposentar em: "+ aposentar);
        } else if (posicao.equalsIgnoreCase("ataque")) {
            aposentar= 35 - getidade();
            System.out.println("O jogador vai se aposentar em: "+ aposentar);
        }else if (posicao.equalsIgnoreCase("meio campo")){
            aposentar= 38 - getidade();
            System.out.println("O jogador vai se aposentar em: "+ aposentar);
        }else {
            System.out.println("posoção invalida!!");
        }
    }
    }

