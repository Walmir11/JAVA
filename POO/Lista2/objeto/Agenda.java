package Lista2.objeto;

import java.util.ArrayList;

public class Agenda {
    public ArrayList<String> agenda1 = new ArrayList<String>();

    public String nome;
    public int idade;
    public double altura;



    public void armazenaPessoa(String nome) {
        agenda1.add("Giniceu");
        agenda1.add("Ginicreu");
        agenda1.add("Giniceaeu");
        agenda1.add("Ginicwerasdeu");
        agenda1.add("Giniceuadas");
        agenda1.add("Giniceudas");

    }

    public void removePessoa(String nome){
        agenda1.remove(2);
    }
    public void buscarPessoa(String nome){
        agenda1.contains("gini");
    }

    public String toString(){
        return agenda1.toString();
    }

    public void impressora(){
        for (int i = 0; i < 10; i++) {
            System.out.println(agenda1.get(i));

        }
    }

}
