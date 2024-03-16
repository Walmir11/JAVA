package RevisaoPoo.VotacaoEscolar.Dominio;


import java.util.ArrayList;

public class SistemaEleitoral {

    private boolean votacaoAberta = false;
    int sexto=0;
    int setimo=0;
    int oitavo=0;
    int nono=0;
    int vSexto=0;
    int vSetimo=0;
    int vOitavo=0;
    int vNono=0;

    ArrayList<Chapa> chapas = new ArrayList<Chapa>();
    ArrayList<Voto> votoChapas = new ArrayList<Voto>();
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    ArrayList<Professor> professores = new ArrayList<Professor>();
    ArrayList<Professor> sSexto = new ArrayList<Professor>();
    ArrayList<Professor> sSetimo = new ArrayList<Professor>();
    ArrayList<Professor> sOitavo = new ArrayList<Professor>();
    ArrayList<Professor> sNono = new ArrayList<Professor>();

    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void inserirProfessor(Professor professor, String turma){
        if (turma.equalsIgnoreCase("sexto")){
            sSexto.add(professor);
            professores.add(professor);
        }
        if (turma.equalsIgnoreCase("setimo")){
            sSetimo.add(professor);
            professores.add(professor);
        }
        if (turma.equalsIgnoreCase("oitavo")){
            sOitavo.add(professor);
            professores.add(professor);
        }
        if (turma.equalsIgnoreCase("nono")){
            sNono.add(professor);
            professores.add(professor);
        }

    }

    public void iniciarVotacao(){
        if (votacaoAberta==true){
            System.out.println("A votação já está aberta");
        }else {
            votacaoAberta=true;
            System.out.println("A votação foi aberta com sucesso");
            System.out.println("A votação já está aberta");
        }
    }

    public void cadastrarRemoverChapa(String nomeChapa,Aluno lider,Aluno viceLider){
        if(votacaoAberta== true){

            Chapa chapa ;
            if(lider.getTurma().equalsIgnoreCase("sexto")&&viceLider.getTurma().equalsIgnoreCase("sexto")){
                chapa = new Chapa(nomeChapa,lider,viceLider);
                if (sexto<2){
                        chapas.add(chapa);
                        sexto++;
                }else {
                        chapas.remove(chapa);
                }
            }
            if(lider.getTurma().equalsIgnoreCase("setimo")&&viceLider.getTurma().equalsIgnoreCase("setimo")) {
                chapa = new Chapa(nomeChapa, lider, viceLider);
                if (setimo < 2) {
                    chapas.add(chapa);
                    sexto++;
                } else {
                    chapas.remove(chapa);
                }
            }
            if(lider.getTurma().equalsIgnoreCase("oitavo")&&viceLider.getTurma().equalsIgnoreCase("oitavo")) {
                chapa = new Chapa(nomeChapa, lider, viceLider);
                if (oitavo < 2) {
                    chapas.add(chapa);
                    sexto++;
                } else {
                    chapas.remove(chapa);
                }
            }
                if (lider.getTurma().equalsIgnoreCase("nono") && viceLider.getTurma().equalsIgnoreCase("nono")) {
                    chapa = new Chapa(nomeChapa, lider, viceLider);
                    if (nono < 2) {
                        chapas.add(chapa);
                        sexto++;
                    } else {
                        chapas.remove(chapa);
                    }
                }
        }else {
            System.out.println("A votação está fechada no momento");
        }
    }

    public void encerrarVotacao(){
        if (votacaoAberta==true){
            votacaoAberta=false;
            System.out.println("A votação foi fechada com sucesso");
        }else {
            System.out.println("A votação já está fechada");
        }
    }

    public Aluno receberAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equalsIgnoreCase(matricula))
                return aluno;
        }return null;
    }

    public Professor receberProfessor(String matricula) {
        for (Professor professor : professores) {
            if (professor.getMatricula().equalsIgnoreCase(matricula))
                return professor;
        }return null;
    }

    public Chapa receberChapa(String nome){
        for (Chapa chapa: chapas){
            if (chapa.getNome().equalsIgnoreCase(nome)){
                return chapa;
            }
        }return null;

    }

    public void inserirVotoChapaProfessor(String matricula, String nome){
        Voto voto= new Voto(receberProfessor(matricula),receberChapa(nome));
        if (voto.getChapa() != null || voto.getProfessor() !=null){
            if ( sSexto.contains(matricula)&&sexto<1&&voto.getChapa().getLider().getTurma().equalsIgnoreCase("sexto")){
                vSexto++;
                if(votoChapas.contains(voto.getChapa())){
                    votoChapas.add(voto);
                }
            }
            if ( sSetimo.contains(matricula)&&setimo<1&&voto.getChapa().getLider().getTurma().equalsIgnoreCase("setimo")){
                vSetimo++;
                if(votoChapas.contains(voto.getChapa())){
                    votoChapas.add(voto);
                }
            }
            if ( sOitavo.contains(matricula)&&oitavo<1&&voto.getChapa().getLider().getTurma().equalsIgnoreCase("oitavo")){
                vOitavo++;
                if(votoChapas.contains(voto.getChapa())){
                    votoChapas.add(voto);
                }
            }
            if (sNono.contains(matricula)&&nono<1&&voto.getChapa().getLider().getTurma().equalsIgnoreCase("nono")){
                vNono++;
                if(votoChapas.contains(voto.getChapa())){
                    votoChapas.add(voto);
                }
            }
        }
    }

    public void inserirVotoChapaAluno(String matricula, String nome){
        Voto voto = new Voto(receberAluno(matricula),receberChapa(nome));
        if(voto.getChapa() != null || voto.getAluno()!= null ){
            if(voto.getAluno().getVoto()<1){
                if(voto.getChapa().getLider().getTurma().equalsIgnoreCase("sexto")&& voto.getAluno().getTurma().equalsIgnoreCase("sexto")){
                    if(votoChapas.contains(voto.getChapa())){
                        votoChapas.add(voto);
                    }
                }
                if(voto.getChapa().getLider().getTurma().equalsIgnoreCase("setimo")&& voto.getAluno().getTurma().equalsIgnoreCase("setimo")){
                    if(votoChapas.contains(voto.getChapa())){
                        votoChapas.add(voto);
                    }
                }
                if(voto.getChapa().getLider().getTurma().equalsIgnoreCase("oitavo")&& voto.getAluno().getTurma().equalsIgnoreCase("oitavo")){
                    if(votoChapas.contains(voto.getChapa())){
                        votoChapas.add(voto);
                    }
                }
                if(voto.getChapa().getLider().getTurma().equalsIgnoreCase("nono")&& voto.getAluno().getTurma().equalsIgnoreCase("nono")){
                    if(votoChapas.contains(voto.getChapa())){
                        votoChapas.add(voto);
                    }
                }
            }
        }
    }

    public void emitirResuldado(){
        int vencedor=0;
        for (Chapa chapa: chapas){
            for(Voto voto : votoChapas){
                if(voto.getChapa().getNome().equalsIgnoreCase(chapa.getNome())){
                    chapa.cont++;
                }
            }
            if (chapa.cont>vencedor){
                vencedor=chapa.cont;
            }
        }
        for(Chapa chapa : chapas){
            if(chapa.cont==vencedor){
                System.out.println("A chapa vencedora foi a " + chapa.getNome() + ", com o líder "+chapa.getLider()+" e o vice líder "+chapa.getViceLider());
            }
        }

    }
}
