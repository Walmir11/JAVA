package PadroesProjeto.Builder.MaratonaJAVA;

public abstract class Carro {

    protected String cor;
    protected String modelo;
    protected String marca;
    protected String motor;

    private Carro(String cor, String modelo, String marca, String motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
    }

    public abstract class CarroBuilder{
        protected String cor;
        protected String modelo;
        protected String marca;
        protected String motor;

        public CarroBuilder cor(){
            this.cor = cor;
            return this;
        }

        public CarroBuilder modelo(){
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder marca(){
            this.marca = marca;
            return this;
        }

        public CarroBuilder motor(){
            this.motor = motor;
            return this;
        }
    }
}
