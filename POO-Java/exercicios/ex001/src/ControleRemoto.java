public class ControleRemoto {
    private Televisor tv;

    public ControleRemoto(Televisor tv) {
        this.tv = tv;
    }

    public void ligar() {
        if(!tv.isLigado()) {
            tv.setLigado(true);
        }
    }
    public void desligar() {
        if(tv.isLigado()) {
            tv.setLigado(false);
        }
    }
    public void aumentarVolume() {
        if(tv.isLigado() && tv.getVolume() <= 95) {
            tv.setVolume(tv.getVolume() + 5);
        }
    }
    public void diminuirVolume() {
        if(tv.isLigado() && tv.getVolume() >= 5) {
            tv.setVolume(tv.getVolume() - 5);
        }
    }
    public void trocarCanal(int can) {
        if(tv.isLigado()) {
            tv.setCanal(can);
        }
    }
}
