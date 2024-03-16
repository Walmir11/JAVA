package RevisaoPoo.Escola;

import java.util.ArrayList;

public class Diciplina {

    private int codigo;
    private String nome;
    private String horario;
    private int totalAlunos;
    ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

    public Diciplina(int codigo, String nome, String horario, int totalAlunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
        this.totalAlunos = totalAlunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTotalAlunos() {
        return totalAlunos;
    }

    public void setTotalAlunos(int totalAlunos) {
        this.totalAlunos = totalAlunos;
    }

    public String matriculaAluno(Aluno aluno){
        for(Aluno alunoExistente : listaAluno){
            if (alunoExistente.equals(aluno)){
                return "Aluno já matriculado";
            }
        }
        listaAluno.add(aluno);
        setTotalAlunos(getTotalAlunos()+1);
        return "Aluno matriculado";
    }

    public String desmatricularAluno(int nrMatricula){
        for (int i = 0; i< listaAluno.size();i++) {
            Aluno aluno = listaAluno.get(i);
            if (aluno.getNrMatricula() == nrMatricula) {
                listaAluno.remove(i);
                setTotalAlunos(getTotalAlunos()-1);
                return "Aluno desmatriculado";
            }
        }
        return "Aluno inexitente";
    }

    public double mediaTurma(){
        double somaTotal=0;
        double media=0;
        for (Aluno aluno : listaAluno){
            somaTotal = somaTotal+aluno.getMedia();
        }
        media = somaTotal/listaAluno.size();
        System.out.println("A média da turma é: "+media);
        return media;
    }

    public String trancarMatricula(int nrMatricula){
        for (Aluno aluno: listaAluno){
            if(aluno.getNrMatricula()==nrMatricula){
                if(aluno.getStatus().equalsIgnoreCase("A")){
                    aluno.setStatus("T");
                    return "Matricula trancada";
                }else {
                    return "Aluno já está com a diciplina trancada";
                }
            }
        }
        return "Aluno inexistente";
    }

    public String alunosAprovados(){
        for (Aluno aluno: listaAluno){
            if(aluno.getMedia()>=6){
                System.out.println("O aluno "+aluno.getNome()+" está APROVADO!!!");
            }else {
                System.out.println("O aluno "+aluno.getNome()+" está REPROVADO!!!");
            }
        }
        return " ";
    }

    public Double maiorMedia(){
        double maiorMedia=0;
        String nomeMaiorMedia=null;
        for (Aluno aluno:listaAluno){
            if(aluno.getMedia()>maiorMedia){
                nomeMaiorMedia = aluno.getNome();
                maiorMedia=aluno.getMedia();
            }
        }
        System.out.print("O aluno com a maior média foi "+nomeMaiorMedia+" com ");
        return maiorMedia;
    }

    public String alunosMatriculados(){
        System.out.println("Os alunos matriculados são: ");
        for (Aluno aluno:listaAluno){
            if(aluno.getStatus().equalsIgnoreCase("a")){
                System.out.println(aluno.getNome());
            }
        }
        return " ";
    }
}
