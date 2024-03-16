package Lista2.objeto;

import java.util.Scanner;

public class UrnaEleito {
    public int candidato1=0;
    public int candidato2=0;
    public int nulo;
    public int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getCandidato1() {
        return candidato1;
    }

    public void setCandidato1(int candidato1) {
        this.candidato1 = candidato1;
    }

    public int getCandidato2() {
        return candidato2;
    }

    public void setCandidato2(int candidato2) {
        this.candidato2 = candidato2;
    }

    public int getNulo() {
        return nulo;
    }

    public void setNulo(int nulo) {
        this.nulo = nulo;
    }

    public void votar(int num1){
        Scanner Wn= new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Qual seu voto?");
            num1= Wn.nextInt();
            if(num1==49){
                candidato1++;
            }else if(num1==30){
                candidato2++;
            }else {
                nulo++;
            }

        }
    }

    public void Result(){
        if (candidato1 > candidato2) {
            System.out.println("O candidato1 ganhou com " + candidato1+ " votos");
        }else if (candidato2>candidato1){
            System.out.println("O candidato2 ganhou com " + candidato2+ " votos");
        }else {
            System.out.println("A maioria foi nulo com "+nulo+" votos");
        }
    }
}
