//Criando a classe:
public class Televisor {
    //Atributos:
    private int canal;
    private int volume;
    private boolean ligado;

    //Construtor:
    public Televisor(int canal, int volume, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }
    
    //Métodos:
    public void ligar() {
        //Verifica se o atributo 'ligado' NÃO é true:
        if(!this.isLigado()) { //O sinal de exclamação significa 'diferente de' ou 'não'
            this.setLigado(true); //Usando o método setLigado() para mudar o valor do atributo 'ligado'
        }
    }
    public void desligar() {
        //Verifica se o atributo 'ligado' é true:
        if(this.isLigado()) {
            this.setLigado(false); //Usando o método setLigado() para mudar o valor do atributo 'ligado'
        }
    }
    public void aumentarVolume() {
        if(this.isLigado() && this.getVolume() <= 95) { //Se for true E o volume for menor igual a 95
            this.setVolume(this.getVolume() + 5); //Usando o método setVolume() e alterando pelo valor retornado de getVolume() + 5
        }
    }
    public void diminuirVolume() {
        if(this.isLigado() && this.getVolume() >= 5) { //Se for true E o volume for maior igual a 5
            this.setVolume(this.getVolume() - 5); //Usando o método setVolume() e alterando pelo valor retornado de getVolume() - 5
        }
    }
    public void trocarCanal(int can) {
        if(this.isLigado()) { //Se for true
            this.setCanal(can); //Usando o método setCanal() e alterando pelo valor do parâmetro 'can' digitado pelo usuário
        }
    }

    //Métodos getters e setters:
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
    
    @Override
    public String toString() {
        return "Canal: " + this.getCanal() + ", Volume: " + this.getVolume() + ", Está ligado? " + this.isLigado();
    }
}
