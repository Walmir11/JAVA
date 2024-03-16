package Laboratorio01.Dominio;
import java.util.ArrayList;

public class Urna {

    public ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
    public ArrayList<Eleitor> eleitores = new ArrayList<Eleitor>();
    public ArrayList<Voto> votosSenador = new ArrayList<>();
    public ArrayList<Voto> votosPresidente = new ArrayList<>();
    public ArrayList<Voto> votosGovernador = new ArrayList<>();


    public void inserirEleitor(Eleitor eleitor) {
        eleitores.add(eleitor);
    }

    public void inserirCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public Eleitor receberEleitor(String Rg) {
        for (Eleitor eleitor : eleitores) {
                if (eleitor.getRG().equalsIgnoreCase(Rg))
                    return eleitor;
            }return null;
        }
    public Candidato receberCandidato(String numero){
        for (Candidato cand:candidatos) {
            if (cand.getNumero().equalsIgnoreCase(numero))
                return cand;
        }return null;
    }

    public void inserirVotosPresidente(String numeleitor,String Presidente){

        Voto voto= new Voto(receberEleitor(numeleitor),receberCandidato(Presidente));
        if (voto.getCandidato() != null || voto.getEleitor() != null) {
        if (eleitores.contains(voto.getEleitor())){
                votosPresidente.add(voto);
            }
        }
        }

    public void inserirVotosGovernador(String numeleitor,String Governador){
        Voto voto= new Voto(receberEleitor(numeleitor),receberCandidato(Governador));
        if (voto.getCandidato() != null || voto.getEleitor() != null) {
         if (eleitores.contains(voto.getEleitor())){
                votosGovernador.add(voto);
            }
            }
        }


    public void inserirVotoSenador(String numeleitor,String Senador) {
        Voto voto = new Voto(receberEleitor(numeleitor), receberCandidato(Senador));
        if (voto.getCandidato() != null && voto.getEleitor() != null) {
            if (eleitores.contains(voto.getEleitor())) {
                    votosSenador.add(voto);
                }
            }
        }


    public void resultadoCalcPresidente(){
        int cont = 0;
        int vencedor=0;
        for (Candidato candidato : candidatos) {
            cont=0;
            for (Voto voto :votosPresidente) {
                if (candidato.getCargo().equalsIgnoreCase("Presidente")){if (voto.getCandidato().getNome().equals(candidato.getNome())) {
                    cont++;}
                }
                }if (cont>vencedor){
                vencedor=cont;
            }
            if ((candidato.getCargo().equalsIgnoreCase("Presidente") )){
                if (!candidato.getPartido().equalsIgnoreCase("PSDSA") && cont==vencedor && cont!=0) {
                    System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome() + " - Nº: " + candidato.getNumero() + " - Votos: " + (cont - 1));
                }else if (!candidato.getPartido().equalsIgnoreCase("PSDSA")) System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome()
                        + " - Nº: " + candidato.getNumero() + " - Votos: " + (cont));

            }
        }for (Candidato candidato:candidatos) {
            if (candidato.getPartido().equalsIgnoreCase("PSDSA")&&candidato.getCargo().equalsIgnoreCase("Presidente")){
                 System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome() + " - Nº: " + candidato.getNumero() + " - Votos: " + vencedor);}
        }}


    private void resultadoCalcSenador(){
        int vencedor=0;
        int cont=0;
        for (Candidato candidato : candidatos) {
            cont=0;
            for (Voto voto :votosSenador) {
                if (candidato.getCargo().equalsIgnoreCase("Senador")){
                    if (voto.getCandidato().getNome().equals(candidato.getNome())) {
                        cont++;}
                }
            }if (cont>vencedor){
                vencedor=cont;
            }
            if ((candidato.getCargo().equalsIgnoreCase("Senador") )){
                if (!candidato.getPartido().equalsIgnoreCase("PSDSA") && cont==vencedor && cont!=0) {
                    System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome() + " - Nº: " + candidato.getNumero() + " - Votos: " + (cont - 1));
                }else if (!candidato.getPartido().equalsIgnoreCase("PSDSA")) System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome() +
                        " - Nº: " + candidato.getNumero() + " - Votos: " + (cont));

            }
        }for (Candidato candidato:candidatos) {
            if (candidato.getPartido().equalsIgnoreCase("PSDSA")&&candidato.getCargo().equalsIgnoreCase("Senador")){
                System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome() + " - Nº: " + candidato.getNumero() + " - Votos: " + vencedor);}
        }}

   private void ResultadoCalcGovernador(){
       int vencedor=0;
       int cont = 0;
        for (Candidato candidato : candidatos) {
            cont=0;
            for (Voto voto :votosGovernador) {
                if (candidato.getCargo().equalsIgnoreCase("Governador")){
                    if (voto.getCandidato().getNome().equals(candidato.getNome())) {
                        cont++;}
                }
            }if (cont>vencedor){
                vencedor=cont;
            }
            if ((candidato.getCargo().equalsIgnoreCase("Governador") )){
                if (!candidato.getPartido().equalsIgnoreCase("PSDSA") && cont==vencedor && cont!=0) {
                    System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome() + " - Nº: " + candidato.getNumero() + " - Votos: " + (cont - 1));
                }else if (!candidato.getPartido().equalsIgnoreCase("PSDSA")) System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome()
                        + " - Nº: " + candidato.getNumero() + " - Votos: " + (cont));

            }
        }for (Candidato candidato:candidatos) {
           if (candidato.getPartido().equalsIgnoreCase("PSDSA")&&candidato.getCargo().equalsIgnoreCase("Governador")){
               System.out.println("Partido: " + candidato.getPartido() + " - Candidato: " + candidato.getNome() + " - Nº: " + candidato.getNumero() + " - Votos: " + vencedor);}
       }}
    public void Resultado(){
        System.out.println("Resultado Presidente");
        resultadoCalcPresidente();
        System.out.println("Resultado Governador");
        ResultadoCalcGovernador();
        System.out.println("Resultado Senador");
        resultadoCalcSenador();
    }


    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public ArrayList<Eleitor> getEleitores() {
        return eleitores;
    }

    public void setEleitores(ArrayList<Eleitor> eleitores) {
        this.eleitores = eleitores;
    }

    public ArrayList<Voto> getVotosSenador() {
        return votosSenador;
    }

    public void setVotosSenador(ArrayList<Voto> votosSenador) {
        this.votosSenador = votosSenador;
    }

    public ArrayList<Voto> getVotosPresidente() {
        return votosPresidente;
    }

    public void setVotosPresidente(ArrayList<Voto> votosPresidente) {
        this.votosPresidente = votosPresidente;
    }

    public ArrayList<Voto> getVotosGovernador() {
        return votosGovernador;
    }

    public void setVotosGovernador(ArrayList<Voto> votosGovernador) {
        this.votosGovernador = votosGovernador;
    }
}




