package Laboratorio01.Test;

import Laboratorio01.Dominio.Candidato;
import Laboratorio01.Dominio.Eleitor;
import Laboratorio01.Dominio.Urna;

public class Main {
    public static void main(String[] args) {
        Urna urna = new Urna();
        Main.popularCandidato(urna);
        Main.popularEleitor(urna);
        Main.votacaoGovernador(urna);
        Main.votacaoPresidente(urna);
        Main.votacaoSenador(urna);
        urna.Resultado();
    }
    public static void votacaoPresidente(Urna urna){
        urna.inserirVotosPresidente("1", "11");
        urna.inserirVotosPresidente("17","11");
        urna.inserirVotosPresidente("2", "15");
        urna.inserirVotosPresidente("3", "15");
        urna.inserirVotosPresidente("4", "15");
        urna.inserirVotosPresidente("5", "11");
        urna.inserirVotosPresidente("6", "11");
        urna.inserirVotosPresidente("19","15");
        urna.inserirVotosPresidente("7", "15");
        urna.inserirVotosPresidente("8", "15");
        urna.inserirVotosPresidente("9", "11");
        urna.inserirVotosPresidente("10","15");
        urna.inserirVotosPresidente("11","12");
        urna.inserirVotosPresidente("12","15");
        urna.inserirVotosPresidente("13","21");
        urna.inserirVotosPresidente("14","14");
        urna.inserirVotosPresidente("15","12");
    }
    public static void votacaoGovernador(Urna urna){
        urna.inserirVotosGovernador("1", "23"  );
        urna.inserirVotosGovernador("17","25");
        urna.inserirVotosGovernador("2", "23");
        urna.inserirVotosGovernador("3", "23");
        urna.inserirVotosGovernador("4", "22");
        urna.inserirVotosGovernador("5", "23");
        urna.inserirVotosGovernador("6", "25");
        urna.inserirVotosGovernador("19","25");
        urna.inserirVotosGovernador("7", "25");
        urna.inserirVotosGovernador("8", "22");
        urna.inserirVotosGovernador("9", "23");
        urna.inserirVotosGovernador("10","24");
        urna.inserirVotosGovernador("11","23");
        urna.inserirVotosGovernador("12","24");
        urna.inserirVotosGovernador("13","23");
        urna.inserirVotosGovernador("14","24");
        urna.inserirVotosGovernador("15","22");
    }

    public static void votacaoSenador(Urna urna) {

        urna.inserirVotoSenador("1", "333");
        urna.inserirVotoSenador("17","338");
        urna.inserirVotoSenador("2", "311");
        urna.inserirVotoSenador("3", "311");
        urna.inserirVotoSenador("4", "311");
        urna.inserirVotoSenador("5", "323");
        urna.inserirVotoSenador("6", "321");
        urna.inserirVotoSenador("19","323");
        urna.inserirVotoSenador("7", "325");
        urna.inserirVotoSenador("8", "323");
        urna.inserirVotoSenador("9", "333");
        urna.inserirVotoSenador("10","335");
        urna.inserirVotoSenador("11","323");
        urna.inserirVotoSenador("12","321");
        urna.inserirVotoSenador("13","323");
        urna.inserirVotoSenador("14","322");
        urna.inserirVotoSenador("15","326");
    }


    public static void popularCandidato(Urna urna) {
        urna.inserirCandidato(new Candidato("Candidato11", "PSDSA", "11", "Presidente"));
        urna.inserirCandidato(new Candidato("Candidato12", "PP", "12", "Presidente"));
        urna.inserirCandidato(new Candidato("Candidato13", "PM", "13", "Presidente"));
        urna.inserirCandidato(new Candidato("Candidato14", "PB", "14", "Presidente"));
        urna.inserirCandidato(new Candidato("Candidato15", "PSD", "15", "Presidente"));
        urna.inserirCandidato(new Candidato("Candidato21", "PSD", "21", "Governador"));
        urna.inserirCandidato(new Candidato("Candidato22", "PP", "22", "Governador"));
        urna.inserirCandidato(new Candidato("Candidato23", "PSDSA", "23", "Governador"));
        urna.inserirCandidato(new Candidato("Candidato24", "PIB", "24", "Governador"));
        urna.inserirCandidato(new Candidato("Candidato25", "PPI", "25", "Governador"));
        urna.inserirCandidato(new Candidato("Candidato31", "PP", "311", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato32", "PM", "321", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato33", "PD", "322", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato34", "PPO", "323", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato35", "PSDSA", "333", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato36", "PD", "322", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato37", "PPO", "328", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato38", "PSDSA", "337", "Senador"));
        urna.inserirCandidato(new Candidato("Candidato39", "PSDSA", "339", "Senador"));
    }

    public static void popularEleitor(Urna urna) {
        urna.inserirEleitor(new Eleitor("Eleitor1", "1", "Rua1"));
        urna.inserirEleitor(new Eleitor("Eleitor2", "2", "Rua2"));
        urna.inserirEleitor(new Eleitor("Eleitor3", "3", "Rua3"));
        urna.inserirEleitor(new Eleitor("Eleitor4", "4", "Rua4"));
        urna.inserirEleitor(new Eleitor("Eleitor5", "5", "Rua5"));
        urna.inserirEleitor(new Eleitor("Eleitor6", "6", "Rua6"));
        urna.inserirEleitor(new Eleitor("Eleitor7", "7", "Rua7"));
        urna.inserirEleitor(new Eleitor("Eleitor8", "8", "Rua8"));
        urna.inserirEleitor(new Eleitor("Eleitor9", "9", "Rua9"));
        urna.inserirEleitor(new Eleitor("Eleitor10", "10", "Rua10"));
        urna.inserirEleitor(new Eleitor("Eleitor11", "11", "Rua11"));
        urna.inserirEleitor(new Eleitor("Eleitor12", "12", "Rua12"));
        urna.inserirEleitor(new Eleitor("Eleitor13", "13", "Rua13"));
        urna.inserirEleitor(new Eleitor("Eleitor14", "14", "Rua14"));
        urna.inserirEleitor(new Eleitor("Eleitor15", "15", "Rua15"));
    }


}
