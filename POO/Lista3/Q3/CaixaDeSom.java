package Lista3.Q3;

public class CaixaDeSom extends ControlUnv{

    private int volumeAtual;

    public CaixaDeSom(String comando, int volumeAtual) {
        super(comando);
        this.volumeAtual = volumeAtual;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }


    @Override
    public int volume() {
        int somAtual=0;
        if(getComando().equalsIgnoreCase("-")){
            if(getVolumeAtual()==0){
                return 0;
            }else {
                return somAtual = getVolumeAtual()-1;
            }
        } else if (getComando().equalsIgnoreCase("+")) {
            if(getVolumeAtual()==10){
                return 10;
            }else {
                return somAtual = getVolumeAtual()+1;
            }
        }if (getComando().equalsIgnoreCase("m")){
            return somAtual=0;
        }
        return somAtual = getVolumeAtual();
    }
}
