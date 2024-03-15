//Criando a classe:
public class ControleRemoto {
    private Televisor tv; //Atribuindo à variável 'tv' o objeto Televisor vindo da classe Televisor

    //Construtor da classe:
    public ControleRemoto(Televisor tv) {
        this.tv = tv;
    }

    //Métodos herdados da classe Televisor:
    public void ligar() {
        tv.ligar();
    }
    public void desligar() {
        tv.desligar();
    }
    public void aumentarVolume() {
        tv.aumentarVolume();
    }
    public void diminuirVolume() {
        tv.diminuirVolume();
    }
    public void trocarCanal(int can) {
        tv.trocarCanal(can);
    }
}
