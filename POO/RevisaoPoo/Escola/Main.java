package RevisaoPoo.Escola;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(123456,"Giniceu",8,"A");
        Aluno aluno1 = new Aluno(789654,"arnaldo",9,"A");
        Aluno aluno2 = new Aluno(654987,"Gini",10,"A");
        Aluno aluno3 = new Aluno(321654,"Giceu",6,"A");
        Aluno aluno4 = new Aluno(132655,"niceu",5,"A");
        Aluno aluno5 = new Aluno(985647,"iceu",7,"A");
        Aluno aluno6 = new Aluno(362514,"iniceu",2,"A");

        Diciplina diciplina = new Diciplina(987,"bosta seca","10 pa nestante",25);


        System.out.println(diciplina.matriculaAluno(aluno));
        System.out.println(diciplina.matriculaAluno(aluno1));
        System.out.println(diciplina.matriculaAluno(aluno2));
        System.out.println(diciplina.matriculaAluno(aluno3));
        System.out.println(diciplina.matriculaAluno(aluno4));
        System.out.println(diciplina.matriculaAluno(aluno5));
        System.out.println(diciplina.matriculaAluno(aluno6));


        System.out.println(diciplina.desmatricularAluno(654987));

        System.out.println(diciplina.trancarMatricula(132655));

        System.out.println(diciplina.mediaTurma());

        System.out.println(diciplina.alunosAprovados());

        System.out.println(diciplina.maiorMedia());

        System.out.println(diciplina.alunosMatriculados());
    }
}
