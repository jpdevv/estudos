public class App {
    //Método main():
    public static void main(String[] args) throws Exception {
        //Criando as instâncias:
        Professor prof = new Professor("Paulo Ricardo", 20241503, "Pedagogia");
        Porta porta = new Porta("Marrom", 2.1f, 0.8f, true);
        Televisor tv = new Televisor(0, 0, false);
        ControleRemoto ctrl = new ControleRemoto(tv);
        
        //Printando na tela os valores das classes Professor e Porta:
        System.out.println(prof.toString());
        System.out.println(porta.toString());

        //Controlando a classe Televisor com a classe ControleRemoto:
        ctrl.ligar(); //Usando o método ligar()
        ctrl.aumentarVolume(); //Usando o método aumentarVolume()
        ctrl.trocarCanal(16); //Usando o método trocarCanal() - Aqui temos um parâmetro do tipo int!

        //Printando na tela os valores da classe Televisor:
        System.out.println(tv.toString());
    }
}
