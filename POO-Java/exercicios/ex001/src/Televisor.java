public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        if(!isLigado()) {
            this.setLigado(true);
        }
    }
    public void desligar() {
        if(isLigado()) {
            this.setLigado(false);
        }
    }
    public void aumentarVolume() {
        if(isLigado() && this.getVolume() <= 95) {
            this.volume += 5;
        }
    }
    public void diminuirVolume() {
        if(isLigado() && this.getVolume() >= 5) {
            this.volume -= 5;
        }
    }
    public void trocarCanal(int can) {
        if(isLigado()) {
            this.canal = can;
        }
    }
    
    @Override
    public String toString() {
        String vol = "";
        for(int i = 0; i < this.volume; i+=10) {
            vol += "|";
        }
        return String.format("Canal: %d\nVolume: %s (%d)\nLigado? %s\n", this.getCanal(), vol, this.getVolume(), this.isLigado());
    }
}
