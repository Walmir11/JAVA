package Laboratorio01.Dominio;

public class Voto {
   public Eleitor eleitor;
   public Candidato candidato;

   public Voto(Eleitor eleitor, Candidato candidato) {
      this.eleitor = eleitor;
      this.candidato = candidato;
   }



   public Eleitor getEleitor() {
      return eleitor;
   }

   public Candidato getCandidato() {
      return candidato;
   }

}
