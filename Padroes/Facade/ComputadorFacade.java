package PadroesProjeto.Facade;

public class ComputadorFacade {
    private CPU cpu;
    private Memoria memoria;
    private DiscoRigido discoRigido;

    public ComputadorFacade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.discoRigido = new DiscoRigido();
    }

    public void ligarComputador() {
        cpu.ligar();
        memoria.carregar();
        discoRigido.ler();
        System.out.println("Computador ligado e pronto para uso");
    }
}
