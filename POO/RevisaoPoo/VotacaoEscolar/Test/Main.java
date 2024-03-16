package RevisaoPoo.VotacaoEscolar.Test;

import RevisaoPoo.VotacaoEscolar.Dominio.SistemaEleitoral;

public class Main {
    public static void main(String[] args) {
        SistemaEleitoral sistemaEleitoral = new SistemaEleitoral();
        sistemaEleitoral.iniciarVotacao();
        Main.aluno(sistemaEleitoral);
        Main.chapa(sistemaEleitoral);
        Main.professor(sistemaEleitoral);
        Main.votosChapa(sistemaEleitoral);
        sistemaEleitoral.encerrarVotacao();
        sistemaEleitoral.emitirResuldado();

    }

    public static void professor(SistemaEleitoral sistemaEleitoral){

    }

    public static void aluno(SistemaEleitoral sistemaEleitoral){

    }

    public static void chapa(SistemaEleitoral sistemaEleitoral){

    }

    public static void votosChapa(SistemaEleitoral sistemaEleitoral){

    }

}
