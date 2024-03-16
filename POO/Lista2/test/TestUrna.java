package Lista2.test;
import Lista2.objeto.UrnaEleito;

public class TestUrna {
    public static void main(String[] args) {
        UrnaEleito urnaEleito = new UrnaEleito();
        urnaEleito.votar(urnaEleito.num1);
        urnaEleito.Result();
    }
}
