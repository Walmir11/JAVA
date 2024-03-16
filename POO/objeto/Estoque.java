package Lab2.objeto;

import java.util.ArrayList;

public class Estoque {
    public ArrayList<Bebida>bebidas = new ArrayList<Bebida>();

    public void addBebida(Bebida bebida){
        bebidas.add(bebida);
    }
    public void removeBebida(Bebida bebida){
        bebidas.remove(bebida);
    }

    public Bebida buscaBebida(Bebida bebida){
        for (Bebida bebida1 : bebidas){
            if (bebida1.getNome().equalsIgnoreCase(bebida.getNome())){
                return bebida1;
            }
        }
        return null;
    }
}
